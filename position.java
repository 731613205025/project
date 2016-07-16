/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class position {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         System.out.println("Enter the Element");
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       
        int flag=0;
        System.out.println("Enter the number in an array");
        int[] b=new int[n];
        
        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
        }
        System.out.println("Enter the Element u have to search:");
        int c=s.nextInt();
        
         for(int i=0;i<n;i++)
        {
            if(b[i]==c)
            {
                System.out.println("number in the position:"+i);
                flag=1;
                break;
            }
        }
       if(flag==0)
            System.out.println("number is not present in array");
        
    }
}
