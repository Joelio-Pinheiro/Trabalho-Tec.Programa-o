public abstract class Distribuicao {
    public static double media(double list[]){
        double tam = list.length;
        double sum = 0;
        for (double d : list) {
            sum += d;
        }
        double media = sum/tam;
        return media;
    }
    
    public static double variancia_amostral(double list[]){
        double media = media(list);
        double sum = 0;
        for (double d : list) {
            sum += Math.pow((d-media), 2);
        }
        double var = sum/(list.length-1);
        return var;
    }
    public static double variancia_populacional(double list[]){
        double media = media(list);
        double sum = 0;
        for (double d : list) {
            sum += Math.pow((d-media), 2);
        }
        double var = sum/list.length;
        return var;
    }

    public static double desviopadrao_amostral(double list[]){
        return Math.sqrt(variancia_amostral(list));
    }
    public static double desviopadrao_populacional(double list[]){
        return Math.sqrt(variancia_populacional(list));
    }

    //... Métodos abstratos comuns às distribuições
}
