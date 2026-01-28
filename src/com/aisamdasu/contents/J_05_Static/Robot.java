package com.aisamdasu.contents.J_05_Static;

public class Robot {
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static int getPopulation() {
        return population;
    }

    public static void setPopulation(int population) {
        Robot.population = population;
    }

    private static int population;

    public Robot(String name, String job) {
        this.name = name;
        this.job = job;
        population = population + 1;
    }
}
