package lab5;

import lombok.Getter;

/**
 * Represents a standard entry-level tariff plan.
 */
@Getter
public class BasicTariff extends Tariff {
    /** The name of the subscriber who owns this tariff. */
    private final String nameOfSubscriber;

    /**
     * Constructs a BasicTariff with predefined values.
     *
     * @param nameOfSubscriber the name of the client (must not be empty).
     * @throws IllegalArgumentException if the subscriber name is null or blank.
     */
    public BasicTariff(String nameOfSubscriber) {
        super("Basic tariff", 10.0, 300.0, 220.0);
        if (nameOfSubscriber == null || nameOfSubscriber.isBlank()) {
            throw new IllegalArgumentException("Subscriber name cannot be empty");
        }
        this.nameOfSubscriber = nameOfSubscriber;
    }

    /**
     * Returns a string representation of the tariff details.
     *
     * @return a formatted string containing subscriber and tariff information.
     */
    @Override
    public String toString(){
        return "Name of subscriber:"+nameOfSubscriber+"\n"+
        "Name of tariff:"+getName()+"\n"+
        "Gigabytes of internet:"+getGigabytesOfInternet()+"\n"+
        "Time of calls:"+getTimeOfCalls()+"(minutes)"+"\n"+
        "Price of tariff:"+getPrice()+"(grn)";
    }
}
