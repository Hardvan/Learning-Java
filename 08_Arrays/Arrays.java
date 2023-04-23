public class Arrays {
    public static void main(String[] args) {

        // Creating an array
        // 1)
        int[] arr = new int[5]; // Declaration & Memory Allocation

        // 2)
        int[] arr2; // Declaration
        arr2 = new int[5]; // Memory Allocation

        // 3)
        int[] arr3 = { 1, 2, 3, 4, 5 }; // Declaration & Initialization

        // Assigning values to the array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // Displaying the array elements
        // Naive Method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // ? For-each loop (like C++)
        for (int element : arr) {
            System.out.println(element);
        }

        // ? Multi-Dimensional Arrays
        int[][] matrix = new int[2][2];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        // Displaying
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // OR

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
