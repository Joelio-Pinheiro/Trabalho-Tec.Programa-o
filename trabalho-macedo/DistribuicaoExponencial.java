import java.util.Random;
public class DistribuicaoExponencial extends Distribuicao{
    
    Random random = new Random();

    int[] array = new int[5];
    int lambda;

    DistribuicaoExponencial(int x){
        lambda = x;
    }

    double calcVariancia(){
        double variancia = 1.0/(lambda * lambda);

        return variancia;
    }

    void imprimirValores(){
        double exp = Math.E;
        System.out.println("Os valores do vetor são: ");
        for(int i = 0; i < 5; i++){
            array[i] = random.nextInt();

            System.out.print(array[i]+",");
        }
        System.out.println("Os valores gerados são: ");
        for(int i = 0; i < 5; i++){
            double pot = lambda * array[i];
            double val = lambda * Math.pow((1/exp), pot);

            System.out.print(val+" ");
        }
    }
    void imprimirVariancia(){
        double varianciaEsp = calcVariancia();

        System.out.println("O valor da variância é: "+varianciaEsp);
    }


}
