package com.company;

public class MathEx {
    public static int digitSwapper(int input)
    {
        int basenum1=input%10;
        int basenum2=input%100-basenum1;
        int frontnum=input-basenum1-basenum2;
        basenum2=basenum2/10;
        basenum1=basenum1*10;
        int swapped= (frontnum+basenum1+basenum2);
        return swapped;
    }

    public static void timeLeft(int currHour, int currMin, int depHour, int depMin)
    {
       int fullmin=currMin+currHour*60;
       int depfull=depHour*60+depMin;
       int timediff= depfull-fullmin;
       int diffhr= timediff/60;
       int diffmin= timediff%60;
       System.out.println("Your train will arrive in:" + diffhr + "hrs and " + diffmin + "mins.");

        //PRINT the time left here in hours and minutes
    }
    public static int dayOfWeek(int daysOfWeek1, int day)
    {
        int offset= daysOfWeek1;
        int x= day -1  + offset;
        int finalday= x%7;
        return finalday;

        // returns an integer corresponding to the day of the week
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 6;
        output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input + " " + output);

        timeLeft(1, 34, 8, 20);
        timeLeft(1, 15, 4, 36);

        System.out.println(dayOfWeek(0, 1));
        System.out.println(dayOfWeek(0, 14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1, 24));
        System.out.println(dayOfWeek(2, 1));
    }
}


