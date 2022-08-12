package a02_static_demo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.72, 1.83, 1.62, 1.65, 1.77};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}
