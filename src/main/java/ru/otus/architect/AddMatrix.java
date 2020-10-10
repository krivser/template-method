package ru.otus.architect;

public class AddMatrix extends Matrix {
    public AddMatrix(String fileNameIn, String fileNameOut) {
        super(fileNameIn, fileNameOut);
        System.out.println("Операция - Сложение двух матриц");
    }

    @Override
    void loadMatrixFromFile() {
        System.out.println("Чтение двух матриц из файла...");
    }

    @Override
    void computeMatrix() {
        System.out.println("Сложение матриц...");
    }

    @Override
    void printMatrix() {
        System.out.println("Формирование данных для вывода в необходимом формате...");
    }

    @Override
    void saveMatrixToFile() {
        System.out.println("Сохранение матриц в выходной файл...");
    }
}
