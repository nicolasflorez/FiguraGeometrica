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
public class Cuadrado extends FiguraGeometrica {
 
    int l;
    @Override
    int CalcularArea() {
        return l*l;
    }

    @Override
    int CalcularPerimetro() {
        return l+l+l+l;
    }
    
}
