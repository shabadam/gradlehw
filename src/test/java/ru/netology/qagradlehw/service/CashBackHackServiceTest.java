package ru.netology.qagradlehw.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashBackHackServiceTest {
    @Test
    public void remainTest(){
        CashBackHackService service = new CashBackHackService();

        Assert.assertEquals(service.remain(900), 100);
        Assert.assertEquals(service.remain(500), 500);
        Assert.assertEquals(service.remain(1000), 0);
        Assert.assertEquals(service.remain(750), 250);
    }
}
