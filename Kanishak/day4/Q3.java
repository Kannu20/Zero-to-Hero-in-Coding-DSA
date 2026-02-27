package day4;

//  Buy Two Chocolates

// Input: prices = [1,2,2], money = 3
// Output: 0
// Explanation: Purchase the chocolates priced at 1 and 2 units respectively. You will have 3 - 3 = 0 units of money afterwards. Thus, we return 0.

class Solution {
    public int buyChoco(int[] prices, int money) {
        int first = 999;
        int second = 999;

        for(int price: prices){
            if(price<=first)
            {
                second = first;
                first = price;
            }
            else if(price < second)
              second = price;
        }
        
        int total_price = first + second;

        if(total_price <= money)
         return money-total_price;
        else
          return money;
    }
}