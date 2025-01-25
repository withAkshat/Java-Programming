public class buyAndSellStocks {

    public static int stocksPrice( int prices[] ){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for ( int i= 0; i<prices.length; i++ ){
            if( buyPrice < prices[i] ){     // Profit
                int profit = prices[i] - buyPrice; //Todays Profit....!!

                maxProfit = Math.max(profit , maxProfit);
            }

            else {
                buyPrice = prices[i];
            }

            

            return maxProfit;
        }


    }

    public static void main(){

        int prices[]= { 6,5,4,3,2};

        int maxProfit = stocksPrice(prices);

        System.out.print(maxProfit);



    }
    
}
