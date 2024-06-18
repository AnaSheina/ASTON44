package task4;

//Задание 4
/*
*Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
*  значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
* в противном случае “a < b”;
*/
public class FourthTry {
    public static void compareNumbers(){
        /*
        * Выводит сообщение в консоль “a >= b”, если объявленная переменная a больше или равно b,
        * “a < b”, если a меньше b
        * */
        int a = 9;
        int b = 8;
        if (a>=b) {
            System.out.print("a >= b");
        }
        else {
            System.out.print("a < b");
        }
    }
    public static void main(String[] args){
        compareNumbers();
    }
}
