/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalmethods;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Shrestho
 */
public class GaussJordan {
    public void jordan()
    {
        int i,j,k,n;
        Double A[][]=new Double[20][20];
    double c;
    Double x[]=new Double[10];
    n=  (int) Double.parseDouble(JOptionPane.showInputDialog(null,"\nEnter the size of matrix: "));
    
    //printf("\nEnter the elements of augmented matrix row-wise:\n");
    for(i=1; i<=n; i++)
    {
        for(j=1; j<=(n+1); j++)
        {
            A[i][j]=  Double.parseDouble(JOptionPane.showInputDialog(null,"\nEnter the value A ["+i+"]["
                    +j+"]"
            ));      }
    }
     /* Now finding the elements of diagonal matrix */
    for(j=1; j<=n; j++)
    {
        for(i=1; i<=n; i++)
        {
            if(i!=j)
            {
                c=A[i][j]/A[j][j];
                for(k=1; k<=n+1; k++)
                {
                    A[i][k]=A[i][k]-c*A[j][k];
                }
            }
        }
    }
     ArrayList<String> sku = new ArrayList<String> ();
    String s = null;
    //printf("\nThe solution is:\n");
    for(i=1; i<=n; i++)
    {
        x[i]=A[i][n+1]/A[i][i];
       JOptionPane.showMessageDialog(null,"x" +i+"  =  "   +x[i]); 
        sku.add("x"+i+"  =  "+x[i]+"\n\n\n");
        s=sku.toString();
    }
     JOptionPane.showMessageDialog(null,s);
    }
    
}
