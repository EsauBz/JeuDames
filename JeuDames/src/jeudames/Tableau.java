/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudames;

/**
 *
 * @author guiishida
 */
public class Tableau {
    /**
     * Taille X du tableau
     */
    private final int tailleX;
    /**
     * Taille Y du tableau
     */
    private final int tailleY;
    /**
     *  Joueur 1
     */
    private final Joueur j1;
    /**
     *  Joueur 2
     */
    private final Joueur j2;
    
    public Tableau(Joueur p1, Joueur p2){
        this.tailleX = 8;
        this.tailleY = 8;
        this.j1 = p1;
        this.j2 = p2;
    }
    
    public void TourDeJeu(){
        
    }
}
