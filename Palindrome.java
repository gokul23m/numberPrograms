import java.util.*;

class Palindrome {
        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter a number");
                int num=sc.nextInt();
                int rem=0;
                int rev=0;
                int temp=num;

                while(temp!=0){
                      rem = temp%10;
                      rev =rev*10 + rem;
                      temp=temp/10;
                }
                

            String res = num==rev ? "Palindrome" : "Not a Palindrome";

                 System.out.print(res);
        }
}