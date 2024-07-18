public class Main {
    public static void main(String[] args) throws Exception {

        DistribuicaoNormal distribuicaoNormal = new DistribuicaoNormal(0, 1);
        DistribuicaoUniforme distribuicaoUniforme = new DistribuicaoUniforme(0, 1);
        DistribuicaoPoisson distribuicaoPoisson = new DistribuicaoPoisson(2);

        Estatisticas<DistribuicaoNormal> estatisticasNormal = new Estatisticas<>(distribuicaoNormal);
        Estatisticas<DistribuicaoUniforme> estatisticasUniforme = new Estatisticas<>(distribuicaoUniforme);
        Estatisticas<DistribuicaoPoisson> estatisticasPoisson = new Estatisticas<>(distribuicaoPoisson);

        System.out.println("Distribuição Normal:");
        estatisticasNormal.imprimirValoresGerados(5);
        estatisticasNormal.imprimirMedia();
        estatisticasNormal.imprimirVariancia();

        System.out.println("\nDistribuição Uniforme:");
        estatisticasUniforme.imprimirValoresGerados(5);
        estatisticasUniforme.imprimirMedia();
        estatisticasUniforme.imprimirVariancia();

        System.out.println("\nDistribuição Poisson:");
        estatisticasPoisson.imprimirValoresGerados(5);
        estatisticasPoisson.imprimirMedia();
        estatisticasPoisson.imprimirVariancia();
    }
}

