package com.kitcenter.app.homework.lesson6;
import com.kitcenter.app.homework.lesson5.MathSubstraction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class DataProviderSubstractionClass {
    @Test
    @FileParameters(value = "src/test/resources/subsdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathSubstraction.substraction(argA, argB));
    }
}
