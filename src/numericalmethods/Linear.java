/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalmethods;

import javax.swing.JOptionPane;

/**
 *
 * @author Shrestho
 */
class Linear {
     public void reg()
    {
        int n,i;
 float sumx, sumsq, sumy, sumxy, x, y, a0, a1, denom;
  n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of n","")); 
 
 sumx = 0;
 sumsq = 0;
 sumy = 0;
 sumxy = 0;
 for(i = 0; i < n; i++)
 {
     x=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter x","")); 
     y=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter y","")); 
  
  sumx += x;
  sumsq += Math.pow(x, 2);
  sumy += y;
  sumxy += x * y;
 }
 denom = (float) ((n * sumsq) -Math.pow(sumx, 2));
 a0 = (sumy * sumsq) - ((sumx * sumxy) / denom);
 a1 = (n * sumxy - sumx * sumy) / denom;
JOptionPane.showMessageDialog(null,"y="+a1+"+ "+a0+"x");
    }
    
    
}
