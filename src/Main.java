import java.sql.SQLOutput;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conditional operator");

        System.out.println("Задача 1.");
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия.");
        }
        System.out.println("Задача 2.");
        int temperature = 18;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов,можно идти без шапки.");
        }
        System.out.println("Задача 3.");
        int speed = 67;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        System.out.println("Задача 4.");
        int years = 15;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детсвкий сад.");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу.");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в институт.");
        }
        if (years > 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить на работу.");
        }

        System.out.println("Задача 5.");
        age = 9;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на атракционе.");
        }
        if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на атракционе в" +
                    " сопровождении.");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на атракционе,без" +
                    " собровождения взрослого.");
        }
        System.out.println("Задача 6.");
        int places = 102;
        int sitPlaces = 60;
        int human = 101;
        if (human < sitPlaces) {
            System.out.println("В вагоне имеется сидячее место");
        }
        if (human >= sitPlaces && human < places) {
            System.out.println("В вагоне есть стоячее место.");
        } else {
            System.out.println("Вагон переполнен!!!");
        }

        System.out.println("Задача 7.");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Самое большое число " + one);
        } else if (two >= three) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + three);
        }
    }
}