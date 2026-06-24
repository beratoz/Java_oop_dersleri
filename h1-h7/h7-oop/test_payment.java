import javax.lang.model.util.ElementScanner14;

public class test_payment {
      public static void main(String[] args) {
            Payment[] payments = {
                        new CreditCardPayment(35000, "akt1234567"),
                        new PayPalPayment(200000, "ayse@gmail.com"),
                        new CryptoPayment(123456, "asdasd123123")
            };
            for (Payment p : payments) {
                  processpaymentMethod(p);
            }

      }

      public static void processpaymentMethod(Payment pp) {
            pp.initialize();
            if (pp instanceof CreditCardPayment) {
                  CreditCardPayment cp = (CreditCardPayment) pp;
                  cp.validateCard();
            } else if (pp instanceof PayPalPayment) {
                  PayPalPayment paypal = (PayPalPayment) pp;
                  paypal.authentiacteUser();
            } else if (pp instanceof CryptoPayment) {
                  CryptoPayment cripto = (CryptoPayment) pp;
                  cripto.verifyTransaction();
            } else
                  System.out.println("bilinmeyen odeme yontemi!");

            pp.processPayment();
            try {
                  CryptoPayment wrongCast = (CryptoPayment) pp;

            } catch (ClassCastException e) {
                  System.out.println("hatanin nedeni" + e.getMessage());

            }
      }

}

class Payment {
      private double amount;

      public Payment(double amount) {
            this.amount = amount;
      }

      public double getAmount() {
            return this.amount;
      }

      public void processPayment() {
            System.out.println("odeme isleniyor" + amount + "tl ");

      }

      public void initialize() {
            System.out.println("odeme islemi baslatılıyor");
      }
}

class CreditCardPayment extends Payment {
      private String cardNumber;

      public CreditCardPayment(double amount, String cardNumber) {
            super(amount);
            this.cardNumber = cardNumber;
      }

      @Override
      public void processPayment() {
            System.out.println("kredi kartı ille odeme yapilıiyor" + getAmount() + "tl.kartnumarasi" + cardNumber);
      }

      @Override
      public void initialize() {
            System.out.println("kredi karti ile odene islemi baslatılıyor");
      }

      public void validateCard() {
            System.out.println("kart numarasi" + cardNumber);
      }
}

class PayPalPayment extends Payment {
      private String email;

      public PayPalPayment(double amount, String email) {
            super(amount);
            this.email = email;
      }

      @Override
      public void processPayment() {
            System.out.println("paypal ile odeme yapiliyor" + getAmount() + "Tl.paypal email" + email);
      }

      @Override
      public void initialize() {
            System.out.println("paypal ile odeme islemi baslatiliyor");
      }

      public void authentiacteUser() {
            System.out.println("kullanıcı mail" + email);
      }
}

class CryptoPayment extends Payment {
      private String walletAdress;

      public CryptoPayment(double amount, String walletAdress) {
            super(amount);
            this.walletAdress = walletAdress;
      }

      @Override
      public void processPayment() {
            System.out.println("kripto para ile odeme yapiliyor" + getAmount() + "cuzdan adresi" + walletAdress);
      }

      @Override
      public void initialize() {
            System.out.println("kripto ile odeme baslatiliyor");
      }

      public void verifyTransaction() {
            System.out.println("blok zincirinde dogrulaniyor" + walletAdress);
      }
}