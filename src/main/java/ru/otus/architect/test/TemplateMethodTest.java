package ru.otus.architect.test;

import ru.otus.architect.AddMatrix;
import ru.otus.architect.DeterminantMatrix;
import ru.otus.architect.Matrix;
import ru.otus.architect.TransposeMatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemplateMethodTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Matrix matrix = null;
        String fileIn = "inputFile.txt";
        String fileOut = "outputFile.txt";

        System.out.println("Выберите тип операции с матрицами:\n" +
                "1 - Транспонирование матрицы\n" +
                "2 - Сложение двух матриц\n" +
                "3 - Поиск определителя матрицы\n");
        System.out.print("Ваш выбор: ");
        int choice = Integer.parseInt(reader.readLine());

        if (choice < 1 || choice > 3) {
            throw new IllegalArgumentException("Неверный тип операции");
        }

        if (choice == 1) {
            matrix = new TransposeMatrix(fileIn, fileOut);
        } else if (choice == 2) {
            matrix = new AddMatrix(fileIn, fileOut);
        } else if (choice == 3) {
            matrix = new DeterminantMatrix(fileIn, fileOut);
        }

        matrix.compute();
    }
}
