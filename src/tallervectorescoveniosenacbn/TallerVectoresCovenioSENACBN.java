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
        
        System.out.println("Listado de estudiantes:");
        for(int i =0; i<n; i++){
            for(int j=0; j<2; j++){
                System.out.print(matriz[i][j]+" = ");
            }
            
            System.out.println("");
        }
        
        System.out.println("Promedio de estudiantes: \n"+(promedio/n));
        int mayor=0, menor=0;
        for(int i =0; i<n; i++){
            for(int j=1; j<=1; j++){
                if(Float.parseFloat(matriz[i][j])>Float.parseFloat(matriz[mayor][j])){
                    mayor = i;
                }else if(Float.parseFloat(matriz[i][j])<Float.parseFloat(matriz[menor][j])){
                    menor=i;
                }
            }
        }
        
        System.out.println("Mayor nota: "+matriz[mayor][0]+" = "+matriz[mayor][1]+"\nMenor nota: "+matriz[menor][0]+" = "+matriz[menor][1]);
        
        int cont=0;
        for(int i =0; i<n; i++){
            for(int j=1; j<2; j++){
                if(Float.parseFloat(matriz[i][j])>=3){
                    cont++;
                }
            }
        }
        
        System.out.println("Su materia la han ganado un total de "+cont+" estudiante(s)");
    }
    
}
