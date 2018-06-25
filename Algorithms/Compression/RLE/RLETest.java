package Compression.RLE;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RLETest
{
	RLE r= null;
	
	@Before
	public void init()
	{
		r = new RLE();
	}
	
	@Test
	public void CompressTest()
	{
		StringBuilder compress = r.Compress("aaabbbccc111wqw"); //3a3b3c311w1q1w
		System.out.println(compress);
		
		Assert.assertEquals(compress.charAt(0), '3'); // the number of a's
		Assert.assertEquals(compress.charAt(1), 'a');
		
		Assert.assertEquals(compress.charAt(7), '1');
		Assert.assertEquals(compress.toString().substring(0), "3a3b3c311w1q1w");
	}
	@Test
	public void DecompressTest()
	{
		StringBuilder deCompress = r.Decompress("3a3b3c311w1q1w");
		System.out.println(deCompress);
		Assert.assertEquals(deCompress.toString().substring(0), "aaabbbccc111wqw");
		
	}
}
