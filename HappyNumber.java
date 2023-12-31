import java.util.*;

 class HappyNumber{
        public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter a number");
              int num =sc.nextInt();

              int result=num;

              while(result!=1 && result!=4){
                  result=isHappy(num);
              }

              if(result == 1)  {
            System.out.println(num + " is a happy number");  
              }
        else if(result == 4) { 
            System.out.println(num + " is not a happy number");   
        }
       
        }

        public static int isHappy(int num){
                int rem=0,sum=0;

                while(num>0){
                    rem=num%10;
                    sum+=rem*rem;
                    num/=10;
                }
                return sum;
        }
 }