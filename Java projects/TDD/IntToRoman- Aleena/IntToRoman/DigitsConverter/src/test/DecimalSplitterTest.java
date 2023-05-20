package test;
import org.junit.Test;
import main.DecimalSplitter;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;


public class DecimalSplitterTest {

    @Test
    public void tens_Split() throws Exception 
    {
        assertEquals(Arrays.asList(0, 0, 80, 2), DecimalSplitter.splitNumbers(82));
        assertEquals(Arrays.asList(0, 0, 50, 4), DecimalSplitter.splitNumbers(54));
        assertEquals(Arrays.asList(0, 0, 90, 9), DecimalSplitter.splitNumbers(99));
    }

    @Test
    public void hundred_Split() throws Exception {
        assertEquals(Arrays.asList(0, 100, 50, 6), DecimalSplitter.splitNumbers(156));
        assertEquals(Arrays.asList(0, 300, 20, 8), DecimalSplitter.splitNumbers(328));
    }

    @Test
    public void thousands_Split() throws Exception {
        assertEquals(Arrays.asList(1000, 900, 70, 9), DecimalSplitter.splitNumbers(1979));
        assertEquals(Arrays.asList(2000, 0, 40, 4), DecimalSplitter.splitNumbers(2044));
    }
}