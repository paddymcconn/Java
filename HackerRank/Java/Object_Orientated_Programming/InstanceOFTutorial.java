package Object_Orientated_Programming;

import java.util.*;


class Student{}
class Rockstar{}
class Hacker{}


public class InstanceOFTutorial
{
   static String count(ArrayList<Object> mylist)
   {
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++)
      {
         Object element=mylist.get(i);
         if(element instanceof Student)
         {
        	a++; 
         }
         if(element instanceof Rockstar)
         {
        	 b++;
         }
         if(element instanceof Hacker)
         {
        	 c++;
    	 }
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []args){
      ArrayList<Object> mylist = new ArrayList<Object>();
      Scanner Sc = new Scanner(System.in);
      int t = Sc.nextInt();
      for(int i=0; i<t; i++){
         String s=Sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
      Sc.close();
   }
}