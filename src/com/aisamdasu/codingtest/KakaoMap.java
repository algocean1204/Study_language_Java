package com.aisamdasu.codingtest;

public class KakaoMap {
    public static void main(String[] args) {
        int map1[] = { 46, 33, 33, 22, 31, 50 };
		int map2[] = { 27, 56, 19, 14, 14, 10 };

        char resultMap[][] = new char[6][6];

        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < map1.length; i++){
            for(int j = 0; j < map1.length; j++){
                num1 = map1[i];
                num2 = map2[i];
                String change1 = String.format("%6s", Integer.toBinaryString(num1)).replace(' ', '0');
                String change2 = String.format("%6s", Integer.toBinaryString(num2)).replace(' ', '0');
                String result = "";
                for(int i2 = 0; i2 < change1.length(); i2++){
                    if(change1.charAt(i2) == '1' || change2.charAt(i2) == '1'){
                        result += '1';
                    }
                    else{
                        result += '0';
                    }
                }
                for(int i1 = 0; i1 < result.length(); i1++){
                     resultMap[i][i1] =  result.charAt(i1);
                }
            }
        }
        for(int i = 0; i < resultMap.length; i++){
            for(int j = 0; j < resultMap.length; j++){
                if(resultMap[i][j] == '1'){
                    System.out.print('#');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
