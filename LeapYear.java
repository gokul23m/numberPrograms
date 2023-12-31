import java.util.*;
 class LeapYear{
      public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           int year=sc.nextInt();

           String res = year%400==0 || (year%4==0 && year%100!=0) ? "Leap Year " : "NOt a Leap Year" ;
           
            System.out.println(res);
                 }
}