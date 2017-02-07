/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumvec;

/**
 *
 * @author Estudiante
 */
public class Sumvec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lec = new java.util.Scanner(System.in);
        System.out.println("ingresa el tamaño de los vector ");
        int tam = lec.nextInt();
        int[] vectorA = new int[tam];
        int[] vectorB = new int[tam];
        
        for(int i =0; i <tam; i++){
           System.out.println("ingresa el dato" + i + " para A"); 
           vectorA[i] = lec.nextInt();
        }
        for(int j=0; j<tam;j++){
            System.out.println("ingresa el dato" + j + " para B"); 
            vectorB[j] = lec.nextInt();
        }
        int[] resultado = sumvectores(vectorA,vectorB);
        
        for(int i=0;i<tam;i++){
            System.out.print(resultado[i]);
        }
    }
            
    static int[] sumvectores(int[]a,int[]b){
        int[] r = new int[a.length];
        for(int i=0; i <a.length; i++){
            r[i] = a[i] + b[i];
        }
        return r;
    }        
            
            
    }
    
    
    
    
}
