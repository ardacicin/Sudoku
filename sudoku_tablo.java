/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ardaoyan
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JPanel;


public class sudoku_tablo extends JPanel{
        
    private static final int HUCRE_BOYUT = 60;  // Hücrelerin genisliği
    private static final int HUCRE_SAY = 9;   // Satır veya sütundaki hücre sayısı
    private static final int ALTKARE   = 3;   // Size of subsquare.
    private static final int TABLO_GENISLIK = HUCRE_BOYUT * HUCRE_SAY;
    private static final int TEXT_OFFSET = 22;  // Fine tuning placement of text.
    private static final Font TEXT_FONT  = new Font("Sansserif", Font.BOLD, 25);
    
    
    public void bos_tablo(Graphics g) {
        super.paintComponent(g);     // paint parent's background        
        int j=0;     
        for(int i=60 ; i<=TABLO_GENISLIK+60;i=i+HUCRE_BOYUT){
            g.setColor(Color.BLACK);
            if(j%3==0){
                g.drawLine(60, i+1, TABLO_GENISLIK+60, i+1);
                g.drawLine(i+1, 60, i+1, TABLO_GENISLIK+60);
            }
            g.drawLine(60, i, TABLO_GENISLIK+60, i);
            g.drawLine(i, 60, i, TABLO_GENISLIK+60);
            j++;
        }
    }
    
    public void string_yaz(Graphics g,int [][]matris){
         super.paintComponent(g); 
         yazlab nesne1 = new yazlab();
          g.setFont(TEXT_FONT);
          for (int i = 0; i < HUCRE_SAY; i++) {
          int yDisplacement = ((i+1) * HUCRE_BOYUT - TEXT_OFFSET)+60;
          for (int j = 0; j < HUCRE_SAY; j++) {
                if ( matris[i][j] != 0) {
                    int xDisplacement = (j * HUCRE_BOYUT + TEXT_OFFSET)+60;
                    g.drawString(Integer.toString(matris[i][j]),xDisplacement, yDisplacement);
                }
            }             
    }
    
    
    
    
    
    }
}
