/*
 * Exercícios    Apostila Caelum .
 */
package apostilacaelum;

/**
 * @version v 1.1 01/2022
 * @author Michael Coitim
 */
public class ApostilaCaelum {

    /**
     * metodo pricipal
     */
    public static void main(String[] args) {
        // declarando criando variável e atribundo o valor 15
        int idade =25;
        int quatro = 2 + 2;
        int tres = 5 - 2;
        int um = 5 % 2;
        double	pi =3.14;
        double	x = 5 *	10;
        boolean verdade = true;
        boolean menorIdade = idade < 18;
        char letra ='a';
        int i= 5;
        int j = i;
        i = i + 1;
        double cast1 =5.12;
        int i2 = (int) cast1;
        float x3 = 0.1f ;

        // primeiro programa
        //System.out.println("Olá mundo \nPrimeiro programa");
        //System.out.println("Primeiro programa");
        // exibindo o valor da variável idade
        System.out.println(um);
        System.out.println(letra);
        System.out.println(x);
        System.out.println(letra);
        System.out.println("valor de i="+i);
        System.out.println("valor de j="+j);
        
        GastoTrimeste t1 = new GastoTrimeste();
        
        t1.mesUm =15000;
        t1.mesDois=23000;
        t1.mesTres=17000;
        
        System.out.println("a Soma é = "+t1.SomaTotal(t1.mesUm, t1.mesDois, t1.mesTres));
        System.out.println("a Soma é = "+t1.Media(t1.mesUm, t1.mesDois, t1.mesTres));
        
        //molde(casted) gaurda a parte inteira(geralemte feito para não prder informação) de uma variavel 
        // outra maneira de realizar o casting, pois somente o doble é considerado ponto flutuante
        // o CASTING é a converção de um valor em outro tipo
        System.out.println(i2+"\n"+x3);
        
        
        //fluxo de controle if e else 
        if(idade <=18){
            System.out.println("Não pode entrar");
        } else{
            System.out.println("pode entar");
        }
        
        //fluxo de controle WHILE
        int i3 = 0;
        
        while(i3 < 10 ){
            System.out.println(i3);
            i3++;
        }
        
        //fluxo de controle for
        for(int ii=0;ii <5; ii++){
            System.err.println("ola");// fica em vermelho
            //System.out.println(ii);
        }
        

        
    }
    
}
