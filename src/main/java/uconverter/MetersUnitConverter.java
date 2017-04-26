package uconverter;

/**
 * Created by Aleksandra on 24.04.17.
 */
public class MetersUnitConverter extends UnitConverter {
    @Override
    public double toSI(double value) {
        return value;
    }
    @Override
    public double fromSI(double siValue) {
        return siValue;
    }
    @Override
    public String getName() {
        return "Meters";
    }
}
