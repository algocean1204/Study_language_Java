package com.aisamdasu.contents.J_04_ConstructorAndOverloading;

public class OrderExam {
    public static void main(String[] args) {
        Order order = new Order();

        order.setAppetizer("밥");
        order.setMaindish("불고기");
        order.setDessert("빵");
        order.setDrink("복분자주");
        order.setTogo(false);


        System.out.println("<주문 현황>");
        System.out.println("appetizer: " + order.getAppetizer());
        System.out.println("Maindish: " + order.getMaindish());

    }
}
