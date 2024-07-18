public class Estatisticas<T extends Distribuicao> {
    public void imprimirValoresGerados(int quantidade_valores){
        if (quantidade_valores < 0){
            throw new Exception("Quantidade de valores deve ser um número positivo");
        }
    }
}
