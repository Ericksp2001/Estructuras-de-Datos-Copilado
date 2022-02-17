
package EstListaEstatica;


public class RegistroMusica {

 String cancion;
 String cantante;
 String album;
 String genero; 

String duracion;

    public RegistroMusica() {
    }

    public RegistroMusica(String cancion,String cantante, String album,String genero, String duracion) {
        this.cancion = cancion;
        this.cantante = cantante;
        this.album = album;
        this.genero =genero;
        this.duracion = duracion;
        

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }


 
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
          sb.append(cancion).append("\t\t");
        sb.append(cantante).append("\t\t");
        sb.append(album).append("\t\t");
        sb.append(genero).append("\t\t");
        sb.append(duracion).append("\t\t");
        sb.append("\n");
        return sb.toString();
    }

    

}
