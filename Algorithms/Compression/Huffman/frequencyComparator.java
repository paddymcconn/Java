package Compression.huffman;

import java.util.Comparator;

/**
 * @author Patrick
 * @return int first - second frequency of the letters.
 */
public class frequencyComparator implements Comparator<huffmanNode>
{

    public int compare(huffmanNode first, huffmanNode second)
    {
        return first.frequency - second.frequency;
    }
}
