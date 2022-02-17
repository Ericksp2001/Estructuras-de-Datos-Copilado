/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstListaEstatica;


import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class listaEstatica {
 
    private int _max;
    private int _numeroElementos;
    public RegistroMusica _musica[];


    public listaEstatica(int max) {
        this._max = max;
        this._numeroElementos =0;
        this._musica =new RegistroMusica[this._max];
    }
    
    public listaEstatica() {
        this._max = 10;
        this._numeroElementos =0;
        this._musica =new RegistroMusica[this._max];
    }

      public listaEstatica(listaEstatica nueva) {
        this._max = nueva._max;
        this._numeroElementos =nueva._numeroElementos;
        this._musica =nueva._musica;
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

    public RegistroMusica[] getMusica() {
        return _musica;
    }

    public void Musica(RegistroMusica[] musica) {
        this._musica = musica;
    }
    
    
    public RegistroMusica Musica(int pos) {
        return _musica[pos];
    }

    public void setMusica(int posicion,RegistroMusica c) {
        this._musica[posicion] = c;
    }
    
    public void recorrer (int posicion,boolean derecha){
        
       if(derecha){
           for(int i=this._numeroElementos;i>=posicion;i--){
               this._musica[i]=this._musica[i-1];
               
           }
       }else{
           
           for(int i=posicion;i<=this._numeroElementos;i++){
              this._musica[i-1]=this._musica[i];
               if(i==this._numeroElementos){
                   this._musica[i-1]=null;
                   
               }
               
           }
           
       }
        
    }
    

    
    
    public void recorrerEliminar (int posicion,boolean derecha){
        
       if(derecha){
           for(int i=this._numeroElementos;i>posicion;i--){
               this._musica[i]=this._musica[i-1];
               
           }
       }else{
           
           for(int i=posicion;i<this._numeroElementos;i++){
              this._musica[i-1]=this._musica[i];
               if(i==this._numeroElementos){
                   this._musica[i-1]=null;
                   
               }
               
           }
           
       }
        
    }
    
    
    
    
    public boolean agregar(int posicion,RegistroMusica cancion){
          
        boolean respuesta=true;
        if(this._numeroElementos<this._max){
            if(posicion>this._numeroElementos){
                this._musica[this._numeroElementos]=cancion; 
            JOptionPane.showMessageDialog(null,"Registrado con exito");
            }else{
                recorrer(posicion,true);
                this._musica[posicion-1]=cancion;
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
            
            texto+=i+1+".-\t"+this._musica[i].toString();   
        }
        
        return texto;
       
    }
    
    
    public String buscarTitulo(String dato){
        
        String titulo="";
        for(int i=0;i<this._numeroElementos;i++){
            if(this._musica[i].getCancion().equals(dato)){
                titulo+=i+1+".-\n"+this._musica[i].toString();
               
            }
        }
       return titulo; 
    }
    
    
       public String buscarArtista(String dato){
        
        String titulo="";
        for(int i=0;i<this._numeroElementos;i++){
            if(this._musica[i].getCantante().equals(dato)){
                titulo+=i+1+".-\n"+this._musica[i].toString();  
            }
        }
       return titulo; 
    }
    
       
       
      public String buscarAlbum(String dato){
        
        String titulo="";
        for(int i=0;i<this._numeroElementos;i++){
            if(this._musica[i].getAlbum().equals(dato)){
                titulo+=i+1+".-\n"+this._musica[i].toString();  
            }
        }
       return titulo; 
    }
      
        
      public String buscarDuracion(String dato){
        
        String titulo="";
        for(int i=0;i<this._numeroElementos;i++){
            if(this._musica[i].getDuracion().equals(dato)){
                titulo+=i+1+".-\n"+this._musica[i].toString();  
            }
        }
       return titulo; 
    }
    
      
            public String buscarGenero(String dato){
        
        String titulo="";
        for(int i=0;i<this._numeroElementos;i++){
            if(this._musica[i].getGenero().equals(dato)){
                titulo+=i+1+".-\n"+this._musica[i].toString();  
            }
        }
       return titulo; 
    }
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
