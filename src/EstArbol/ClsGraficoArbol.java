
package EstArbol;

  /**
 *
 * @author Erick Pérez
 * 11/02/2022
 */

import java.awt.*;
import java.util.*;
import javax.swing.*;


public class ClsGraficoArbol extends JPanel{
    private ClsArboles miArbol;
    private HashMap posicionNodos;
    private HashMap tamSubArboles;
    private boolean sucio = true;
    private int padre2hijo = 30, hijo2hijo = 30;
    private Dimension vacio = new Dimension(0,0);
    private FontMetrics fuente;
    
    
    /**
     * El constructor permite inicializar los atributos de la clase ClsGraficoArbol
     * y llama al método repaint(), que es el encargado de pintar el Arbol.
     * @param miArbol: dato de tipo ClsArboles que contiene el Arbol a
     * dibujar.
     */
    public ClsGraficoArbol(ClsArboles miArbol){
        this.miArbol = miArbol;
        this.setBackground(Color.WHITE);
        posicionNodos = new HashMap();
        tamSubArboles = new HashMap();
        sucio = true;
        repaint();      
    }


    /**
     * Calcula las posiciones de los respectivos subárboles y de cada nodo que 
     * forma parte de ese subárbol, para conocer en que posición van a ir dibujados
     * los rectángulos representativos del árbol de la expresión.
     */
    private void calcularPosiciones(){
        posicionNodos.clear();
        tamSubArboles.clear();
        ClsNodo root = this.miArbol.getRaiz();
        if (root != null){
           calcularTamañoSubarbol(root);
           calcularPosicion(root, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        }
    }
    
    /**
     * Calcula el tamaño de cada subárbol y lo agrega al objeto subtreeSizes de la clase
     * de tipo HashMap que va a contener la coleccion de todos los 
     * subárboles que contiene un arbol.
     * @param n:Objeto de la clase ClsNodo que se utiliza como
     * referencia calcular el tamaño de cada subárbol.
     * @return Dimension con el tamaño de cada subárbol.
     */
    private Dimension calcularTamañoSubarbol(ClsNodo n){
        if (n == null) 
            return new Dimension(0,0);
        
        Dimension ld = calcularTamañoSubarbol(n.getIzq());
        Dimension rd = calcularTamañoSubarbol(n.getDer());
        int h = fuente.getHeight() + padre2hijo + Math.max(ld.height, rd.height);
        int w = ld.width + hijo2hijo + rd.width;
        Dimension d = new Dimension(w, h);
        tamSubArboles.put(n, d);
        return d;
    }
    
    
    /**
     * Calcula la ubicación de cada nodo de cada subárbol y agrega cada nodo con 
     * un objeto de tipo Rectangule que tiene la ubicación y la información específica de dónde 
     * va a ser dibujado.
     * @param n: Objeto de tipo ClsNodo que se utiliza como
     * referencia para calcular la ubicación de cada nodo.
     * @param left: int con alineación y orientación a la izquierda.
     * @param right: int con alineación y orientación a la derecha.
     * @param top: int con el tope.
     */
    private void calcularPosicion(ClsNodo n, int left, int right, int top){
        if (n == null) 
            return;
        
        Dimension ld = (Dimension) tamSubArboles.get(n.getIzq());
        if (ld == null) 
            ld = vacio;
        
        Dimension rd = (Dimension) tamSubArboles.get(n.getDer());
        if (rd == null) 
            rd = vacio;
        
        int center = 0;
        if (right != Integer.MAX_VALUE)
            center = right - rd.width - hijo2hijo/2;
        else if (left != Integer.MAX_VALUE)
            center = left + ld.width + hijo2hijo/2;
        int width = fuente.stringWidth(n.getInf().getPrecio()+"");
        
        posicionNodos.put(n,new Rectangle(center - width/2 - 3, top, width + 6, fuente.getHeight()));
        
        calcularPosicion(n.getIzq(), Integer.MAX_VALUE, center - hijo2hijo/2, top + fuente.getHeight() + padre2hijo);
        calcularPosicion(n.getDer(), center + hijo2hijo/2, Integer.MAX_VALUE, top + fuente.getHeight() + padre2hijo);
    }
    
    /**
     * Dibuja el árbol teniendo en cuenta las ubicaciones de los nodos y los 
     * subárboles calculadas anteriormente.
     * @param g: Objeto de la clase Graphics2D que permite realizar el dibujo de las líneas, rectangulos y del String de la información que contiene el Nodo.
     * @param n: Objeto de la clase ClsNodo que se utiliza como referencia para dibujar el árbol.
     * @param puntox: int con la posición en x desde donde se va a dibujar la línea hasta el siguiente hijo.
     * @param puntoy: int con la posición en y desde donde se va a dibujar la línea hasta el siguiente hijo.
     * @param yoffs: int con la altura del FontMetrics.
     */
    private void dibujarArbol(Graphics2D g, ClsNodo n, int puntox, int puntoy, int yoffs){
        if (n == null) 
            return;
        
        Rectangle r = (Rectangle) posicionNodos.get(n);
        g.draw(r);
        g.drawString(n.getInf().getPrecio()+"", r.x + 3, r.y + yoffs);
        
        if (puntox != Integer.MAX_VALUE)  
            
        g.drawLine(puntox, puntoy, (int)(r.x + r.width/2), r.y);
        
        dibujarArbol(g, n.getIzq(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
        dibujarArbol(g, n.getDer(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
    }
    

   /**
     * Sobreescribe el metodo paint y se encarga de pintar todo el árbol.
     * @param g: Objeto de la clase Graphics.
     */
    @Override
    public void paint(Graphics g){
        super.paint(g);
        fuente = g.getFontMetrics();
        
        if (sucio){
          calcularPosiciones();
          sucio = false;
        }
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(getWidth() / 2, padre2hijo);
        dibujarArbol(g2d, this.miArbol.getRaiz(), Integer.MAX_VALUE, Integer.MAX_VALUE, fuente.getLeading() + fuente.getAscent());
        fuente = null;
    }
}