import java.util.*;
 class PrimeNumbers{
      
     

    public static boolean isPrime(int num){
              
              if(num < 2){
                  return false ;
              }

              else{
                  for(int i=2;i<num/2;i++){
                        if(num%i==0){
                             return false;
                        }

                       
                  }
                   return true;
              }
     }

       public static void main(String[] args){

     Scanner sc =new Scanner(System.in);
     System.out.println("Enter range start");
     int start =sc.nextInt();
     System.out.println("ENter range end");
     int end =sc.nextInt();

     for(int i=start;i<=end;i++){

        if(isPrime(i)){
              System.out.print(i + ",");
        }
     }
       }
 }