import java.util.Scanner;

/**
 * Pow4and5
 */
public class Pow4and5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,a=0;
        System.out.print("Please enter a number : ");
        n=scanner.nextInt();
        int b=1,c=1;
        while (b!=n) {
            
            System.out.print(" "+b*4);
            System.out.print(" "+c*5);
            b++;
            c++;
        }
    }
}