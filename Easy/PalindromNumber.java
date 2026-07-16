class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int originalNumber = x;
        int reverseNumber = 0;
        while(x>0){
            int lastDigit = x % 10;
                reverseNumber = reverseNumber * 10 + lastDigit;
                x/=10;
            }
        return reverseNumber == originalNumber;
    }
}