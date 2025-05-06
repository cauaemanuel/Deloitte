package dia2.exercicio.exercice2;

public class Produto {

    private double preco;

    public double aplicarDesconto(){
        return preco = preco * 0.95;// Desconto de 5%
    }

    public double aplicarDesconto(double desconto){
        return preco = preco - (preco * (desconto / 100));// Desconto com valor do parametro
    }

    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
