package entities;

public abstract class Pessoa {
    private String nome;
    protected double rendaAnual;
    protected Double impostoPago;

    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public abstract Double calcularImpostoPago();


}
