import java.util.Scanner;

public class Matriz {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a quantidade de linhas e colunas da matriz.");
        System.out.print("Linhas: ");
        int n = sc.nextInt();

        System.out.print("Colunas: ");
        int j = sc.nextInt();

        int [][] mat = new int[n][j];

        for (int i = 0; i< mat.length; i++) {
            for (int p = 0; p < mat[i].length; p++) {
                mat[i][p] = sc.nextInt();
            }
        }

        System.out.print("Escolha um numero da Matriz para demonstrar suas respectivas posições: ");
        int positionOf = sc.nextInt();


        System.out.println();
        for (int i = 0; i< mat.length; i++) {
            for (int p = 0; p < mat[i].length; p++) {
                if(mat[i][p] == positionOf){
                    System.out.println("Position " + i + "," + p + ":");

                    if(p>0) {
                        System.out.println("Left: " + mat[i][p - 1]);
                    }
                    if(i>0) {
                        System.out.println("Up: " + mat[i-1][p]);
                    }

                    if(p < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][p+1]);
                    }

                    if(i < mat.length-1) {
                        System.out.println("Down: " + mat[i + 1][p]);
                    }


                }
            }
        }


        sc.close();
    }
}
