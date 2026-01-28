package com.aisamdasu.contents.J_01_BasicSyntax;

public class SwitchTest {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
		}

        switch (num) {
		case 1:
		case 3:
		case 5:
			System.out.println("홀수");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("짝수");
		}

        int lastDate;
		boolean isLeapYear = true;
		String month = "March";

        switch (month) {
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			lastDate = 31;
			break;
		case "February":
			lastDate = !isLeapYear ? 28 : 29;
			break;
		case "April":
		case "June":
		case "September":
		case "November":
			lastDate = 30;
			break;
		default:
			throw new IllegalArgumentException("Invalid month: " + month);
		}

        System.out.println(month + "'s last day is " + lastDate);

        lastDate = switch (month) {
			case "January", "March", "May", "July", "August", "October", "December" -> 31;
			case "February" -> !isLeapYear ? 28 : 29;
			case "April", "June", "September", "November" -> 30;
			default -> throw new IllegalArgumentException("Invalid month: " + month);
		};
		System.out.println(month + "'s last day is " + lastDate);


        int year = 2024;
		month = "February";
		lastDate = switch (month) {
			case "January", "March", "May", "July", "August", "October", "December" -> 31;
			case "February" -> {
				boolean isLeap = (year % 4 == 0) == (year % 100 == 0) == (year % 400 == 0);
				yield !isLeap ? 28 : 29;
			}
			case "April", "June", "September", "November" -> 30;
			default -> throw new IllegalArgumentException("Invalid month: " + month);
		};
		System.out.println(month + "'s last day is " + lastDate);
    }
}
