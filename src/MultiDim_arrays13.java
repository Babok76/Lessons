public class MultiDim_arrays13 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3}; // одномерный массив
        int[][] matr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(matr[2][2]); //первое число отвечает за строку, второе за столбец
        System.out.println(matr[0][1]);

        String[][] strings = new String[2][3];
        strings[0][1] = "Идея";
        System.out.println(strings[0][1]);

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * ввод комментариев
         */
    }
}
