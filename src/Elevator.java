public class Elevator {
    private int currentFloor = 1;

    private int minFloor;
    private int maxFloor;

    private int floor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown() {
        int i = this.currentFloor;
        for (; i >= minFloor; i--){
            if (i == floor){
                break;
            }
            currentFloor = floor;
            System.out.println("Этаж: " + i);
        }
        System.out.print("Этаж: ");
        return i;
    }

    public int moveUp() {
        int i = this.currentFloor;
        for (; i <= maxFloor; i++){
            if (i == floor){
                break;
            }
            currentFloor = floor;
            System.out.println("Этаж: " + i);
        }
        System.out.print("Этаж: ");
        return i;
    }

    public int move(int floor) {
        this.currentFloor = currentFloor;
        this.floor = floor;
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Этаж выбран неверно! Выберите нужный этаж из списка: от " +
                    minFloor + " до " + maxFloor);
            return getCurrentFloor();
        }
        if (floor == this.currentFloor){
        }
        if (floor > currentFloor) {
            System.out.println(moveUp());
        }
        if (floor < currentFloor) {
            System.out.println(moveDown());
        }
        return getCurrentFloor();
    }

}
