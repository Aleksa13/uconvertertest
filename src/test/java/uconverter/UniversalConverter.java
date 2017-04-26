package uconverter;

import asg.cliche.Command;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by javaCourses on 19.04.2017..
 */
public class UniversalConverter {

    private List<UnitConverter> converters = Arrays.asList(
            new CelsiusUnitConverter(),
            new FahrenheitUnitConverter(),
            new KelvinUnitConverter(),
            new KilometersUnitConverter(),
            new MilesUnitConverter(),
            new MetersUnitConverter(),
            new TonsUnitConverter(),
            new GramsUnitConverter()

    );

    @Command
    public void list() {
        for (int i = 0; i < converters.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, converters.get(i));
        }
    }

    private UnitConverter sourceConverter;
    private UnitConverter targetConverter;

    @Command
    public void source(int idx) {
        sourceConverter = converters.get(idx - 1);
    }


    @Command
    public void target(int idx) {
        targetConverter = converters.get(idx - 1);
    }

    @Command
    public double convert(double value) {
        if (sourceConverter == null ){
            System.out.print("Please enter source for value ");
            return value;
        }else
        if (targetConverter == null ) {
            System.out.print("Please enter target for value");
            return value;

        } else {
            double siValue = sourceConverter.toSI(value);
            return targetConverter.fromSI(siValue);
        }

    }
}

