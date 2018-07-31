package Advanced;

public class Java_Singleton_Pattern
{
	public static void main (String args[])
	{
		Singleton s1 = new Singleton();
		System.out.println(s1.getClass());
	}
}

class Singleton
{
    public String str;
    private static Singleton singleton;
    Singleton()
    {
        
    }
    public static Singleton getSingleInstance()
    {
        if(singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
}