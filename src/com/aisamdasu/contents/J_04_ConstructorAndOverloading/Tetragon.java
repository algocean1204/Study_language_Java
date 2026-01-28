package com.aisamdasu.contents.J_04_ConstructorAndOverloading;

/*
메서드 오버로딩
return 타입과 무관함.
이름과 메개변수로 구분됨
 */
public class Tetragon {
    public int getSquareArea(int x) {
		return x * x;
	}

	public int getSquareArea(int x, int y) {
		return x * y;
	}

    public int getSquareArea(int x, double y){
        return x * (int)y;
    }
}
