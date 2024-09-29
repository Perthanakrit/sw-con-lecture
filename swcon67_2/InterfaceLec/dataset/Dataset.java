package dataset;

public class Dataset {
    static class GdpMeasuser implements Measurer {

        @Override
        public double getMeasure() {
            return 0;
        }
    }

    public static void main(String[] args) {
        Country thailand = new Country("Thailand", 65.0, 513, 23);
        Country singapore = new Country("Singapore", 6.0, 0.7, 133);
    }

    public double average(Measurable[] measurables) {
        double sum = 0;
        for (Measurable measurable :measurables) {
            sum += measurable.getMeasure();
        }

        if (sum > 0)
            return sum / measurables.length;

        throw new IllegalArgumentException("Sum of accounts is not positive");


    }

    public double max(Measurable[] measurables) {
        double max = -1;

        for (Measurable measurable :measurables) {
            if (max < measurable.getMeasure()) {
                max = measurable.getMeasure();
            }
        }

        return max;
    }
}
