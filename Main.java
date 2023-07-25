package Online_Space.SpeedRecord;

import Online_Space.SpeedConverter.SpeedConverter;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        int dist, hrs, mins;
        double mph;


        Scanner keyboard = new Scanner(in);

        System.out.print("Enter the distance :: ");
        dist = keyboard.nextInt();

        System.out.print("Enter the hours :: ");
        hrs = keyboard.nextInt();

        System.out.print("Enter the minutes :: ");
        mins = keyboard.nextInt();

        Online_Space.SpeedConverter.SpeedConverter test = new SpeedConverter(dist, hrs, mins);
        test.calcMPH();
        test.print();
    }
}
