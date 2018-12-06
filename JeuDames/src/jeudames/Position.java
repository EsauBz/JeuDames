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
    
    /**
     *
     * @param dir Direction du mouvement 
     */
    public void deplacerPion(int dir){
        
        switch(dir){
                /* sup droit*/
            case 1:
                x = x + 1;
                y = y +1;
                break;
                /* sup gauche*/
            case 2:
                x = x - 1;
                y = y +1;
                break;
                /* inf droit*/
            case 3:
                x = x + 1;
                y = y - 1;
                break;
                /* inf gauche*/
            case 4:
                x = x - 1;
                y = y - 1;
                break;
        }
    }
    /**
     * 
     * @param dir 
     * @param nombre 
     */
    public void deplacerDame(int dir, int nombre){
        
       switch(dir){
                /* sup droit*/
            case 1:
                x = x + nombre;
                y = y + nombre;
                break;
                /* sup gauche*/
            case 2:
                x = x - nombre;
                y = y + nombre;
                break;
                /* inf droit*/
            case 3:
                x = x + nombre;
                y = y - nombre;
                break;
                /* inf gauche*/
            case 4:
                x = x - nombre;
                y = y - nombre;
                break;
        }
    }
}
