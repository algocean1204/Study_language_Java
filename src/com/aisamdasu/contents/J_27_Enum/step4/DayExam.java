package com.aisamdasu.contents.J_27_Enum.step4;

public class DayExam {
    public static void main(String[] args) {
//        // 사전에 문제 생길것을 차단해줌
//        if(Day.Monday == Month.August){
//            System.out.println("It's same! ");
//        }


        // Day.Monday를 사용할 수 없음 -> 문제점
        Day day = Day.Tuesday;

        switch (day) {
            case Day.Monday:
                System.out.println("It's Monday");
                break;
            case Day.Tuesday:
                System.out.println("It's Tuesday");
                break;
            case Day.Wednesday:
                System.out.println("It's Wednesday");
                break;
            case Day.Thursday:
                System.out.println("It's Thursday");
                break;
            case Day.Friday:
                System.out.println("It's Friday");
                break;
            case Day.Saturday:
                System.out.println("It's Saturday");
                break;
            case Day.Sunday:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("It's Not Monday");
        }
    }
}
