package lab5;

import lombok.Getter;

@Getter
public class BasicTariff {
    private final String name;
    private final Double gigabytesOfInternet;
    private final Double timeOfCalls;
    private final Double price;

    public BasicTariff(String name, Double gigabytesOfInternet, Double timeOfCalls, Double price){
        if (name==null || name.isBlank()){
            throw new IllegalArgumentException("Name should be not null");
        }
        if (gigabytesOfInternet==null || gigabytesOfInternet<=0){
            throw new IllegalArgumentException("Gigabytes of internet should be >0 or not null");
        }
        if (timeOfCalls==null || timeOfCalls<=0){
            throw new IllegalArgumentException("Time of calls should be >0 or not null");
        }
        if (price==null || price<=0){
            throw new IllegalArgumentException("Price should be >0 or not null");
        }
        this.name=name;
        this.gigabytesOfInternet=gigabytesOfInternet;
        this.timeOfCalls=timeOfCalls;
        this.price=price;
    }
}
