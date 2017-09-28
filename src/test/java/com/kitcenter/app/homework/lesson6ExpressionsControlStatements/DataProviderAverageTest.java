package com.kitcenter.app.homework.lesson6ExpressionsControlStatements;

import com.kitcenter.app.homework.lesson5UnitTesing.MathAverage;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class DataProviderAverageTest {
    @Test
    @FileParameters(value = "src/test/resources/averagedata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int argC, int expOut) {
        Assert.assertEquals(expOut, MathAverage.average(argA, argB, argC));
    }
}
