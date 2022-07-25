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
        int idade =15;
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
        

        
    }
    
}
