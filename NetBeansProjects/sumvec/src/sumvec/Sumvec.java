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
        //crea el objeto de lectura
        java.util.Scanner lec = new java.util.Scanner(System.in);
        //pide al usuario el tamaño
        System.out.println("ingresa el tamaño de los vector ");
        int tam = lec.nextInt();
        //crea los vectores
        int[] vectorA = new int[tam];
        int[] vectorB = new int[tam];
        //llena el vector A
        for(int i =0; i <tam; i++){
           System.out.println("ingresa el dato" + i + " para A"); 
           vectorA[i] = lec.nextInt();
        }
        //llena el vactor B
        for(int j=0; j<tam;j++){
            System.out.println("ingresa el dato" + j + " para B"); 
            vectorB[j] = lec.nextInt();
        }
        //llamar funcion
        int[] resultado = sumvectores(vectorA,vectorB);
        
        //imprimir vector final
        for(int i=0;i<tam;i++){
            System.out.print(resultado[i] + " , ");
        }
    }
    
    //declarar la funcion
    static int[] sumvectores(int[]a,int[]b){
        //vector respuesta
        int[] r = new int[a.length];
        //llenar  vector respuesta
        for(int i=0; i <a.length; i++){
            r[i] = a[i] + b[i];
        }
        return r;
    }        
            
            
    }