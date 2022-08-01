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
    
    //os fatoriais de 1 a 10.

    public void Fatorial(){
      int fat = 1; 
  
      for(int n= 1; n<=10;n++){
          fat= fat*n;
          System.out.print("O Fatorial de "+n+"!= ");
          
            for(int j=n; j> 0;j--){
                System.out.print(j+" X ");
      }
        System.out.println("= "+fat);
          
      }
    }
    
}
