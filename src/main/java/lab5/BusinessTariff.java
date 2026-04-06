package lab5;

import lombok.Getter;
import lombok.Setter;

@Getter
public class BusinessTariff extends Tariff {
    private final String name = "Business tariff";
    private final Double gigabytesOfInternet = 40.0;
    private final Double timeOfCalls = 400.0;
    private final Double price = 400.0;
    private Integer quantityOfConnectedDevices;

    public BusinessTariff(String nameOfSubscriber, Integer quantityOfConectedDevices){
        super(nameOfSubscriber);
        if (quantityOfConectedDevices <=0 || quantityOfConectedDevices>3){
            throw new IllegalArgumentException("Quantity of connected devices must be >0 and <3");
        }
        this.quantityOfConnectedDevices = quantityOfConectedDevices;
    }
    @Override
    public String toString(){
        return "Name of subscriber:"+getNameOfSubscriber() +"\n"+
                "Name of tariff:"+name+"\n"+
                "Gigabytes of internet:"+gigabytesOfInternet+"\n"+
                "Time of calls:"+timeOfCalls+"(minutes)"+"\n"+
                "Price of tariff:"+price+"(grn)"+"\n"+
                "Quantity of connected devices:"+quantityOfConnectedDevices;
    }
    public void setQuantityOfConnectedDevices(Integer quantity){
        if (quantity <=0 || quantity>3){
            throw new IllegalArgumentException("Quantity of connected devices must be >0 and <3");
        }
        this.quantityOfConnectedDevices = quantity;
    }
}
