package Zoopark;

/**
 * FileName: Cat
 * Author: aspid
 * Date: 13.08.2022 18:13
 * Description:
 */
public class Cat extends Animal {

    public Cat(String name, int age, int weight, String color) {super(name, age, weight, color);}

        public void say () {
            System.out.println("Мяу");
            System.out.println();
        }
    }

