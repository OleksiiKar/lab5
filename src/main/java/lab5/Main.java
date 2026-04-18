package lab5;

import lombok.NonNull;

import java.util.*;
/**
 * Application entry point for managing and filtering telecommunication tariffs.
 */
public class Main {
    /**
     * Main execution method.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double min;
        Double max;
        // Initialize a list of all tariff types
        List<Tariff> tariffList = new ArrayList<>(Arrays.asList(new BasicTariff("test"),
                new BusinessTariff("test", 3),
                new RoamingTariff("test"),
                new PotushniiTariff("test")));
        // Initialize a list of subscribers
        Tariff[] subscribers = new Tariff[] {new BasicTariff("Natalia"),
                new BusinessTariff("Oleg", 2),
                new RoamingTariff("Oksana"),
                new PotushniiTariff("Viktor")};
        // Sort the list based on price using a Comparator
        System.out.println("Quantity of subscribers: "+subscribers.length);
        System.out.println("---Sorted tariffs by price---");
        tariffList.sort(Comparator.comparingDouble(Tariff::getPrice));
        printObj(tariffList);
        // Filter tariffs based on user-provided price range
        System.out.println("---Insert the range of price---");
        System.out.println("Insert min price");
        min = scanner.nextDouble();
        System.out.println("Insert max price");
        max = scanner.nextDouble();
        searchSuitableTariff(tariffList, min, max);
    }
    /**
     * Filters and prints tariffs that fall within the specified price range.
     *
     * @param items list of tariffs to search.
     * @param min minimum price boundary.
     * @param max maximum price boundary.
     */
    public static void searchSuitableTariff(@NonNull List<Tariff> items, Double min, Double max){
        List<Tariff> suitableTariffs = new ArrayList<>();
        for(Tariff a:items){
            if (a.getPrice() >= min && a.getPrice() <= max) {
                suitableTariffs.add(a);
            }
        }
        if (suitableTariffs.isEmpty()){
            System.out.println("Something suitable to this range is not found");
        } else {printObj(suitableTariffs);}
    }
    /**
     * Utility method to print a summary of tariff objects.
     *
     * @param items list of tariffs to display.
     */
    public static void printObj(@NonNull List<Tariff> items){
        for(Tariff a:items){
            System.out.println(a.getName()+":"+a.getPrice());
        }
    }
}
