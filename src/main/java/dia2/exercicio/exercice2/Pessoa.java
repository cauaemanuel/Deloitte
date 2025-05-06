package dia2.exercicio.exercice2;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String cpf;

    public Pessoa(String nome, int idade, double peso, double altura, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        setCpf(cpf);
    }

    public double IMC(){
        return peso / (altura * altura);
    }

    public boolean deMaior(){
        if(idade >= 18){
            return true;
        }
        return false;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        var cpfAux = cpf.replaceAll("[^0-9]", "");
        if(cpf.length() == 11 && cpfAux.length() == 11){
            this.cpf = cpf;
        } else {
            throw new RuntimeException("CPF invalido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
