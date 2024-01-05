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
public class Sphere {
   double rayon;

    public Sphere(double rayon) {
       this.rayon = rayon;
    }
    public double computeRayon(){
        return (4/3)*(Math.PI*(Math.pow(rayon, 3)));
    }
    public void presentation(){
        System.out.println("""
                           Hello,
                           Je suis une sphere de rayon : """ + rayon);
    }
   
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ray = 0;
       
        System.out.println("Veuillez entrer la valeur du rayon");
        try {
            ray = sc.nextDouble();
        } catch (InputMismatchException e) {
           // System.out.println(e.getMessage());
            System.out.println("Veuillez entrer une valeur numérique. ");
        }
        System.out.println("####################");
        if (ray != 0){
            Sphere s = new Sphere(ray);
            s.presentation();
            System.out.println("Determinons son volume. V = " + s.computeRayon() );
            
        }
       
   }
}
