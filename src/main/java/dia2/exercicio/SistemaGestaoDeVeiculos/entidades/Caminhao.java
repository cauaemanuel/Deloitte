package dia2.exercicio.SistemaGestaoDeVeiculos.entidades;

public class Caminhao extends Veiculo{

    private double capacidade_carga;

    public Caminhao(String marca, String modelo, int ano, double capacidade_carga) {
        super(marca, modelo, ano);
        this.capacidade_carga = capacidade_carga;
    }

    @Override
    public String exibir_info() {
        return toString();
    }

    @Override
    public String toString() {
        return super.toString() +
                " capacidade_carga=" + capacidade_carga;
    }

    public double getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(double capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }
}
