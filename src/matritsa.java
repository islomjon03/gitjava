public class matritsa {
    public static void main(String[] args) {

        int[][] matr = new int[3][3];

        matr[0][0] = 1;
        matr[0][1] = 2;
        matr[0][2] = 3;

        matr[1][0] = 4;
        matr[1][1] = 5;
        matr[1][2] = 6;

        matr[2][0] = 7;
        matr[2][1] = 8;
        matr[2][2] = 9;


        int s = 0;


        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (i == j){
                    s += matr[i][j];
                }

            }

        }
        System.out.println(" summa diagonalniy matritsa "+s);



    }



}