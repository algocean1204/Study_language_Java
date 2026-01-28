package com.aisamdasu.contents.J_21_Special;

import java.util.Arrays;

public class SoilResearch {
    public static void main(String[] args) {
        // 1. 성분 목록 추출 및 출력
        String[] elements = getElements("carbon-dioxide,magnesium,sodium,potassium,chloride,water");
        printElement(elements);

        // 2. 샘플 데이터 추출 및 출력
        String sampleRawData = "8.3,4.5,6.7,2.3,12.5,4.5>3.9,1.8,34.7,23.5,1.2,14.3>6.7,7.4,1.5,18.4,7.2,23.7>23.4,5.6,2.9,18.5,39.5,18.2>15.4,5.3,27.4,9.8,3.8,27.4";
        double[][] samples = getSamples(sampleRawData);
        printSamples(samples);
    }

    // 쉼표로 구분된 문자열을 배열로 반환
    public static String[] getElements(String inputElementString) {
        return inputElementString.split(",");
    }

    public static double[][] getSamples(String inputSampleString) {
        String[] rows = inputSampleString.split(">");
        double[][] result = new double[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            String[] columns = rows[i].split(",");
            result[i] = new double[columns.length];

            for (int j = 0; j < columns.length; j++) {
                result[i][j] = Double.parseDouble(columns[j]);
            }
        }
        return result;
    }

    public static void printElement(String[] inputElements) {
        System.out.println("[ 분석 대상 성분 ]");
        for (int i = 0; i < inputElements.length; i++) {
            System.out.print(inputElements[i] + (i == inputElements.length - 1 ? "" : " | "));
        }
        System.out.println("\n");
    }

    public static void printSamples(double[][] samples) {
        System.out.println("[ 샘플 분석 결과 (2차원 배열) ]");
        for (int i = 0; i < samples.length; i++) {
            System.out.print("Sample " + (i + 1) + ": ");
            for (int j = 0; j < samples[i].length; j++) {
                System.out.printf("%5.1f ", samples[i][j]);
            }
            System.out.println();
        }
    }
}