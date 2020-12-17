/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasconasteriscos;

/**
 *
 * @author erikj
 */
public class FigurasConAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int contador2 = 9;
        int contador3 = 1;
        int contador4 = 1;
        int contador5 = 9;
        System.out.println("Triangulo relleno");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                //Espacios
                System.out.print(" ");
            }
            for (int h = 1; h <= contador3; h++) {
                System.out.print("*");
                //Rellenado
            }
            //Numero de asteriscos
            contador3 += 2;
            System.out.println("");
        }
        System.out.println("Triangulo volteado");
        for (int i = 1; i <= 5; i++) {
            ///Comenzara a aumentar el contador desde 1 hasta 5 en cada iteracion
            for (int h = 1; h <= contador4; h++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= contador5; j++) {
                System.out.print("*");
            }
            //Numero de espacios
            contador4 += 1;
            //Numero de asteriscos
            contador5 -= 2;
            System.out.println("");
        }
        System.out.println("Triangulo hueco");
        for (int i = 1; i <= 5; i++) {
            //contador+=1;
            for (int j = i; j <= 5; j++) {
                //Espacios en linea recta
                System.out.print(" ");
            }
            for (int h = 1; h <= contador; h++) {
                if (i == 5) {
                    //Esta condicion es para hacer la base del triangulo, y que esta este rellena
                    System.out.print("*");
                } else {
                    if (h == 1) {
                        //Esta condicion representa la posicion inicial del triangulo
                        System.out.print("*");
                    } else if (h == contador) {
                        //El contador representa la posicion final del triangulo
                        System.out.print("*");
                    } else {
                        //Si la posicion es diferente del inicio y final imprime espacios
                        System.out.print(" ");
                    }

                }
            }
            System.out.println("");
            contador += 2;
        }
        System.out.println("Taza con asteriscos");
        for (int a = 1; a <= 7; a++) {
            if (a == 3) {
                for (int j = 1; j <= 9; j++) {
                    //Esta parte hace una parte del mango de la taza
                    System.out.print("*");
                }
            } else if (a == 4) {
                for (int j = 1; j <= 9; j++) {
                    if (j == 8) {
                        //Agarradera de la taza, espacio vacio
//             *****
                        System.out.print(" ");
                    } else {
                        //Parte final de la agarradera
                        System.out.print("*");
//             *******
//                    *
                    }
                }
            } else if (a == 5) {
                for (int j = 1; j <= 9; j++) {
                    //Parte de abajo de la agarradera
//                    *
//             ********
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 7; j++) {
                    System.out.print("*");
                    //Partes del vaso
                }
            }
            System.out.println("");
        }
    }

}
