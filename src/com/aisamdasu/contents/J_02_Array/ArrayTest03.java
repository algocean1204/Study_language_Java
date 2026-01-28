package com.aisamdasu.contents.J_02_Array;

/*
확장된 for문
 */
public class ArrayTest03 {

    public static void main(String[] args) {
        int[] scores = {100, 90, 85};

		for(int element: scores) {
			System.out.println(element);
		}
// ----------------------------------------------------------------------------------------------------
        int sum;
		int[][] termScores = {{90, 95, 80}, {95, 100, 75}};

        for(int[] row: termScores) {
            sum = 0;
            for(int column: row) {
                System.out.print(column + " ");
                sum += column;
            }
            System.out.println("평균: " + ((double)sum / row.length));
        }
    }
}
