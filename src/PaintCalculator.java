import java.util.*;
import java.lang.Math;
public class PaintCalculator {
    public static void main(String[] args) {
        System.out.println("Paint Required \n");
        double paintAmount;
        double paintAmountWalls;

        String[] painternames = new String[19];
        painternames[0] = "Gary";
        painternames[1] = "Stevie";
        painternames[2] = "Phil";
        painternames[3] = "Jamie S";
        painternames[4] = "Jamie L";
        painternames[5] = "Joseph";
        painternames[6] = "Harry";
        painternames[7] = "Ryan";
        painternames[8] = "Robert";
        painternames[9] = "Barry";
        painternames[10] = "Adam";
        painternames[11] = "Yuge";
        painternames[12] = "Matthew";
        painternames[13] = "David";
        painternames[14] = "Daniel";
        painternames[15] = "Louis";
        painternames[16] = "Kshitij";
        painternames[17] = "William";
        painternames[18] = "Hashim";

        int max = 18;
        int min = 0;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range);

        System.out.println("\nYour painters name is: "+ painternames[rand] +"\n");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter room width: ");
        double roomWidth= sc.nextDouble();
        System.out.print("Enter room length: ");
        double roomLength= sc.nextDouble();
        System.out.print("Enter room height: ");
        double roomHeight= sc.nextDouble();
        System.out.print("\nYour room is: "+ roomWidth +" m wide, "+roomLength+ " m long & "+roomHeight+" m tall \n");

        double surfaceAreaShortWall = roomHeight * roomWidth;
        double surfaceAreaLongWall = roomHeight * roomLength;
        double surfaceAreaRoof = roomLength * roomWidth;
        double surfaceAreaWalls = (surfaceAreaLongWall * 2) + (surfaceAreaShortWall);
        double surfaceAreaTotal = surfaceAreaWalls + surfaceAreaRoof;

        System.out.println("The longer walls are: "+ surfaceAreaLongWall +" metres squared");
        System.out.println("The shorter walls are: "+ surfaceAreaShortWall +" metres squared");
        System.out.println("The roof is: "+ surfaceAreaRoof +" metres squared");
        System.out.println("The total surface area for four walls + roof is therefore: " +surfaceAreaTotal +" metres squared");
        System.out.println("Average litre can covers 6m of area");

        paintAmount = surfaceAreaTotal/6;
        paintAmountWalls = surfaceAreaWalls/6;
        System.out.println("\nTherefore, user needs " + paintAmount + " litres of paint");
        System.out.println("\nFor just the walls its "+ paintAmountWalls + " litres of paint");
    }
}