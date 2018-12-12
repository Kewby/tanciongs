/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier;

import Connection.DBIPAddress;
import Controller.CheckoutController;
import Model.myModel;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author allysha
 */
public class Checkout extends javax.swing.JFrame {
    
    DBIPAddress dbip = new DBIPAddress();
    String IP = dbip.getIP();

    private float total;
    private DefaultTableModel table;
    private Object[] row;
    private int empId;
    private int count;
    private JLabel gTotal,lblItems;
    
    JFrame frame = new JFrame();
     public void setRow(Object[] row){
        this.row = row;
    }
    public Object[] getRow(){
        return row;
    }
    
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }

    public Checkout() {
        initComponents();
    }
    
    public Checkout(float total) {
        initComponents();
        setTotal(total);
        totalAmount.setText(String.valueOf(getTotal()));
    }
      
    public Checkout(float total, int empId) {
        initComponents();
        setEmpId(empId);
        setTotal(total);
       
        totalAmount.setText(String.valueOf(getTotal()));
    }
     
     public Checkout(float total, int empId,Object[] row,int count,DefaultTableModel model,JLabel gTotal,JLabel lblItems) {
         
        initComponents();
        setEmpId(empId);
        setTotal(total);
        setRow(row);
        setTable(model);
        totalAmount.setText(String.valueOf(getTotal()));
        setgTotal(gTotal);
        setLblItems(lblItems);
        
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
        jLabel2 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tenderAmt = new javax.swing.JTextField();
        change = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PHP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("TOTAL AMOUNT DUE:");

        totalAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalAmount.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("TENDER AMT:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CHANGE:");

        tenderAmt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        change.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        change.setText("0.00");

        btnConfirm.setBackground(new java.awt.Color(204, 204, 255));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirm.setText("OK");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Capture2.PNG"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("PHP");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("PHP");

        PHP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PHP.setText("PHP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(change))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(totalAmount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PHP)
                        .addGap(18, 18, 18)
                        .addComponent(tenderAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(totalAmount)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHP)
                    .addComponent(tenderAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(change))
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btnConfirm))
                        .addContainerGap())))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       /* CashierPage cp = new CashierPage(this.getName());
        cp.getLblUser().setText("Welcome "+this.getName());*/
  
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        CheckoutController rpc = new CheckoutController();    
        myModel mm = new myModel();
        Desktop browser = Desktop.getDesktop();
        
        int empID = getEmpId();
        int indx,result = 0,transID;
        float totalPurchase, totalChange, totalTender; 
        
        try {
            if(Float.parseFloat(tenderAmt.getText())!= 0){
            totalPurchase = getTotal();
            totalTender = Float.parseFloat(tenderAmt.getText()); //tender amount
                
                if(totalPurchase<=totalTender){ //total purchase <= tender amount
                    change.setText(String.valueOf(totalTender-totalPurchase));
                    totalChange = Float.parseFloat(change.getText()); //total change
                    
                    result = rpc.addToTransaction(totalTender, totalChange, getEmpId(), totalPurchase);
                    
                    indx = mm.getLastRowId();
                    System.out.println(indx);
                    
                    rpc.addItems(indx, table);
                    table.setRowCount(0);
                        
                        if(result>0){
                            getgTotal().setText("0.00"); 
                            getLblItems().setText("0"); 
                            this.dispose();
                        }
                    
                        browser.browse(new URI("http://"+IP+"/TanciongStore_v2/PDF_resibo.php?transID="+indx));
                }   else {
                        JOptionPane.showMessageDialog(frame, "Insufficient Funds.");
                    }        
            }   else { 
                    JOptionPane.showMessageDialog(frame, "You should Input payment");
                }
            
            if(result>0){
                            getgTotal().setText("0.00"); 
                            getLblItems().setText("0"); 
                            this.dispose();
                        }
        }   catch (IOException err){
                
            }   catch(URISyntaxException err){
                
                }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(frame, "You should input a number ");
                }   
    }//GEN-LAST:event_btnConfirmActionPerformed
    
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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }
    
    //Getters Setters
    
    public JLabel getgTotal() {
        return gTotal;
    }

    public void setgTotal(JLabel gTotal) {
        this.gTotal = gTotal;
    }

    public JLabel getLblItems() {
        return lblItems;
    }

    public void setLblItems(JLabel lblItems) {
        this.lblItems = lblItems;
    }
    public void setTotal(float total){
        this.total = total;
    }
    public float getTotal(){
        return total;
    }
    
    public DefaultTableModel getTable(){
     return table;   
    }
    public void setTable(DefaultTableModel table){
        this.table = table;
    }
     public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PHP;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel change;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tenderAmt;
    private javax.swing.JLabel totalAmount;
    // End of variables declaration//GEN-END:variables
}
