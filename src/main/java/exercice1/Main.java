package exercice1;

public class Main {
    public static void main(String[] args){

        var pessoa = new Pessoa("Carlos", 18);
        var pessoaAux = new Pessoa("Caique", 28);

        System.out.println(pessoa.deMaior());
        System.out.println(pessoaAux.deMaior());

        if (pessoa.getIdade() > pessoaAux.getIdade()){
            System.out.println(pessoa.getNome() + " é maior que o " + pessoaAux.getNome());
        }

        if (pessoaAux.getIdade() > pessoa.getIdade()){
            System.out.println(pessoaAux.getNome() + " é maior que o " + pessoa.getNome());
        }

    }
}
