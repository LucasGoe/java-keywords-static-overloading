package nl.novi.javaprogrammeren.three;

public class Beer {
    private String brand;
    private int numOfBeers;

    public Beer (String brand) {
        this.brand = brand;
    }

    public void setTappedBeersAmount(int numOfBeers) {
        TappedBeersAmount = numOfBeers;
    }

    public int getTappedBeersAmount() {
        return TappedBeersAmount;
    }
}


