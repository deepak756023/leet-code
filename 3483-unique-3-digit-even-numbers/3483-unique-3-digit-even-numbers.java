class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> uniqueDigits = new HashSet<>();
        int count = 0;
        for (int i = 0; i < digits.length; i++)
            for (int j = 0; j < digits.length; j++)
                for (int k = 0; k < digits.length; k++)
                    if (i != j && digits[i] != 0 && j != k && k != i) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if ((!uniqueDigits.contains(number)) && number % 2 == 0) {
                            count++;
                            uniqueDigits.add(number);
                        }

                    }
        return count;

    }
}