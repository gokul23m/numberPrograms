import java.util.*;

class SumOfNumbers{

       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter starting number");
          int start=sc.nextInt();
          System.out.println("Enter Ending number");
           int end = sc.nextInt();
           int sum=0;

           for(int i=start;i<=end;i++){
               sum+=i;
           }
           System.out.println(sum);

       }
}