package Zoopark;

/**
 * FileName: Animals
 * Author: aspid
 * Date: 13.08.2022 18:13
 * Description:
 */
public class Animal {
                                        //созданы имя,цвет, возраст, вес
    protected String name;
    protected int age;
    protected int weight;
    protected String color;

   // public Animal(String name, int age, String old, int weight, String color) {}

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age =  age;
        this.weight = weight;
        this.color = color;
    }
    public String getOld(){
        String old = " ";
        if (age == 1) old = "год";
        else if (age >=5 && age <=9) old = "лет";
        else old = "года";
        return old;
    }
                                    //созданы методы ем, пью, иду, говорю
    public void eat() {
        System.out.println("Я ем");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void say() { System.out.println("Я говорю");}

        //созданы методы Gettery&Settery
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

                                    //переопределен метод toString
    @Override
    public String toString() {
    return "Привет! меня зовут " + name + ", мне " + age + " " + getOld() + ", " + "я вешу - " + weight +" кг, " + "мой цвет - " + color;
    }

                //переопределили equels/hash-code для сравнения
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
                                     //переопределили hash-код для сравнения
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}



