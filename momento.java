package unidad1;

import java.util.Scanner;

/**
 *
 * @author Andrijo 21550346
 */

public class Practica3 {
    /*
     Pila sin usar "Stack".
     Se trabaja con la estructura pila sin hacer uso de la clase predefinida stack, es decir, se acumulan los métodos de esta.
     */

    Scanner momento = new Scanner(System.in);
    int[] pila = new int[4];
    int tope = -1;
    //Se crean los métodos similares usados

    public int push() {
        if (tope >= pila.length - 1) {

        } else {
            tope += 1;
            System.out.println("La pila está llena");
            pila[tope] = momento.nextInt();
        }
        return tope;
    }

    public int pop() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("Se eliminó un elemento de la pila.");
            pila[tope] = 0;
            tope = -1;
        }
        return tope;
    }

    public void verElementos() {
        for (int tope = 3; tope >= 0; tope--) {
            System.out.println("Datos de la pila: " + pila[tope]);
        }
    }
}
