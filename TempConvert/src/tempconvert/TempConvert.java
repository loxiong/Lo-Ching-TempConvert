/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;

/**
 *
 * @author Ching-PC
 */

import java.util.Scanner;

public class TempConvert 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //code application logic here
        double tempf, tempc, sum;
        Scanner keyboard = new Scanner(System.in);
        
        //Input temperature in Celsius from user
        System.out.println("Enter temperature in Celcius: ");
        tempc = keyboard.nextDouble();
        
        //Convert Celcius to Fahrenheit
        tempf = (9.0/5.0) * tempc + 32.0;
        
        //Outputs new temperature in Farenheit
        System.out.println(tempc + " degree Celcius is equal to " + tempf + " degree Farenheit.");    
    } 
}
