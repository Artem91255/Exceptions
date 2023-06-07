package HomeTasks;

public class HomeTask1 {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,3};
        int[] array2 = new int[] {3,2,1};
        double[]array3 = multArray(array1,array2);
        for(int i  = 0; i<array3.length; i++){
            System.out.println(array3[i]);
        }
       // System.out.println(divideByZero(10,0));
        wrongIndex();
        //wrongFormat();
    }
    public static int divideByZero(int a, int b)
    {
        return a/b;
    }

    public static void wrongIndex()
    {
        int[] array = new int[] {1,2,3};
        System.out.println(array[8]);
    }
    public static void wrongFormat(){
        int num = Integer.parseInt("XYZ");
        System.out.println(num);
    }
    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]); sum += val;
            }
        }
        return sum;
    }
    /*Виды исключений:
        1. NumberFormatException - если будут в массиве буквы
        2. ArrayIndexOutOfBoundsException - Если будет больше 5 столбцов

    */

    public static double[] multArray(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length){
            throw new RuntimeException("Ошибка! длины массивов не равны. Операция невозможна.");
        }
        double[] newArray = new double[arr1.length];
        for(int i = 0; i<newArray.length; i++){
            newArray[i] = arr1[i]/arr2[i];
        }
        return newArray;
    }

}
