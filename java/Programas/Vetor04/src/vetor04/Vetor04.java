/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author wesle
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};
        
        Arrays.sort(vetor);//ordenar o vetor
        
        for(int v:vetor){
            System.out.print(v + " ");
        }
        
        System.out.println("");
        
        int p = Arrays.binarySearch(vetor, 9);/*busca binária do vetor,
        se não colocar um valor que contenha no vetor, ele retorna negativo,
        pois não existem índices negativos.*/
        System.out.println("Encontrei o valor na posição " + p);
    }
    
}
