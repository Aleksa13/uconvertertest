package uconverter;

/**
 * Created by Aleksandra on 24.04.17.
 */
public class KilometersUnitConverter extends UnitConverter{
    @Override
    public double toSI(double value) {
        return value * 1000  ;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue / 1000 ;
    }

    @Override
    public String getName() {
        return "Kilometers";
    }
}
