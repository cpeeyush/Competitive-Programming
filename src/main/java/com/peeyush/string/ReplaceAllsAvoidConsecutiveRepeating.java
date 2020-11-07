package com.peeyush.string;

/***
 * https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/
 */
public class ReplaceAllsAvoidConsecutiveRepeating {

    public static void main(String[] args) {
        System.out.println(modifyString("?zs"));
        System.out.println(modifyString_sol2("?zs"));
    }

    public static String modifyString_sol2(String s) {
        char[] arr = s.toCharArray();
        char l = '#';
        char r = '#';
        int newChar = 97;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                if (i > 0) {
                    l = arr[i - 1];
                }
                if (i < arr.length - 1) {
                    r = arr[i+1];
                }

                while (newChar == l || newChar == r) {
                    newChar++;
                }
                arr[i] = (char)newChar;
            }
            l = '#';
            r = '#';
            newChar = 97;
        }

        return String.valueOf(arr);
    }

    public static String modifyString(String s) {
        int min = 97;
        int max = 122;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {

                if (arr.length == 1) {

                    arr[i] = (char) min;

                } else {
                    for (int j = min; j <= max; j++) {
                        char newChar = (char) j;
                        if (i > 0 && i < arr.length - 1) {

                            if (newChar != arr[i - 1] && newChar != arr[i + 1]) {
                                arr[i] = newChar;
                                break;
                            }

                        } else if (i == 0) {
                            if (newChar != arr[i + 1]) {
                                arr[i] = newChar;
                                break;
                            }

                        } else {
                            // last one or one letter.
                            if (newChar != arr[i - 1]) {
                                arr[i] = newChar;
                                break;
                            }
                        }
                    }
                }


            }
        }

        return String.valueOf(arr);
    }

}
