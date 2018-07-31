package Object_Orientated_Programming;


class animal
{
	void walk()
	{
		System.out.println("I am walking");
	}
}

class Bird extends animal
{
	void fly()
	{
		System.out.println("I am flying");
	}
	void sing()
	{
		System.out.println("I am singing");
	}
}

public class Java_Inheritance_I
{
	  public static void main(String args[]){

		  Bird bird = new Bird();
		  bird.walk();
		  bird.fly();
	      bird.sing();
		
	   }
}
