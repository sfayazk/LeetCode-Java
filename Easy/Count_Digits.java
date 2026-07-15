class Count_Digits {
    public int countDigits(int num) {
        int count = 0;
        int in = num;
        while(num>0){
            int digit = num % 10;
            if(in % digit == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}