import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c)
            System.out.println("The largest number is " + a);
        else if (b > c)
            System.out.println("The largest number is " + b);
        else
            System.out.println("The largest number is " + c);

        sc.close();
    }
}
// I got helped with this one from Youtube's channel Joey's Tech