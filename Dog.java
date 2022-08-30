package Zoopark;

/**
 * FileName: Dog
 * Author: aspid
 * Date: 13.08.2022 18:13
 * Description:
 */
public class Dog extends Animal {

    public Dog(String name, int age, int weight, String color) {super(name, age, weight, color);}

    public void say() {
        System.out.print("Гав ");
       System.out.println();}

}


