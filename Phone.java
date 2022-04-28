import java.util.Scanner;


class Phone {
    private String model;
    private long number;
    private String color;
    private double displaySize;
    long outputNumber;
    String network;

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public long getOutputNumber() {
        return outputNumber;
    }

    public void setOutputNumber(long outputNumber) {
        this.outputNumber = outputNumber;
    }

    public void outputRing() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        outputNumber = sc.nextLong();
    }

    @Override
    public String toString() {
        System.out.println("Phone{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", color='" + color + '\'' +
                ", displaySize=" + displaySize +
                ", outputNumber=" + outputNumber +
                ", network=" + network +
                '}');
        return null;
    }
}
