package entities;

public class PessoaFisica extends Pessoa{

    private Double gastosSaude;

    private Double impostoPagoPF;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude, Double impostoPagoPF) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
        this.impostoPagoPF = impostoPagoPF;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public Double getImpostoPagoPF() {
        return impostoPagoPF;
    }

    public void setImpostoPagoPF(Double impostoPagoPF) {
        if (rendaAnual < 20000.00) {
            impostoPagoPF = (rendaAnual * 0.15) - (gastosSaude * 0.5);
        }else {
            impostoPagoPF = (rendaAnual * 0.25) - (gastosSaude * 0.5);
        }
    }

    @Override
    public Double getRendaAnual() {
        return super.rendaAnual;
    }




}
