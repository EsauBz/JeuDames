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
                    
                    try {
                        Joueur j1 = new Joueur(nom);
                    } catch (NumberFormatException e) {
                        System.err.println(e.getMessage());  
                    }  
                }
                ligne = fichier.readLine();
                StringTokenizer tokenizer2 = new StringTokenizer(ligne, delimiteurs);
                // If pour récuperer les pièces qui le joueur possede
                while (tokenizer2.hasMoreTokens()){
 
                    try {
                        int coordX = Integer.parseInt(tokenizer2.nextToken());
                        int coordY = Integer.parseInt(tokenizer2.nextToken());
                        String isDame = tokenizer2.nextToken();
                        if (isDame == "false"){
                            
                        }
                        
                    } catch (NumberFormatException e) {
                        System.err.println(e.getMessage());  
                    }  
                }
                //Initialisation du monde avec un constructeur de deux parametres
                monde = new World(coordX, coordY);
                ligne = fichier.readLine();
                
                while (ligne != null){
                    //appel au methode creerElementJeu pour creer l'element de la ligne lue 
                    creerElementJeu(ligne, monde);                     
                    ligne = fichier.readLine();
                }
            }
            fichier.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
              
        return monde;
    }
}
