import java.util.*;

class StrongNumber{

         public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number");
          int num=sc.nextInt();

            int temp=num;
            int sum=0;
            int rem=0;

            while(temp!=0){
                rem = temp % 10;
                sum += factorial(rem);
                temp /= 10;
            }
            System.out.println(sum);
            if (num == sum) {
                System.out.println(num + " is a strong number.");
         }
         else{
             System.out.println(num + " is not a strong number.");
         }
         }

         public static int factorial(int n){
                 int fact=1;
                 for(int i=n;i>1;i--){
                        fact*=i;
                 }
                 return fact;
         }

          
}