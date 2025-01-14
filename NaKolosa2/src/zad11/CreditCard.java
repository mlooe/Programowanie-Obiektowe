package zad11;

import java.time.LocalDate;

public class CreditCard implements Cloneable {
    String cardNumber;
    String holderName;
    LocalDate expiryDate;

    public CreditCard(String cardNumber, String holderName, LocalDate expiryDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Credit card: " + cardNumber + ", Holder: " + holderName + ", Expiry: " + expiryDate;
    }

    @Override
    public CreditCard clone() {
        try {
            CreditCard clone = (CreditCard) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("12345", "John Smith", LocalDate.of(1990, 6, 8));

        CreditCard creditCard2 = creditCard1.clone();

        creditCard1.setExpiryDate(LocalDate.of(2028, 6, 8));

        System.out.println(creditCard1);
        System.out.println(creditCard2);
    }


}
