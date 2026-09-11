package model.entities;

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
        return getEvent().getBasePrice() * vipFeeRate;
    }

    @Override
    public String toString() {
        return getEvent().getName()
                + "(VIP TICKET): $"
                + String.format("%.2f", price());
    }
}
