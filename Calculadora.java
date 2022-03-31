public class Calculadora {

    int valorA;
    int valorB;
    int soma;
    double valorD;
    double valorE;
    int divisao;
    int multiplicacao;
    double divisaoF;

    public void somar(int valorA,int valorB){
        soma = valorA + valorB;
    }

    public void dividirInteiros(int valorA, int valorB){
        divisao = valorA/valorB;
    }

    public void multiplicar(int valorA,int valorB){
        multiplicacao = valorA * valorB;
    }

    public void dividirFlutuantes(double valorD, double valorE){
        divisaoF = valorD/valorE;
    }
}
