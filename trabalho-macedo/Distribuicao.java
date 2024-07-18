public abstract class Distribuicao {
    //Limites delimitadores das densidades mais relevantes da distribuição
    protected double limiteInferior;
    protected double limiteSuperior;

    protected double media;
    protected double desvio;

    public double getMedia(){return this.media;}
    public double getDesvio() {return this.desvio;}
    public double getVariancia() {return Math.pow(this.desvio, 2);}

    public double getLimiteInferior() {return this.limiteInferior;}
    public double getLimiteSuperior() {return this.limiteSuperior;}

    //... Métodos abstratos comuns às distribuições
    public abstract double calcularDensidade(double x);
    public abstract double calcularMedia();
    public abstract double calcularVariancia();
}
