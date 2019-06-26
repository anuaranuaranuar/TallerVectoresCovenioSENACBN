/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallervectorescoveniosenacbn;

import java.util.Scanner;
import javafx.beans.binding.Bindings;

/**
 *
 * @author AnuarParejo,DiegoDiaz
 */
public class TallerVectoresCovenioSENACBN {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Digite la cantidad estudiantes");
        int n = leer.nextInt();
        float promedio =0;
        
        String matriz [][] = new String [n][2];
        for(int i =0; i<n; i++){
            for(int j=0; j<2; j++){
                if(j==0){
                    System.out.println("Digite el nombre del estudiante:");
                    matriz[i][j]= leer.next();
                }else{
                    System.out.println("Digite la nota de "+matriz[i][0]);
                    matriz[i][j]= leer.next();
                    promedio = promedio + Float.parseFloat(matriz[i][j]);
                }
            }
        }
        
        
    }
    
}
