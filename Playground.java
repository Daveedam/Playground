package Playground;

public class Playground {
    // Операторы сравнения:
    // < - меньше,  <= - меньше либо равно, > - больше,  >= - больше либо равно, == - равно, != - не равно.
    //Логический оператор. Конструкция if(условие) оператор;
}
class ifDemo {
    public static void main(String[] args) {
        int a, b , c;
        a = 2;
        b = 3;

        if (a < b) System.out.println("a меньше b ");

        c = a - b;// c = 3-2

        System.out.println();

        System.out.println("c содержит -1");
        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c - отрицательное число");

        System.out.println();

        c = b - a;// c = 3-2

        System.out.println("c содержит 1");
        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c - отрицательное число");




    }
}

class ForDemo {
    public static void main(String[] args) {
        int count;

        for(count = 0; count <= 5; count = count +1)//аналогичная запись count = count + 1 есть count++
            System.out.println("Значение счетчика: " + count);

        System.out.println("Готово!");
    }
}

class  BlockDemo{
    public static void main(String[] args) {
        double i , j , d;

        i=5;
        j=10;

        if (i != 0) {
            System.out.println("i не равно нулю");
            d = j/i;
            System.out.println("j / i равно " + d);
        }
    }
}