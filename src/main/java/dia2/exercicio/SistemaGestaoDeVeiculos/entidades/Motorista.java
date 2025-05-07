package dia2.exercicio.SistemaGestaoDeVeiculos.entidades;

public class Motorista {

    private String nome;
    private String CNH;
    private Veiculo veiculo_atual = null;

    public Motorista(String nome, String CNH, Veiculo veiculo_atual) {
        this.nome = nome;
        setCNH(CNH);
        this.veiculo_atual = veiculo_atual;
    }

    public Veiculo atribuir_veiculo(Veiculo veiculo){
       return veiculo_atual = veiculo;
    }

    public void remover_veiculo(){
        veiculo_atual = null;
    }

    public void dirigir(){
        System.out.println(nome + " " + veiculo_atual.getModelo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {

        var cnhAux = CNH.replaceAll("[^0-9]", "");
        if(CNH.length() == 9 && cnhAux.length() == 9){
            this.CNH = CNH;
        } else {
            throw new RuntimeException("CNH invalida");
        }
    }

    public Veiculo getVeiculo_atual() {
        return veiculo_atual;
    }

    public void setVeiculo_atual(Veiculo veiculo_atual) {
        this.veiculo_atual = veiculo_atual;
    }
}
