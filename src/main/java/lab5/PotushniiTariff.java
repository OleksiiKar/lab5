package lab5;

import lombok.Getter;

/**
 * Represents the "Potushnii" (Powerful) tariff with unlimited data and calls.
 */
@Getter
public class PotushniiTariff extends Tariff {
    private final String nameOfSubscriber;
    private final Double roamingTimeOfCalls = Double.POSITIVE_INFINITY;
    private final Double roamingGigabytesOfInternet = Double.POSITIVE_INFINITY;

    public PotushniiTariff(String nameOfSubscriber) {
        super("Potushnii tariff", Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1200.0);
        if (nameOfSubscriber == null || nameOfSubscriber.isBlank()) {
            throw new IllegalArgumentException("Subscriber name cannot be empty");
        }
        this.nameOfSubscriber = nameOfSubscriber;
    }
    @Override
    public String toString(){
        return "Name of subscriber:"+getNameOfSubscriber() +"\n"+
                "Name of tariff:"+getName()+"\n"+
                "Gigabytes of internet:"+getGigabytesOfInternet()+"\n"+
                "Time of calls:"+getTimeOfCalls()+"(minutes)"+"\n"+
                "Price of tariff:"+getPrice()+"(grn)"+"\n"+
                "Gigabytes of internet in roaming:"+getRoamingGigabytesOfInternet()+"\n"+
                "Time of calls in roaming:"+getRoamingTimeOfCalls();
    }
}
