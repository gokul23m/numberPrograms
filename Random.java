import java.util.*;

class Random{
            public static void main(String[] args){
                     Scanner sc =new Scanner(System.in);
                System.out.println("Enter a Start");
                int min=sc.nextInt();
                System.out.println("Enter a End");
                int max=sc.nextInt();

                 System.out.println(Math.random()*(max-min+1) +min);


            }
}