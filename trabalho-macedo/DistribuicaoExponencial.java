public class DistribuicaoExponencial extends Distribuicao{
    double lambda;

    public DistribuicaoExponencial(double lambda){
        this.lambda = lambda;
    }

    public double calcularDistribuicao(double x){
        //fórmula da distribuição exponencial: lambda * e^(-lambda * x)
        double exp = this.lambda * x;

        double result = this.lambda * Math.pow(1/Math.E, exp); 
        
        return result;
    }

    protected double calcularMedia(){
        
        
    }

    protected  double calcularDesvio(){
        double num = Math.pow(this.lambda, 2);

        return Math.sqrt(1/num);
    }

}
