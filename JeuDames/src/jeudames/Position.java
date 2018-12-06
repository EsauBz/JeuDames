/*
 * Ecole Centrale de Nantes MEDEV
 */
package jeudames;

/**
 *
 * @author EsauBZ
 */
public class Position {
    /** Position d'un Jette **/
    private int x;
    private int y;
    
    /**
     * 
     * @param x
     * @param y 
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
      public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void deplacerPion(int dir ){
        
    }
}
