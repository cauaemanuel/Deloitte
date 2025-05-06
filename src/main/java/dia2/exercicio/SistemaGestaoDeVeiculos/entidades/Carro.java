package dia2.exercicio.SistemaGestaoDeVeiculos.entidades;

public class Carro extends Veiculo{

    private int num_portas;

    public Carro(String marca, String modelo, int ano, int num_portas) {
        super(marca, modelo, ano);
        this.num_portas = num_portas;
    }

    @Override
    public String exibir_info() {
        return toString();
    }

    public int getNum_portas() {
        return num_portas;
    }

    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }

    @Override
    public String toString() {
        return super.toString() + " num_portas=" + num_portas;
    }
}
