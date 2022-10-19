import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    Map<String, ArrayList<String, Integer>> TypeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver,
    Map<String, ArrayList<String, Integer>> TypeCarAccepted,
    ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.TypeCarAccepted = TypeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}