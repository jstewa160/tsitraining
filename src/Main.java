import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Paint Required \n");
        double paintAmount;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter room width: ");
        int roomWidth= sc.nextInt();
        System.out.print("Enter room height: ");
        int roomHeight= sc.nextInt();
        System.out.print("Enter room length: ");
        int roomLength= sc.nextInt();
        System.out.print("Your room is: "+ roomWidth +" m wide, "+roomLength+ " m long & "+roomHeight+" m tall ");


        int surfaceAreaShortWall = roomHeight * roomWidth;
        int surfaceAreaLongWall = roomHeight * roomLength;
        int surfaceAreaRoof = roomLength * roomWidth;
        int surfaceAreaTotal = (surfaceAreaLongWall * 2) + (surfaceAreaShortWall * 2);

        System.out.println("The longer walls are: "+ surfaceAreaLongWall +" metres squared");
        System.out.println("The shorter walls are: "+ surfaceAreaShortWall +" metres squared");
        System.out.println("The roof is: "+ surfaceAreaRoof +" metres squared");
        System.out.println("The total surface area for four walls + roof is therefore: " +surfaceAreaTotal);
        System.out.println("Average litre can covers 6.5m of area");

        paintAmount = surfaceAreaTotal/6.5;
        System.out.println("Therefore, user needs " + paintAmount + " litres of paint");
    }
}