import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {
        System.out.println("marks to percentage calculator");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter subject 1 marks: ");

        float a = sc.nextFloat();

        System.out.println("enter subject 2 marks");

        float b = sc.nextFloat();

        System.out.println("enter subject 3 marks");

        float c = sc.nextFloat();

        System.out.println("enter subject 4 marks");

        float d = sc.nextFloat();

        System.out.println("enter subject 5 marks");

        float e = sc.nextFloat();

        float sum = a+b+c+d+e;
        float percentage =(sum/500)*100;

        System.out.println("percentage obtain is: " + percentage);



    }
}
