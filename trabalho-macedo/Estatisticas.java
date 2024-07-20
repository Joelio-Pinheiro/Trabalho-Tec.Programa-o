import java.util.Random;

public class Estatisticas<T extends Distribuicao> {
    T distribuicao;

    public Estatisticas(T distribuicao){
        this.distribuicao = distribuicao;
    }

    public void imprimirValoresGerados(int quantidade_valores) throws Exception{
        if (quantidade_valores < 0){
            throw new Exception("Quantidade de valores deve ser um número positivo!");
        }

        String resultado = "{ ";
        Random rng = new Random();
        for (int i = 0; i < quantidade_valores; i++){
            double randomX = distribuicao.getLimiteInferior() + (distribuicao.getLimiteSuperior() - distribuicao.getLimiteInferior()) * rng.nextDouble();;
            double densidade = distribuicao.calcularDistribuicao(randomX);

            resultado += densidade + ", ";
        }
        resultado += "}";

        System.out.println("Os valores gerados são: " + resultado);
    }

    public void imprimirMedia(){
        double media = distribuicao.getMedia();

        System.out.println("A média calculada é: " + media);
    }

    public void imprimirVariancia(){
        double variancia = distribuicao.getVariancia();

        System.out.println("A variância calculada é: " + variancia);
    }
}
