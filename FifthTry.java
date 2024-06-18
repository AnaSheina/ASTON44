package task5;

//Задание 5
/*Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
 от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
*/
public class FifthTry {
    public static void compareSum(int a,int b){
        /*
        * Метод возвращает True, если сумма двух чисел лежит в пределах от 10 до 20 (включительно)
        * и False, если не лежит
        */
        if ((a+b>=10) & (a+b<=20)) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        };
    }
    public static void main(String[] args){
        compareSum(4,7);
    }
}
