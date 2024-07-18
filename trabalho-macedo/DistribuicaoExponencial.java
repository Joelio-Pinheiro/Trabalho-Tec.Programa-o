import java.util.Random;
public class Teste{
    
    Random random = new Random();

    float[] array = new float[5];
    int lambda;
    
    Teste(int x){
        this.lambda = x;
    }

    double calcVariancia(){
        double variancia = 1.0/(this.lambda * this.lambda);

        return variancia;
    }

    void imprimirValores(){
        double exp = Math.E;

        System.out.println("Os valores do vetor são: ");

        for(int i = 0; i < 5; i++){
            this.array[i] = random.nextFloat();

            System.out.print(array[i]+",");
        }

        System.out.println("\nOs valores gerados são: ");

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

        System.out.println("\nO valor da variância é: "+varianciaEsp);
    }
}
