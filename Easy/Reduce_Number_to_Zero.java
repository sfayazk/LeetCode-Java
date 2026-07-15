class Reduce_Number_to_Zero {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num>0 ){
            if(num%2==0){
                num = num/2;
                count++;
            }
            else{
                num = num-1;
                count++;
            }
             }
          return count;
    }
}