package dia2.exercicio.SistemaGestaoDeVeiculos.main;

import dia2.exercicio.SistemaGestaoDeVeiculos.entidades.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var carro = new Carro("Volvo", "XC60", 2018, 4);
        var caminhao = new Caminhao("Volkswagen", "24-250", 2018, 1000);

        var motoristaCaminhao = new Motorista("Jorge", "12232112", caminhao);
        var motoristaCarro = new Motorista("Douglas", "122322322", carro);

        motoristaCarro.getVeiculo_atual().exibir_info();
        motoristaCaminhao.getVeiculo_atual().exibir_info();

        motoristaCaminhao.getVeiculo_atual().acelerar();
        motoristaCaminhao.getVeiculo_atual().acelerar();
        motoristaCaminhao.getVeiculo_atual().frear();

        motoristaCarro.getVeiculo_atual().acelerar();
        motoristaCarro.getVeiculo_atual().acelerar();
        motoristaCarro.getVeiculo_atual().frear();

        var frota = new Frota(List.of(motoristaCaminhao, motoristaCarro));
        frota.adicionar_veiculo(new Carro("Hyndai", "HB20", 2019, 4));

        frota.listarFrota();

    }
}