

package EstArbol;
/**
 * @author Erick Perez, Alexa Amaguaya
 * 22/02/2022
 */

import java.util.ArrayList;
import javax.swing.JPanel;

public class ClsArboles {
    private ClsNodo _raiz;
    private int _nodos;
    
    public ClsArboles(){
        _raiz=new ClsNodo();
        _nodos=0;
    }

    public ClsNodo getRaiz() {
        return _raiz;
    }

    public void setRaiz(ClsNodo raiz) {
        this._raiz = raiz;
    }

    public int getNodos() {
        return _nodos;
    }

    public void setNodos(int nodos) {
        this._nodos = nodos;
    }
    
    /**
     * Permite la insercion de un nuevo nodo al arbol de manera recursiva
     * @param nuevo Es el nodo a insertar en el arbol
     * @param pivote Es un nodo de referencia que permite recorrer el arbol
     * hasta encontrar una posicion adecuada para la insercion
     */
    public void insertar(ClsNodo nuevo, ClsNodo pivote) {
        if (this._nodos==0) {
            _raiz = nuevo;
        } else {
            if (nuevo.getInf().CostoFactura() <= pivote.getInf().CostoFactura()) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nuevo);
                } else {
                    insertar(nuevo, pivote.getIzq());
                }
            } else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nuevo);
                } else {
                    insertar(nuevo, pivote.getDer());
                }
            }
        }
        _nodos+=1;
    }
    
    /**
     * Permite la llamada a la clase CLsGraficoArbol para generar el grafico
     * del arbol
     * @return 
     */
    public JPanel getdibujo() {
        return new ClsGraficoArbol(this);
    }
    

    /**
     * Metodo que permite obtener un string con los nodos ordenados de manera
     * PostOrden
     * @return String con los nodos del arbol ordenados
     */
    public String postOrden() {
        ArrayList rec = new ArrayList();
        postorden(_raiz, rec);
        String arbol = "";
        for (int i = 0; i < rec.size(); i++) {
            arbol+=rec.get(i);
        }
        return arbol;
    }
    
    /**
     * Metodo que pemrite ordenar los nodos del arbol en un arraylist de manera PostOrden
     * @param aux Nodo que permite recorrer los nodos del arbol
     * @param recorrido ArrayList que contiene los nodos ordenados del arbol
     */
    private void postorden(ClsNodo aux, ArrayList recorrido) {
        if (aux != null) {
            postorden(aux.getIzq(), recorrido);
            postorden(aux.getDer(), recorrido);
            recorrido.add(aux.getInf().CostoFactura()+" - ");
        }
    }
    
    
    /**
     * Metodo que permite obtener un string con los nodos ordenados de manera
     * PreOrden
     * @return String con los nodos del arbol ordenados
     */
    public String preOrden() {
        ArrayList l=new ArrayList();
        preOrden(_raiz,l);
        String arbol ="";
        for (int i = 0; i < l.size(); i++) {
            arbol += l.get(i);
        }
        return arbol;
    }

    /**
     * Metodo que pemrite ordenar los nodos del arbol en un arraylist de manera PreOrden
     * @param reco Nodo que permite recorrer los nodos del arbol
     * @param contenedor Arraylist que contendra los nodos ordenados
     */
    private void preOrden(ClsNodo reco, ArrayList contenedor) {
        if (reco != null) {
            contenedor.add(reco.getInf().CostoFactura()+ " - ");
            preOrden(reco.getIzq(),contenedor);
            preOrden(reco.getDer(),contenedor);
        }
    } 
    
    
    /**
     * Metodo que permite obtener un string con los nodos ordenados de manera
     * InOrden
     * @return String con los nodos del arbol ordenados
     */
    public String inOrden() {
        ArrayList l=new ArrayList();
        inOrden(_raiz,l);
        String arbol = "";
        for (int i = 0; i < l.size(); i++) {
            arbol+=l.get(i);
        }
        return arbol;
    }
    
    /**
     * Metodo que pemrite ordenar los nodos del arbol en un arraylist de manera InOrden
     * @param reco Nodo que permite recorrer los nodos del arbol
     * @param contenedor Arraylist que contendra los nodos ordenados
     */
    private void inOrden(ClsNodo orde,ArrayList contenedor) {
        if (orde != null) {
            inOrden(orde.getIzq(),contenedor);
            contenedor.add(orde.getInf().CostoFactura() + " - ");
            inOrden(orde.getDer(),contenedor);
        }
    }
}
