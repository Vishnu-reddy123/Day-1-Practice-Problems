import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an year ::");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year >= 1582) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Given year is a leap year");
            } else {
                System.out.println("Given year is not a leap year");
            }
        } else {
            System.out.println("please enter a year greater than 1582");
        }
    }
}