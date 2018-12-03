/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import FFSSM.Club;
import FFSSM.Embauche;
import FFSSM.Licence;
import FFSSM.Moniteur;
import FFSSM.Personne;
import FFSSM.Plongee;
import FFSSM.Plongeur;
import FFSSM.Site;
import java.util.Calendar;
/**
 *
 * @author adrie
 */    import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

        public class FFSSMTest {
    
Moniteur moniteur1,moniteur2; 
Plongee plongee1,plongee2;
Embauche embauche1; 
Club club1; 
Licence licence1,licence2; 
Plongeur plongeur1, plongeur2;
Calendar c1,c2;
Site site1;

        @Before 
        public void setUp() {
            Calendar c1= Calendar.getInstance();
            c1.set(2000,12,12);
          plongeur1= new Plongeur("07635", "Faustin", "Rich", "ville rido", "0633674836",c1,2);
          Calendar c2= Calendar.getInstance();
            c2.set(2001,9,14);
          plongeur2= new Plongeur("07632", "RIDAR", "Betty", "ville bello", "06338836",c2,3);
          Calendar c3= Calendar.getInstance();
            c3.set(1987,8,14);
          moniteur1 = new Moniteur("001", "Berry", "Bob","ville rio","0687678754",c3,1);
          Calendar c4= Calendar.getInstance();
            c4.set(1988,6,17);
          moniteur2 = new Moniteur("002", "Rijoi", "Albel","ville paris","06876679878",c4,2);
          club1= new Club (moniteur1,"ocean","0262336789");
          Calendar c5= Calendar.getInstance();
            c5.set(2018,5,11);
          licence1= new Licence(plongeur1, "01", c5,2, club1);
          Calendar c9= Calendar.getInstance();
            c9.set(1980,5,11);
          licence2= new Licence(plongeur2, "02", c9,3, club1);
          embauche1 = new Embauche(c5, moniteur1, club1);
          site1 = new Site ("Lagon","details");
          Calendar c6= Calendar.getInstance();
            c6.set(2018,6,15);
          plongee1= new Plongee(site1, moniteur1,c6, 25,2);
          Calendar c8= Calendar.getInstance();
            c8.set(2018,6,15);
          plongee2= new Plongee(site1, moniteur2,c8, 25,2);
         
          
          
        }
          
          
          @Test 
          public void Testajoutlicence(){
             plongeur1.ajouteLicence(licence1);
             assertEquals(plongeur1.myLicence.size(),1);
             
            
          }
          @Test
          public void TestNouvelleembauche(){
              Calendar c5= Calendar.getInstance();
              c5.set(2018,5,11);
              moniteur1.nouvelleEmbauche(club1, c5);
              assertEquals(moniteur1.myEmbauche.size(),1);
          }
          @Test
          public void TestajoutParticipant(){
             plongee1.ajouteParticipant(plongeur1);
             assertEquals(plongee1.myPlongeur.size(),1);
          }
          
          @Test 
          public void TestPlongeeConforme(){
              plongeur1.ajouteLicence(licence1);
              plongee1.ajouteParticipant(plongeur1);
              assertEquals(plongee1.estConforme(), true);
          }
          @Test
          public void TestLicenceValide(){
              plongee1.ajouteParticipant(plongeur1);
              assertEquals(plongee1.myPlongeur.size(),1);
          }
              
          
          @Test 
          public void TestEmployeur(){
              Calendar c7= Calendar.getInstance();
              c7.set(2018,7,18);
              moniteur2.nouvelleEmbauche(club1, c7);
              assertEquals(moniteur2.employeur(),club1);
              
          }
          @Test 
          public void TestOrganiseplongee(){
              club1.organisePlongee(plongee1);
              assertEquals(club1.myPlongee.size(),1);
          }
             @Test 
          public void TestPlongeeNonConforme(){
              plongeur2.ajouteLicence(licence2);
              plongee1.ajouteParticipant(plongeur2);
              assertEquals(plongee1.estConforme(), false);
              
          }
          
          @Test 
          public void TestlistePlongeeNonConforme(){
              plongeur1.ajouteLicence(licence1);
              plongee1.ajouteParticipant(plongeur1);
              club1.organisePlongee(plongee1);
              assertEquals(club1.plongeesNonConformes().size(),1);
          }
          @Test 
          public void TestEmplois(){
              moniteur1.emplois();
          }
        }
                
            

 
    





