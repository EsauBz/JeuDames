/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudames;

/**
 *
 * @author EsauBZ
 */
public class Piece {
    private Position pos;
    private boolean isDame;
    
    public Piece(Position p){
        pos = p;
        isDame = false;
    }

    public Position getPos() {
        return pos;
    }

    public boolean isIsDame() {
        return isDame;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void setIsDame(boolean isDame) {
        this.isDame = isDame;
    }
    
    
}
