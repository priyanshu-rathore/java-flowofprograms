import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        a = sc.next();
        String rev = "";
        for(int i = a.length()-1;i>=0;i--){
             rev = rev + a.charAt(i);
        }
        System.out.println("");

       if(rev.equals(a)){
        System.out.println(a +" is Palindrome");
       }else{
        System.out.println(a + " is not Palindrome");
       }

    }
}
