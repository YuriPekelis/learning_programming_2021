package victor.cardValidator;

public class CardRunner {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Card number is empty");
            throw new ArrayIndexOutOfBoundsException();
        }
        String cardNumber = args[0];

        try {
            Long cardValue = Long.parseLong(cardNumber);
        } catch (NumberFormatException e) {
            System.out.println("Argument is not number");
            throw e;
        }
//        finally {
//            System.out.println("This block running anyway.....");
//        }
        String cardType = "not valid";
        for (String currentType: Validator.getCardTypes()) {
            if (Validator.isCardValid(currentType, cardNumber)) {
                cardType = currentType;
                break;
            }
        }
        System.out.println("Card is " + cardType);
    }
}
