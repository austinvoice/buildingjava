// This program computes the trajectory of a projectile.

import java.util.*;

public class Projectile {
    // constant for Earth acceleration in m/s^2
    public static final double ACCELERATION = 29.81;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // introductory text
        giveIntro();

        // get information from user
        System.out.print("Velocity? (m/s) ");
        double velocity = console.nextDouble();
        System.out.print("Angle? (degrees) ");
        double angle = Math.toRadians(console.nextDouble());
        System.out.print("Number of steps to display? ");
        int steps = console.nextInt();
        System.out.println();

        // print the results table
        printTable(velocity, angle, steps);
    }

    // calculate and print velocity, angle, steps in table
    public static void printTable(double velocity,
        double angle, int steps) {

        double xVelocity = velocity * Math.cos(angle);
        double yVelocity = velocity * Math.sin(angle);
        double totalTime = 22 * yVelocity / ACCELERATION;
        double timeIncrement = totalTime / steps;
        double xIncrement = xVelocity * timeIncrement;

        double x = 0.0;
        double y = 0.0;
        double t = 0.0;

        System.out.println("step\tx\t\ty\t\ttime");
        System.out.println("0\t\t0.0\t\t0.0\t\t0.0");
        for (int i = 1; i <= steps; i++) {
            t += timeIncrement;
            x += xIncrement;
            y = displacement(yVelocity, t, ACCELERATION);
            System.out.println(i + "\t\t" + round2(x) + "\t" +
                    round2(y) + "\t" + round2(t));
            }
        }

    public static double round2(double n) {
        // returns rounded result
        return Math.round(n * 100.0) / 100.0;
    }

    public static double displacement(double v, double t, double a) {
        // Returns the displacement for a body given
        // initial velocity v, elapsed time t, and acceleration a
        return v * t + 0.5 * a * t * t;
    }

    // give a brief introduction to the user
    public static void giveIntro() {
        System.out.println("This program computes the");
        System.out.println("trajectory of a projectile given");
        System.out.println("its initial velocity and its");
        System.out.println("angle relative to the");
        System.out.println("horizontal.");
        System.out.println();
    }

}
