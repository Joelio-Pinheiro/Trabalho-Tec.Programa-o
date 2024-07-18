public class DistribuicaoNormal extends Distribuicao {
    public DistribuicaoNormal(double media, double desvio){
        this.media = media;
        this.desvio = desvio;

        this.limiteInferior = this.media - this.desvio*Math.PI;
        this.limiteSuperior = this.media + this.desvio*Math.PI;
    }
    public DistribuicaoNormal(double media){
        this(media, 1);
    }
    public DistribuicaoNormal(){
        this(0, 1);
    }

    public double calcularDensidade(double x){
        double denominador = Math.sqrt(2*Math.PI) * this.getDesvio();
        double euler_expoente = -Math.pow(x - this.getMedia(), 2)/(2*Math.pow(this.getDesvio(), 2));

        double resultado = 1/denominador * Math.pow(Math.E, euler_expoente);

        return resultado;
    }

    public double calcularMedia() { return this.getMedia(); }
    public double calcularVariancia() { return this.getVariancia(); }
}
