package nl.novi.javaprogrammeren.three;

public class MainThree {
    public static void main(String[] args) {
        Beer amstelBier = new Beer("Amstel");
        Beer brandBier = new Beer("Brand");
        Beer heinekenBier = new Beer("Heineken");



        for(int i = 0; i < 10; ++i) {
            System.out.println("Er is weer een biertje getapt");
            System.out.println("Dit is biertje nummer: " + (i + 1));
        }

        System.out.println("Aantal biertjes getapt: " + Beer.getTappedBeersAmount());



    }
}
