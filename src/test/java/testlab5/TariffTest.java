package testlab5;
import lab5.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TariffTest {
    @Test
    void testInvalidSubscriberNameThrowsException() {
        Exception exceptionNull = assertThrows(IllegalArgumentException.class, () -> {
            new BasicTariff(null);
        });
        Exception exceptionEmpty = assertThrows(IllegalArgumentException.class, () -> {
            new BasicTariff("   ");
        });
    }
    @Test
    void testInvalidQuantityOfDevicesThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new BusinessTariff("Oleg", 0));
        assertThrows(IllegalArgumentException.class, () -> new BusinessTariff("Oleg", -1));

        assertThrows(IllegalArgumentException.class, () -> new BusinessTariff("Oleg", 4));
    }
    @Test
    void testSetQuantityOfConnectedDevices() {
        BusinessTariff tariff = new BusinessTariff("Oleg", 1);

        tariff.setQuantityOfConnectedDevices(3);
        assertEquals(3, tariff.getQuantityOfConnectedDevices());

        assertThrows(IllegalArgumentException.class, () -> tariff.setQuantityOfConnectedDevices(5));
    }
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testSearchSuitableTariffFound() {
        List<Tariff> tariffs = Arrays.asList(
                new BasicTariff("Test1"), // 220.0
                new BusinessTariff("Test2", 1), // 400.0
                new RoamingTariff("Test3") // 350.0
        );
        Main.searchSuitableTariff(tariffs, 300.0, 400.0);

        String output = outContent.toString();
        assertTrue(output.contains("Business tariff:400.0"));
        assertTrue(output.contains("Roaming tariff:350.0"));
        assertFalse(output.contains("Basic tariff:220.0"));
    }
}