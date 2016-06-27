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
 * @author Josue Muñoz S.
 * @Date
 */
public class Juegoahorcado {

    public static void main(String[] args) {
       
        Juegoahorcado juegoahrocado = new Juegoahorcado ();
    }
    public Juegoahorcado(){
    // metodo scaner que agarra lo ingresado por el usuario
    Scanner scanner = new Scanner(System.in);
    //metodo string donde almacena una lista de palabras que creamos y que se utilizaran en el juego.    
    String [] todaslasPalabras = {"HEREDIANO","herediano","SAPRISSA","saprissa","ALAJUELA","alajuela","CARTAGO","cartago","SANCARLOS","sancarlos","BELEN","belen","LIMON","limon"};
    // mensaje de salida, que se mostrara en la consola 
    System.out.println("Hola! A que no adivinas la palabra que tengo en mente ¿?... te atreves a jugar?");

        int numeroRandom = 1 + new Random().nextInt(todaslasPalabras.length);
        String palabraElegida = todaslasPalabras[numeroRandom];
        System.out.println("de acuerdo la palabra consta de " + palabraElegida.length() + " letras...");
        System.out.println("SUERTE!!!");
        String[] palabra = new String[palabraElegida.length()];
        imprimirPalabra(palabra);
        int vidas = 11;

        while (true) {
            System.out.println(" ");
            System.out.println("Ok es facil, solo digita una letra, la que quieras ➜ [(  )]");
            String letraElegidaPorUsuario = scanner.nextLine();
            String[] letras = palabraElegida.split("");
            int contador = 0;

            boolean adivinoAlguna = false;

            
            for (String letra : letras) {

                if (letraElegidaPorUsuario.equals(letra)) {
                    palabra[contador] = letraElegidaPorUsuario;
                    adivinoAlguna = true;
                }

                contador++;
            }
    }
 }
}
