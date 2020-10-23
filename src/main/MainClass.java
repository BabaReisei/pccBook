package main;

import questions.Ants;
import questions.LakeCounting;
import questions.Lottery;
import questions.PartialSum;
import questions.Triangle;

public class MainClass {

    public static void main(String[] args) {

        // Triangle
        Triangle.solve(4, new int[] {4, 5, 10, 20});

        // Ants
        Ants.solve(10, 3, new int[] {2, 6, 7});

        // Lottery
        Lottery.solve(3, 9, new int[] {1, 3, 5});

        // PartialSum
        PartialSum.solve(4, 15, new int[]{1, 2, 4, 7});

        // LakeCounting
        LakeCounting.solve(
                10,
                12,
                new char[][] {
            {'W', '.', '.', '.', '.', '.', '.', '.', '.', 'W', 'W', '.'},
            {'.', 'W', 'W', 'W', '.', '.', '.', '.', '.', 'W', 'W', 'W'},
            {'.', '.', '.', '.', 'W', 'W', '.', '.', '.', 'W', 'W', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', 'W', 'W', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', 'W', '.', '.'},
            {'.', '.', 'W', '.', '.', '.', '.', '.', '.', 'W', '.', '.'},
            {'.', 'W', '.', 'W', '.', '.', '.', '.', '.', 'W', 'W', '.'},
            {'W', '.', 'W', '.', 'W', '.', '.', '.', '.', '.', 'W', '.'},
            {'.', 'W', '.', 'W', '.', '.', '.', '.', '.', '.', 'W', '.'},
            {'.', '.', 'W', '.', '.', '.', '.', '.', '.', '.', 'W', '.'}
                }
                );
    }
}
