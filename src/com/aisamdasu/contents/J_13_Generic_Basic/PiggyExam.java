package com.aisamdasu.contents.J_13_Generic_Basic;

public class PiggyExam {
    public static void main(String[] args) {
        InPiggyBank inPiggyBank = new InPiggyBank();
        inPiggyBank.setMoney(1000);
        System.out.println(inPiggyBank.getMoney());

        DoublePiggyBank doublePiggyBank = new DoublePiggyBank();
        doublePiggyBank.setMoney(5.4);
        System.out.println(doublePiggyBank.getMoney());

        ObjectPiggyBank objectPiggyBank = new ObjectPiggyBank();
        objectPiggyBank.setMoney(1000);
        System.out.println(objectPiggyBank.getMoney());
        objectPiggyBank.setMoney(5.4);
        System.out.println(objectPiggyBank.getMoney());
        /*
        object 문제
         -> 타입 케스트를 통해 변경해야됨
         -> 들어갈때는 형변환 자동으로됨
         -> 빼올때는 직접 형변환 해야됨

         */
    }
}
