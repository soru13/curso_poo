class Main {
    public static void main(String[] args) {
       System.out.println("Hola mundo");
       UberX uberX = new UberX("AMQ123", new Account("adrea", "AND123"), "Totoya", "Camry" )
       uberX.setPassenger(4)
       uberX.printDataCar();

       UberVan uberVan = new UberVan("QWE567", new Account("Andres Herrea", "ANDA133") )
       uberVan.setPassenger(6)
       uberVan.printDataCar();
    }
}