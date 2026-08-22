import java.util.Scanner;

//A water tank has a capacityh of 1000L water is being filled at a rate of x literes per min simulate the filling process by min by min after every 100L added print the curr water level stop when the tank is full print the total time taken and final water level now ans

public class Water_tanker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float tanker_capacity = 1000;
        System.out.println("enter the amount of water in liters is being added per min: ");
        float x = sc.nextFloat();

        float current_water_level = 0;
        int time = 0;

        while (current_water_level < tanker_capacity){
            current_water_level += x;
            time++;
            if (current_water_level > tanker_capacity) {
                System.out.println("Amount of water overflowed: " + (current_water_level - tanker_capacity));
                current_water_level  -= current_water_level - tanker_capacity;
            }
            System.out.println("Tanker current water level " + current_water_level + "L After " + time + "min");
        }

        System.out.println("Total Time taken: " + time);
        System.out.println("Tanker current water level " + current_water_level);
    }
}
