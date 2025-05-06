package exercice2;

import static java.io.IO.println;

public class Main {
    public static void main(String[] args){

        var produto = new Produto(100.00);
        var pessoa = new Pessoa("Carlos",
                12,
                65.0,
                1.60,
                "12345678999");
        println(pessoa.getCpf());
        println(pessoa.IMC());
        println(produto.aplicarDesconto());
    }
}
