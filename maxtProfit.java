import java.util.*;

public class maxtProfit {
    
  public static int maxProfit(int[] prices){
    int n = prices.length;
    if(n<2){
      return 0;
    }
    int minPrice = prices[0];
    int maxProfit = 0;
    for(int i=1; i<n; i++){
      if(prices[i]<minPrice){
        minPrice = prices[i];
      }
      int profit = prices[i]- minPrice;
      if(profit>maxProfit){
        maxProfit = profit;
      }
    }
    return maxProfit;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
      
    }
    System.out.print(maxProfit(arr));
  }
}
