lass Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        
        for (int num : nums) {
            // Count the number of digits for the current number
            int digits = 0;
            while (num > 0) {
                digits++;
                num /= 10;
            }
            
            // Check if the digit count is even
            if (digits % 2 == 0) {
                evenDigitCount++;
            }
        }
        
        return evenDigitCount;
    }
}
