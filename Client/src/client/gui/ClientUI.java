/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.gui;

import client.business.Client;
import client.exceptions.EmptyFieldException;
import client.exceptions.NoConnectionEstablished;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author strudel
 */
public class ClientUI extends javax.swing.JFrame {

    /**
     * Creates new form ClientUI
     */
    public ClientUI() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPort = new javax.swing.JTextField();
        jConnect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMessages = new javax.swing.JTextPane();
        jSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jSender = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("IP:");

        jLabel2.setText("Port:");

        jConnect.setText("Connect");
        jConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConnectActionPerformed(evt);
            }
        });

        jMessages.setEditable(false);
        jScrollPane1.setViewportView(jMessages);

        jSend.setText("Send");
        jSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSendActionPerformed(evt);
            }
        });

        jSender.setColumns(20);
        jSender.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jSender.setLineWrap(true);
        jSender.setRows(5);
        jSender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSenderKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jSender);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPort, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSend, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jConnect)
                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConnectActionPerformed
        
        try {
            if ( jAddress.getText().equalsIgnoreCase("") || jPort.getText().equalsIgnoreCase("") ) {
                throw new EmptyFieldException();
            }
            
            this.client = new Client( jAddress.getText() , Integer.parseInt(this.jPort.getText()));
            
            this.MessageGetter = new Thread(client);
            
            this.MessageGetter.start();
            
            this.updateMessage = new Thread( new Runnable() {

                @Override
                public void run() {
                    
                    while ( true ) {
                        synchronized(client) {
                            try {
                                client.wait();
                            }
                            catch ( InterruptedException e ) {
                                
                            }
                            jMessages.setText(client.getMessages());
                        }
                    }
                    
                }
                
            });
            
            jMessages.setText("Connection established!\n");
        }
        catch ( IOException e ) {
            
        }
        catch ( EmptyFieldException e ) {
            JOptionPane.showMessageDialog(this, "Fill all the blanks!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        this.updateMessage.start();
        
    }//GEN-LAST:event_jConnectActionPerformed

    private void jSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSendActionPerformed
        try {
            
            if ( this.client == null ) {
                throw new NoConnectionEstablished();
            }
            
            this.client.sendMessage("Farmer: " + jSender.getText() + "\n");
            jSender.setText(null);
        } 
        catch (IOException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (NoConnectionEstablished e) {
            JOptionPane.showMessageDialog( this , "No connection established!");
            jSender.setText("");
        }
    }//GEN-LAST:event_jSendActionPerformed

    private void jSenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSenderKeyReleased
        
        try {
            if ( evt.getKeyCode() == KeyEvent.VK_ENTER ) {
                
                if ( this.client == null ) {
                    throw new NoConnectionEstablished();
                }
                this.client.sendMessage("Farmer: " + jSender.getText());
                this.jSender.setText(null);
            }
        }
        catch ( IOException e ) {
            
        }
        catch ( NoConnectionEstablished e ) {
            JOptionPane.showMessageDialog( this , "No connection established!");
            jSender.setText("");
        }
        
    }//GEN-LAST:event_jSenderKeyReleased

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAddress;
    private javax.swing.JButton jConnect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextPane jMessages;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jSend;
    private javax.swing.JTextArea jSender;
    // End of variables declaration//GEN-END:variables

    Client client;
    Thread updateMessage;
    Thread MessageGetter;

}
