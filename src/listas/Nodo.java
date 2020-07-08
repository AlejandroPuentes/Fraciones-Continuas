/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author User
 */
public class Nodo {
    int  info; 
    Nodo sig;
    Nodo ant;
    public Nodo(int info){
        this.info=info;
        sig=null;
        ant=null;
    }
}
