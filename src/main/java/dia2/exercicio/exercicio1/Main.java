package dia2.exercicio.exercicio1;

import static java.io.IO.println;

public class Main {
    public static void main(String[] args){

        var pessoa = new Pessoa("Carlos", 18);
        var pessoaAux = new Pessoa("Caique", 28);

        println(pessoa.deMaior());
        println(pessoaAux.deMaior());

        if (pessoa.getIdade() > pessoaAux.getIdade()){
            println(pessoa.getNome() + " é maior que o " + pessoaAux.getNome());
        }

        if (pessoaAux.getIdade() > pessoa.getIdade()){
            println(pessoaAux.getNome() + " é maior que o " + pessoa.getNome());
        }

    }
}
