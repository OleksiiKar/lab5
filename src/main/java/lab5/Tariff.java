package lab5;

import lombok.Getter;

@Getter
public abstract class Tariff {
    private String name;
    private Double gigabytesOfInternet;
    private Double timeOfCalls;
    private Double price;
}
