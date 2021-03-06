/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudames;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author guiishida
 */
public class ChargementPartie {
    
/**
 * Format du fichier :
 * 
 * Joueur Nom_Joueur
 * CoordX CoordY isDame .....
 * Joueur Nom_Joueur
 * CoordX CoordY isDame ...
 */


//attribut nomFichier contenant le nom du fichier à charger
    private final String nomFichier;
    
    //attribut responsable pour faire la lecture du fichier qu'on chargera
    private BufferedReader fichier;
    
    /**
     * Constructeur de la class ChargementPartie avec un parametre
     * 
     *
     * @param fichierNom de type String
     */
    
    public ChargementPartie(String fichierNom){
        nomFichier = fichierNom; 
    }
    
    /**
     * 
     * @return un objet de type World contenant l'ensemble des 
     * elements du jeu qui etait sauvegardé dans le fichier texte
     */
    
    public Tableau chargerPartie(){ 
        Tableau jeu = null;
        Joueur j1 = null;
        Joueur j2 = null;
        try {
            String ligne;
            fichier = new BufferedReader(new FileReader(nomFichier));
            ligne = fichier.readLine(); //lis une ligne
            String delimiteurs = " ,.;";
            if (ligne != null) { // si le fichier est rempli
                
                // on declare un 'tokenizer' pour decouper chaque ligne
                // en fonction des delimiteurs
                StringTokenizer tokenizer = new StringTokenizer(ligne, delimiteurs);
                                
                // If pour récuperer l'info du premier joueur
                if (tokenizer.hasMoreTokens()){
                    String nom = tokenizer.nextToken();
                    j1 = new Joueur(nom);
                }
                ligne = fichier.readLine();
                StringTokenizer tokenizer2 = new StringTokenizer(ligne, delimiteurs);
                // while pour récuperer les pièces qui le joueur j1 possede
                while (tokenizer2.hasMoreTokens()){
                    try {
                        int coordX = Integer.parseInt(tokenizer2.nextToken());
                        int coordY = Integer.parseInt(tokenizer2.nextToken());
                        String isDame = tokenizer2.nextToken();
                        if ("false".equals(isDame)){
                            j1.getPieces().add(new Piece(new Position(coordX, coordY), false));
                        }
                        else {
                            j1.getPieces().add(new Piece(new Position(coordX, coordY), true));
                        }
                    } catch (NumberFormatException e) {
                        System.err.println(e.getMessage());  
                    }  
                }
                ligne = fichier.readLine(); 
                StringTokenizer tokenizer3 = new StringTokenizer(ligne, delimiteurs);
                                
                // If pour récuperer l'info du premier joueur
                if (tokenizer3.hasMoreTokens()){
                    String nom2 = tokenizer3.nextToken();
                    j2 = new Joueur(nom2);
                }
                ligne = fichier.readLine();
                StringTokenizer tokenizer4 = new StringTokenizer(ligne, delimiteurs);
                // while pour récuperer les pièces qui le joueur j2 possede
                while (tokenizer4.hasMoreTokens()){
                    try {
                        int coordX = Integer.parseInt(tokenizer4.nextToken());
                        int coordY = Integer.parseInt(tokenizer4.nextToken());
                        String isDame = tokenizer4.nextToken();
                        if ("false".equals(isDame)){
                            j2.getPieces().add(new Piece(new Position(coordX, coordY), false));
                        }
                        else {
                            j2.getPieces().add(new Piece(new Position(coordX, coordY), true));
                        }
                    } catch (NumberFormatException e) {
                        System.err.println(e.getMessage());  
                    }  
                }
                
                //Initialisation d'un jeu --> Il faut passer les deux joueurs comme paramètre
                jeu = new Tableau();
            }
            fichier.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
              
        return jeu;
    }
}
