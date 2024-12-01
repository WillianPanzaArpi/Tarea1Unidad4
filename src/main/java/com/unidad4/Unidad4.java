package com.unidad4;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Unidad4 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int temperatura;
//        System.out.print("Ingrese la temperatura en grados Celsius: ");
//        temperatura = scanner.nextInt();
//
//        if (temperatura < 0) {
//            System.out.println("Congelado");
//        } else if (temperatura >= 0 && temperatura <= 15) {
//            System.out.println("Frio");
//        } else if (temperatura >= 16 && temperatura <= 25) {
//            System.out.println("Moderado");
//        } else {
//            System.out.println("Caliente");
//        }
//        ArreglosU4 vecU4 = new ArreglosU4();
//        //vecU4.menu();
//
//        MatrizesU4 matU4 = new MatrizesU4();
//        //matU4.menuMatriz();
//
//        int[][] matriz = new int[4][4];
//        int value = 1;
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                matriz[i][j] = value;
//                value++;
//            }
//        }
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(matriz[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        //Crar matriz tipo float
//        float[][] matrizf = {
//            {1.2f, 2.3f, 3.4f, 4.5f},
//            {5.6f, 6.7f, 7.8f, 8.9f},
//            {9.1f, 10.2f, 11.3f, 12.4f},
//            {13.5f, 14.6f, 15.7f, 16.8f}
//        };
//        int indiceFila = 2;
//        float resultado = sumaFila(matrizf, indiceFila);
//
//        System.out.println("La suma de los elementos de la fila " + indiceFila + " es: " + resultado);
//        int[][] datos = {{1, 2}, {3, 4}};
//
//        modificarMatriz(datos);
        //Operaciones operacion = new Operaciones();
//        int resultado1 = calcularResultado(12, 2);
//
//        double resultado2 = calcularResultado(2.5, 4.0);
//
//        double resultado3 = calcularResultado(12, 2.0);
//
//        System.out.println("Resultado1: " + resultado1);
//
//        System.out.println("Resultado2: " + resultado2);
//
//        System.out.println("Resultado3: " + resultado3);
        int a = 8;

        int b = 3;

        int c = 5;

        int resultado = 0;

        resultado = (a * b + c) / 2;

        resultado += a % b;

        resultado *= c;
        System.out.println("resultado: " + resultado);

    }

    public static int calcularResultado(int a, int b) {

        return a + b;

    }

    public static double calcularResultado(double a, double b) {

        return a * b;

    }

    public static double calcularResultado(int a, double b) {

        return a / b;

    }

    public static float sumaFila(float[][] matriz, int indiceFila) {
        float suma = 0;
        for (int i = 0; i < matriz[indiceFila].length; i++) {
            suma += matriz[indiceFila][i];
        }
        return suma;
    }

    public static void modificarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {

                    matriz[i][j] += 10;

                }
                System.out.println(matriz[i][j]);
            }
            System.out.print("");

        }

    }

}
