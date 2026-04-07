package lab5;

import lombok.Getter;

@Getter
public class RoamingTariff extends BasicTariff {
    private final String name = "Roaming tariff";
    private final Double gigabytesOfInternet = 30.0;
    private final Double timeOfCalls = 200.0;
    private final Double price = 350.0;
    private final Double roamingTimeOfCalls = 150.0;
    private final Double roamingGigabytesOfInternet = 20.0;

    public RoamingTariff(String nameOfSubscriber){
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
