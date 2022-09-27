 import java.util.Scanner;
public class InvalidIntegers {
    public static void main(String args[]){
        System.out.println("Enter First Number");
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();
        System.out.println("Enter Second Number:");
        Scanner scan2 =new Scanner(System.in);
        int num2 = scan2.nextInt();
        int sum = num1+num2;
        System.out.println("your sum is:"+sum);
    }
}
