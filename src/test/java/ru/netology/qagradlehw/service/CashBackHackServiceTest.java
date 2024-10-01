package ru.netology.qagradlehw.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashBackHackServiceTest {
    @Test
    void remainTest(){
        CashBackHackService service = new CashBackHackService();

        Assertions.assertEquals(100, service.remain(900));
        Assertions.assertEquals(500, service.remain(500));
        Assertions.assertEquals(0, service.remain(1000));
        Assertions.assertEquals(250, service.remain(750));
    }
}
