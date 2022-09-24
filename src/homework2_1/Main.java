package homework2_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 5");
        int value = 33;
        changeValue(value);
        System.out.println(value);
        System.out.println();

        System.out.println("Task 6");
        Integer value1 = 33;
        changeValue(value1);
        System.out.println(value1);
        System.out.println();

        System.out.println("Task 7");
        Integer[] value2 = new Integer[]{3, 4};
        changeValue(value2);
        System.out.println(Arrays.toString(value2));
        System.out.println();

        System.out.println("Task 8");
        Integer[] value3 = new Integer[]{3, 4};
        changeValue1(value3);
        System.out.println(Arrays.toString(value3));
        System.out.println();

        System.out.println("Task 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
        System.out.println();

        System.out.println("Task 10");
        person = new Person("Lyapis", "Trubetskoy");
        changePerson1(person);
        System.out.println(person);


    }

    /**
     * Task 5
     * Напишите метод, который изменяет значение переменной типа int.
     * Объявите метод changeValue, который принимает параметр типа int
     * под названием value. Внутри метода с помощью оператора присваивания запишите
     * в параметр значение 22.
     * В методе main объявите переменную типа int под названием value и запишите туда
     * значение 33. В следующей строке вызовите метод changeValue и передайте в него
     * эту переменную.
     */

    static void changeValue(int value) {
        value = 22;

    }

    /**
     * Task 6
     * Напишите метод, который изменяет значение переменной типа Integer.
     * Объявите метод changeValue, который принимает параметр типа Integer
     * под названием value. Внутри метода с помощью оператора присваивания
     * запишите в параметр значение 22.
     * В методе main объявите переменную типа Integer под названием value и запишите
     * туда значение 33. В следующей строке вызовите метод changeValue и передайте
     * в него эту переменную.
     */

    static Integer changeValue(Integer value1) {
        value1 = 22;
        return value1;
    }

    /**
     * Task 7
     * Напишите метод, который изменяет значение массива типа Integer.
     * Объявите метод changeValue, который принимает параметр массива типа Integer
     * под названием value. Внутри метода с помощью оператора присваивания запишите
     * в параметр новый массив {1,2}.
     * В методе main объявите массив типа Integer под названием value и запишите туда
     * значение {3,4}. В следующей строке вызовите метод changeValue и передайте в
     * него этот массив.
     */


    static void changeValue(Integer[] value2) {
        value2 = new Integer[]{1, 2};

    }

    /**
     * Task 8
     * Напишите метод, который изменяет значение массива типа Integer.
     * Объявите метод changeValue, который принимает параметр массива типа Integer
     * под названием value. Внутри метода с помощью оператора присваивания запишите
     * в первую ячейку параметра цифру 99.
     * В методе main объявите массив типа Integer под названием value и запишите туда
     * значение {3,4}. В следующей строке вызовите метод changeValue и передайте в него
     * этот массив.
     */

    static void changeValue1(Integer[] value3) {
        value3[0] = 99;
    }

    /**
     * Task 9
     * Объявите объект класса person с полями name и surname.
     * Переопределите у него метод toString так, чтобы он возвращал строку
     * из name и surname. Объявите метод changePerson, который принимает параметр
     * типа Person под названием person. Внутри метода с помощью оператора присваивания
     * запишите в параметр новый объект типа Person. Присвойте строке name значение Ilya,
     * строке surname — значение Lagutenko.
     * В методе main объявите переменную типа Person под названием person и запишите
     * новый объект типа Person. Присвойте строке name значение Lyapis, строке surname
     * значение — Trubetskoy.
     * В следующей строке вызовите метод changePerson и передайте в него эту переменную.
     */

    static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }


    /**
     * Task 10
     * Объявите объект класса person с полями name и surname. Переопределите у него
     * метод toString так, чтобы он возвращал строку из name и surname.
     * Объявите метод changePerson, который принимает параметр типа Person под
     * названием person. Внутри метода запишите в поле name строку “Ilya”,
     * а в строку surname — “Lagutenko”.
     * В методе main объявите переменную типа Person под названием person и запишите
     * новый объект типа Person. Присвойте значение имени Lyapis, фамилии — Trubetskoy.
     * В следующей строке вызовите метод changePerson и передайте в него эту переменную.
     */

    static void changePerson1(Person person){
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }

}


