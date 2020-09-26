/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

/**
 *
 * @author erikssonherlo
 */
public class Calculo {
    private double n1,n2;

    public Calculo(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public double suma(){
    return n1+n2;
    }
    
    public double resta(){
    return n1-n2;
    }
    
    public double multiplicacion(){
    return n1*n2;   
    }
    
    public double division(){
    return n1/n2;
    }
    
    public String mayorQue(){
        String resultado = "";
    if(n1>n2){
        resultado+=n1;
    return resultado;
    } else if(n2>n1){
        resultado+= n2;
    return resultado;
    } else {
            resultado+=n1 + " son iguales " +n2;
            return resultado;
      }
    }
    public double potencia(){
    return Math.pow(n1, n2);
    }
    public int binario(double decimal){
        int no1 = (int)decimal;
        int aux1= no1;
        int exp=0;
        
        int residuo=0, binario1 = 0;
        
     while(aux1>0){
                residuo=(aux1%2);
                binario1 =  (int) (binario1+residuo * Math.pow(10, exp));
                exp++;
                aux1= (aux1/2);
               
            }
                  
            return binario1;
    }
    
}
