package ru.otus.architect;

public class DeterminantMatrix extends Matrix {
    public DeterminantMatrix(String fileNameIn, String fileNameOut) {
        super(fileNameIn, fileNameOut);
        System.out.println("Операция - Поиск определителя матрицы");
    }

    @Override
    void loadMatrixFromFile() {
        System.out.println("Чтение матрицы из файла...");
    }

    @Override
    void computeMatrix() {
        System.out.println("Найти определить матрицы...");
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
