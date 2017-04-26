package uconverter;

/**
 * Created by Aleksandra on 25.04.17.
 */
public class GramsUnitConverter extends UnitConverter {
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
            return "Grams";
        }
    }
