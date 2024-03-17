package org.example;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        zadacha();
    }
    public static void zadacha(){
        List<String> name = new ArrayList<>(List.of("Анна","Иван","Ольга"));
        System.out.println(name.stream().map(n -> n.substring(1)).sorted().toList());
    }
}