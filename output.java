import java.util.Scanner;

public class output{
    public static void main(String[] args){
        System.out.println("summation");
        Scanner obj =new Scanner(System.in);
        System.out.println("enter number 1: ");
        int a = obj.nextInt();
        System.out.println("enter number 2: ");
        int b = obj.nextInt();
        int sum = a+b;
        System.out.println("the sum of these numbers is: " + sum);
       /* boolean b1 = obj.hasNextFloat();
        System.out.println(b1);*/
        // checking the validity

    }
} 
