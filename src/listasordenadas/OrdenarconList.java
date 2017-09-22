/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasordenadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author milena
 */
public class OrdenarconList {
    
    public int numElementos;
    public List<Integer> lista = null;
    
    public OrdenarconList(List<Integer> lista){
        this.numElementos = numElementos;
//        this.lista = lista;
        this.lista = new ArrayList<Integer>();
//        agregarElemento(2);
//        iniRandom();
               
    }
    
    public void iniRandoms(){
        this.lista = new ArrayList<Integer>();
//        for(int i=0; i<this.numElementos; i++){
//            int aux = (int)(Math.random() * 20);
//            lista.add(aux);
//                                 
//        }
    }
    
    public void imprimirBurbuja(){
        
        Collections.sort(lista);
        for (int elemento:this.lista){
            System.out.println(elemento);
        }
    }
    
    public void agregarElemento(int numElementos){
//        this.lista = new ArrayList<Integer>();
        for(int i=0; i<numElementos; i++){
            int aux = (int)(Math.random() * 20);
             lista.add(aux);
                                              
        }
    }
    
    public void RemoverNumAleatorio(){
        //calculamos el tamaños de la lista y con un random eliminamos aleatoriamente una posición
        int longitud = this.lista.size();
        int remover = (int)(Math.random() * longitud);
        int aux = remover;
        this.lista.remove(remover);
        int longitud2 = this.lista.size();
        System.out.println("la lista ahora tiene "+longitud2+" elementos"+"\n");//imprimimos la nueva longitud
    }
    
    public void RemoverElementoEspec(int posi){
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).equals(posi)){
                lista.remove(i);
                System.out.println("se removio el elemento");
            }else{
                System.out.println("no coincide");
            }
            
        }
    }
    
//     List<Integer> listas = new ArrayList<Integer>();
    public static void main(String[] args) {
       
        List<Integer> bu = null;
        OrdenarconList o = new OrdenarconList(bu);
        o.agregarElemento(10);//agregamos los elementos que queramos como parametro
//        o.agregarElemento(2);
//        o.agregarElemento(2);
        o.imprimirBurbuja();
        System.out.println();
//        o.RemoverNumAleatorio(); //removemos de la lista un elemento aleat..
        System.out.println();
//        o.imprimirBurbuja();//imprimimos nuevamente para ver que ya tiene un elemento menos
        o.RemoverElementoEspec(5);
        o.imprimirBurbuja();
        
    }
    
     
    
    
}
