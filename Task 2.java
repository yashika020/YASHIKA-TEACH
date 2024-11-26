import java.util.Scanner;

 class Task {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();   
        if(i<0){
            System.out.println("negetive");
        }else if(i==0) {
            System.out.println("zero");
        }else{
            System.out.println("positive");
        }
    }
}