package TaskOneExamclouds.phoneTest;

import TaskOneExamclouds.phone.Phone;

public class PhoneTest {

    static void callInfo(String numberPhone, String nameAbonent, double weigthPhone) {
        System.out.println("Number: " + numberPhone + ", " + "Name: " + nameAbonent + ", " + "Weigth: " + weigthPhone);
    }

    public static void main(String[] args) {

        Phone phone = new Phone("80291111111", "Gollum", 5.0);
        Phone phoneTwo = new Phone("80292222222", "Sauron", 10.0);
        Phone phoneThree = new Phone("80293333333", "Gendalf", 15.0);

        System.out.println("Возьми трубку, моя прелесть: ");
        callInfo(phone.getNumberPhone(), phone.getNameAbonent(), phone.getWeigthPhone());
        System.out.println();

        System.out.println("Вызывает поработитель: ");
        callInfo(phoneTwo.getNumberPhone(), phoneTwo.getNameAbonent(), phoneTwo.getWeigthPhone());
        System.out.println();

        System.out.println("Только в ваших руках спасение мира: ");
        callInfo(phoneThree.getNumberPhone(), phoneThree.getNameAbonent(), phoneThree.getWeigthPhone());
    }

}
