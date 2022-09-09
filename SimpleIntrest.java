import java.util.Scanner;

public class SimpleIntrest {
 public static void main(String[] args) {
    System.out.print("Enter the Principal Amount : ");
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt();
    System.out.print("Enter the Rate of intrest : ");
    int R = sc.nextInt();
    System.out.print("Enter the Time : ");
    int T = sc.nextInt();
    int SI = (P*R*T)/100;
    System.out.println("The Simple Intrest to be calculated is : "+ SI);
 }   
}
