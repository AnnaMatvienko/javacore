package com.kitcenter.app.homework.lesson6;

import com.kitcenter.app.homework.lesson5.MathDivision;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class DataProviderDivision {
    @Test
    @FileParameters(value = "src/test/resources/divisiondata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathDivision.division(argA, argB));
    }
}
