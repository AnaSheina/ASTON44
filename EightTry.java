package task8;

//Задание 8
/*
* Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
*  в консоль указанную строку, указанное количество раз
*/
public class EightTry {
    public static void printText(String text,int a){
        /*
        * Метод выводит в командную строку введенный текст введенное количество раз
        */
        for (int i=0;i<a;i++){
            System.out.println(text);
        }
    }
    public static void main(String[] args){
        printText("Hi,dude",5);
    }
}
