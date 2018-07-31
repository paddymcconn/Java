package Data_Structures;

import java.util.*;

class Student
{
	public int id;
	public String fname;
	public double cgpa;
	
	public Student(int id, String fname, double cgpa)
	{
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId()
	{
		return id;
	}
	public String getFname()
	{
		return fname;
	}
	public double getCgpa()
	{
		return cgpa;
	}
}

public class Java_Sort
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		int testCases = Integer.parseInt(Sc.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0)
		{
			int id = Sc.nextInt();
			String fname = Sc.next();
			double cgpa = Sc.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().thenComparing(Student :: getFname).thenComparing(Student :: getId));
      	for(Student st: studentList)
      	{
			System.out.println(st.getFname());
		}
      	Sc.close();
	}
}


