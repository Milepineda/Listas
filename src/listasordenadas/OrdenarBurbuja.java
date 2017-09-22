/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasordenadas;

/**
 *
 * @author milena
 */
public class OrdenarBurbuja {
    
    public int[] Ordenar(int[] vector){
        
        int aux;
        int longitud= vector.length;
        
        for(int i=1; i<longitud; i++){
            for(int j=0; j<longitud-1; j++){
                if(vector[j]>vector[j+1]){
                    aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
            }
        }
        return vector;
    }
    
    
}
