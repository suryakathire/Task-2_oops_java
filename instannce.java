 import java.util.*;
class Student
{
    
}
class Rockstar
{
    

}
class Hacker
{
    
}
public class instannce
{
    static String count(ArrayList arr)
    {
    int a=0,b=0,c=0;
    for(int i=0;i<arr.size();i++)
    {
     Object element=arr.get(i);
     if(element instanceof Student)
     {
         a++;
     }
     if(element instanceof Rockstar)
     {
         b++;
     }
     if(element instanceof  Hacker)
     {
         c++;     
     }
    }
    String r= Integer.toString(a)+" "+Integer.toString(b)+" "+Integer.toString(c);
    return r;
    }
public static void main(String[] args)
{
    ArrayList arr=new ArrayList();
    Scanner s =new Scanner(System.in);
    System.out.println("enter the no of elemnts:");
    int t=s.nextInt();
    for(int i=0;i<t;i++)
    {
        String str=s.next();
        if(str.equals("Student"))arr.add(new Student());
               if(str.equals("Rockstar"))arr.add(new Rockstar());
                      if(str.equals("Hacker"))arr.add(new Hacker());
    }
    System.out.println(count(arr));
}
}
