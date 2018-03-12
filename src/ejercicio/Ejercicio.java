/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        Rectangulo miRectangulo = new Rectangulo();
        int a, b;
        System.out.print("Introduzca el largo del rectangulo ");
        miRectangulo.a = sc.nextInt();

        System.out.print("Introduzca el ancho del rectangulo ");
        miRectangulo.b = sc.nextInt();

        System.out.println("Area del rectangulo" + miRectangulo.CalcularArea());
        System.out.println("Perimetro del rectangulo" + miRectangulo.CalcularPerimetro());

        Triangulo miTriangulo = new Triangulo();

        int c, d;
        System.out.print("Introduzca la base del triangulo ");
        miTriangulo.c = sc.nextInt();

        System.out.print("Introduzca el alto del triangulo ");
        miTriangulo.d = sc.nextInt();

        System.out.println("Area del triangulo" + miTriangulo.CalcularArea());
        System.out.println("Perimetro del triangulo" + miTriangulo.CalcularPerimetro());

        Cuadrado miCuadrado = new Cuadrado();
        int l;
        System.out.print("Introduzca el lado del Cuadrado ");
        miCuadrado.l = sc.nextInt();

        System.out.println("Area del cuadrado" + miCuadrado.CalcularArea());
        System.out.println("Perimetro del cuadrado" + miCuadrado.CalcularPerimetro());

    }

}
