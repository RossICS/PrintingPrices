/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package printingprices;
import java.util.Scanner;

/**
 *
 * @author rkaune
 */
public class PrintingPrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copies;
        double cost=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of copies: ");
        copies = input.nextInt();
        if (copies > 1000)
        {
            cost = copies * 0.25;
        }
        else if ((copies >=750) && (copies<1000))
        {
            cost = copies * 0.26;
        }
        else if  ((copies >=500) && (copies<=749))
        {
            cost = copies * 0.27;
        }
        else if  ((copies >=100) && (copies<=499))
        {
            cost = copies * 0.28;
        }
        else
        {
            cost = copies * 0.30;
        }
        System.out.println("The cost is $" + cost);
    }
    
}
