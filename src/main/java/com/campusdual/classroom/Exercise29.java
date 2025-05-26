package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception throwed");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
