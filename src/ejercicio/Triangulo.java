/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Estudiantes
 */
public class Triangulo extends FiguraGeometrica {
 
    int c,d;
   @Override
    int CalcularArea() {
        return  c*d/2;
    }

    @Override
    int CalcularPerimetro() {
        return c+c+c;
     }
    
}
