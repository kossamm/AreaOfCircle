/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaofcircle;

/**
 *
 * @author sakoc2551
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 15.0;
        double pi = 3.14;
        double area = 0.0;
        // algorithm for area calc
        area = pi * radius * radius;
        System.out.println("the area ..." + area + "cm squared");
    }
    
}
