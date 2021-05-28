import java.util.*;
import java.io.*;
class Cycle
{
    String example()
    {
        return "a vechicle with pedals.";
    }
}
    class Motorcycle extends Cycle
    {
    String example()
    {
        return "a cycle with an engine.";
    }
    Motorcycle()
    {
    
    System.out.println("hello i am a motorcyle,i am"+example());
   String temp=super.example();
        System.out.println("my ancestor is a cycle who is "+temp);
    }
}

class solution
{
    public static void main(String[] args)

    {
        Motorcycle m=new Motorcycle();
    }}

