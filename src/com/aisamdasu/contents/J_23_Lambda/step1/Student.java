package com.aisamdasu.contents.J_23_Lambda.step1;

public class Student {
    private int englishScore;
    private int mathScore;
    private String name;
    public Student(int englishScore, int mathScore, String name) {
        super();
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.name = name;
    }
    public int getEnglishScore() {
        return englishScore;
    }
    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }
    public int getMathScore() {
        return mathScore;
    }
    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
