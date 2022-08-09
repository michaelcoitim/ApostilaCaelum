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
        if(minhaConta.saca(2000)){
            System.out.println("Saque realizado com sucesso");
        } else{
            System.err.println("Erro ao Sacar");
        }
        
        // usando o metodo depositar 
       // minhaConta.depositar(500);
        
        System.out.println("Saldo atual = "+minhaConta.saldo+" R$"); 
        
    }
    
}
