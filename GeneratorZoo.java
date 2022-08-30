package Zoopark;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * FileName: GeneratorZoo
 * Author: aspid
 * Date: 23.08.2022 16:13
 * Description:
 */
public class GeneratorZoo {

    public static void main(String[] args) {

        Scanner zoo = new Scanner(System.in);            //вводим конструктор Scaner
        List<Animal> animals = new ArrayList<>();              //создаем  Arraylist

        while (true) {
            System.out.println("Введите одну из команд -> ADD, LIST, EXIT: ");
            Command myChose = Command.valueOf(zoo.next().toUpperCase());

            switch (myChose) {
                case ADD:
                    System.out.println("Какое у Вас домашнее животное (Dog, Duck, Cat)? ");
                    String zooType = zoo.next();

                    if (zooType.equals("Dog")) {
                        System.out.println("Введите кличку животного");
                        String name = zoo.next();
                        System.out.println("Введите возраст животного");
                        int age = zoo.nextInt();
                        System.out.println("Введите вес животного");
                        int weight = zoo.nextInt();
                        System.out.println("Введите окрас животного");
                        String color = zoo.next();
                        Dog animal = new Dog(name, age, weight, color);
                        animal.say();
                        animals.add(animal);
                    }
                    if (zooType.equals("Duck")) {
                        System.out.println("Введите кличку животного");
                        String name = zoo.next();
                        System.out.println("Введите возраст животного");
                        int age = zoo.nextInt();
                        System.out.println("Введите вес животного");
                        int weight = zoo.nextInt();
                        System.out.println("Введите цвет шерсти животного");
                        String color = zoo.next();
                        Duck animal = new Duck(name, age, weight, color);
                        animal.say();
                        animals.add(animal);

                    } else if (zooType.equals("Cat")) {
                        System.out.println("Введите кличку животного");
                        String name = zoo.next();
                        System.out.println("Введите возраст животного");
                        int age = zoo.nextInt();
                        System.out.println("Введите вес животного");
                        int weight = zoo.nextInt();
                        System.out.println("Введите цвет шерсти животного");
                        String color = zoo.next();
                        Cat animal = new Cat (name, age, weight, color);
                        animal.say();
                        animals.add(animal);
                    }break;

                case LIST:
                    for (Animal animal: animals) {System.out.println(animal);}
                    break;

                case EXIT:
                    System.out.println("До встречи");
                    System.exit(0);
                default:
                    System.out.println("Неизвестный тип команды");
            }
        }
    }
}
