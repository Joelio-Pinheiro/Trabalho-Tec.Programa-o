public class DistribuicaoUniforme extends Distribuicao {
    public DistribuicaoUniforme(double limiteInferior, double limiteSuperior){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }
    public DistribuicaoUniforme(){
        this.limiteInferior = 0;
        this.limiteSuperior = 1;
    }

    public double calcularDensidade(double x){
        double comprimento = this.limiteSuperior - this.limiteInferior;

        return 1/comprimento;
    }

    public double calcularMedia(){
        return (this.limiteSuperior + this.limiteInferior)/2;
    }

    public double calcularVariancia(){
        double comprimento_quadrado = Math.pow(this.limiteSuperior - this.limiteInferior, 2);

        return Math.sqrt(comprimento_quadrado/12);
    }
}
