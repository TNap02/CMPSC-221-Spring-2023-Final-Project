/**
* CMPSC 221 Program #5
 * StartMenu.java
 * GUI for the start menu
 * @author Logan Simbeck
 * @version 1.0 4/27/2023
 */

package SnakeGameGUIs;

import java.awt.Color;
import snake.SnakeFrame;


public class StartMenu extends java.awt.Frame {

    /**
     * Creates new form StartName
     */
    public StartMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlayButton = new javax.swing.JButton();
        TitleTextField = new javax.swing.JTextField();
        SettingButton = new javax.swing.JButton();
        LeaderboardButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setBackground(java.awt.Color.black);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        PlayButton.setText("Play");
        PlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PlayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayButtonMouseExited(evt);
            }
        });
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });

        TitleTextField.setEditable(false);
        TitleTextField.setBackground(new java.awt.Color(0, 0, 0));
        TitleTextField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TitleTextField.setForeground(new java.awt.Color(102, 255, 102));
        TitleTextField.setText("Snake Game");
        TitleTextField.setBorder(null);
        TitleTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        TitleTextField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        TitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleTextFieldActionPerformed(evt);
            }
        });

        SettingButton.setText("Options");
        SettingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingButtonMouseExited(evt);
            }
        });
        SettingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingButtonActionPerformed(evt);
            }
        });

        LeaderboardButton.setText("Leaderboard");
        LeaderboardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LeaderboardButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LeaderboardButtonMouseExited(evt);
            }
        });
        LeaderboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaderboardButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SettingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(LeaderboardButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PlayButton)
                .addGap(18, 18, 18)
                .addComponent(SettingButton)
                .addGap(18, 18, 18)
                .addComponent(LeaderboardButton)
                .addGap(18, 18, 18)
                .addComponent(ExitButton)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void TitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleTextFieldActionPerformed

    private void PlayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseEntered
        PlayButton.setBackground(Color.green);
    }//GEN-LAST:event_PlayButtonMouseEntered

    private void PlayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseExited
        PlayButton.setBackground(Color.white);
    }//GEN-LAST:event_PlayButtonMouseExited

    //Ends the program if the user clicks the exit button
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

//Pulls up the game when the user clicks play
    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
       new SnakeFrame().setVisible(true);
       
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void SettingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingButtonMouseEntered
        SettingButton.setBackground(Color.orange);
    }//GEN-LAST:event_SettingButtonMouseEntered

    private void SettingButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingButtonMouseExited
        SettingButton.setBackground(Color.white);
    }//GEN-LAST:event_SettingButtonMouseExited

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        ExitButton.setBackground(Color.red);
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        ExitButton.setBackground(Color.white);
    }//GEN-LAST:event_ExitButtonMouseExited

    private void LeaderboardButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderboardButtonMouseEntered
        LeaderboardButton.setBackground(Color.gray);
    }//GEN-LAST:event_LeaderboardButtonMouseEntered

    private void LeaderboardButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaderboardButtonMouseExited
        LeaderboardButton.setBackground(Color.white);
    }//GEN-LAST:event_LeaderboardButtonMouseExited

    //if user clicks setting button pulls up the gui
    private void SettingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingButtonActionPerformed
        new SettingMenu().setVisible(true);
    }//GEN-LAST:event_SettingButtonActionPerformed

    private void LeaderboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaderboardButtonActionPerformed
try {
        String url = "http://localhost:32308/CMPSC221FinalProject/GameOver.jsp";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
    } catch (java.io.IOException e) {
        System.out.println(e.getMessage());
    }        
       
       
    }//GEN-LAST:event_LeaderboardButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LeaderboardButton;
    private javax.swing.JButton PlayButton;
    private javax.swing.JButton SettingButton;
    private javax.swing.JTextField TitleTextField;
    // End of variables declaration//GEN-END:variables
}
