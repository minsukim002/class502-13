package Cardtest;

public class Card {

    private int cardNumber;
    private static int serialNum = 1001;

    Card(){
        serialNum++;
        cardNumber = serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

}