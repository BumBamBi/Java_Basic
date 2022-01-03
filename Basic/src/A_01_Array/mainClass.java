package A_01_Array;
public class mainClass {
    public static void main(String[] args) throws Exception {
        int[] arr1;
        arr1 = new int[5];
        System.out.println(arr1[0]);

        int[] arr2 = {1, 2, 3,4, 5};
        System.out.println(arr2[0]);


        // 2차원 배열
        int[][] arr3 = new int[3][];
        // 각각 다른 길이를 가지도록 할 수 있음.
        arr3[0] = new int[3];
        arr3[1] = new int[6];
        arr3[2] = new int[9];
    }
}