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
        
        // craindo contta
        Conta minhaConta; 
        minhaConta = new Conta();
        
        //alterando valores da conta
        minhaConta.titular = "Michael";
        minhaConta.saldo =1000.0;
        
        //utilizando o mentodo sacar  
        minhaConta.saca(200);
        
        // usando o metodo depositar 
        minhaConta.depositar(500);
        
        System.out.println("Saldo atual = "+minhaConta.saldo+" R$"); 
        
    }
    
}
