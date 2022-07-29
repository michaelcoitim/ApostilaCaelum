/*
 * Exercicios da postila
 */
package apostilacaelum;

/**
 *
 * @author Michael Coitim
 */
public class Exercicios {
    
    public void ImprimeNumeros(int a , int b){
        
        for(int i=a; i <= b;i++){
            System.out.println(i);
        }
        
    }
    
    public void ImprimeSoma(int a, int b){
        int soma=0;
        for(int i = a; i <=b;i++){
            soma= soma +i;
        }
        System.out.println(soma);
    }
    
}
