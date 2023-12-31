 import java.util.*;
class Amstrong{
       public static void main(String[] args){
             Scanner sc= new Scanner(System.in);
             System.out.println("enter a number");
             int num=sc.nextInt();

             int len;

             len=order(num);

                 if (armstrong (num, len)){
        System.out.println(num + " is armstrong");
                 }
    else{
        System.out.println(num + " is not a armstrong");
    }

  }

       static int order(int n){
               int len=0;
               while(n!=0){
                    len++;
                    n/=10;
               }
               return len;
       }

       static boolean armstrong(int n,int l){
          
             int temp=n;
             int rem=0;
             int sum=0;
             while(temp!=0){
                     rem=temp%10;
                     sum +=Math.pow(rem,l);
                     temp/=10;
             }
             
             return n==sum;
       }

       }
