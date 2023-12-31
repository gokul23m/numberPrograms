import java.util.*;
 
 class Prime{

       public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number: ");
                int n = sc.nextInt();
                String res="Prime";

                 if(n<2){
                       res = "Neither prime nor not Prime";
                 }
                  else{

                for(int i=2;i<n/2;i++){
                       if(n%i==0){
                            res = "Not a Prime";
                            break;
                       }
                }
                  }
                System.out.print(res );
       }
 }