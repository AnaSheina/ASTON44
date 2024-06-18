package task10;

//Задание 10
/*
* Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
*  С помощью цикла и условия заменить 0 на 1, 1 на 0
*/
public class TenthTry {

    public static void main(String[] args){
        /*
        * Метод меняет элементы массива с 1 на 0 и наоборот
        */
        int[] dock={1,0,0,1,0,1};
        for (int i=0;i < dock.length;i++){
            if (dock[i]==1){
                dock[i]=0;
            }
            else {
                dock[i]=1;
            }
        }
        for (int i=0;i < dock.length;i++) {
            System.out.print(dock[i]);
        }
    }
}
