package at.cgsit.training.functional.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise04_NamePrinterTest {

    @Test
    void testNamePrinter() {
        List<String> log = new ArrayList<>();
        Consumer<String> printer =
                Exercise04_NamePrinter.createNamePrinter(log);

        printer.accept("Chris");
        printer.accept("Alex");

        assertEquals(2, log.size());
        assertEquals("Name: Chris", log.get(0));
        assertEquals("Name: Alex", log.get(1));
    }
}
