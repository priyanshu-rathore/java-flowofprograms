import java.util.Scanner;

public class Largestno {
 public static void main(String[] args) {
    System.out.print("Enter 1st no. : ");
    int a;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    System.out.print("Enter 2nd no. : ");
    int b = sc.nextInt();
    if(a>b){
    System.out.println(a+" is the largest number !");
    }else{
        System.out.println(b+" is the largest number !");
    }
 }   
}
