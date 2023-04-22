/*
package ru.aosandy.hrs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.aosandy.common.Report;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TariffServiceTest {

    @Autowired
    TariffService service;

    @Test
    void unlimited300TariffTest() {
        Report report = new Report("71234567890", 6);
        report.appendCall(
            1,
            LocalDateTime.of(2023, 1, 1, 0, 0, 0),
            LocalDateTime.of(2023, 1, 1, 5, 1, 9)
        );
        report.appendCall(
            2,
            LocalDateTime.of(2023, 2, 1, 1, 0, 0),
            LocalDateTime.of(2023, 2, 1, 1, 0, 59)
        );
        report.appendCall(
            1,
            LocalDateTime.of(2023, 3, 1, 1, 0, 0),
            LocalDateTime.of(2023, 3, 1, 1, 1, 59)
        );
        service.calculatePriceForReport(report);
        assertEquals(105, report.getTotalCost() / 100.0);
    }

    @Test
    void minuteByMinuteTariffTest() {
        Report report = new Report("71234567890", 3);
        report.appendCall(
            2,
            LocalDateTime.of(2023, 1, 1, 0, 0, 0),
            LocalDateTime.of(2023, 1, 1, 0, 2, 9)
        );
        report.appendCall(
            1,
            LocalDateTime.of(2023, 2, 1, 1, 0, 0),
            LocalDateTime.of(2023, 2, 1, 1, 0, 59)
        );
        report.appendCall(
            2,
            LocalDateTime.of(2023, 3, 1, 1, 0, 0),
            LocalDateTime.of(2023, 3, 1, 2, 1, 59)
        );
        service.calculatePriceForReport(report);
        assertEquals(99, report.getTotalCost() / 100.0);
    }

    @Test
    void regularTariffTest() {
        Report report = new Report("71234567890", 11);
        report.appendCall(
            2,
            LocalDateTime.of(2023, 1, 1, 0, 0, 0),
            LocalDateTime.of(2023, 1, 1, 3, 2, 9)
        );
        report.appendCall(
            1,
            LocalDateTime.of(2023, 2, 1, 1, 0, 0),
            LocalDateTime.of(2023, 2, 1, 1, 49, 30)
        );
        report.appendCall(
            1,
            LocalDateTime.of(2023, 3, 1, 1, 0, 0),
            LocalDateTime.of(2023, 3, 1, 2, 1, 59)
        );
        service.calculatePriceForReport(report);
        assertEquals(50 * 0.5 + 50 * 0.5 + 12 * 1.5, report.getTotalCost() / 100.0);
    }
}

*/
