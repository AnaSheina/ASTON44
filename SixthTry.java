package task6;

//Задание 6
/*
*  Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
*  положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
*/
public class SixthTry {
    public static void printWhatNumber(int value){
        /*
        *Метод выводит положительное ли введенное число или отрицательное
        */
        if (value >= 0) {
            System.out.print("Положительное число");
        }
        else {
            System.out.print("Отрицательное число");
        }
    }
    public static void main(String[] args){
        printWhatNumber(-7);
    }
}
