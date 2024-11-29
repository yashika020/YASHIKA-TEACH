import java.util.*;
class swap{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int temp ;
        int num1 =  sc.nextInt();
        System.out.println("enter the value of num 1");
        int num2 =  sc.nextInt();
        System.out.println("enter the value of num2");

         temp = num1 ;
         num1 = num2  ;
        num2 = temp  ;
        System.out.println("after swapping value of num1 is:"+num1);
        System.out.println("after swapping value of num2 is:"+num2);


    }
   

    }

