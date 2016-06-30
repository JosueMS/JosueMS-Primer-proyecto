/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoahorcado;
//importe de la clase scanner, para agarrar letras ingresadas por usuario

import java.util.Scanner;
//importe de la clase random que se encarga de escoger una palabra alazar
import java.util.Random;

/**
 *
 * @author Josue Muñoz Solis.
 * @Date 29/06/2016
 */
public class Juegoahorcado {

    public static void main(String[] args) {
        //instacia  juego ahorcado
        Juegoahorcado juegoahrocado = new Juegoahorcado();
    }

    //se crea el public que sera donde se escribira las condiciones
    public Juegoahorcado() {
        // metodo scaner que agarra lo ingresado por el usuario
        Scanner scanner = new Scanner(System.in);
        //metodo string donde almacena una lista de palabras que creamos y que se utilizaran en el juego.    
        String[] todaslasPalabras = {"HEREDIANO", "herediano", "SAPRISSA", "saprissa", "ALAJUELA", "alajuela", "CARTAGO", "cartago", "SANCARLOS", "sancarlos", "BELEN", "belen", "LIMON", "limon"};
        // mensaje de salida, que se mostrara en la consola 
        System.out.println("Hola! A que no adivinas la palabra que tengo en mente ¿?... te atreves a jugar?");
        //definimos una variable int con el metodo de random, se mostrara la longitud de la palabra con lenght
        int numeroRandom = 1 + new Random().nextInt(todaslasPalabras.length);
        //declaramos la variable int vidas, las que contaremos en el juego
        int vidas = 11;
        // hacemos un string que escoge palabras con el metodo random
        String palabraElegida = todaslasPalabras[numeroRandom];
        //impremimos y concatenamos el mensaje con la palabra elegida y su largo
        System.out.println("de acuerdo la palabra consta de " + palabraElegida.length() + " letras...");
        //imprimimos un mensaje
        System.out.println("SUERTE!!!");
        //creamos un string donde palabra se igual a la palabra elegida y su largo para que se muestre y se imprima 
        String[] palabra = new String[palabraElegida.length()];
        imprimirPalabra(palabra);
        // metodo wile de desicion
        while (true) {
            //creamos el contador en un int contador
            int contador = 0;
            //declaramos un boolean que se iguale a false
            boolean adivinoAlguna = false;
            //generamos una espacio para separar un poco
            System.out.println(" ");
            //mostramos el mensaje donde escribir
            System.out.println("Ok es facil, solo digita una letra, la que quieras ➜ [(  )]");
            //creamos el string con la letra del usuario y el scanner nexline para brincar al siguiente reglon
            String letraElegidaPorUsuario = scanner.nextLine();
            //string donde haremos que la palabra elegida se separe con el metodo split
            String[] letras = palabraElegida.split("");
            //metodo for donde compararemos las letras
            for (String letra : letras) {
                //el if donde se revisa si la letra elegida por el usuario es igual a la letra y si se acerto para que el contador se mantenga.
                if (letraElegidaPorUsuario.equals(letra)) {
                    palabra[contador] = letraElegidaPorUsuario;
                    adivinoAlguna = true;
                }

                contador++;
            }
            //si la condicion anterior se cumple, se mostrara las siguentes impresiones
            if (adivinoAlguna) {
                System.out.println("Wow!!! me estas leyendo la mente?, has adivinado una letra sigue asi");
                System.out.println("Sigue asi...");
                System.out.println("Ojo, que te quedan " + vidas + " vidas");
            } 
            //si no se cumple, mostrara que fallo y una vida se restara del contador
            else {
                vidas--;
                System.out.println("buuuu!!! fallaste, letra equivocada, intentalo de nuevo");
                //if donde se desplega los mensajes cuando el contador llega a 0 y se perdio en el juego y se cierra con un break
                if (vidas == 0) {
                    System.out.println("Ups!!!");
                    System.out.println("Acabaste con todas tus vidas, AHORCADO...");
                    System.out.println("HAS PERDIDO!!!");
                    break;
                } 
                //else donde se muestra cuantas vidas tienes y una advertencia, concatenado., si solo se fallo se muestra cuanto se a adivinado.
                else {
                    System.out.println("cuidado amig@!!!, te quedan " + vidas + " vidas");
                }
            }

            System.out.println("No me digas que solo esto has adivinado ⇣, vamos que se puede!: ");
            System.out.println("Solo son " + palabraElegida.length() + " letras...");
            imprimirPalabra(palabra);
            //este es el if de la victoria donde se muestra en system de impresion que se acerto y se gano el juego. se cierra con un break 
            if (acerto(palabra)) {

                System.out.println("Sos increible!!! has adivinado, pero igual creo que has hecho trampa jejeje.");
                System.out.println("HAS GANADO EL JUEGO!!!");
                break;
            }
        }
    }
    // metodo boolean en un public donde se confirma si se acerto las letras y se gano el juego.
    public boolean acerto(String[] palabra) {
        boolean acerto = true;

        for (String letra : palabra) {
            if (letra == null) {
                acerto = false;
                break;
            }

        }
        //metodo return para devolver que se acerto la palabra.
        return acerto;
    }
//el public de impresion de palabras
public void imprimirPalabra(String[] palabra) {
        //Este metodo imprime las letras que ha acertado el usuario hasta el momento.
        for (String letra : palabra) {
            if (letra != null) {
                System.out.print(letra);
            } 
             //signos que se ponen para ocualtar la letras de la palabra y mostrar su largo.
            else {
                System.out.print("*");
            }
        }
        System.out.println("");
    }

}
