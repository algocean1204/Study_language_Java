package com.aisamdasu.contents.J_27_Enum.step2;

public class DayExam {
    // 상수만 파악하기 어렵고,
    // 동일한 상수이름이면 문제 생김
    private static final int Monday = 1;
    private static final int Tuesday = 2;
    private static final int Wednesday = 3;
    private static final int Thursday = 4;
    private static final int Friday = 5;
    private static final int Saturday = 6;
    private static final int Sunday = 7;

    public static void main(String[] args) {
        int day = Tuesday;

        switch (day) {
            case Monday:
                System.out.println("It's Monday");
                break;
            case Tuesday:
                System.out.println("It's Tuesday");
                break;
            case Wednesday:
                System.out.println("It's Wednesday");
                break;
            case Thursday:
                System.out.println("It's Thursday");
                break;
            case Friday:
                System.out.println("It's Friday");
                break;
            case Saturday:
                System.out.println("It's Saturday");
                break;
            case Sunday:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("It's Not Monday");
        }
    }
}
