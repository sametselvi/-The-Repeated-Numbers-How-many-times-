import java.util.Scanner;

public class Main {
     static int pattern1(int num) {

        if (num <= 0) {
            return num;
        } else {
            System.out.print(num + " ");
            return pattern1(num - 5);
        }

    }

    static int pattern2(int num, int temp) {
        if (num > temp) {
            return num;
        } else {
            System.out.print(num + " ");
            return pattern2(num + 5, temp);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("N sayisi : ");
        num = input.nextInt();

        pattern2(pattern1(num), num);

    }
}