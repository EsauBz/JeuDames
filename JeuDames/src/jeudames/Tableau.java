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
     * Joueur 1
     */
    private Joueur j1;
    /**
     * Joueur 2
     */
    private Joueur j2;

    public Tableau() {
        this.tailleX = 8;
        this.tailleY = 8;
        this.creationJoueurs();
    }

    public Joueur getJ1() {
        return j1;
    }

    public Joueur getJ2() {
        return j2;
    }

    public void TourDeJeu() {

    }

    public void creationJoueurs() {
        String nom;
        Scanner lecture = new Scanner(System.in);

        System.out.println("Creation de Joueurs");
        System.out.println("Joueurs 1");
        System.out.println("Nom: ");

        nom = lecture.next();
        j1 = new Joueur(nom);
        setPositionPieces(true);

        System.out.println("Joueurs 2");
        System.out.println("Nom: ");

        nom = lecture.next();
        j2 = new Joueur(nom);
        setPositionPieces(false);

    }

    public void setPositionPieces(boolean f) {
        if (f) {

            Piece p = new Piece(new Position(0, 0)); // 00 20 40 60
            Piece p1 = new Piece(new Position(2, 0));
            Piece p2 = new Piece(new Position(4, 0));
            Piece p3 = new Piece(new Position(6, 0));
            Piece p4 = new Piece(new Position(1, 1));
            Piece p5 = new Piece(new Position(3, 1));
            Piece p6 = new Piece(new Position(5, 1));
            Piece p7 = new Piece(new Position(7, 1));
            Piece p8 = new Piece(new Position(0, 2));
            Piece p9 = new Piece(new Position(2, 2));
            Piece p11 = new Piece(new Position(4, 2));
            Piece p12 = new Piece(new Position(6, 2));

            this.j1.getPieces().add(p);
            this.j1.getPieces().add(p1);
            this.j1.getPieces().add(p2);
            this.j1.getPieces().add(p3);
            this.j1.getPieces().add(p4);
            this.j1.getPieces().add(p5);
            this.j1.getPieces().add(p6);
            this.j1.getPieces().add(p7);
            this.j1.getPieces().add(p8);
            this.j1.getPieces().add(p9);
            this.j1.getPieces().add(p11);
            this.j1.getPieces().add(p12);

        } else {
            Piece p = new Piece(new Position(0, 7)); // 00 20 40 60
            Piece p1 = new Piece(new Position(2, 7));
            Piece p2 = new Piece(new Position(4, 7));
            Piece p3 = new Piece(new Position(6, 7));
            Piece p4 = new Piece(new Position(1, 6));
            Piece p5 = new Piece(new Position(3, 6));
            Piece p6 = new Piece(new Position(5, 6));
            Piece p7 = new Piece(new Position(7, 6));
            Piece p8 = new Piece(new Position(0, 5));
            Piece p9 = new Piece(new Position(2, 5));
            Piece p11 = new Piece(new Position(4, 5));
            Piece p12 = new Piece(new Position(6, 5));

            this.j2.getPieces().add(p);
            this.j2.getPieces().add(p1);
            this.j2.getPieces().add(p2);
            this.j2.getPieces().add(p3);
            this.j2.getPieces().add(p4);
            this.j2.getPieces().add(p5);
            this.j2.getPieces().add(p6);
            this.j2.getPieces().add(p7);
            this.j2.getPieces().add(p8);
            this.j2.getPieces().add(p9);
            this.j2.getPieces().add(p11);
            this.j2.getPieces().add(p12);
        }
    }
}
