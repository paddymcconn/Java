package Data_Structures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student_PQ
{
    private int token;
    private String fname;
    private double cgpa;

    public Student_PQ(int id, String fname, double cgpa)
    {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getToken()
    {
        return token;
    }

    public String getName()
    {
        return fname;
    }

    public double getCgpa()
    {
        return cgpa;
    }
}

class Priorities
{
	public List < Student_PQ > getStudents(List < String > events)
	{
        PriorityQueue < Student_PQ > student_queue = new PriorityQueue <Student_PQ>(Comparator.comparing(Student_PQ::getCgpa).reversed().thenComparing(Student_PQ::getName).thenComparing(Student_PQ::getToken));
        List < Student_PQ > students = new ArrayList < Student_PQ > ();
        for (String e: events)
        {
            Scanner in =new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER"))
            {
                String name = in.next();
                float cgpa = in.nextFloat();
                int token = in.nextInt();

                Student_PQ student = new Student_PQ(token, name, cgpa);
                student_queue.add(student);
            }
            else if (event.equals("SERVED"))
            {
                Student_PQ first = student_queue.poll();
            } in .close();
        }
        Student_PQ first = student_queue.poll();
        if (first == null)
        {
            return students;
        }
        else
        {
            while (first != null)
            {
                students.add(first);
                first = student_queue.poll();
            }
            return students;
        }
    }
}
public class Java_Priority_Queue
{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args)
    {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0)
        {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student_PQ> students = priorities.getStudents(events);
        
        if (students.isEmpty())
        {
            System.out.println("EMPTY");
        }
        else
        {
            for (Student_PQ st: students)
            {
                System.out.println(st.getName());
            }
        }
        scan.close();
    }
}