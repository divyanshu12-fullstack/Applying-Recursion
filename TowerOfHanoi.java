package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static int count;

    public static void solnForHanoi(int disks, String src, String desti, String helper) {
        if (disks == 0) {
            return;
        }
        solnForHanoi(disks - 1, src, helper, desti);

        System.out.println("Move " + disks + "th disk from " + src + " to " + desti);
        count++;
        solnForHanoi(disks - 1, helper, desti, src);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int disks = scn.nextInt();

        solnForHanoi(disks, "src", "desti", "helper");
        System.out.println(count);
        scn.close();
    }
}