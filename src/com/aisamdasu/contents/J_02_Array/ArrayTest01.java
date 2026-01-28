package com.aisamdasu.contents.J_02_Array;
/*
1차원 배열
 */

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] scores = {100, 90, 85};

//		int[] scores = new int[]{100, 90, 85};
//		int[] scores = new int[3];
//		scores[0] = 100;
//		scores[1] = 90;
//		scores[2] = 85;

		System.out.println("배열 scores의 크기: " + scores.length);
		System.out.println("scores의 첫번째 항목: " + scores[0]);
		System.out.println("scores의 두번째 항목: " + scores[1]);
		System.out.println("scores의 세번째 항목: " + scores[2]);

		scores[1] = 70;
		System.out.println("scores의 바뀐 두번째 항목: " + scores[1]);

		System.out.println("------<배열 scores의 모든 항목 출력>-------");
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
    }
}
