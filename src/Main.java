public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Совершеннолетие еще не наступило!");
        }

        System.out.println("Задание 2");
        int peopleAge = 18;
        if (peopleAge >= 7 && peopleAge < 18) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (peopleAge >= 18 && peopleAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        }
        if (peopleAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Задание 3");
        int carCapacity = 103;
        if (carCapacity <= 60){
            System.out.println("В вагоне есть сидячие места");
        }
        if (carCapacity <= 102){
            System.out.println("В вагоне есть стоячие места!");
        }
        if (carCapacity > 102){
            System.out.println("В вагоне нет мест!");
        }
    }
}