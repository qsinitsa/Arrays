public class Task1234 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        double[] array2 = {1.22, 2.33, 3.22};
        boolean[] array3;
        array3 = new boolean[3];
        array3[0] = true;
        array3[1] = false;
        array3[2] = 1 > 2;

        // Задание 2
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }

        // Задание 3
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        // Задание 4
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                array[i] +=1;
            }
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }

        }
    }
}
