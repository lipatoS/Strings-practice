package task2;

import java.util.regex.Pattern;

public class Main {
    static String words;

    public static void main(String[] args) {
        words = "orange, plum, tomato, onion, grape, onion";
        view(splits(del(words)));
    }

    public static String del(String string) {
        StringBuilder sb = new StringBuilder(string);
        //Удалил только 1 "onion" так как не сказано было удалить все.
        sb.delete(20,27);
        return String.valueOf(sb);
    }

    public static String[] splits(String text) {
        String delimiter = ", ";
        Pattern pattern = Pattern.compile(delimiter,
                Pattern.CASE_INSENSITIVE);
        return pattern.split(text);
    }
    public static void view(String[] arr) {
        int count = 1;
        for (String str : arr) {
            System.out.printf("%s) %s\n", count, str);
            count++;
        }
    }

}