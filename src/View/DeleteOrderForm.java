/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Model.Order;
import Model.OrderDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Randy
 */
public class DeleteOrderForm extends javax.swing.JFrame {

    OrderDAO orderDao = new OrderDAO();
    Order OrderVO;
    /**
     * Creates new form DeleteConcessionerForm
     */
    public DeleteOrderForm() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        RefreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlWindowControls = new javax.swing.JPanel();
        MinimiceControl = new javax.swing.JLabel();
        CloseControl = new javax.swing.JLabel();
        jPnlBody = new javax.swing.JPanel();
        BackControl = new javax.swing.JLabel();
        UnderlineTitleView = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JLabel();
        RefreshButton = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new rojerusan.RSTableMetro();
        jPnlBanner = new javax.swing.JPanel();
        BackgroundBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPnlWindowControls.add(MinimiceControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 15, -1, 27));

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
        jPnlWindowControls.add(CloseControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 15, -1, 27));

        getContentPane().add(jPnlWindowControls, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, 755, 45));

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

        UnderlineTitleView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Title View Underline.png"))); // NOI18N
        UnderlineTitleView.setAlignmentY(0.0F);
        jPnlBody.add(UnderlineTitleView, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 63, 540, 3));

        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Delete Button.png"))); // NOI18N
        DeleteButton.setAlignmentY(0.0F);
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        jPnlBody.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 140, 35));

        RefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Refresh Button.png"))); // NOI18N
        RefreshButton.setAlignmentY(0.0F);
        RefreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RefreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshButtonMouseClicked(evt);
            }
        });
        jPnlBody.add(RefreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 140, 35));

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "IdOrder", "NameOrder", "CurrentDate", "DeliveryDate", "IdMoto", "Quantity"
            }
        ));
        tblOrders.setAlignmentX(0.0F);
        tblOrders.setAlignmentY(0.0F);
        tblOrders.setAltoHead(24);
        tblOrders.setColorBackgoundHead(new java.awt.Color(238, 112, 82));
        tblOrders.setColorBordeFilas(new java.awt.Color(112, 112, 112));
        tblOrders.setColorBordeHead(new java.awt.Color(112, 112, 112));
        tblOrders.setColorFilasBackgound1(new java.awt.Color(112, 112, 112));
        tblOrders.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblOrders.setColorFilasForeground1(new java.awt.Color(36, 47, 65));
        tblOrders.setColorFilasForeground2(new java.awt.Color(36, 47, 65));
        tblOrders.setColorSelBackgound(new java.awt.Color(238, 112, 82));
        tblOrders.setFillsViewportHeight(true);
        tblOrders.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        tblOrders.setFuenteFilas(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        tblOrders.setFuenteFilasSelect(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        tblOrders.setFuenteHead(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        tblOrders.setGridColor(new java.awt.Color(153, 153, 153));
        tblOrders.setGrosorBordeFilas(0);
        tblOrders.setMultipleSeleccion(false);
        tblOrders.setPreferredSize(new java.awt.Dimension(595, 350));
        tblOrders.setRowHeight(24);
        tblOrders.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblOrders);

        jPnlBody.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 710, 358));

        getContentPane().add(jPnlBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 45, 755, 530));

        jPnlBanner.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBanner.setName("jPnlBanner"); // NOI18N
        jPnlBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundBanner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BackgroundBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Banner1.png"))); // NOI18N
        BackgroundBanner.setAlignmentY(0.0F);
        BackgroundBanner.setPreferredSize(new java.awt.Dimension(296, 577));
        jPnlBanner.add(BackgroundBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 575));

        getContentPane().add(jPnlBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 296, 575));

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
        new OrderModule().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackControlMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        int row = tblOrders.getSelectedRow();
        int idOrder = Integer.parseInt(tblOrders.getValueAt(row, 0).toString());
        ConfirmDialog dialog = new ConfirmDialog(this, true);
        dialog.dialogText.setText("Are you sure to delete this item?");
        dialog.setVisible(true);
        if(dialog.getReturnStatus()==1)
        {
            orderDao.deleteOrder(idOrder);
            //Actualizar Tabla
            RefreshTable();
        }
        
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void RefreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshButtonMouseClicked
        RefreshTable();
    }//GEN-LAST:event_RefreshButtonMouseClicked

        private void RefreshTable()
    {
        ArrayList<Order> array = new ArrayList<Order>();
          
        array = orderDao.viewOrder();
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("IdOrder");
        model.addColumn("NameOrder");
        model.addColumn("CurrentDate");
        model.addColumn("DeliveryDate");
        model.addColumn("IdMoto");
        model.addColumn("Quantity");
        tblOrders.setModel(model);
        
        Object[] column=new Object[6];
        for(int i=0; i<array.size(); i++){
            column[0]=array.get(i).getIdOrder();
            column[1]=array.get(i).getNameOder();
            column[2]=array.get(i).getCurrentDate();
            column[3]=array.get(i).getDeliveryDate();
            column[4]=array.get(i).getIdMoto();
            column[5]=array.get(i).getQuantity();

            model.addRow(column);
            
            
        }
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackControl;
    private javax.swing.JLabel BackgroundBanner;
    private javax.swing.JLabel CloseControl;
    private javax.swing.JLabel DeleteButton;
    private javax.swing.JLabel MinimiceControl;
    private javax.swing.JLabel RefreshButton;
    private javax.swing.JLabel UnderlineTitleView;
    private javax.swing.JPanel jPnlBanner;
    private javax.swing.JPanel jPnlBody;
    private javax.swing.JPanel jPnlWindowControls;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSTableMetro tblOrders;
    // End of variables declaration//GEN-END:variables
}
