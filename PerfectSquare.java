import java.util.*;

class PerfectSquare{
             public static void main(String[] args){
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter fisrt number");
                   int num=sc.nextInt();

                   if(Math.floor(Math.sqrt(num))==Math.ceil(Math.sqrt(num))){
                         System.out.println("Perfect Square");
                   }
                   
                   else{
                         System.out.println("Not a Perfect Square");
                   }
             }
}