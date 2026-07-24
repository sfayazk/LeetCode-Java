class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
            int wealth = 0;
            int maxWealth = 0;
        for(int row = 0; row<accounts.length; row++){      
            for(int col = 0; col<accounts[row].length; col++){
                wealth += accounts[row][col];
            }
            if(wealth>maxWealth){
                maxWealth = wealth;
            }
            wealth = 0;
        }
        return maxWealth;    
    }
}