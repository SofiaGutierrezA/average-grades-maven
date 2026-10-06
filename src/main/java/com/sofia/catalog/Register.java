package com.sofia.catalog;

import java.util.ArrayList;

public class Register {
    private ArrayList<Double> list;
    public Register() {
        this.list = new ArrayList<>();
    }

    public void add(double grade) {
        list.add(grade);
    }
    public String averageOfGrades() {
        if (list.isEmpty()) {
            return "No grades yet.";
        }
        else {
            double average = 0;
            for (Double grade : list) {
                average += grade;
            }
            return String.format("Average: %.2f", (average / list.size())); //Convierte el número a String y
        }
    }
    public int count() {
        return list.size();
    }
    public String listGrades() {
        if (list.isEmpty()) return "No grades yet.";
        return list.toString();
    }
    public void clear() {
        list.clear();
    }
}
