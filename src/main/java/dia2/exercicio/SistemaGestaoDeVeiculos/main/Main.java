package dia2.exercicio.SistemaGestaoDeVeiculos.main;

import dia2.exercicio.SistemaGestaoDeVeiculos.entidades.Carro;
import dia2.exercicio.SistemaGestaoDeVeiculos.entidades.Veiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro v =new Carro("volvo", "hb20", 2025, 4);
        System.out.println(v.exibir_info());
    }
}