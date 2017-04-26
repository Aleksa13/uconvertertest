package uconverter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */
@RunWith(Parameterized.class)
public class CelsiusUnitConverterTest {
    CelsiusUnitConverter converter = new CelsiusUnitConverter();

    @Parameterized.Parameter(0)
    public double kelvin;
    @Parameterized.Parameter(1)
    public double celsius;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10.0, 283.15},
                {100.0, 373.15},
                {200.0, 473.15}
        });
    }

    @Test
    public void toSI() throws Exception {
        assertEquals(celsius, converter.toSI(kelvin), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(kelvin, converter.fromSI(celsius), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Celsius" ,converter.getName());

    }

}