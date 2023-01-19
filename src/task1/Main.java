package task1;

import java.util.regex.Pattern;

public class Main {
    static String words;

    public static void main(String[] args) {
        words = "brange, plum, tomato, onibn, grape";
        view(splits(correction(words)));
    }

    public static String correction(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.replace(0, 1, "o");
        sb.replace(25, 26, "o");
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
