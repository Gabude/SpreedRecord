package Online_Space.SpeedRecord;

public class SpeedConverter {

    private int distance;
    private int hours;
    private int minutes;
    double mph;

    public SpeedConverter(int dist, int hrs, int mins)
    {
        distance = dist;
        hours = hrs;
        minutes = mins;

    }

    public void setNums(int dist, int hrs, int mins)
    {
    }

    public void calcMPH()
    {

        mph = (distance)/(hours + (minutes/60.0));

    }

    public void print()
    {
        System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + mph + "MPH.");

    }


}
