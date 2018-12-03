/**
 * @(#) Club.java
 */
package FFSSM;

import static java.lang.reflect.Array.set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Club {

 
    public Moniteur president;

    public String nom;

    public String adresse;

    public String telephone;
    
    public List<Plongee> myPlongee= new LinkedList<>();

    public Club(Moniteur président, String nom, String telephone) {
        this.president = président;
        this.nom = nom;
        this.telephone = telephone;
    }

    public Set<Plongee> plongeesNonConformes() {
        Set<Plongee> plongeenonconf = new HashSet<>(); 
        for( Plongee p : myPlongee){
			plongeenonconf.add(p);
		}

		return plongeenonconf;
        }
    

    public void organisePlongee(Plongee p) {
         myPlongee.add(p);
    }
    
    
    public Moniteur getPresident() {
        return president;
    }

    public void setPresident(Moniteur président) {
        this.president = président;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Club{" + "président=" + president + ", nom=" + nom + ", adresse=" + adresse + ", telephone=" + telephone + '}';
    }

}
