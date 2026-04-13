import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which task you want to test?:");
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        switch (test) {
            case 1:
                task1.test();
                break;
            case 2:
                task2.test();
                break;
            case 3:
                task3.test();
                break;
            case 4:
                task4.test();
                break;
            case 5:
                task5.test();
                break;
            case 6:
                task6.test();
                break;
        }
    }
}