/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5laboratorio;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE-PC
 */
public class MatrizClass {

    int[][] inicializarMatriz(int[][] mat, int m, int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                mat[i][j] = 0;
            }
        }
        return mat;
    }

    int[][] llenarAleatorio(int[][] mat, int m, int n) {
        while (true) {
            int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el número para el extremo inferior del intervalo:"));
            int fin = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el número para el extremo superior del intervalo:"));
            if (inicio <= fin) {
                Random aleatorio = new Random();
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        int numeroAleatorio = (inicio + aleatorio.nextInt((fin + 1) - inicio));
                        mat[i][j] = numeroAleatorio;
                    }
                }
                return mat;
            } else {
                JOptionPane.showMessageDialog(null, "El extremo superior debe ser MENOR que el extremo superior del intervalo.");
            }
        }
    }

    int[][] sumarMatrices(int[][] matA, int m, int n, int[][] matB, int p, int q) {
        int[][] matR = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matR[i][j] = matA[i][j] + matB[i][j];
            }
        }
        return matR;
    }

    int[][] restarMatrices(int[][] matA, int m, int n, int[][] matB, int p, int q) {
        int[][] matR = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matR[i][j] = matA[i][j] - matB[i][j];
            }
        }
        return matR;
    }

    int[][] producPuntoMatrices(int[][] matA, int m, int n, int[][] matB, int p, int q) {
        int[][] matR = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matR[i][j] = (matA[i][j]) * (matB[i][j]);
            }
        }
        return matR;
    }

    int[][] producCruzMatrices(int[][] matA, int m, int n, int[][] matB, int p, int q) {
        int[][] matR = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    matR[i][j] = matR[i][j] + (matA[i][k] * matB[k][j]);
                }
            }
        }
        return matR;
    }

    int[][] matrizAlCubo(int[][] matA, int m, int n) {
        int[][] matR = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matR[i][j] = (matA[i][j]) * (matA[i][j]) * (matA[i][j]);
            }
        }
        return matR;
    }

    int[][] transponerMatriz(int[][] matA, int m, int n) {
        int[][] matR = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matR[j][i] = matA[i][j];
            }
        }
        return matR;
    }
}
