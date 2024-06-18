package task14;

//Задание 14
/*
* Написать метод, принимающий на вход два аргумента: len и initialValue,
*  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
*/
public class FourteenthTry {
    public static void printArray(int len,int initialValue){
        /*
        * Метод создает одномерный массив введенной длины, каждая ячейка которого заполнена введенным значением
        */
        int[] dock=new int [len];
        for (int i=0;i<dock.length;i++){
            dock[i]=initialValue;
            System.out.print(dock[i] +" ");
        }
    }
    public static void main(String[] args){
        printArray(2,3);
    }
}
