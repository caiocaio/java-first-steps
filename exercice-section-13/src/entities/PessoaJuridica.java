package entities;

public class PessoaJuridica extends Pessoa{

    private int numeroFunc;

    public PessoaJuridica(String nome, double rendaAnual, int numeroFunc) {
        super(nome, rendaAnual);
        this.numeroFunc = numeroFunc;
    }

    @Override
    public Double calcularImpostoPago() {
        if (numeroFunc < 10) {
            impostoPago = rendaAnual * 0.16;
        }else {
            impostoPago = rendaAnual * 0.14;
        }
        return impostoPago;
    }



}
