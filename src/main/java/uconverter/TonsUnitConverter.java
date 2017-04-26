package uconverter;

/**
 * Created by Aleksandra on 25.04.17.
 */
public class TonsUnitConverter extends UnitConverter {

        @Override
        public double toSI(double value) {
            return value * 1000000  ;
        }
        @Override
        public double fromSI(double siValue) {
            return siValue / 1000000 ;
        }
        @Override
        public String getName() {
            return "Tons";
        }
    }
