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
        // apartir do fatorial 20! ocorre erro pois não cabe no int 
      long fat = 1; 
  
      for(int n= 1; n<=20;n++){
          fat= fat*n;
          System.out.print("O Fatorial de "+n+"!= ");
          
            for(int j=n; j> 0;j--){
                if(j!=1){
                    System.out.print(j+" X ");
                }else{
                     System.out.print(j);
                }
      }
        System.out.println(" = "+fat);
          
      }
    }
    
    //Fibonacci (tive que pesquisar o algoritimo )
    // achei o modo 
    public long Fibonacci(int fib){
        if( fib <2){
            return fib;
        }else{
            return Fibonacci(fib-1) + Fibonacci(fib-2);
        }
       
        
    }
    
    //exe 7 3.13 regresiva impar par 
    public void RegraIparPar(int x){
        int i = x;
        
            while(i >=0){
                if(i==1){
                    break;
                }
                if(i%2==0){
                //par
                i = i/2 ;
                System.out.print(i+" -> ");
                }else{
                //impar 
                i = 3 * i +1;
                System.out.print(i+" -> ");
                }
            }
        
    }
    
    public void ImprimePiramide(int n){
        int linhas=n;
        for(int i = 1; i < linhas; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
         
          
        } 
       

    }
}
    
    

