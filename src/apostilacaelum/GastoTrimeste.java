/*
1. Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do
primeiro trimestre, precisamos somar o gastototal.Sabendo que,emjaneiro, foram gastos 15mil reais,em
fevereiro,23mil	reaise,	em março,17mil reais,faça um programa que calcule e imprima
a despesa total	no trimestre e	a média	mensal	de gastos.

 */
package apostilacaelum;

/**
 *
 * @author Michael coitim
 */
public class GastoTrimeste {
    float mesUm;
    float mesDois;
    float mesTres;
    float total;
    float mediaMensal;
    
    public float SomaTotal(float a, float b,  float c){
        total = a+ b + c;
        return total;
    }
    
    public float Media (float a, float b,  float c){
        mediaMensal= (a+b+c)/3;
        return mediaMensal;
    }
}

