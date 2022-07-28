/*
 *exemplo de labeled loops
 * para saber mais no link:
 * http://www.java2s.com/Code/Java/Language-Basics/Javalabeledforloop.htm  
 * Apos pesquisar um pouco, cheguei no seguinte intendimento:
 * Esses outer e inner são blocos, e os labeled loops é uma forma de parar ou continuar
 * utilizando o break e o continue, explicação no link:
 * https://www.youtube.com/watch?v=8SMB_yRXkec
 * E
 * https://www.youtube.com/watch?v=JlRgBWWYOSE
 */
package apostilacaelum;

/**
 *
 * @author Michael Coitim 
 */
public class ExemploLabeledLoops {
    
    public void Loops(){
        int i = 0;
        outer: // Can't have statements here (não pode argumentos aqui) 
        for (; true;) { // infinite loop loop infinito 
            inner: // Can't have statements here 
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++; // Otherwise i never
                    // gets incremented.
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++; // Otherwise i never
                    // gets incremented.
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
