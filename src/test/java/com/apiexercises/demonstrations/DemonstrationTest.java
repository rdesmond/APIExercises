package com.apiexercises.demonstrations;

import org.junit.Assert;
import org.junit.Test;

public class DemonstrationTest {

    Demonstration test = new Demonstration();

    @Test
    public void castingTypes() throws Exception {
        Assert.assertEquals(200, test.castingTypes(25.5));
   }

    @Test
    public void masterOfFlow() throws Exception {
        Assert.assertEquals(0, test.masterOfFlow(test));
    }

    @Test
    public void varArgsSummation() throws Exception {
        Assert.assertEquals(22, test.varArgsSummation(5,6,9,2));
    }

}