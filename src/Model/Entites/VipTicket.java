package Model.Entites;

public class VipTicket extends Ticket {

    private Double vipFeeRate;

    public VipTicket() {
        super();
    }

    public VipTicket(Integer id, Event event, Double vipFeeRate) {
        super(id, event);
        this.vipFeeRate = vipFeeRate;
    }

    public Double getVipFeeRate() {
        return vipFeeRate;
    }

    public void setVipFeeRate(Double vipFeeRate) {
        this.vipFeeRate = vipFeeRate;
    }

    @Override
    public Double price() {
        vipFeeRate = 1.50;
        return getEvent().getBasePrice() * vipFeeRate;
    }
}
