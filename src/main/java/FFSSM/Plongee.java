/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Plongee {

    public Site lieu;

    public Moniteur chefDePalanquee;

    public Calendar date;

    public int profondeur;

    public int duree;

    public List<Plongeur> myPlongeur = new LinkedList<>();

    public Plongee(Site lieu, Moniteur chefDePalanquee, Calendar date, int profondeur, int duree) {
        this.lieu = lieu;
        this.chefDePalanquee = chefDePalanquee;
        this.date = date;
        this.profondeur = profondeur;
        this.duree = duree;
    }

    public void ajouteParticipant(Plongeur participant) {
        myPlongeur.add(participant);
    }

    public Calendar getDate() {
        return date;
    }

    public boolean estConforme() {
        Calendar d = Calendar.getInstance();
            d.set(2018,11,30);
        //if(myPlongeur == null)
        //    new throws IllegalArgumentException("pas de participant");
        for (Plongeur p1 : myPlongeur) {

            for (Licence L1 : p1.myLicence) {
                if (L1.estValide(d)) {
                    return true;

                }

            }

        }
        return false;
    }
}
