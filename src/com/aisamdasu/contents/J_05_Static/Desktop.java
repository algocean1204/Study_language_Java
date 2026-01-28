package com.aisamdasu.contents.J_05_Static;

public class Desktop {
    private static String cpu = "8 core";
	private static String memory = "RAM 32GB";
	private static String video = "RTX 3060 8GB";
	private static String feature;

    public static String getCpu() {
        return cpu;
    }

    public static void setCpu(String cpu) {
        Desktop.cpu = cpu;
    }

    public static String getMemory() {
        return memory;
    }

    public static void setMemory(String memory) {
        Desktop.memory = memory;
    }

    public static String getVideo() {
        return video;
    }

    public static void setVideo(String video) {
        Desktop.video = video;
    }

    public static String getFeature() {
        return feature;
    }

    public static void setFeature(String feature) {
        Desktop.feature = feature;
    }
}
