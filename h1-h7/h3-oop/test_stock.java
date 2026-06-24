public class test_stock {
      public static void main(String[] args) {

            Stock s = new Stock("java", "sun micnu", 4.5, 4.35);
            System.out.println(s.yuzdelik_degisim());

      }
}

class Stock {
      String symbol;
      String name;

      double previousClosingPrice = 4.5;
      double currenctPrice = 4.35;

      public Stock(String new_symbol, String new_name, double previousClosingPrice, double currenctPrice) {
            this.symbol = new_symbol;
            this.name = new_name;
            this.previousClosingPrice = previousClosingPrice;
            this.currenctPrice = currenctPrice;

      }

      public double yuzdelik_degisim() {
            return ((Math.abs(previousClosingPrice - currenctPrice) * 100) / previousClosingPrice);

      }

}