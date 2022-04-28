import java.util.Arrays;

public class PhoneCalling {
    public static void main(String[] args) {
        Network network = new Network();
        System.out.println("Base of numbers:  ");
        System.out.println(Arrays.toString(network.numbersPhones));
        Phone phone = new Phone();
        phone.setColor("Blcak");
        phone.setModel("Samsung");
        phone.setDisplaySize(6.1);
        phone.setNetwork("Vodaphone");
        phone.getNetwork();
        phone.outputRing();
        phone.getOutputNumber();
        phone.getModel();
        phone.getDisplaySize();
        phone.getNumber();
        phone.getColor();
        phone.setNumber(380994205042L);
        network.connection(phone.getNumber(), phone.getOutputNumber());
        phone.toString();


    }
}
