import java.util.Random;
public class DistribuicaoExponencial extends Distribuicao{
    int[] array = new int[5];
    int lambda;

    DistribuicaoExponencial(int x){
        this.lambda = x;
    }

    double calcVariancia(){
        double variancia = 1.0/(this.lambda * this.lambda);

        return variancia;
    }

    void imprimirValores(){
        Random random = new Random();
        double exp = Math.E;

        for(int i = 0; i < 5; i++){
            this.array[i] = random.nextInt();
        }
        System.out.print("Os valores gerados são: ");
        for(int i = 0; i < 5; i++){
            double pot = this.lambda * this.array[i];
            double val = this.lambda * Math.pow((1/exp), pot);
            
            if(i == 4){
                System.out.print(val);
            }
            else{
                System.out.print(val+",");
            }
        }
    }
    void imprimirVariancia(){
        double varianciaEsp = calcVariancia();

        System.out.println("O valor da variância é: "+varianciaEsp);
    }
}
