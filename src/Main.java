import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0.0;
        double efficiency = 0.0;
        double pricePerGallons = 0.0;
        double costPer100Miles = 0.0;
        double distance = 0.0;
        boolean done = false;

        do
        {
            System.out.println("Please enter how many gallons your fuel tank holds: ");
            if (in.hasNextDouble())
            {
                gallons = in.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Please enter a valid gallon size!");
                in.next();
            }
        }while (!done);
        do
        {
            System.out.println("Please enter your fuel efficiency: ");
            if (in.hasNextDouble())
            {
                efficiency = in.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Please enter a valid fuel efficiency!");
                in.next();
            }
        }while (!done);
        do
        {
            System.out.println("Please enter the price per gallon: ");
            if (in.hasNextDouble())
            {
                 pricePerGallons= in.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Please enter a valid gallon size ");
                in.next();
            }
        }while (!done);

        costPer100Miles = (100/efficiency) * pricePerGallons;
        distance = gallons * efficiency;

        System.out.println("The cost per 100 miles is: " + costPer100Miles);
        System.out.println("The distance you can travel is: " + distance);

    }
}