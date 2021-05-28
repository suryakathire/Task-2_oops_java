import java.util.*;
abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
        
    }
}
class MyBook extends Book
{
    void setTitle(String s)
    {
        super.title=s;
    }
}
public class Books
{
    public static void main(String[] args)
    {
        System.out.println("enter the title is:");
        Scanner scan=new Scanner(System.in);
        String title=scan.nextLine();
        MyBook m=new MyBook();
        m.setTitle(title);
        System.out.println("the Title is:"+m.getTitle());
    }
}
