import java.util.*;

class  NthTermOfFibanocci{

            static int fiba(int n){
                   int n1=0,n2=1,n3;
                   if(n==0){
                       return n1;
                   }
                   else{
                    for(int i=2;i<=n;i++){
                       n3=n1+n2;
                       n1=n2;
                       n2=n3;
                    }
                   
                   }
                     return n2;
              }

          public static void main(String[] args){

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the term");
            int n=sc.nextInt();
           System.out.print(fiba(n));
                      }
}