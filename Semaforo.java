/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semafori;

/**
 *
 * @author Simona
 */
public class Semaforo {
    int x;
    public Semaforo(int v){
        x=v;
    }
    synchronized public void P(){
        //qua il semaforo lo metto rosso 
        while (x==0){
            //adesso il thread si ferma 
            try { wait();}
            catch(InterruptedException e){}
            }
        //qua il semaforo diventa rosso 
            x--;
        }
    synchronized public void V(){
        //qua il semaforo lo metto verde
        x++;
        //fa ripartire il thread che si era fermato9
        notify();
    }
    
    }

