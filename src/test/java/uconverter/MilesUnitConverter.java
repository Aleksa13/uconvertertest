package uconverter;

/**
 * Created by Aleksandra on 24.04.17.
 */
public class MilesUnitConverter extends UnitConverter{
        @Override
        public double toSI(double value) {
            return value * 1609.344  ;
        }

        @Override
        public double fromSI(double siValue) {
            return siValue / 1609.344 ;
        }

        @Override
        public String getName() {
            return "Miles";
        }
    }
