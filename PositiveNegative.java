import java.util.*;

class PositiveNegative{
          public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number");
                int num=sc.nextInt();

                String res = num ==0 ? "neither positive nor negative" : (num > 0) ? "Positive" : "Negative" ;

                System.out.println(res);
          }
}