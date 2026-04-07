package lab5;

import lombok.Getter;

@Getter
public class PotushniiTariff extends BasicTariff {
    private final String name = "Potushnii tariff";
    private final Double gigabytesOfInternet = Double.POSITIVE_INFINITY;
    private final Double timeOfCalls = Double.POSITIVE_INFINITY;
    private final Double price = 1200.0;
    private final Double roamingTimeOfCalls = Double.POSITIVE_INFINITY;
    private final Double roamingGigabytesOfInternet = Double.POSITIVE_INFINITY;

    public PotushniiTariff(String nameOfSubscriber){
        super(nameOfSubscriber);
    }
    @Override
    public String toString(){
        return "Name of subscriber:"+getNameOfSubscriber() +"\n"+
                "Name of tariff:"+name+"\n"+
                "Gigabytes of internet:"+gigabytesOfInternet+"\n"+
                "Time of calls:"+timeOfCalls+"(minutes)"+"\n"+
                "Price of tariff:"+price+"(grn)"+"\n"+
                "Gigabytes of internet in roaming:"+roamingGigabytesOfInternet+"\n"+
                "Time of calls in roaming:"+roamingTimeOfCalls;
    }
}
