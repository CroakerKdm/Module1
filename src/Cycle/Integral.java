package Cycle;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module1
 * @class Integal
 * @since 13.03.2021 - 15.40
 **/

public class Integral {

    public static double getIntegral (int secant) {
        double start = 0;
        double finish = Math.PI;
        int steps = 100;
        double step = (finish - start) / steps;
        double area = 0;
        double height = 0;
        double currentArea = 0;

        for (int i = 0; i < steps; i++) {
            if (Math.sin(i * step) < 0.1 * secant) {
                height = Math.sin(i * step);
            } else {
                height = 0.1 * secant;
            }
            currentArea = height * step;
            area = area + currentArea;
        }

        return area;
    }

    public static void main (String[] args) {
        System.out.println("Integral = " + getIntegral(8));
    }
}
