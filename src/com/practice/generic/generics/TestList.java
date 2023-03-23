package com.practice.generic.generics;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List <String> list =new ArrayList<>();
        list.add("Rose");
        list.add("Lily");
        list.add("Sunflower");
        list.add("Daisy");
        list.add("Orchid");
        list.add("Lavender");
        list.add("Lavender");
        list.add("Marigold");
        list.add("null");

        System.out.println("++++++++++++++++++++++++++++++++++++");

        list.remove(2);
        System.out.println(list.get(2));
        System.out.println("*********************************");
        list.add(2, "Cosmos");
        System.out.println("*********************************");
        System.out.println(list.get(2));
        System.out.println("*******************************");

        for (String s: list){
            System.out.println(s);
        }
    }
}
