package com.kitcenter.app.homework.lesson6;

import com.kitcenter.app.homework.lesson5.MathAbs;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class DataProviderAbsTest {
    @Test
    @FileParameters(value = "src/test/resources/absdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int expOut) {
        Assert.assertEquals(expOut, MathAbs.abs(argA));
    }
}