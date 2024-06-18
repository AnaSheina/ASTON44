package task12;

//Задание 12
/*
* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
*/
public class TwelfthTry {
    public static void main(String[] args){
        /*
        * Метод умножает на 2 значения массива меньше 6
        */
        int[] dock= { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0;i < dock.length;i++){
            if(dock[i]<6){
                dock[i]=dock[i]*2;
            }
        }
        for (int i=0;i < dock.length;i++) {
            System.out.print(dock[i]+" ");
        }
    }
}
