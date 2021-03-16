package com.davidfb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String nombre;
        double[] calificaciones = new double[5];
        double promedio;
        char calificacion;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del estudiante\nNombre: ");
        nombre = scanner.nextLine();

        System.out.println("Introduce las calificicaciones");

        for(int i = 0; i < 5; i++) {
            System.out.print("Calificacion " + (i + 1) + ": ");
            calificaciones[i] = Double.parseDouble(scanner.nextLine());
        }

        promedio = calcularPromedio(calificaciones);
        calificacion = calificar(promedio);

        System.out.println("Listo, imprimiendo Reporte:");

        imprimirCalificaciones(nombre,calificaciones,promedio,calificacion);

    }

    public static double calcularPromedio(double[] calificaciones) {
        double promedio = 0;
        for(double calificacion: calificaciones) {
            promedio += calificacion;
        }
        promedio /= 5;
        return promedio;
    }

    public static char calificar(double promedio) {
        if(promedio <= 50) {
            return 'F';
        } else if(promedio <= 60) {
            return 'E';
        } else if(promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public static void imprimirCalificaciones(String nombre, double[] calificaciones, double promedio, char calificacion) {
        System.out.println("\nNombre del estudiante: {" + nombre + "}");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": {" + calificaciones[i] + "}");
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion: " + calificacion);
    }
}
