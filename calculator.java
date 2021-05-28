 
 import java.util.*;
interface AdvancedArithmetic
{
}
class Calculator implements AdvancedArithmetic {

    int sum = 0;

    public void divisor_sum(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter the no:");
        int n = scan.nextInt();
        Calculator cal = new Calculator();
          System.out.println("I implementes:"+cal.getClass().getSuperclass());
        cal.divisor_sum(n);
    }
}
