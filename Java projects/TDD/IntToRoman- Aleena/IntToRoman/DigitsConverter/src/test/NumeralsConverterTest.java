package test;
import org.junit.Before;
import org.junit.Test;

import main.NumeralsConverter;

import static org.junit.Assert.assertEquals;

public class NumeralsConverterTest {

    private NumeralsConverter converter;

    @Before
    public void doBefore() {
        converter = new NumeralsConverter();
    }

    @Test
    public void convertNum_1_2_3() throws Exception {
        assertEquals("I", converter.inpConvert(1));
        assertEquals("II", converter.inpConvert(2));
        assertEquals("III", converter.inpConvert(3));
    }

    @Test
    public void convertNum_5_10() throws Exception {
        assertEquals("V", converter.inpConvert(5));
        assertEquals("X", converter.inpConvert(10));
    }

    @Test
    public void convertNum_4() throws Exception {
        assertEquals("IV", converter.inpConvert(4));
    }

    @Test
    public void convertNum_9() throws Exception {
        assertEquals("IX", converter.inpConvert(9));
    }

    @Test
    public void convertNum_6_7_8() throws Exception {
        assertEquals("VI", converter.inpConvert(6));
        assertEquals("VII", converter.inpConvert(7));
        assertEquals("VIII", converter.inpConvert(8));
    }

    @Test
    public void convertNum_50() throws Exception {
        assertEquals("L", converter.inpConvert(50));
    }

    @Test
    public void convertNum_40() throws Exception {
        assertEquals("XL", converter.inpConvert(40));
    }

    @Test
    public void convertNum_60_70_80() throws Exception {
        assertEquals("LX", converter.inpConvert(60));
        assertEquals("LXX", converter.inpConvert(70));
        assertEquals("LXXX", converter.inpConvert(80));
    }

    @Test
    public void convertNum_100() throws Exception {
        assertEquals("C", converter.inpConvert(100));
    }

    @Test
    public void convertNum_90() throws Exception {
        assertEquals("XC", converter.inpConvert(90));
    }

    @Test
    public void convertNum_500() throws Exception {
        assertEquals("D", converter.inpConvert(500));
    }

    @Test
    public void convertNum_400() throws Exception {
        assertEquals("CD", converter.inpConvert(400));
    }

    @Test
    public void convertNum_600_700_800() throws Exception {
        assertEquals("DC", converter.inpConvert(600));
        assertEquals("DCC", converter.inpConvert(700));
        assertEquals("DCCC", converter.inpConvert(800));
    }

    @Test
    public void convertNum_1000() throws Exception {
        assertEquals("M", converter.inpConvert(1000));
    }

    @Test
    public void convertNum_900() throws Exception {
        assertEquals("CM", converter.inpConvert(900));
    }

    @Test
    public void convertNum_20_30() throws Exception {
        assertEquals("XX", converter.inpConvert(20));
        assertEquals("XXX", converter.inpConvert(30));
    }

    @Test
    public void convertNum_200_300() throws Exception {
        assertEquals("CC", converter.inpConvert(200));
        assertEquals("CCC", converter.inpConvert(300));
    }

    @Test
    public void convertNum_2000_3000() throws Exception {
        assertEquals("MM", converter.inpConvert(2000));
        assertEquals("MMM", converter.inpConvert(3000));
    }

    @Test
    public void convertNum_54_82() throws Exception {
        assertEquals("LIV", converter.inpConvert(54));
        assertEquals("LXXXII", converter.inpConvert(82));
    }

    @Test
    public void convertNum_99_199_2999() throws Exception {
        assertEquals("XCIX", converter.inpConvert(99));
        assertEquals("CXCIX", converter.inpConvert(199));
        assertEquals("MMCMXCIX", converter.inpConvert(2999));
    }
}

