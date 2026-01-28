package com.aisamdasu.contents.J_02_Array;

public class SelfTest01 {
    public static void main(String[] args) {
        int sales[] = { 52, 62, 30, 95, 77, 0, 100 };
        char graph[][] = new char[10][7];
        char Dot = '.';
        char Zero = '0';

        int j = 0;
        for(int Number : sales){
            int height = Number / 10;

            for(int i = 0; i < 10; i++){
                if(i >= (10 - height)){
                    graph[i][j] = Zero;
                }
                else {
                    graph[i][j] = Dot;
                }
            }
            j++;
        }

        System.out.println("--------<그래프>--------------");
        for(char[] row : graph) {
            for(char column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------");
        System.out.println("1 2 3 4 5 6 7");
    }
}