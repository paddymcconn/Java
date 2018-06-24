package Compression.huffman;

import java.util.PriorityQueue;

/*
 * This algorithm will compress the amount of bits necessary to store a given sequence of characters.
 * 
 */
public class huffman {

    final int CHARACTER_LIMIT = 256;
    StringBuilder header = new StringBuilder();

    /**
     * Create a frequency table for a given text
     *
     * @param text
     * @return int []
     */
    public int[] createFrequencyTable(char[] text) {
        int[] frequencies = new int[CHARACTER_LIMIT];
        for (int i=0; i<text.length; i++) {
            frequencies[text[i]] = frequencies[text[i]] + 1;
        }
        return frequencies;
    }

    /**
     * Creates the PriorityQueue from a given frequency table
     *
     * @param frequencies
     * @return PriorityQueue
     */
    public PriorityQueue<huffmanNode> createPriorityQueue(int[] frequencies) {
        header = new StringBuilder();
        header.append((char) 1);
        PriorityQueue<huffmanNode> queue = new PriorityQueue<huffmanNode>(1, new frequencyComparator());
        for(int i=0; i<frequencies.length; i++) {
            if (frequencies[i] > 0) {
                queue.add(new huffmanNode((char) i, frequencies[i]));
                header.append(":").append((char) i).append(frequencies[i]);
            }
        }
        header.append((char) 2);
        return queue;
    }

    /**
     * method creates the HuffmanTree from a given queue
     *
     * @param queue
     * @return HuffmanNode
     */
    public huffmanNode createHuffmanTree(PriorityQueue<huffmanNode> queue) {
        huffmanNode root = null;
        while(queue.size() > 0) {
            root = pullLeastUsedAsNode(queue);
            if (queue.size() > 0) queue.add(root);
        }
        return root;
    }

    /**
     * This methods receives a text and returns the compressed value for the given text.
     * E.g. for aabbbcd it will return 1010000110111
     * @param text
     * @return String
     */
    public String compress(char[] text) {
        int[] frequencies = createFrequencyTable(text);
        PriorityQueue<huffmanNode> queue = createPriorityQueue(frequencies);
        huffmanNode root = createHuffmanTree(queue);
        String compressed = header.toString() + encodeString(text, root);
        return compressed;
    }

    /**
     * this method will decompress a text previously compressed by this algorithm.
     * \u0001:a2:b3:c1:d1\u00021010000110111 - > aabbbcd
     *
     * @param encodedText
     * @return char[]
     */
    public char[] decompress(char[] encodedText) {
        if (encodedText[0] != (char) 1) return null;
        int[] frequencies = parseHeaderAsFrequency(encodedText);
        PriorityQueue<huffmanNode> queue = createPriorityQueue(frequencies);
        huffmanNode root = createHuffmanTree(queue);
        String decompressed = decodeString(encodedText, root);
        return decompressed.toCharArray();
    }

    /**
     * It will replace the characters received from the text and replace by the new sequence
     * of bytes for each character.
     * E.g. aabbbcd becomes 1010000110111
     *
     * @param text
     * @param root
     * @return String
     */
    public String encodeString(char[] text, huffmanNode root) {
        StringBuilder s = new StringBuilder();
        String array[] = new String[CHARACTER_LIMIT];
        generateBites(array, root, new StringBuilder());
        for (int i=0; i<text.length; i++) {
            s.append(array[text[i]]);
        }
        return s.toString();
    }


    /**
     * This method decodes the Huffman compression bits into charactes
     *
     * /u0001:a2:b3:c1:d1/u0002 1010000110111
     * aabbbcd
     * 
     * @param text
     * @param root
     * @return String
     */
    public String decodeString(char[] text, huffmanNode root) {
        StringBuilder s = new StringBuilder();
        huffmanNode currentNode = root;
        for (int i=header.length(); i<text.length; i++) {
            if (text[i] - '0' == 0) currentNode = currentNode.left;
            else if (text[i] - '0' == 1) currentNode = currentNode.right;
            if (isLeaf(currentNode)) {
                s.append(currentNode.c);
                currentNode = root;
            }
        }
        return s.toString();
    }

    /**
     *  Traverse through the HuffmanTree and generate the compressed bytes for each character.
     *  It also store them into an array of Strings
     *  E.g. for a three created from aabbbcd it will generate the following sequence of bits
     *  b - 0
     *  a - 10
     *  c - 110
     *  d - 111
     *
     *
     * @param array
     * @param root
     * @param s
     */
    public void generateBites(String[] array, huffmanNode root, StringBuilder s) {
        if (root.c == '-') {
            s.append("0");
            generateBites(array, root.left, s);
            s.append("1");
            generateBites(array, root.right, s);
            if (s.length() > 0) s.deleteCharAt(s.length() - 1);
        } else {
            System.out.println(root.c + " - " + s.toString());
            array[root.c] = s.toString();
            if (s.length() > 0) s.deleteCharAt(s.length() - 1);
        }
    }

    /**
     * This method remove the top two least used characters and add to a root node as a left
     * and right objects then return the root node. The node is a HuffmanNode
     *    n1(-)
     *  c-1   d-1
     *
     * @param queue
     * @return HuffmanNode
     */
    public huffmanNode pullLeastUsedAsNode(PriorityQueue<huffmanNode> queue) {
        huffmanNode node1 = queue.poll();
        huffmanNode node2 = queue.poll();
        huffmanNode root = new huffmanNode('-', node1.frequency + node2.frequency);
        root.left = node1;
        root.right = node2;

        return root;
    }


    /**
     * Example String:
     * /u0001:a2:b3:c1:d1/u00021010000110111
     *
     * @param text
     * @return int[]
     */
    public int[] parseHeaderAsFrequency(char[] text) {
        int[] frequencies = new int[CHARACTER_LIMIT];
        int i=0;
        for(; i<text.length && text[i] != (char) 2; i++) {
            header.append(text[i]);
            if (text[i] == ':') {
                i++;
                header.append(text[i]);
                int f=0;
                int m=1;
                int j = i +1;
                for(; j<text.length && text[j] != (char) 2 && text[j] != ':'; j++) {
                    f = (f * m) + (text[j] - '0');
                    if (f != 0) m = 10;
                    header.append(text[i] - '0');
                }
                frequencies[text[i]] = f;
                i = j -1;
            }
        }
        return frequencies;
    }

    /**
     * this method return true if the received node is a leaf node
     *
     * @param node
     * @return boolean
     */
    public boolean isLeaf(huffmanNode node) {
        if (node == null) return false;
        return node.left == null && node.right == null;
    }
}
