package com.unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class MatrizesU4 {

    int[][] matriz = new int[5][5];
    Scanner scanner = new Scanner(System.in);
    int opcion;

    public void menuMatriz() {
        llenarMatrizAleatorio(matriz);
        imprimirMatriz(matriz);

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("===================   Menú de Opciones:  ");
            System.out.println("== 1. Calcular y mostrar el promedio de los elementos de la matriz");
            System.out.println("== 2. Calcular y mostrar el número mayor y la cantidad de veces que éste se repite en la matriz.");
            System.out.println("== 3. Mostrar todos los números primos que contiene la matriz.");
            System.out.println("== 4. Mostrar todos los números pares que contiene la matriz");
            System.out.println("== 5. Calcular y mostrar la suma de los elementos de la última fila");
            System.out.println("== 6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            //opciones a escoger 
            switch (opcion) {
                case 1:
                    int[][] matrizPromedio = matriz;
                    double promedio = calcularPromedio(matrizPromedio);
                    System.out.println("El promedio de los elementos de la matriz es: " + promedio);
                    break;
                case 2:
                    int[][] matrizMayRep = matriz;
                    calcularNumeroMayorVecesRepiteMatriz(matrizMayRep);
                    break;
                case 3:
                    int[][] matrizPrimos = matriz;
                    numerosPrimos(matrizPrimos); 
                    break;
                case 4:
                    int[][] matrizNumPares = matriz;
                    System.out.print("Números pares en la matriz: ");
                    numerosPares(matrizNumPares);
                    break;
                case 5:
                    int[][] sumUltFila = matriz;
                    sumaElementosUltimaFila(sumUltFila);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    public void llenarMatrizAleatorio(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(101); // Números aleatorios entre 0 y 100
            }
        }
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public double calcularPromedio(int[][] matriz) {
        int suma = 0;
        int totalMatriz=0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                totalMatriz++;
            }
        }
        double promedio = (double) suma /  totalMatriz;
        System.out.println("lenght"+totalMatriz);
        return promedio;
    }
    
    /*
    Calcular y mostrar el número mayor y la cantidad de veces que éste se repite en la matriz
    */
    public void calcularNumeroMayorVecesRepiteMatriz(int[][] matriz){
        int mayor = matriz[0][0];
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    contador = 1;
                } else if (matriz[i][j] == mayor) {
                    contador++;
                }
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("Se repite " + contador + " veces en la matriz.");
    }
    
    /*
    Mostrar todos los números primos que contiene la matriz.
    */
    public void numerosPrimos(int[][] matriz){
        System.out.print("Números primos en la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esPrimo(matriz[i][j])) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
    
    
    //retorna un verdadero o false 
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    /*
    Mostrar todos los números pares que contiene la matriz
    */
    public void numerosPares(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
    
    /*
    Calcular y mostrar la suma de los elementos de la última fila
    */
    public void sumaElementosUltimaFila(int[][] matriz){
        int suma = 0;//variable que almacena la suma
        int ultimaFila = matriz.length - 1;//Variable que selecciona la ultima fila
        for (int j = 0; j < matriz[ultimaFila].length; j++) {//Realiza el recorrido de la matriz
            suma += matriz[ultimaFila][j];//Suma la ultima fila de la matriz
        }
        System.out.println("La suma de los elementos de la última fila es: " + suma);
    }
}
