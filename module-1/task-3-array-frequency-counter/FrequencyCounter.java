public class FrequencyCounter {

    public static void countFrequencies(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        boolean[] counted = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (counted[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    count++;

                    counted[j] = true;
                }
            }

            System.out.println(
                    arr[i] + " appears " + count + " time(s)"
            );
        }
    }

    public static void main(String[] args) {

        int[] numbers = {
                1, 2, 2, 3, 1, 4, 2, 3, 3, 3
        };

        countFrequencies(numbers);
    }
}
