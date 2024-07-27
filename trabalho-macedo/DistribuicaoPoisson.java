public class DistribuicaoPoisson extends Distribuicao {
    double lambda;

    public DistribuicaoPoisson(double lambda){
        this.limiteInferior = 0;
        this.limiteSuperior = lambda * 4;

        this.lambda = lambda;
        
        this.media = calcularMedia();
        this.desvio = calcularDesvio();
    }
    public DistribuicaoPoisson(){
        this(1);
    }

    public double calcularDistribuicao(double x){
        //É uma distribuição discreta, então, por convenção, arrendondamos o x pra baixo
        int discX = (int) x;

        double numerador = Math.pow(Math.E, -lambda) * Math.pow(lambda, discX);
        double denominador = 1;

        //Calculando o denominador (fatorial de x)
        for (int i = discX; i > 0; i--){ denominador *= i; }
        
        return numerador/denominador;
    }

    protected double calcularMedia() { return lambda; }
    protected double calcularDesvio() { return Math.sqrt(lambda); }
}
