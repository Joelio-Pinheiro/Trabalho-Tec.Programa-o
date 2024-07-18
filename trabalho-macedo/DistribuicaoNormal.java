public class DistribuicaoNormal extends Distribuicao {
    public DistribuicaoNormal(double media, double desvio){
        this.limiteInferior = this.media - this.desvio*Math.PI;
        this.limiteSuperior = this.media + this.desvio*Math.PI;

        this.media = media;
        this.desvio = desvio;
    }
    public DistribuicaoNormal(double media){
        this(media, 1);
    }
    public DistribuicaoNormal(){
        this(0, 1);
    }

    public double calcularDistribuicao(double x){
        double denominador = Math.sqrt(2*Math.PI) * this.getDesvio();
        double euler_expoente = -Math.pow(x - this.getMedia(), 2)/(2*Math.pow(this.getDesvio(), 2));

        double resultado = 1/denominador * Math.pow(Math.E, euler_expoente);

        return resultado;
    }

    protected double calcularMedia() { return this.getMedia(); }
    protected double calcularDesvio() { return this.getDesvio(); }
}
