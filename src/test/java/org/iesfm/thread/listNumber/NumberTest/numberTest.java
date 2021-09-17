package org.iesfm.thread.listNumber.NumberTest;

import org.iesfm.thread.listNumber.NumberTest.thread.listNumber.NotANumberException;
import org.iesfm.thread.listNumber.NumberTest.thread.listNumber.Number;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class numberTest {
    @Test
    public void sumaTest (){
        List<Double> numeros= Arrays.asList(3.5,4.5,4.0);
        double res= Number.suma(numeros);
        Assert.assertEquals(12.0,12.0,00000000.1);

    }


    @Test
    public void mediaTest () throws NotANumberException {
        List <Double> numeros= Arrays.asList(3.5,4.5,4.0);
        double res= Number.media(numeros);
        Assert.assertEquals(12.0,12.0,0000000000.1);
    }


}
