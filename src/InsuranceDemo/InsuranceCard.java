package InsuranceDemo;

public class InsuranceCard {
    private String cardNum;
    private String cardHolderName;

    public InsuranceCard(String cardNum, String cardHolderName) {
        this.cardNum = cardNum;
        this.cardHolderName = cardHolderName;
    }

    // Getters and Setters

    public String getCardNum() {
        return cardNum;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
}