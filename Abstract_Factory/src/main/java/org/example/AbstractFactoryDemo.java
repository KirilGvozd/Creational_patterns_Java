package org.example;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard creditCard = creditCardFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(creditCard.getClass());

        creditCardFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard secondCard = creditCardFactory.getCreditCard(CardType.GOLD);
        System.out.println(secondCard.getClass());
    }
}
