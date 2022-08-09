/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apostilacaelum.banco;

/**
 *
 * @author Michael Coitim 
 */
public class Conta {
    int numero;
    String titular;
    double saldo;
    double salario;
    
    boolean saca(double quantidade){
        if(this.saldo < quantidade){
            return false;
        }else{
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }
    
    void depositar(double quantidade){
        this.saldo += quantidade;
    }
    
}
