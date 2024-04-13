package Lv1;

/*
   문자열 내 p와 y의 개수
   https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */

public class Lv1_12916 {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (str.substring(i, i+1).equals("y")) {
                count1++;
            } else if (str.substring(i, i+1).equals("p")) {
                count2++;
            }
        }

        return count1 == count2;
    }
}