package Cycle;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module1
 * @class AboutMe
 * @since 13.03.2021 - 14.56
 **/

public class AboutMe {

    public static void main (String[] args) {
        System.out.println("8 facts about me:");

        byte myAge = 21;
        System.out.println("I am " + myAge + " years old.");

        short myBooks = 300;
        System.out.println("I own more than " + myBooks + " books.");

        int mySalary = 13_000;
        System.out.println("I work for " + mySalary + " a month.");

        long humanNeurons = 16_000_000_000L;
        System.out.println("Approximate number of neurons in my brain is " + humanNeurons + ".");

        float height = 176.5F;
        System.out.println("My height is " + height + " cms.");

        double weight = 83.5;
        System.out.println("My weight is " + weight + " kgs.");

        char bloodType = 'O';
        System.out.println("My blood type is " + bloodType + ".");

        boolean isHighestMark = true;
        System.out.println("I am certain i`ll have highest mark for this work. It is " + isHighestMark + ".");
    }
}
