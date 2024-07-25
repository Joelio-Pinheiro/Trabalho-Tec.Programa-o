public class DistribuicaoExponencial extends Distribuicao{
    double lambda;
    
    public DistribuicaoExponencial(double media){
        this.limiteInferior = 0;
        this.limiteSuperior = 5;

        this.lambda = 1/media;
        this.media = media;

        this.desvio = calcularDesvio();
    }

    public double calcularDistribuicao(double x){
        double result = 0;
        
        //fórmula da distribuição exponencial: lambda * e^(-lambda * x)
        if(x == 0){
            result = 0;
            //a probabilidade de que X seja 0 deve ser nula
        }
        else{
            //resolvendo o expoente (lambda * x) separadamente
            double expoente = this.lambda * x;
            
            //como o expoente é negativo, inverti o euler, por isso 1/Math.E
            result = this.lambda * Math.pow(1/Math.E, expoente); 
        }
        
        return result;
    }

    protected double calcularMedia(){
        //a média foi dada como parâmetro
        return this.media;
    }

    protected  double calcularDesvio(){
        //a variância é igual a 1/lambda², o que significa que o desvio é 1/lambda
        return 1/this.lambda;
    }
}
