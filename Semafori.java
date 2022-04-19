/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semafori;

/**
 *
 * @author Simona
 */
public class Semafori {
protected static int buffer;
 
    public static void main(String[] args) {
        // TODO code application logic here
       Semaforo pieno=new Semaforo(0);
       Semaforo vuoto=new Semaforo(1);
       ProduciDato prod=new ProduciDato(pieno,vuoto);
       ConsumaDato cons=new ConsumaDato(pieno,vuoto);
       prod.start();
       cons.start();
        System.out.println("termine di avvio del thread");
    }
    
}
