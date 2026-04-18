package lab5;

import lombok.Getter;

/**
 * Represents a tariff plan with additional roaming benefits.
 */
@Getter
public class RoamingTariff extends Tariff {
    private final String nameOfSubscriber;
    private final Double roamingTimeOfCalls = 150.0;
    private final Double roamingGigabytesOfInternet = 20.0;

    public RoamingTariff(String nameOfSubscriber) {
        super("Roaming tariff", 30.0, 200.0, 350.0);
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
