package ru.otus.architect;

public abstract class Matrix {
    protected int[][] matrix;
    private String fileNameIn, fileNameOut;

    public Matrix(String fileNameIn, String fileNameOut) {
        this.fileNameIn = fileNameIn;
        this.fileNameOut = fileNameOut;
    }

    public final void compute() {
        loadMatrixFromFile();
        computeMatrix();
        printMatrix();
        saveMatrixToFile();
    }

    abstract void loadMatrixFromFile();
    abstract void computeMatrix();
    abstract void printMatrix();
    abstract void saveMatrixToFile();
}
