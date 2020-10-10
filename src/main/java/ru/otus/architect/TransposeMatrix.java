package ru.otus.architect;

public class TransposeMatrix extends Matrix {
    public TransposeMatrix(String fileNameIn, String fileNameOut) {
        super(fileNameIn, fileNameOut);
        System.out.println("Операция - Транспонирование матрицы");
    }

    @Override
    void loadMatrixFromFile() {
        System.out.println("Чтение матрицы из файла...");
    }

    @Override
    void computeMatrix() {
        System.out.println("Транспонирование матрицы...");
    }

    @Override
    void printMatrix() {
        System.out.println("Формирование данных для вывода в необходимом формате...");
    }

    @Override
    void saveMatrixToFile() {
        System.out.println("Сохранение матрицы в выходной файл...");
    }
}
