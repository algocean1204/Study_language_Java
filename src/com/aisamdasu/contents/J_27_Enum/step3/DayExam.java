package com.aisamdasu.contents.J_27_Enum.step3;

public class DayExam {

    public static void main(String[] args) {
        // 가끔 휴먼에러가 터질 가능성이 생긴다.
        int day = Day.tuesday;

        switch (day) {
            case Day.monday:
                System.out.println("It's Monday");
                break;
            case Day.tuesday:
                System.out.println("It's Tuesday");
                break;
            case Day.wednesday:
                System.out.println("It's Wednesday");
                break;
            case Day.thursday:
                System.out.println("It's Thursday");
                break;
            case Day.friday:
                System.out.println("It's Friday");
                break;
            case Day.saturday:
                System.out.println("It's Saturday");
                break;
            case Day.sunday:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("It's Not Monday");
        }
    }
}
