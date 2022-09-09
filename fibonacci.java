import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        int n  , firstTerm = 0, secondTerm = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n term : ");
        n = sc.nextInt();
     
    for (int i = 1; i <= n; i++) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
    System.out.println("");
    }
}