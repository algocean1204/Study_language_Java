package com.aisamdasu.contents.J_24_Collection.Map;

import java.util.*;

public class MapExam {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("국어",90);
        map.put("수학",40);
        map.put("영어",60);
        map.put("과학",100);

        // size 확인
        System.out.println("총 Entry: " + map.size());

        // 요소 확인
        System.out.println("국어 점수: " + map.get("국어"));

        // 키값만 set 으로 추출
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator(); // iterator 객체 얻음

        // 반복하여 전부 출력
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }

        for(String key : keySet){
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }

        // iterator 객체를 추출해서 확장 for문으로 List 출력
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("C#");
        list.add("Objective-C");

        // 일반 출력
        for(String value : list){
            System.out.println(value);
        }
        // iterator 객체 추출해서 출력
        //  방법 1
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }
        //  방법 1 요약
        Iterator<String> i = list.iterator();
        while (i.hasNext()){
            String e = i.next();
            System.out.println(e);
        }

        map.remove("국어");
        System.out.println("총 Entry: " + map.size());


        // ======================================================

        // 엔트리를 전부 뽑음
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();

        // 키, 값 받아서 전부 출력
        while (entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        //  확장 for문으로 출력
        //  방법 1
        for(String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }
        //  방법 2
        for(Map.Entry<String,Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // 내부 비우기
        map.clear();
        System.out.println("총 Entry: " + map.size());

    }
}
