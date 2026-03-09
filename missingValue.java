class missingValue {

    static int missingNum(int arr[]) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,4,5};

        int result = missingNum(arr);

        System.out.println("missing Number: " + result);
    }
}