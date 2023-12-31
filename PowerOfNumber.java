import java.util.*;

public class PowerOfNumber{
        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                 System.out.println("Enter a number");
                int num=sc.nextInt();
                System.out.println("Enter a exponential");
                int exponential=sc.nextInt();
                long result =1;
                
                   while(exponential!=0){
                           result*=num;
                           exponential--;
                   }

                 System.out.print(result);
        }
}