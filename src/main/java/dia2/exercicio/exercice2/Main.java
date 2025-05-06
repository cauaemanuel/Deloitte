package dia2.exercicio.exercice2;

import static java.io.IO.println;

public class Main {
    public static void main(String[] args){

        var produto = new Produto(100.00);
        var pessoa = new Pessoa("Carlos",
                12,
                65.0,
                1.60,
                "12345678999");
        println("Seu cpf: " + pessoa.getCpf());
        println("Seu IMC: "+ pessoa.IMC());
        println("Seu Desconto: "+ produto.aplicarDesconto(15));
        println("Seu Desconto Padrão: " + produto.aplicarDesconto());
    }
}
