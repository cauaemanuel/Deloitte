package dia2.exercicio.SistemaGestaoDeVeiculos.entidades;

import java.util.ArrayList;
import java.util.List;

public class Frota {

    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Motorista> motoristas = new ArrayList<>();

    public Frota(List<Veiculo> veiculos, List<Motorista> motoristas) {
        this.veiculos = veiculos;
        this.motoristas = motoristas;
    }

    public Frota(List<Motorista> motoristas) {
        motoristas.stream()
                .forEach(p -> {
                    this.motoristas.add(p);
                    this.veiculos.add(p.getVeiculo_atual());
                });
    }

    public void listarFrota(){
        veiculos.stream()
                .forEach(v -> {
                    motoristas.stream()
                            .filter(p -> p.getVeiculo_atual().equals(v))
                            .findFirst()
                            .ifPresentOrElse(p -> {
                                System.out.println(p.getNome() + " é o motorista do " + v.getModelo());
                            }, () -> {
                                System.out.println("Veículo " + v.getModelo() + " não tem motorista atribuído.");
                            });
                });
    }

    public Veiculo adicionar_veiculo(Veiculo veiculo){
        veiculos.add(veiculo);
        return veiculo;
    }

    public Motorista adicionar_motorista(Motorista motorista){
        motoristas.add(motorista);
        return motorista;
    }

}
