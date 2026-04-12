import java.util.ArrayList;
import java.util.Scanner;

public class task5 {

    public static void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String cleaned = input.replace("students=[", "")
                .replace("samsas=[", "")
                .replace("sandwiches=[", "")
                .replace("]", "");

        String[] parts = cleaned.split(",");

        ArrayList<Integer> students = new ArrayList<>();
        ArrayList<Integer> samsas = new ArrayList<>();

        boolean secondArray = false;

        for (String part : parts) {
            if (part.contains("samsas=") || part.contains("sandwiches=")) {
                secondArray = true;
            }

            String value = part.replace("samsas=", "").replace("sandwiches=", "").trim();

            if (!secondArray) {
                students.add(Integer.parseInt(value));
            } else {
                samsas.add(Integer.parseInt(value));
            }
        }

        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
        }

        int result = 0;

        for (int i = 0; i < samsas.size(); i++) {
            if (samsas.get(i) == 0) {
                if (zeroCount == 0) {
                    result = oneCount;
                    break;
                }
                zeroCount--;
            } else {
                if (oneCount == 0) {
                    result = zeroCount;
                    break;
                }
                oneCount--;
            }
        }

        System.out.println(result);
    }
}