/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Galito
 */
public class OrderModule extends javax.swing.JFrame {

    /**
     * Creates new form OrderModule
     */
    public OrderModule() {
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

        BackgroundBanner = new javax.swing.JLabel();
        jPnlWindowControls = new javax.swing.JPanel();
        MinimiceControl = new javax.swing.JLabel();
        CloseControl = new javax.swing.JLabel();
        jPnlBody = new javax.swing.JPanel();
        BackControl = new javax.swing.JLabel();
        OrderAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundBanner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BackgroundBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Banner1.png"))); // NOI18N
        BackgroundBanner.setAlignmentY(0.0F);
        BackgroundBanner.setPreferredSize(new java.awt.Dimension(296, 577));

        jPnlWindowControls.setBackground(new java.awt.Color(255, 255, 255));
        jPnlWindowControls.setName(""); // NOI18N
        jPnlWindowControls.setPreferredSize(new java.awt.Dimension(755, 45));
        jPnlWindowControls.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MinimiceControl.setFont(new java.awt.Font("Font Awesome 5 Free Regular", 1, 20)); // NOI18N
        MinimiceControl.setForeground(new java.awt.Color(153, 153, 153));
        MinimiceControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Minimize Control.png"))); // NOI18N
        MinimiceControl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinimiceControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimiceControlMouseClicked(evt);
            }
        });
        jPnlWindowControls.add(MinimiceControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, 27));

        CloseControl.setFont(new java.awt.Font("Font Awesome 5 Free Regular", 0, 20)); // NOI18N
        CloseControl.setForeground(new java.awt.Color(153, 153, 153));
        CloseControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close Control.png"))); // NOI18N
        CloseControl.setAlignmentY(0.0F);
        CloseControl.setAutoscrolls(true);
        CloseControl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseControlMouseClicked(evt);
            }
        });
        jPnlWindowControls.add(CloseControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, 27));

        jPnlBody.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Back Control.png"))); // NOI18N
        BackControl.setAlignmentY(0.0F);
        BackControl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackControlMouseClicked(evt);
            }
        });
        jPnlBody.add(BackControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 32));

        OrderAdd.setText("Agregar orden");
        OrderAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderAddActionPerformed(evt);
            }
        });
        jPnlBody.add(OrderAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jButton2.setText("Editar Orden");
        jPnlBody.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        jButton3.setText("Consultar Orden");
        jPnlBody.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jButton4.setText("Eliminar orden");
        jPnlBody.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(181, Short.MAX_VALUE)
                    .addComponent(jPnlWindowControls, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackgroundBanner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnlBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPnlWindowControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(519, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimiceControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimiceControlMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_MinimiceControlMouseClicked

    private void CloseControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseControlMouseClicked
        ConfirmDialog dialog = new ConfirmDialog(this, true);
        dialog.dialogText.setText("Do you want to logout?");
        dialog.setVisible(true);
        if(dialog.getReturnStatus()==1)
        {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CloseControlMouseClicked

    private void BackControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackControlMouseClicked
        new MainAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackControlMouseClicked

    private void OrderAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderAddActionPerformed
        // TODO add your handling code here:
        new AddOrderForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OrderAddActionPerformed

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
            java.util.logging.Logger.getLogger(OrderModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackControl;
    private javax.swing.JLabel BackgroundBanner;
    private javax.swing.JLabel CloseControl;
    private javax.swing.JLabel MinimiceControl;
    private javax.swing.JButton OrderAdd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPnlBody;
    private javax.swing.JPanel jPnlWindowControls;
    // End of variables declaration//GEN-END:variables
}