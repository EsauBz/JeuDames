/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudames;

import java.util.Scanner;

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
    private  Joueur j1;
    /**
     *  Joueur 2
     */
    private  Joueur j2;
    
    public Tableau(){
        this.tailleX = 8;
        this.tailleY = 8;
        this.creationJoueurs();
    }
    
    public void TourDeJeu(){
        
    }
    
    public void creationJoueurs(){
        String nom;
        Scanner lecture = new Scanner(System.in);
        
        System.out.println("Creation de Joueurs");
        System.out.println("Joueurs 1");
        System.out.println("Nom: ");
        
        nom = lecture.next();
        j1 = new Joueur(nom);
        
        System.out.println("Joueurs 1");
        System.out.println("Nom: ");
        
        nom = lecture.next();
        j2 = new Joueur(nom);
             
    }
    
    public void setPositionPieces(boolean f){
        if(f){
            int x = 0, y = 0;
            for(int i = 0; i < 12; i++){
                
                Piece p = new Piece(new Position(x,y));
                this.j1.getPieces().add(p);
            }
        }else{
            for(int i = 0; i < 12; i++){
                
            }
        }
    }
}
