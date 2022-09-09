import java.util.Scanner;

public class Usdconverter {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int INR ;
    System.out.print("Enter the INR : ");
    INR = sc.nextInt();
    double USD = INR /  79.89;
    System.out.println(USD+" USD");
 }   
}
