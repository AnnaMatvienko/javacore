package com.kitcenter.app.homework.lesson6ExpressionsControlStatements;

import com.kitcenter.app.homework.lesson5UnitTesing.MathSphereArea;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class DataProviderSphereAreaTest {
    @Test
    @FileParameters(value = "src/test/resources/spheredata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(double argA, double expOut) {
        Assert.assertEquals(0, Double.compare(expOut, MathSphereArea.sphereArea(argA)));
    }
}

