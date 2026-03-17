public class BuySell {

    static int Buy(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    
    static void Stocks(int StockPrices[]){
        int BuyPrice=StockPrices[0];
        int maxProfit=0;
        for(int i=1;i<StockPrices.length;i++){
            if(BuyPrice>StockPrices[i]){
                BuyPrice=StockPrices[i];
            }
            else{
                int curProfit=StockPrices[i]-BuyPrice;
                maxProfit=Math.max(maxProfit, curProfit);
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        Stocks(arr);
    }
}
