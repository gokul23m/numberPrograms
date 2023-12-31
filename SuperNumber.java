import java.util.*;

class SuperNumber{
         public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter a number");
               int num=sc.nextInt();

               int len=order(num);

                int result=isSuper(num,len);

                if(result==num)
{
      System.out.println("Super Number");
}               

     else{
          System.out.println("Not a Super Number");
     }
               
   }

     public static int isSuper(int num,int l){
          int rem=0,sum=0;
               while(num>0){
                     rem=num%10;
                     sum+=Math.pow(rem,l);
                     num/=10;
                     l--;
               }
               return sum;
     }

            public static int order(int n){
                   int count=0;

                   while(n>0){
                        count++;
                        n/=10;
                   }
                   return count;
            }
}