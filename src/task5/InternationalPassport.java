package task5;

import java.util.Arrays;

public class InternationalPassport extends Passport{
    String[] visas;
    String internationalPassportNumber;
    public InternationalPassport(String number, String name, String surname, String birthday, String internationalPassportNumber, String[] visas) {
        super(number, name, surname, birthday);
        this.internationalPassportNumber = internationalPassportNumber;
        this.visas = visas;
    }

    @Override
    public String toString() {
        return "InternationalPassport: " +
                "nationalPassportNumber: " + number +
                ", name: " + name +
                ", surname: " + surname +
                ", birthday: " + birthday +
                ", internationalPassportNumber: " + internationalPassportNumber +
                ", visas: " + Arrays.toString(visas);
    }
}
