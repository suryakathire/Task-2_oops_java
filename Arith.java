import java.io.*;
import java.util.*;

class Arithmetic {
    }

    class Adder extends Arithmetic
    {
        public int add(int a,int b)
        {
            return a+b;
        }
    }
public class Arith{
    public static void main(String[] args)
    {
        Adder a=new Adder();
        System.out.println("My Superclss is:"+a.getClass().getSuperclass().getName());
        System.out.println(a.add(10,32)+" "+a.add(10,3)+" "+a.add(10,10)+"\n");
    }
}
    

