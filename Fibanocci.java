import java.util.*;

class Fibanocci{
        public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter no of Terms");
           int num = sc.nextInt();

           int n1=0,n2=1,nextTerm;
             System.out.print(n1+","+n2+",");
             for(int i=2;i<num;i++){
                    nextTerm=n1+n2;
                    System.out.print(nextTerm+",");
                    n1=n2;
                    n2=nextTerm;
                    
    }
        }
}