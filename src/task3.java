import java.util.*;

public class task3{
    public static void test() {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> shelf = new ArrayDeque<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();

            if (operation == 1) {
                int disk = sc.nextInt();
                shelf.addFirst(disk);
            }
            else if (operation == 2) {
                int disk = sc.nextInt();
                shelf.addLast(disk);
            }
            else if (operation == 3) {
                System.out.print(shelf.removeFirst() + " ");
            }
            else if (operation == 4) {
                System.out.print(shelf.removeLast() + " ");
            }
        }

        sc.close();
    }
}