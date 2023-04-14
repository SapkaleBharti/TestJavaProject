import java.util.Scanner;

public class Add2Numbers {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter two Integers to calculate their sum ");

        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();
        z = x + y;

        System.out.println("Sum of entered integer= " + z);
    }

}
