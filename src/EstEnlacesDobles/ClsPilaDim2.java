

package EstEnlacesDobles;

import EstVeterinaria.ClsVeterinaria;

/**
 *
 * @author Erick Perez
 * 29/01/2021
 */

public class ClsPilaDim2 {
    private ClsListDim2 _Pila;

    //Constructor
    public ClsPilaDim2(){
        _Pila = new ClsListDim2();
    }

    //Rutinas Getter y Setter
    public int nelem(){
        return _Pila.nelem();
    }

    public ClsNodo2 CabIzq(){
        return _Pila.cabizq();
    }

    public ClsNodo2 CabDer(){
        return _Pila.cabder();
    }

    /**
     * Adaptacion del metodo poner de la clase ClsListDim2 que cumple con la estrcutura de una pila
     * @param dato Objeto de tipo ClsAnimal que sera contenido en un nodo
     */
    public void Poner(ClsVeterinaria dato){
        _Pila.poner(1, dato, true);
    }

    /**
     * Adaptacion del metodo sacar de la clase ClsListDim2 que cumple con la estrcutura de una pila
     * @return Un valor booleano que es verdadero cuando el proceso fue exitoso
     */
    public Boolean Sacar(){
        return _Pila.sacar(1, true);
    }

    /**
     * Adaptacion del metodo Buscar de la clase ClsListDim2 que cumple con la estrcutura de una pila
     * @param clave Sting que se comparara con el atributo nombre del objeto ClsAnimal contenido en cada nodo
     * @return Entero que indica la posicion del nodo coincidente
     */
    public int Buscar(String clave){
        return _Pila.Buscar(clave);
    }
}
