/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Moniteur extends Personne {

    public int numeroDiplome;
    public List<Embauche> myEmbauche= new LinkedList<>();
    
    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
    }

    public Club employeur() {
     Embauche s = myEmbauche.get(myEmbauche.size() - 1) ;
     if (s.estTerminee())
         return null; 
     return s.getEmployeur();
     }
    
    
    public void nouvelleEmbauche(Club employeur, Calendar debutNouvelle) {   
		
        Embauche s = new Embauche(debutNouvelle, this, employeur);
		myEmbauche.add(s);	    
    }

    public  List<Embauche> emplois() {
               return myEmbauche;
    }

}
