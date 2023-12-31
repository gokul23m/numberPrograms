import java.util.*;

class LCM{
       public static void main(String[] args){
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter fisrt number");
                   int n1=sc.nextInt();
                   System.out.println("Enter second number");
                   int n2=sc.nextInt();

                  int greater = n1>n2 ? n1 : n2;
                  int lcm=0;

                   for(int i=greater;i<=n1*n2;i++){
                          if(i%n1==0 && i%n2==0){
                              lcm=i;
                                break;  
                          } 
                   }
                   System.out.println(lcm);
       }
}