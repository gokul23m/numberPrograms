import java.util.*;

class SumOfDigit {
        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter a number");
                int num=sc.nextInt();
                int rem=0;
                int sum=0;

                while(num!=0){
                      rem = num%10;
                      sum+=rem;
                      num=num/10;
                }

                 System.out.print(sum);
        }
}