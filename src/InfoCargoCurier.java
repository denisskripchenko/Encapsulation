public class InfoCargoCurier {

    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean cargoPropertyTurnOver;
    private final String regNumber;
    private final boolean cargoFragile;

    public Dimensions getDimensions() {
        return dimensions;
    }

    public InfoCargoCurier setDimensions(Dimensions dimensions) {
        return new InfoCargoCurier();
    }

    public double getWeight() {
        return weight;
    }

    public InfoCargoCurier setWeight(double weight) {
        return new InfoCargoCurier();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public InfoCargoCurier setDeliveryAddress(String deliveryAddress) {
        return new InfoCargoCurier();
    }

    public boolean isCargoPropertyTurnOver() {
        return cargoPropertyTurnOver;
    }

    public InfoCargoCurier setCargoPropertyTurnOver(boolean cargoPropertyTurnOver) {
        return new InfoCargoCurier();
    }

    public String getRegNumber() {
        return regNumber;
    }

    public InfoCargoCurier setRegNumber(String regNumber) {
        return new InfoCargoCurier();
    }

    public boolean isCargoFragile() {
        return cargoFragile;
    }

    public InfoCargoCurier setCargoFragile(boolean cargoFragile) {
        return new InfoCargoCurier();
    }

    public InfoCargoCurier(){
        weight = 50.00;
        deliveryAddress = "г. Белгород, ул. Октябрьская 20";
        cargoPropertyTurnOver = isCargoPropertyTurnOver();
        regNumber = "А255687БВ";
        cargoFragile = isCargoFragile();
        dimensions = null;
    }

    public InfoCargoCurier(Dimensions dimensions, double weight, String deliveryAddress,
                           boolean cargoPropertyTurnOver,
                           String regNumber,
                           boolean cargoFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.cargoPropertyTurnOver = cargoPropertyTurnOver;
        this.regNumber = regNumber;
        this.cargoFragile = cargoFragile;
    }

    public void infoCargo(){
        Dimensions dimensions = new Dimensions();
        dimensions.getCalculateVolumeCargo();
        System.out.println("Вес: " + getWeight());
        System.out.println(getDeliveryAddress());
        if(cargoPropertyTurnOver) {
            System.out.println("Груз можно поворачивать вокруг своей оси");
        }else {
            System.out.println("Груз нельзя поворачивать вокруг своей оси!");
        }
        System.out.println("Регистрационный номер: " + getRegNumber());
        if(cargoFragile) {
            System.out.println("Груз хрупкий!");
        }
    }
}
