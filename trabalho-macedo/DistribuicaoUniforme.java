public class DistribuicaoUniforme extends Distribuicao {
    public DistribuicaoUniforme(double limiteInferior, double limiteSuperior){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;

        this.media = calcularMedia();
        this.desvio = calcularDesvio();
    }
    public DistribuicaoUniforme(){
        this(0, 1);
    }

    public double calcularDistribuicao(double x){
        if (x < limiteInferior || x > limiteSuperior) return 0;

        double comprimento = this.limiteSuperior - this.limiteInferior;

        return 1/comprimento;
    }

    protected double calcularMedia(){
        return (this.limiteSuperior + this.limiteInferior)/2;
    }

    protected double calcularDesvio(){
        double comprimento_quadrado = Math.pow(this.limiteSuperior - this.limiteInferior, 2);

        return Math.sqrt(comprimento_quadrado/12);
    }
}
