package com.kitcenter.app.homework.lesson5UnitTesing;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathAllFuncTest {

    @Test // JUnit framework annotation
    public void absTest() {
        //test for negatives values
        int a = -15, expRes = 15;
        Assert.assertEquals(expRes, MathAbs.abs(a));
        //test for positive values
        a = 12;
        expRes = 12;
        Assert.assertEquals(expRes, MathAbs.abs(a));
    }

    @Test
    public void averageTest() {
        int a = 15, b = 10, c = 5, expRes = 10;
        Assert.assertEquals(expRes, MathAverage.average(a, b, c));
    }

    @Test
    public void divisionTest() {
        int a = 15, b = 3, expRes = 5;
        Assert.assertEquals(expRes, MathDivision.division(a, b));
    }

    @Test
    public void substractionTest() {
        int a = 15, b = 3, expRes = 12;
        Assert.assertEquals(expRes, MathSubstraction.substraction(a, b));
    }

    @Test
    public void sumTest() {
        int a = 15, b = 3, expRes = 18;
        Assert.assertEquals(expRes, MathSum.sum(a, b));
    }


    @Test
    public void hypotTest() {
        int a = 3, b = 4, expRes = 5;
        Assert.assertEquals(expRes, MathHypot.hypot(a, b));
    }

    @Test
    public void maxTest() {
        int a = 15, b = 3, expRes = 15;
        Assert.assertEquals(expRes, MathMax.max(a, b));
    }

    @Test
    public void minTest() {
        int a = 15, b = 3, expRes = 3;
        Assert.assertEquals(expRes, MathMin.min(a, b));
    }

    @Test
    public void powTest() {
        int a = 3, b = 3, expRes = 27;
        Assert.assertEquals(expRes, MathPow.pow(a, b));
    }

    @Test
    public void sqrtTest() {
        int a = 9, expRes = 3;
        Assert.assertEquals(expRes, MathSqrt.sqrt(a));
    }

    @Test
    public void roundTest() {
        double a = 3.88, b = 0.55, expRes = 1.0;
        System.out.println("Round value = " + MathRound.round(a, b));
        Assert.assertEquals(0, Double.compare(expRes, MathRound.round(a, b)));
    }

    @Test
    public void areaRectangleTest() {
        int a = 3, b = 9, expRes = 27;
        Assert.assertEquals(expRes, MathAreaRectangle.areaRectangle(a, b));
    }

    @Test
    public void perimeterRectangleTest() {
        int a = 3, b = 4, expRes = 14;
        Assert.assertEquals(expRes, MathPerimeterRectangle.perimeterRectangle(a, b));
    }

    @Test
    public void bisectorTest() {
        double a = 9.0, b = 6.0, c = 3.0, expRes = 7.2;
        System.out.println("Bisector = " + MathBisector.bisector(a, b, c));
        Assert.assertEquals(0, Double.compare(expRes, MathBisector.bisector(a, b, c)));
    }

    @Test
    public void squareTest() {
        int a = 9, expRes = 81;
        Assert.assertEquals(expRes, MathSquare.square(a));
    }

    @Test
    public void medianaTest() {
        double a = 3.3, b = 3.9, c = 3.12, expRes = 3.2582817557725114;
        System.out.println("Mediana = " + MathMediana.mediana(a, b, c));
        Assert.assertEquals(0, Double.compare(expRes, MathMediana.mediana(a, b, c)));
    }

    @Test
    public void heightTest() {
        int a = 2, s = 15, expRes = 15;
        Assert.assertEquals(expRes, MathHeight.height(a, s));
    }

    @Test
    public void sphereAreaTest() {
        double r = 3.123, expRes = 122.56143366366236;
        System.out.println("Sphere Area = " + MathSphereArea.sphereArea(r));
        Assert.assertEquals(0, Double.compare(expRes, MathSphereArea.sphereArea(r)));
    }

    @Test
    public void sphereVolumeTest() {
        double r = 3.123, expRes = 127.26748631276286;
        System.out.println("Sphere Volume = " + MathSphereVolume.sphereVolume(r));
        Assert.assertEquals(0, Double.compare(expRes, MathSphereVolume.sphereVolume(r)));
    }

    @Test
    public void circuitTest() {
        double r = 3.123, expRes = 19.622387714323143;
        System.out.println("Circuit = " + MathCircuit.circuit(r));
        Assert.assertEquals(0, Double.compare(expRes, MathCircuit.circuit(r)));
    }
}
