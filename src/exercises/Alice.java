package exercises;

import java.util.Scanner;

public class Alice {


    public static String getArea(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: " );
        String name = sc.next();
        System.out.println("Hello " + name);

        System.out.println("What is the length of your rectangle? ");
        double length = sc.nextDouble();
        System.out.println("What is the height of your rectangle? ");
        double height = sc.nextDouble();

        double areaOfRectangle = length*height;

        String areaText = "The area of the rectangle is " + areaOfRectangle;
        return areaText;

    }

    public static String getMPG(){
        double mpg;

        Scanner sc = new Scanner(System.in);
        System.out.println("How far did you drive?");
        double miles = sc.nextDouble();
        System.out.println("How many gallons of gas were used?");
        double gallons = sc.nextDouble();
        mpg = miles/gallons;
        String milesPerGallon = "Your MPG was " + mpg;

        return milesPerGallon;
    }

    public static String findAlice(){
        boolean isFound = false;
        String success;
        Scanner sc = new Scanner(System.in);
        String aiw = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book," +
                "' thought Alice 'without pictures or conversation?'";
        System.out.println("What term would you like to search for? ");
        String prompt = sc.next();
        isFound = aiw.contains(prompt);
        if (isFound){
            success = "The term is in the text";
        }else{
            success = "The term was not found";
        }
        return success;
    }
}
