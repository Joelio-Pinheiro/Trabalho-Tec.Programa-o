public class DistribuicaoNormal extends Distribuicao {
    double media;
    double desvio;

    public DistribuicaoNormal(double media, double desvio){
        this.media = media;
        this.desvio = desvio;
    }

    public double CalcularDensidade(double x){
        double base = 1/(this.desvio*Math.sqrt(2*Math.PI)) * Math.E;
        double exponente = -Math.pow((x - media),2)/(2*Math.pow(desvio,2));

        return Math.pow(base, exponente);
    }
}
