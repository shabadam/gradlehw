package ru.netology.qagradlehw.service;

import org.junit.Test;
import org.junit.Assert;

public class CashBackHackServiceTest {
    @Test
    public void remainTest(){
        CashBackHackService service = new CashBackHackService();

        Assert.assertEquals(100, service.remain(900));
        Assert.assertEquals(500, service.remain(500));
        Assert.assertEquals(0, service.remain(1000));
        Assert.assertEquals(250, service.remain(750));
    }
}
