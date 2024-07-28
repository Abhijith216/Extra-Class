import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter 2 nos");
        num1 = scn.nextInt();
        num2 = scn.nextInt();
        int sum = num1 + num2;
        int avg = sum / 2;
        System.out.println("The sum of 2 nos:" + sum);
        System.out.println("The avg of 2 nos:" + avg);
        scn.close();
    }
}