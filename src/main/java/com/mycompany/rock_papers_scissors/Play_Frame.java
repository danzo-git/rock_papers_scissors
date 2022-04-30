/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rock_papers_scissors;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author denze
 */
public class Play_Frame extends javax.swing.JFrame {
// c'est ici qu'on crée les elements de style qu'on veut appliquer
    //create borders
     Border gray_border= BorderFactory.createMatteBorder(1,1,1,1,Color.DARK_GRAY);
      Border orange_border= BorderFactory.createMatteBorder(1,1,1,1,Color.ORANGE);
      //variable imagePath
             String ciseau="/image/ciseau.jpg";
             String Rock="/image/fist.png"; 
             String paper="/image/papier.jpg";
    /**
     * Creates new form Play_Frame
     */
    public Play_Frame() {
    
       //init component permet d'initialisé les composants a dynamiser
        initComponents();
            // c'est ici qu'on ajoute les elements de style qu'on a crée
         Label_You.setBorder(gray_border);
          Label_Computer.setBorder(gray_border);
           Label_Paper.setBorder(gray_border);
            Label_Scissors.setBorder(gray_border);
             Label_Rock.setBorder(gray_border);
              displayImage(ciseau,Label_Scissors);
               displayImage(Rock,Label_Rock);
                displayImage(ciseau,Label_Paper);
           
    }
    
    public void displayImage(String imagePath, JLabel label){
        
        //get Image
        //on dit tout simplement que la classe getClass ramene des objet de la class Class 
       ImageIcon image = new ImageIcon(getClass().getResource(imagePath));
        //  ImageIcon image=new ImageIcon(getClass().getResource(imagePath));
       
        //resize image
        Image img=image.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
        //set image into Jlabel
       label.setIcon(new ImageIcon(img));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Label_Scissors = new javax.swing.JLabel();
        Label_Computer = new javax.swing.JLabel();
        labelYouWin = new javax.swing.JLabel();
        LabelComputerWins = new javax.swing.JLabel();
        Label_You = new javax.swing.JLabel();
        Label_Paper = new javax.swing.JLabel();
        Label_Rock = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Label_Scissors.setText("jLabel1");
        Label_Scissors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Scissors.setOpaque(true);
        Label_Scissors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_ScissorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label_ScissorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label_ScissorsMouseExited(evt);
            }
        });

        Label_Computer.setText("jLabel1");
        Label_Computer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Computer.setOpaque(true);

        labelYouWin.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        labelYouWin.setForeground(new java.awt.Color(204, 0, 204));
        labelYouWin.setText("1");

        LabelComputerWins.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        LabelComputerWins.setForeground(new java.awt.Color(255, 0, 0));
        LabelComputerWins.setText("0");

        Label_You.setText("jLabel1");
        Label_You.setOpaque(true);

        Label_Paper.setText("jLabel1");
        Label_Paper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Paper.setOpaque(true);
        Label_Paper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_PaperMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label_PaperMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label_PaperMouseExited(evt);
            }
        });

        Label_Rock.setText("jLabel1");
        Label_Rock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Rock.setOpaque(true);
        Label_Rock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_RockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label_RockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label_RockMouseExited(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("you");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("computer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Label_You, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelYouWin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(LabelComputerWins, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_Rock, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_Scissors, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_Computer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_Paper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Computer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelYouWin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelComputerWins, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Label_You, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Rock, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Scissors, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Paper, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label_RockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_RockMouseClicked
        // TODO add your handling code here:
        //afficher image de caillou
    }//GEN-LAST:event_Label_RockMouseClicked

    private void Label_ScissorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ScissorsMouseClicked
        // TODO add your handling code here:
        //afficher image de cisceau 
    }//GEN-LAST:event_Label_ScissorsMouseClicked

    private void Label_PaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_PaperMouseClicked
        // TODO add your handling code here:
        //afficher image de papier
    }//GEN-LAST:event_Label_PaperMouseClicked

    private void Label_RockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_RockMouseEntered
        // TODO add your handling code here:
        Label_Rock.setBorder(orange_border);
    }//GEN-LAST:event_Label_RockMouseEntered

    private void Label_ScissorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ScissorsMouseEntered
        // TODO add your handling code here:
        Label_Scissors.setBorder(orange_border);
    }//GEN-LAST:event_Label_ScissorsMouseEntered

    private void Label_PaperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_PaperMouseEntered
        // TODO add your handling code here:
         Label_Paper.setBorder(orange_border);
    }//GEN-LAST:event_Label_PaperMouseEntered

    private void Label_RockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_RockMouseExited
        // TODO add your handling code here:
        Label_Rock.setBorder(gray_border);
        
    }//GEN-LAST:event_Label_RockMouseExited

    private void Label_ScissorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ScissorsMouseExited
        // TODO add your handling code here:
        Label_Scissors.setBorder(gray_border);
    }//GEN-LAST:event_Label_ScissorsMouseExited

    private void Label_PaperMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_PaperMouseExited
        // TODO add your handling code here:
         Label_Paper.setBorder(gray_border);
    }//GEN-LAST:event_Label_PaperMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelComputerWins;
    private javax.swing.JLabel Label_Computer;
    private javax.swing.JLabel Label_Paper;
    private javax.swing.JLabel Label_Rock;
    private javax.swing.JLabel Label_Scissors;
    private javax.swing.JLabel Label_You;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelYouWin;
    // End of variables declaration//GEN-END:variables
}
