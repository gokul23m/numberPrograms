import java.util.*;

class Reverse {
        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter a number");
                int num=sc.nextInt();
                int rem=0;
                int rev=0;

                while(num!=0){
                      rem = num%10;
                      rev =rev*10 + rem;
                      num=num/10;
                }

                 System.out.print(rev);
        }
}