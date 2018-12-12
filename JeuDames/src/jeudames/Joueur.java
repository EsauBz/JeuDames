/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudames;

import java.util.ArrayList;

/**
 *
 * @author guiishida
 */
public class Joueur {
    private String nom;
    private ArrayList<Piece> pieces;
    
    public Joueur(String nom){
        this.nom = nom;
        pieces = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
