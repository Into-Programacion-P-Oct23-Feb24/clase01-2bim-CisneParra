/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        El siguiente codigo permite mostrar una cadena utilizando el ciclo repetitivo
        for, en este caso se usa una variable acumuladora para poder usar solo un print
        en todo el codigo. El ciclo for se usa como un inicializador y tambien como un
        contador.
        */
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
        }
        
        for (int i = 1; i < 11; i++) {
            suma = suma + i;
        }
        System.out.printf("%d", suma);

    }

}
