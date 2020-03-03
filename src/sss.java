public class sss {
    public static void main(String[] args) {
        int [][] matr = new int[3][3];

        matr[0][0] = 1;
        matr[0][1] = 2;
        matr[0][2] = 3;

     matr[1][0] = 4;
    matr[1][1] = 5;
    matr[1][2] =6;

    matr[2][0] =7;
    matr[2][1] =8;
    matr[2][2] =9;

    int sum = 0;
    int sumrow = 0;

    int sumcol = 0;
        for (int i = 0; i <matr.length ; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j]);
                sum = sum + matr [i][j];
                sumrow += matr [i][j];

                sumcol += matr [j][i];

            }


            System.out.println("row # "+(i+1)+" : "+sumrow );

            System.out.println(" col # "+(i+1)+" : "+sumcol);

            sumcol = 0;
            sumrow = 0;
            System.out.println("\n");


        }

        System.out.println("summa vsex matritsiy = "+sum);


    }




}
