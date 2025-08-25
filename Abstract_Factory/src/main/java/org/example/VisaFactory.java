package org.example;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD -> {
                return new VisaGoldCreditCard();
            }
            case PLATINUM -> {
                return new VisaPlatinumCreditCard();
            }
            default -> throw new IllegalStateException("Invalid card type!");
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD -> {
                return new VisaGoldValidator();
            }
            case PLATINUM -> {
                return new VisaPlatinumValidator();
            }
            default -> throw new IllegalStateException("Invalid card type!");
        }
    }
}
