/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstListaEstatica;


import EstVeterinaria.ClsVeterinaria;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class listaEstatica {
 
    private int _max;
    private int _numeroElementos;
    public ClsVeterinaria _registroVet[];


    public listaEstatica(int max) {
        this._max = max;
        this._numeroElementos =0;
        this._registroVet =new ClsVeterinaria[this._max];
    }
    
    public listaEstatica() {
        this._max = 10;
        this._numeroElementos =0;
        this._registroVet =new ClsVeterinaria[this._max];
    }

      public listaEstatica(listaEstatica nueva) {
        this._max = nueva._max;
        this._numeroElementos =nueva._numeroElementos;
        this._registroVet =nueva._registroVet;
    }

    
    public int getMax() {
        return _max;
    }

    public void setMax(int max) {
        this._max = max;
    }

    public int getNumeroElementos() {
        return _numeroElementos;
    }

    public void setNumeroElementos(int numeroElementos) {
        this._numeroElementos = numeroElementos;
    }

    public ClsVeterinaria[] getRregistroVet() {
        return _registroVet;
    }

    public void RegistroVet(ClsVeterinaria[] registro) {
        this._registroVet = registro;
    }
    
    
    public ClsVeterinaria getRegistroVet(int pos) {
        return _registroVet[pos];
    }

    public void setRegistroVet(int posicion,ClsVeterinaria c) {
        this._registroVet[posicion] = c;
    }

    //--------------------------------------------------------------------------
    public void recorrer (int posicion,boolean derecha){
        
       if(derecha){
           for(int i=this._numeroElementos;i>=posicion;i--){
               this._registroVet[i]=this._registroVet[i-1];
               
           }
       }else{
           
           for(int i=posicion;i<=this._numeroElementos;i++){
              this._registroVet[i-1]=this._registroVet[i];
               if(i==this._numeroElementos){
                   this._registroVet[i-1]=null;
                   
               }
               
           }
           
       }
        
    }
    

    
    
    public void recorrerEliminar (int posicion,boolean derecha){
        
       if(derecha){
           for(int i=this._numeroElementos;i>posicion;i--){
               this._registroVet[i]=this._registroVet[i-1];
               
           }
       }else{
           
           for(int i=posicion;i<this._numeroElementos;i++){
              this._registroVet[i-1]=this._registroVet[i];
               if(i==this._numeroElementos){
                   this._registroVet[i-1]=null;
                   
               }
               
           }
           
       }
        
    }
    
    
    
    
    public boolean agregar(int posicion,ClsVeterinaria cancion){
          
        boolean respuesta=true;
        if(this._numeroElementos<this._max){
            if(posicion>this._numeroElementos){
                this._registroVet[this._numeroElementos]=cancion; 
            JOptionPane.showMessageDialog(null,"Registrado con exito");
            }else{
                recorrer(posicion,true);
                this._registroVet[posicion-1]=cancion;
            JOptionPane.showMessageDialog(null,"Registrado con exito");
            }
            this._numeroElementos++;
        }else{
            respuesta=false;
            
            JOptionPane.showMessageDialog(null,"No se puede agregar mas elementos","Error", JOptionPane.ERROR_MESSAGE);
        }
   
        
        return respuesta;
      
    }
    

    public boolean eliminar(int posicion){
        
        boolean respuesta=true;
        if(this._numeroElementos>0){
            if(posicion<=this._numeroElementos){
                recorrerEliminar(posicion,false);
                this._numeroElementos--;
            }else{
                respuesta=false;
            }
        }else{
            respuesta=false;
        }
        return respuesta;
    
}
    
    
    public String mostrar(){
        String texto="";
        for(int i=0;i<this._numeroElementos;i++){
            
            texto+=i+1+".-\t"+this._registroVet[i].toString();   
        }
        
        return texto;
       
    }
    
    
    public String buscarMascota(String dato){
        
        String titulo="";
        for(int i=0;i<this._numeroElementos;i++){
            if(this._registroVet[i].NombreMascota().equals(dato)){
                titulo+=i+1+".-\n"+this._registroVet[i].toString();
               
            }
        }
       return titulo; 
    }
    
    
       public String buscarDueño(String dato){
        
        String titulo="";
        for(int i=0;i<this._numeroElementos;i++){
            if(this._registroVet[i].NombreDueño().equals(dato)){
                titulo+=i+1+".-\n"+this._registroVet[i].toString();  
            }
        }
       return titulo; 
    }
    
       
       
      public String buscarIdDueño(String dato){
        
        String titulo="";
        for(int i=0;i<this._numeroElementos;i++){
            if(this._registroVet[i].IdDueño().equals(dato)){
                titulo+=i+1+".-\n"+this._registroVet[i].toString();  
            }
        }
       return titulo; 
    }
      
           
    
    
}
