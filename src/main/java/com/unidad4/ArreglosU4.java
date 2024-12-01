package com.unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class ArreglosU4 {

    //Creacion de variables
    int[] arreglo = new int[100];
    Scanner scanner = new Scanner(System.in);
    int opcion;

    public void menu() {
        llenarArregloAleatorio(arreglo);
        //utilizando el do while para despues de escoger una opcion esta vuelva a mostrar el menu de opciones
        do {
            System.out.println("===========================================================");
            System.out.println("===========================================================");
            System.out.println("============ Menú de Opciones: ============================");
            System.out.println("=============1. Encontrar el número mayor =================");
            System.out.println("=============2. Encontrar el número menor =================");
            System.out.println("=============3. Numeoro primos =================");
            System.out.println("=============4. Encontrar los numeros multiplos de 5 ======");
            System.out.println("=============5. Ordenar los numeros en forma Ascendente ===");
            System.out.println("=============6. Encontrar el promedio =====================");
            System.out.println("=============7. Salir =====================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            //opciones a escoger 
            switch (opcion) {
                case 1:
                    int mayor = numeroMayor(arreglo);//metodo que retorna el valor mayor
                    System.out.println("El número mayor es: " + mayor);
                    break;
                case 2:
                    int menor = numeroMenor(arreglo);//metodo que retorna el valor menor
                    System.out.println("El número menor es: " + menor);
                    break;
                case 3:
                    System.out.println("Numeros primos");
                    numeroPrimo(arreglo);//metodo que selecciona los multiplos de 5
                    break;
                case 4:
                    System.out.println("Estos son los mutliplos de 5");
                    MultiplosDeCinco(arreglo);//metodo que selecciona los multiplos de 5
                    break;
                case 5:
                    ordenarFormaAscendente(arreglo); 
                    System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
                    break;
                case 6:
                    int sumaTotal = promedioElementos(arreglo); 
                    double promedio = sumaTotal/arreglo.length;
                    System.out.println("El promedio es: "+promedio);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    public void llenarArregloAleatorio(int[] arreglo) {
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(101); // Números aleatorios entre 0 y 100
            System.out.println("areglo " + arreglo[i]);
        }
    }

    /*
    Método que reciba como parámetro un arreglo unidimensional de enteros y devuelva el
    número mayor.
     */
    public int numeroMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int numero : arreglo) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    /*
    Método que reciba como parámetro un arreglo unidimensional de enteros y devuelva el
    número menor.
     */
    public int numeroMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int numero : arreglo) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
    
    public void numeroPrimo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if (esPrimo(arreglo[i])) {
                System.out.print(arreglo[i] + " ");
            }
        }
        System.out.println();
    }
    
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
    Método que reciba como parámetro un arreglo unidimensional de enteros y muestre en
    consola todos los números primos que contiene el arreglo
     */
    public void MultiplosDeCinco(int[] arreglo) {
        for (int numero : arreglo) {
            if (numero % 5 == 0) {
                System.out.print(numero + " ");
            }
        }
    }

    /*
    Método que reciba como parámetro un arreglo unidimensional de enteros y muestre en
    consola los elementos del arreglo ordenados de forma descendente.
    */
    public void ordenarFormaAscendente(int[] arreglo) {
        //metodo utilizado de la burbuja  
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    /*
    Método que reciba como parámetro un arreglo unidimensional de enteros y devuelva el
    promedio de todos sus elementos
    */
    public int promedioElementos(int[] arreglo) {
        int promedio=0; 
        for (int i = 0; i < arreglo.length; i++) {
            promedio = promedio + arreglo[i];
        }
        return promedio;
    }
}
