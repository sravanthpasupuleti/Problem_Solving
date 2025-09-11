public class BuyandSell{
    public static void main(String[] args){
        int[] prices = {2,4,1};
        int buy = prices[0];
        int sell = 0;
        int index = 0;
        for(int i=1; i<prices.length ; i++){
            if(buy < prices[i]){
                buy = buy;
                // index = i;
            }else{
                buy = prices[i];
                index = i;
            }
        }
        // System.out.println(prices[index]);
        // System.out.println(prices.length);
        if(prices.length > index + 1){
            for(int j=prices[index]; j<prices.length; j++){
                if(prices[j] > sell){
                sell = prices[j];
                }
            }
            System.out.println(sell - buy);
        }
        else{
            System.out.println("0");
        }
    }
}