class DoubleReversal {
    public boolean isSameAfterReversals(int num) {
        int originalNumber = num;
        int reversed1 = 0;
        int reversed2 = 0;
        while(num>0){
            int lastDigit = num % 10;
            reversed1 = reversed1 * 10 + lastDigit;
            num/=10;
        }
        while(reversed1>0){
            int lastDigit = reversed1 % 10;
            reversed2 = reversed2 * 10 + lastDigit;
            reversed1/=10;
        }
    return reversed2 == originalNumber;

    }
}

// More simplified solution

// Number ending with zeros will not be same after reversing

// class Solution {
//     public boolean isSameAfterReversals(int num) {
//         return num==0 || num%10!=0;    
//     }
// }