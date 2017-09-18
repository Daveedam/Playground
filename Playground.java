package Playground;

public class Playground {
    /*
    Операторы сравнения:
    < - меньше,  <= - меньше либо равно, > - больше,  >= - больше либо равно, == - равно, != - не равно.
    Логический оператор. Конструкция if(условие) оператор;
    */
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
/*
    Расчет числа кубических дюймов в кубе объёмом в 1 куб. милю
*/
class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов");
    }
}

/*
Определение длины гипотенузы, исходя из длины катетов,
    по теореме Пифагора
 */

class Hypot {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);//Math - класс, sqrt() (извлечение квадратного корня) - метод. Метод sqrt() опеределён класса Math
        System.out.println("Длина гипотенузы: " + z);
    }
}

class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++;//паеременную типа char можно инкрементировать
        System.out.println("теперь содержит " + ch);

        ch = 90;//присваевается символ согласно индексу из таблицы ASCII
        System.out.println("теперь содержит " + ch) ;
    }
}

class BoolDemo{
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("Значение b: " + b);
        b = true;
        System.out.println("Значение b: " + b);

        if(b) System.out.println("Значение b истино. При ложном значении действие не выполняется");

        System.out.println("1 > 0 : " + (1 > 0));
    }
}