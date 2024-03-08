package d24datetime_stringbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringBuilderPractice {
    public static void main(String[] args) {

        List<String> trees = Arrays.asList("oak", "pine", "ash", "birch", "elm", "yew");
        System.out.println(listToString(trees));
    }
    private static String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder(32);
        for (String el : list) {
            sb.append(el).append(" ");
        }
        return sb.toString();
    }
}
