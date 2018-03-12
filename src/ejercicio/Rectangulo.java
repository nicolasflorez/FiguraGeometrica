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
public class Rectangulo extends FiguraGeometrica{

    int a,b;
    @Override
    int CalcularArea() {
        return a*b;
    }

    @Override
    int CalcularPerimetro() {
        return a+a+b+b;
    }
    
    
    
}
