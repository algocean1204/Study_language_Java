package com.aisamdasu.contents.J_14_Generic;

// <>안에 타입변수를 컴파일러에 미리 알려줌
public class GenericPiggyBank<T> {
    private T money; // 타입에 대한 변수는 1글자의 대문자로 써야됨

    public T getMoney() {
        return money;
    }

    public void setMoney(T money) {
        this.money = money;
    }
}
