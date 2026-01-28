package com.aisamdasu.contents.J_04_ConstructorAndOverloading;

public class NewOrderExam {
    public static void main(String[] args) {
        NewOrder order = new NewOrder("죽","불고기","약과","복분자주",false);

        System.out.println("<주문 현황>");
		System.out.println("appetizer: " + order.appetizer());
		System.out.println("maindish: " + order.maindish());
		System.out.println("dessert: " + order.dessert());
		System.out.println("drink: " + order.drink());
		System.out.println("togo: " + order.togo());
		System.out.println("-----------------------------------");
		System.out.println(order);
    }
}
