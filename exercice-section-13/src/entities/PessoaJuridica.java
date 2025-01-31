package entities;

public class PessoaJuridica extends Pessoa{

    private Integer numeroFunc;

    private Double impostoPagoPJ;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFunc, Double impostoPagoPJ) {
        super(nome, rendaAnual);
        this.numeroFunc = numeroFunc;
        this.impostoPagoPJ = impostoPagoPJ;
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFunc) {
        super(nome, rendaAnual);
        this.numeroFunc = numeroFunc;
    }

    public Double getImpostoPagoPJ() {
        return impostoPagoPJ;
    }

    public void setImpostoPagoPJ(Double impostoPagoPJ) {
        if (numeroFunc < 10) {
            impostoPagoPJ = rendaAnual * 0.16;
        }else {
            impostoPagoPJ = rendaAnual * 0.14;
        }

    }

    public Integer getNumeroFunc() {
        return numeroFunc;
    }

    public void setNumeroFunc(Integer numeroFunc) {
        this.numeroFunc = numeroFunc;
    }


}
