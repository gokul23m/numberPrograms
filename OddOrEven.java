import java.util.*;

 class OddOrEven{
      public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number");
                int num=sc.nextInt();

                String res = num ==0 ? "neither ODD nor EVEN" : (num%2==0) ? "EVEN" : "ODD" ;

                System.out.println(res);
      }
 }