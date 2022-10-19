import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, ArrayList<String, Integer>> TypeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver,
    Map<String, ArrayList<String, Integer>> TypeCarAccepted,
    ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.TypeCarAccepted = TypeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    // Aquí realmente es cuano puedes decir se esta utilizando polimorfismo
    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros")
        }
    }
}