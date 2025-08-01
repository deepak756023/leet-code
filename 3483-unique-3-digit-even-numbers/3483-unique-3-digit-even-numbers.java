class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> uniqueDigits = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0)
                continue;
            for (int j = 0; j < digits.length; j++) {

                for (int k = 0; k < digits.length; k++) {
                    if (i == j || j == k || i == k)
                        continue;

                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (number % 2 == 0) {
                        uniqueDigits.add(number);
                    }
                }
            }
        }
        return uniqueDigits.size();

    }
}