public abstract class Distribuicao {
    public double media(){return 0.0f;}
    
    public double variancia_amostral(){return 0.0f;}
    public double variancia_populacional(){return 0.0f;}

    public double desviopadrao_amostral(){return Math.sqrt(variancia_amostral());}
    public double desviopadrao_populacional(){return Math.sqrt(variancia_populacional());}

    //... Métodos abstratos comuns às distribuições
    public abstract double CalcularDensidade(double x);
}
