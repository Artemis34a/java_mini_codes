/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Student {
    String matricule;
    String nom;
    int nbrMatieres;
    double[] notes = new double[nbrMatieres];

    public Student(String matricule, String nom, int nbrMatieres) {
        this.matricule = matricule;
        this.nom = nom;
        this.nbrMatieres = nbrMatieres;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }
    
    double calculMoy(){
        double sum = 0;
        for (double note : notes) {
            sum = sum + note;
        }
        return sum / notes.length;
    }

    @Override
    public String toString() {
        return "Je suis " + this.nom + " de matricule " + this.matricule 
                + " et j'ai " + this.nbrMatieres + " matieres. " ;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String nom = null;
        String matricule = null;
        
        try {
            System.out.println("Entrez les informations de l'étudiant.");
            System.out.print("Matricule : ");
            matricule = sc.next();
            System.out.print("Nom : ");
            nom = sc.next();
            System.out.println("Nombre de matieres : ");
            n = sc.nextInt();
        } catch (InputMismatchException e) {
           // System.out.println(e.getMessage());
            System.out.println("Veuillez entrer une valeur valide ");
        }
        
        Student stu = new Student(matricule, nom, n);
        System.out.println(stu);
        double[] notes = new double[stu.nbrMatieres];
        
        System.out.println("Nous allons maintenant enregistrer les notes");
        for (int i = 0; i < stu.nbrMatieres ; i++) {
            System.out.println("Note n ° = " + (i+1));
            notes[i] = sc.nextDouble();
        }
        
        stu.setNotes(notes);
        double moy = stu.calculMoy();
        for (int i = 0; i < stu.nbrMatieres ; i++) {
            System.out.println(" Note " + (i+1) + " = "+notes[i]);
        }
        System.out.println("Moyenne = " + moy);
        
        
        
            
        
        
        
        
    }
}
