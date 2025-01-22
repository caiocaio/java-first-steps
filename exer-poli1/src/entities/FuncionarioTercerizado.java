package entities;

public class FuncionarioTercerizado extends Funcionario{

    private Double addicionalCharge;



    public FuncionarioTercerizado() {
    }

    public FuncionarioTercerizado(String name, Double hours, Double valuePerHour, Double addicionalCharge) {
        super(name, hours, valuePerHour);
        this.addicionalCharge = addicionalCharge;
    }

    public Double getAddicionalCharge() {
        return addicionalCharge;
    }

    public void setAddicionalCharge(Double addicionalCharge) {
        this.addicionalCharge = addicionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + addicionalCharge * 1.1;
    }
}
