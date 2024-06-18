package task11;

//Задание 11
/*
* Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100
*/
public class EleventhTry {
    public static void main(String[] args){
        /*
        * Метод заполняет массив длиной 100 значениями 1 2 3 4 5 6 7 8 ... 100
        */
        int[] dock=new int [100];
        for (int i=0;i < dock.length;i++){
            dock[i]=i+1;
        }
        for (int i=0;i < dock.length;i++) {
            System.out.print(dock[i]+" ");
        }
    }
}
