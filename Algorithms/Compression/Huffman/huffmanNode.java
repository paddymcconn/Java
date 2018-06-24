package Compression.huffman;

/**
 * 
 * @author Patrick
 * This is the node class for huffman encoding.
 */

public class huffmanNode
{
	char c;
	int frequency;
	
	huffmanNode left = null;
	huffmanNode right = null;
	
	public huffmanNode (char c, int frequency)
	{
		this.c = c;
		this.frequency = frequency;
	}
}
