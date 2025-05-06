package dia2.exercicio.SistemaGestaoDeVeiculos.entidades;

import java.util.List;

public class Frota {

    private List<Veiculo> veiculos;
    private List<Motorista> motoristas;

    public Veiculo adicionar_veiculo(Veiculo veiculo){
        veiculos.add(veiculo);
        return veiculo;
    }

    public Motorista adicionar_motorista(Motorista motorista){
        motoristas.add(motorista);
        return motorista;
    }

    public void listarFrota(){
        veiculos.stream()
                .forEach(p -> p.exibir_info() + " Motorista " + p.);
    }
}
