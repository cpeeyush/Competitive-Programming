package com.peeyush.string;


import java.util.ArrayList;
import java.util.List;

public class Without3IdenticalConsecutiveLetters {

    public static void main(String[] args) {
        System.out.println("eedaaad => " + solution("eedaaad"));
        System.out.println("xxxtxxx => " + solution("xxxtxxx"));
        System.out.println("uuuuxaaaaxuuu => " + solution("uuuuxaaaaxuuu"));
        System.out.println("aaa => " + solution("aaa"));
        System.out.println("abc => " + solution("abc"));
    }

    public static String solution(String s) {

        char[] arr = s.toCharArray();

        List<String> stringList = new ArrayList<>();
        int index = 1;
        int start = 0;

        while (index < arr.length) {
            if (arr[index] != arr[index - 1]) {
                String val = s.substring(start, index);
                start += val.length();
                stringList.add(val);
            }
            if (index == arr.length - 1) {
                String val = s.substring(start);
                stringList.add(val);
            }
            index++;
        }

        String result = "";
        for (String val : stringList) {
            if (val.length() >= 3) {
                result += val.substring(0, 2);
            } else {
                result += val;
            }
        }


        return result;
    }

}
