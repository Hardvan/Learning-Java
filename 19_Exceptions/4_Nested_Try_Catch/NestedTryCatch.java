public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println("You are in level 1");
            try {
                System.out.println("You are in level 2");
                arr[100] = 100;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index error!");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }
    }
}
