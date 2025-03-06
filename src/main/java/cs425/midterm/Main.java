package cs425.midterm;


import cs425.midterm.model.Patient;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient(100, "John", "Doe", "123 Main St", "555-555-5555", "fX4Rk@example.com", "1990-01-01"));
        patients.add(new Patient(101, "Jane", "Doe", "456 Main St", "555-555-5555", "fX4Rk@example.com", "1990-01-01"));
        patients.add(new Patient(102, "Bob", "Doe", "789 Main St", "555-555-5555", "fX4Rk@example.com", "1990-01-01"));
        patients.add(new Patient(103, "Alice", "Doe", "321 Main St", "555-555-5555", "fX4Rk@example.com", "1990-01-01"));

        patients.forEach(System.out::println);
    }
}