import java.util.Arrays;

public class ScoreProcessor {

    public static void processScores(double[] scores) {

        if (scores == null || scores.length == 0) {
            System.out.println("No scores available.");
            return;
        }

        double sum = 0;

        for (double score : scores) {
            sum += score;
        }

        double mean = sum / scores.length;

        double[] sortedScores = scores.clone();

        Arrays.sort(sortedScores);

        double median;

        int middle = sortedScores.length / 2;

        if (sortedScores.length % 2 == 0) {

            median =
                    (sortedScores[middle - 1]
                    + sortedScores[middle]) / 2;

        } else {

            median = sortedScores[middle];
        }

        double totalDifference = 0;

        for (double score : scores) {

            double difference = score - mean;

            totalDifference += difference * difference;
        }

        double variance =
                totalDifference / scores.length;

        double standardDeviation =
                Math.sqrt(variance);

        System.out.println(
                "Scores: " + Arrays.toString(scores)
        );

        System.out.printf(
                "Mean: %.2f%n",
                mean
        );

        System.out.printf(
                "Median: %.2f%n",
                median
        );

        System.out.printf(
                "Standard Deviation: %.2f%n",
                standardDeviation
        );
    }

    public static void main(String[] args) {

        double[] scores = {
                85, 90, 72, 88, 95, 76
        };

        processScores(scores);
    }
}
