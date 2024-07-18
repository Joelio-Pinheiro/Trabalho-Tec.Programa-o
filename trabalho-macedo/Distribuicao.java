public abstract class Distribuicao {
    //Limites delimitadores das densidades mais relevantes da distribuição
    protected double limiteInferior;
    protected double limiteSuperior;

    protected double media;
    protected double desvio;

    double getMedia(){return this.media;}
    double getDesvio() {return this.desvio;}
    double getVariancia() {return Math.pow(this.desvio, 2);}

    double getLimiteInferior() {return this.limiteInferior;}
    double getLimiteSuperior() {return this.limiteSuperior;}

    //... Métodos abstratos comuns às distribuições
    public abstract double calcularDistribuicao(double x);
    protected abstract double calcularMedia();
    protected abstract double calcularDesvio();
}
