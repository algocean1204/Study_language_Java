package com.aisamdasu.contents.J_27_Enum.step1;

public class DayExam {
    public static void main(String[] args) {

        // 왜 enum이 필요하고, 만들어 지게 되었는가?
        int day = (int) (Math.random() * 7) + 1;

        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("It's Not Monday");
        }


    }
}
