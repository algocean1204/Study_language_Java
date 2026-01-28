package com.aisamdasu.contents.J_02_Array;

/*
2차원 배열
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        int[][] termScores = {{90, 95, 80}, {95, 100, 75}};

//		int[][] termScores = new int[2][3];
//		int[] tom = {90, 95, 80};
//		int[] kate = {95, 100, 75};
//		termScores[0] = tom;
//		termScores[1] = kate;

		int sum;
		for(int row = 0; row < termScores.length; row++) {
			sum = 0;
			for(int column = 0; column < termScores[row].length; column++) {
				System.out.print(termScores[row][column] + " ");
				sum += termScores[row][column];
			}
			System.out.println("평균: " + ((double)sum / termScores[row].length));
		}
    }
}
