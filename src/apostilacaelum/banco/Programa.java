/*
 * 
 */
package apostilacaelum.banco;

/**
 *
 * @author colaborador
 */
public class Programa {
    public static void main (String[]args){
        
        Conta minhaConta; 
        minhaConta = new Conta();
        
        minhaConta.titular = "Michael";
        minhaConta.saldo =1000.0;
        
        System.out.println("Saldo atual = "+minhaConta.saldo+" R$"); 
        
    }
    
}
