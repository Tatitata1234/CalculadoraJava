import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        //Arrenge
        Calculadora calculadora = new Calculadora();
        calculadora.valorA = 2;
        calculadora.valorB = 3;
        int valorEsperado = 5;
        //Act
        calculadora.somar(calculadora.valorA,calculadora.valorB);
        //Assert
        Assert.assertEquals(valorEsperado,calculadora.soma);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        Calculadora calculadora = new Calculadora();
        calculadora.valorA = 6;
        calculadora.valorB = 3;

        int valorEsperado = 2;

        calculadora.dividirInteiros(calculadora.valorA,calculadora.valorB);

        Assert.assertEquals(valorEsperado,calculadora.divisao);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        Calculadora calculadora = new Calculadora();
        calculadora.valorA = 34;
        calculadora.valorB = 2;
        int valorEsperado = 68;
        calculadora.multiplicar(calculadora.valorA,calculadora.valorB);

        Assert.assertEquals(valorEsperado,calculadora.multiplicacao);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        Calculadora calculadora = new Calculadora();
        calculadora.valorD = 3.2;
        calculadora.valorE = 1.1;
        double valorEsperado = 2.9;

        calculadora.dividirFlutuantes(calculadora.valorD,calculadora.valorE);

        Assert.assertEquals(valorEsperado,calculadora.divisaoF,0.01);
    }
}
