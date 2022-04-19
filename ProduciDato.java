/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semafori;

/**
 *
 * @author Simona
 */
class ProduciDato extends Thread {
    Semaforo pieno;
    Semaforo vuoto;
    int elementi=5;//numero di elementi da produrre 
    final int attesa=500;//tempo di attesa 
    
    public ProduciDato(Semaforo s1,Semaforo s2){
        pieno=s1;
        vuoto=s2;
    }
    public void run(){
        for(int i=0;i<elementi;i++){//serve per tutti i dati da produrre 
            vuoto.P();
           Semafori.buffer=i;//vado a produrre un numero
            System.out.println("dato scritto:"+i);
            pieno.V();
            try{
                Thread.sleep(attesa);}
            catch(Exception e){}
            }
        System.out.println("termine di scrittura dati");
        }
    }
    
