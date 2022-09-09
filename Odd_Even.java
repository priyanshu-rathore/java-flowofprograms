import java.util.Scanner;

class Odd_Even{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to check the no. : ");
        a = sc.nextInt();
        if(a%2==0){
            System.out.println("The no. is Even");
        }else{
            System.out.println("The no. is Odd");
        }
    }
}