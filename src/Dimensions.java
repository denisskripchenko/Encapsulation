public class Dimensions {
    private final double length;
    private final double width;
    private final double height;



    public Dimensions(){
        length = 25.00;
        width = 30.00;
        height = 50.00;
    }

    public Dimensions setLength(double length) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(length, width, height);
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }



    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getCalculateVolumeCargo() {
        double volume = length * width * height;
        System.out.println("Длина: " + getLength());
        System.out.println("Ширина: " + getWidth());
        System.out.println("Высота: " + getHeight());
        System.out.println("Объём груза: " + volume);
        return volume;
    }
}
