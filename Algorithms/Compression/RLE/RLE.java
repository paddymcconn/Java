package Compression.RLE;

/**
 * 
 * @author Patrick
 * This is code for the Run length encoding compression algorithm.
 * it simply encodes by counting the letters and using the count beside the number.
 * it only really works well for long running sequences of the same character.
 * 
 * 	eg. wwwbwwbww is 3W1b2w1b2w
 */

public class RLE
{
	public StringBuilder Compress (String Sequence)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<Sequence.length(); i++)
		{
			int RunLen = 1;
			while(i+1<Sequence.length() && Sequence.charAt(i) == Sequence.charAt(i+1))
			{
				RunLen++;
				i++;
			}
			sb.append(RunLen);
			sb.append(Sequence.charAt(i));
		}
		return sb;
	}
	/**
	 * This is a standard implementation with the string being fixed in length and alternation in characters and numbers
	 * for simplicity.
	 * @param compressed
	 * @return
	 */
	public StringBuilder Decompress(String compressed)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0, j=1; j<compressed.length(); i+=2, j+=2)
		{
			 int enumeration = (int)compressed.charAt(i) -48;
			 while(enumeration !=0)
			 {
				 sb.append(compressed.charAt(j));
				 enumeration --;
			 }
		}
		
		return sb;
	}
}
