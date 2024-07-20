public class DistribuicaoExponencial extends Distribuicao{
    double lambda;

    public DistribuicaoExponencial(double lambda){
        this.lambda = lambda;

        this.media = calcularMedia();
        this.desvio = calcularDesvio();
    }

    public double calcularDistribuicao(double x){
        double result = 0;
        //fórmula da distribuição exponencial: lambda * e^(-lambda * x)
        if(x == 0){
            result = 0;
        }
        else{
            double exp = this.lambda * x;
            result = this.lambda * Math.pow(1/Math.E, exp); 
        }

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
