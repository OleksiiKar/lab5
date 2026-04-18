package lab5;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Abstract class representing a general model of a telecommunications tariff.
 * This serves as the foundation for all specific tariff implementations.
 */
@Getter
@AllArgsConstructor
public abstract class Tariff {
    /** The name of the tariff plan. */
    private String name;

    /** The amount of internet data included (in gigabytes). */
    private Double gigabytesOfInternet;

    /** The total calling time included (in minutes). */
    private Double timeOfCalls;

    /** The monthly price of the tariff (in UAH). */
    private Double price;
}