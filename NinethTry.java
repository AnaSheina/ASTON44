package task9;

//Задание 9
/*
* Напишите метод, который определяет, является ли год високосным, и возвращает boolean
*  (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
*  при этом каждый 400-й – високосный.
*/
public class NinethTry {
    public static void printWhatYear(double a){
        /*
        * Метод определяет, является ли год високосным, и возвращает boolean
        *  (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
        *  при этом каждый 400-й – високосный
        */
        Boolean b;
        if (a % 4 == 0) {
            if (a % 400 == 0){
                b=true;
            }
            else if(a % 100 == 0){
                b=false;
            }
            else {
                b=true;
            }
        }
        else {
            b=false;
        };
        System.out.println(b);
    }
    public static void main(String[] args){
        printWhatYear(764);
    }
}
