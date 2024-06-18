package task7;

//Задание 7
/*
* Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
*  если число отрицательное, и вернуть false если положительное.
* Замечание: ноль считаем положительным числом.
*/
public class SeventhTry {
    public static void printWhatNumber(int a){
        /*
        * Метод возвращает true, если число отрицательное,
        * false, если положительное
        */
        if (a >= 0) {
            System.out.print("False");
        }
        else {
            System.out.print("True");
        };
    }
    public static void main(String[] args){
        printWhatNumber(4);
    }
}
