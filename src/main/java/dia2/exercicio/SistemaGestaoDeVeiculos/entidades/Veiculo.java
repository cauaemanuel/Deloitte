package dia2.exercicio.SistemaGestaoDeVeiculos.entidades;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidade = 0.0;

    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
        System.out.println(modelo +" acelerando;" +
                " velocidade atual: "+ velocidade );
    }

    public void frear(){
        if (getVelocidade() - 10  <= 0){
            System.out.println(modelo + "está Parado");
            System.out.println();
        } else {
            setVelocidade(getVelocidade() - 10);
            System.out.println(modelo + " está freando");
            System.out.println();
        }
    };

    public String exibir_info(){
       return toString();
    };

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo: " +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade;
    }
}
