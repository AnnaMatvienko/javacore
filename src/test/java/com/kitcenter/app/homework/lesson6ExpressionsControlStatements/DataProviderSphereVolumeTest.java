package com.kitcenter.app.homework.lesson6ExpressionsControlStatements;

import com.kitcenter.app.homework.lesson5UnitTesing.MathSphereVolume;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DataProviderSphereVolumeTest {
    @Test
    @FileParameters(value = "src/test/resources/spheredataV.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(double argA, double expOut) {
        Assert.assertEquals(0, Double.compare(expOut, MathSphereVolume.sphereVolume(argA)));
    }
}
