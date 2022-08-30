package Zoopark;

/**
 * FileName: Duck
 * Author: aspid
 * Date: 13.08.2022 18:14
 * Description:
 */
public class Duck extends Animal implements Flying {

    public Duck(String name, int age, int weight, String color) {super(name, age, weight, color);}

    public void say(){
        System.out.print("Кря ");
        System.out.println();}

    public void fly() {
        System.out.println("Я лечу-у-у!");
        System.out.println();}

}

