package entities;

public class PessoaFisica extends Pessoa{

    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double calcularImpostoPago() {
        if (rendaAnual < 20000.00) {
            impostoPago = (rendaAnual * 0.15) - (gastosSaude * 0.5);
        }else {
            impostoPago = (rendaAnual * 0.25) - (gastosSaude * 0.5);
        }
        return impostoPago;
    }

}
