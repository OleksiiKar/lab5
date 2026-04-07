package lab5;

import lombok.Getter;

@Getter
public class BasicTariff implements Tariff {
    private final String name = "Basic tariff";
    private final Double gigabytesOfInternet = 10.0;
    private final Double timeOfCalls = 300.0;
    private final Double price = 220.0;
    private final String nameOfSubscriber;

    public BasicTariff(String nameOfSubscriber){
        if (nameOfSubscriber==null || nameOfSubscriber.isBlank()){
            throw new IllegalArgumentException("Subscriber name cannot be empty");
        }
        this.nameOfSubscriber = nameOfSubscriber;
    }

    @Override
    public String toString(){
        return "Name of subscriber:"+nameOfSubscriber+"\n"+
        "Name of tariff:"+name+"\n"+
        "Gigabytes of internet:"+gigabytesOfInternet+"\n"+
        "Time of calls:"+timeOfCalls+"(minutes)"+"\n"+
        "Price of tariff:"+price+"(grn)";
    }
}
