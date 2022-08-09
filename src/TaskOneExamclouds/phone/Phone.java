package TaskOneExamclouds.phone;

/**
 * Сreating instances of a class, constructors, and method with the specified parameters.
 * Using getters and the this keyword.
 * @author Alex Krentik
 * @data 08.08.2022
 */

public class Phone {

    private String numberPhone;
    private String nameAbonent;
    private double weigthPhone;

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getNameAbonent() {
        return nameAbonent;
    }

    public double getWeigthPhone() {
        return weigthPhone;
    }

    public Phone(String numberPhone, String nameAbonent, double weigthPhone) {
        this(numberPhone, nameAbonent);
        this.weigthPhone = weigthPhone;
    }

    Phone(String numberPhone, String nameAbonent) {
        this.numberPhone = numberPhone;
        this.nameAbonent = nameAbonent;
    }
}
