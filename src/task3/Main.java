package task3;

import java.util.Scanner;

public class Main {
    static String[] names;
    static String name;
    static int count;

    public static void main(String[] args) {
        names = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = scanner.nextLine();
        count = countNames(names, name);
        info(count, name);
    }

    public static int countNames(String[] listNames, String inputName) {

        for (String name : listNames) {
            //пользовался сравнением "contains"
            // так как в задании не было указано каким конкретно пользоваться
            if (name.toLowerCase().contains(inputName.toLowerCase())) {
                count++;
            }
        }
        return count;

    }

    public static void info(int count, String name) {
        if (count > 0) {
            System.out.printf("Name %s occurs %s times", name, count);
        } else System.out.println("Your name is not on the list");
    }
}
