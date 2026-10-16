// Title: Convert the Temperature
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/convert-the-temperature/


class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;

        return new double[]{kelvin, fahrenheit};
    }
}

