import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        name = sc.next();
        System.out.println("Greetings "+ name + "!");
    }
}
