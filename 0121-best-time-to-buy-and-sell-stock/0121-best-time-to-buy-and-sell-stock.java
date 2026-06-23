class Solution {
    public int maxProfit(int[] prices) {

        int maxprof = 0;
        int minprice = Integer.MAX_VALUE;

        for(int price: prices){
            if(price<minprice){
                minprice = price;
            }else{
                maxprof=Math.max(maxprof,price-minprice);
            }
        }

        return maxprof;
        
    }
}