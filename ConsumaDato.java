/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semafori;

/**
 *
 * @author Simona
 */
class ConsumaDato extends Thread {
   Semaforo pieno;
   Semaforo vuoto;
   
   int dato;
   public ConsumaDato(Semaforo s1,Semaforo s2){
       pieno=s1;
       vuoto=s2;
       
   }
   public void run(){
       while(true){
           pieno.P();
           dato=Semafori.buffer;//consuma un numero 
           System.out.println("dato letto:"+dato);
           vuoto.V();
       }
   }

  
   
  
}
