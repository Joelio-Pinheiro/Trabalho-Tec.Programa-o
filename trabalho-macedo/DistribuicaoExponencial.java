public class DistribuicaoExponencial extends Distribuicao{
    double lambda;

    public DistribuicaoExponencial(double lambda){
        //O limite dessa distribuição é calculado baseado numa probabilidade de ocorrência de 99.99% no intervalo [limiteInferior, limiteSuperior]
        this.limiteInferior = 0;
        this.limiteSuperior = 9.21034f/lambda; //9.21034 é a aproximação de ln(1/10000) em valores absolutos

        this.lambda = lambda;

        this.media = calcularMedia();
        this.desvio = calcularDesvio();
    }

    public double calcularDistribuicao(double x){
        if (x < 0) return 0;

        double result = 0;
        //fórmula da distribuição exponencial: lambda * e^(-lambda * x)

        double exp = this.lambda * x;
        result = this.lambda * Math.pow(1/Math.E, exp); 

        return result;
    }

    protected double calcularMedia(){
        
        return 1/this.lambda;
    }

    protected  double calcularDesvio(){
        //a variância é igual a 1/lambda², o que significa que o desvio é 1/lambda

        return 1/this.lambda;
    }
}
