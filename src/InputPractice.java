import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Number 1:");
//        int num1 = sc.nextInt();
//        System.out.println("Enter Number 2:");
//        int num2 = sc.nextInt();
//        int ans = num1 + num2;
//
//        System.out.println(" The Answer is: " + ans);

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");



    }
}
