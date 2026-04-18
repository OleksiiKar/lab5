package lab5;

import lombok.Getter;

/**
 * Represents a business-tier tariff allowing multiple connected devices.
 */
@Getter
public class BusinessTariff extends Tariff {
    private final String nameOfSubscriber;
    private Integer quantityOfConnectedDevices;

    /**
     * Constructs a BusinessTariff.
     *
     * @param nameOfSubscriber the name of the subscriber.
     * @param quantityOfConnectedDevices number of devices allowed (between 1 and 3).
     */
    public BusinessTariff(String nameOfSubscriber, Integer quantityOfConnectedDevices) {
        super("Business tariff", 40.0, 400.0, 400.0);
        if (nameOfSubscriber == null || nameOfSubscriber.isBlank()) {
            throw new IllegalArgumentException("Subscriber name cannot be empty");
        }
        this.nameOfSubscriber = nameOfSubscriber;
        setQuantityOfConnectedDevices(quantityOfConnectedDevices);
    }

    @Override
    public String toString(){
        return "Name of subscriber:"+getNameOfSubscriber() +"\n"+
                "Name of tariff:"+getName()+"\n"+
                "Gigabytes of internet:"+getGigabytesOfInternet()+"\n"+
                "Time of calls:"+getTimeOfCalls()+"(minutes)"+"\n"+
                "Price of tariff:"+getPrice()+"(grn)"+"\n"+
                "Quantity of connected devices:"+getQuantityOfConnectedDevices();
    }
    /**
     * Updates the number of connected devices.
     *
     * @param quantity the new quantity (1 to 3).
     * @throws IllegalArgumentException if the quantity is out of range.
     */
    public void setQuantityOfConnectedDevices(Integer quantity) {
        if (quantity <= 0 || quantity > 3) {
            throw new IllegalArgumentException("Quantity of connected devices must be between 1 and 3");
        }
        this.quantityOfConnectedDevices = quantity;
    }
}
