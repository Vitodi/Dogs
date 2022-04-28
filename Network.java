

class Network {

    String name = "Vodaphone";
    long[] numbersPhones = new long[20];
    private Phone phone;

    Network() {
        this.phone = phone;
        numbersPhones[0] = 380665453453l;
        for (int i = 1; i < numbersPhones.length; i++) {
            numbersPhones[i] = numbersPhones[i - 1] + 1;

        }

    }

    void compare(long outputNumber, long phoneN) {
        for (int i = 0; i < numbersPhones.length; i++) {
            if (outputNumber == numbersPhones[i]) {
                System.out.println("The number was found");
                connection(outputNumber, phoneN);
                //break;
            }

        }

    }

    public void connection(long outputNumber, long inputNumber) {

        System.out.println("Dilin'---Dilin'--- Dilin'---Dilin'");
        System.out.println("Call from   " + outputNumber);
        System.out.println("Calling phone to   " + inputNumber);

    }

}

