package com.aisamdasu.contents.J_27_Enum.step5;

public class DayExam {
    public static void main(String[] args) {
        // 객체 타입이 다르니까 여전히 안됨
//        if(Day.MONDAY == Month.August){
//            System.out.println("It's same");
//        }

        // switch 에서 사용가능한 특별한 객체를 만들었음
        // 자바에서 enum은 객체임, 생성자를 자동으로 생성해줌
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println(Day.MONDAY.ordinal());
                break;
            case TUESDAY:
                System.out.println(Day.TUESDAY.ordinal());
                break;
            case WEDNESDAY:
                System.out.println(Day.WEDNESDAY.ordinal());
                break;
            case THURSDAY:
                System.out.println(Day.THURSDAY.ordinal());
                break;
            case FRIDAY:
                System.out.println(Day.FRIDAY.ordinal());
                break;
            case SATURDAY:
                System.out.println(Day.SATURDAY.ordinal());
                break;
            case SUNDAY:
                System.out.println(Day.SUNDAY.ordinal());
                break;
            default:
                break;
        }
    }
}
