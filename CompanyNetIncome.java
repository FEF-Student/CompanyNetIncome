
/**
 * Write a description of class CompanyNetIncome here.
 *
 *Description: Java application to report the financial performance of a company.
 *Program reads a collection of intergers which represent net income from a company.
 *All values are enetred by user to then display some data about the quarter incomes. 
 *
 * @author: Felix Estay-Foix
 * @version: 10/20/2020
 */

import java.util.*;
import java.util.Scanner;

public class CompanyNetIncome
{
    private static int income, count = 0, positiveCount = 0;
    private static double total = 0;
    private static double average = 0.0;
    private static int profitQuarter = 0;
    private static Scanner in = new Scanner(System.in);
    private static double lowestIncome;

    public static void main (String args[])
    {

        average = total / positiveCount;
        System.out.print("Enter net income or Q to quit: ");

        while(in.hasNextInt())
        {
            income = in.nextInt();
            total += income;
            positiveCount++;
            if(positiveCount == 1 )
            {
                lowestIncome = income;
            }

            System.out.print("Enter net income or Q to quit: ");
            if (income > 0)
            {
                profitQuarter++;
            }
            if(lowestIncome > income )
            {
                lowestIncome = income;
            }

        }
        if (positiveCount == 0)
        {
            System.out.print("No income entered.");
            System.exit(0);

        }
        else
        {
            average = total / positiveCount;
            System.out.println("Number of profitable quarters: " + profitQuarter + "." );
            System.out.println("The lowest quarterly income  : " + (int)lowestIncome  + "." );
            System.out.printf("The average quarterly income : %.2f.", + average );           
        }

    }
}
