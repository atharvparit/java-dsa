// Find the shortest path for a given route

package com.atharv.dsa.strings;

import java.util.Scanner;

public class ShortestPath {

    public static float getShortestPath(String path) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {

            char direction = path.charAt(i);

            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'E') {
                x++;
            } else if (direction == 'W') {
                x--;
            }
        }

        int xSquare = x * x;
        int ySquare = y * y;

        return (float) Math.sqrt(xSquare + ySquare);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter path : ");
        String path = in.nextLine().toUpperCase();

        float shortestPath = getShortestPath(path);

        System.out.println("Shortest Path = " + shortestPath);

        in.close();
    }
}