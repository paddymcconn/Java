package PatternMatching.euclid;

import org.junit.*;

import PatternMatching.euclid.Euclid;
public class EuclidTest
{
	Euclid e = null;
	
	@Before
	public void init()
	{
		e = new Euclid();
	}
	
	@Test
	public void gcdtest()
	{
		Assert.assertEquals(2, e.gcd(10, 2));
		Assert.assertEquals(2, e.gcd(22, 6));
	}
	
	@Test
	public void gcd2test()
	{
		Assert.assertEquals(2, e.gcd2(10, 2));
		Assert.assertEquals(e.gcd2(10, 2), e.gcd2(10, 2));
		Assert.assertEquals(2, e.gcd2(22, 6));
	}
}
