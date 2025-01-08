package com.example.project;

public class Horse {
    private String name;
    private int weight;

    // Constructor to initialize the horse with name and weight
    public Horse(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // Getter for the horse's name
    public String getName() {
        return name;
    }

    // Getter for the horse's weight
    public int getWeight() {
        return weight;
    }

    // Method to return a string representation of the horse
    public String horseInfo() {
        return "name: " + name + ", weight: " + weight;
    }
}


