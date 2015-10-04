package com.epam.module1.task05;

/**
 * Created by pxjoke on 03.10.2015.
 */
class Matrix {
    private final int dimension;
    private final int[][] matrix;

    public Matrix(int dimension) {
        this.dimension = Math.abs(dimension);
        matrix = new int[dimension][dimension];
        generate();
    }

    private void generate() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if ((i == j) || (i == (dimension - j - 1))) matrix[i][j] = 1;
            }
        }
    }

    public void print() {
        System.out.println("------------------------------");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
}
