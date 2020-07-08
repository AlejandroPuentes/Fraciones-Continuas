/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class FraccionContinua {
    private int numerador;
    private int denominador;
    Listas lista;
    
    
    FraccionContinua(int num, int den){
        this.numerador=num;
        this.denominador=den; 
        
    }
    public void fraccion(){
        lista=new Listas();;
        int i=0;
        int residuo;
        double resul;
        while(denominador != 0){
            resul = parte_entera(numerador,denominador);
            residuo = residuo(numerador,denominador);
            lista.meter_nodo((int)resul);
            numerador = denominador;
            denominador=residuo;
            i++;
        }
        System.out.println();
    }
    
    
    
    private double parte_entera(int numerador, int denominador){
        double resultado;
        resultado=numerador/denominador;
        double parteDecimal = resultado % 1; // Lo que sobra de dividir al número entre 1
	double parteEntera = resultado - parteDecimal;
        return parteEntera;
    }
    
    private int residuo(int numerador, int denominador){
        int resultado=numerador%denominador;
        return resultado;
    }
    
    public double resulta(){
        lista.Escribir_atras();
        double resultado=lista.resultado;
        return resultado; 
    }
    
    double division(){
        double division = ((double)numerador) /((double)denominador);
        return division;
    }
    public String lista(){
        return lista.imprimir_delante();
    }
    public String igualdad(){
        return lista.igualdad();
    }
}
