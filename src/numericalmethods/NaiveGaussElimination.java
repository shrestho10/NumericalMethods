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
class NaiveGaussElimination {
     public void elimination()
    {
        int i,j,k,n;
    double a[][] =new double[10][10];
    double c,sum=0;
    double x[] =new double[10];
    
     n=Integer.parseInt(JOptionPane.showInputDialog(null,"\nEnter the order of matrix: ",""));
    

    for(i=1; i<=n; i++)
    {
        for(j=1; j<=(n+1); j++)
        {
            a[i][j]=Double.parseDouble(JOptionPane.showInputDialog(null,"\nEnter the value A ["+i+"]["
                    +j+"]"));
        }
    }
    for(j=1; j<=n; j++) 
    {
        for(i=1; i<=n; i++)
        {
            if(i>j)
            {
                c=a[i][j]/a[j][j];
                for(k=1; k<=n+1; k++)
                {
                    a[i][k]=a[i][k]-c*a[j][k];
                }
            }
        }
    }
    x[n]=a[n][n+1]/a[n][n];
    
    for(i=n-1; i>=1; i--)
    {
        sum=0;
        for(j=i+1; j<=n; j++)
        {
            sum=sum+a[i][j]*x[j];
        }
        x[i]=(a[i][n+1]-sum)/a[i][i];
    }
    ArrayList<String> sku = new ArrayList<String> ();
    String s = null;
    for(i=1; i<=n; i++)
    {
        JOptionPane.showMessageDialog(null,"x" +i+"  =  "   +x[i]); 
        sku.add("x"+i+"  =  "+x[i]+"\n\n\n");
        s=sku.toString();
    }
     JOptionPane.showMessageDialog(null,s);
  
}
    }

    


