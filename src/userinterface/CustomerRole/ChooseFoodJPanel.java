/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Food;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yaopeixinmac
 */
public class ChooseFoodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChooseFoodJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Customer customer;
    Restaurant restaurant;
    public ChooseFoodJPanel(JPanel userProcessContainer,  Customer customer,EcoSystem system,Restaurant restaurant) {
        initComponents();
            this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.customer=customer;
        this.restaurant=restaurant;
                  refreshTable();
    }
  public void refreshTable(){
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        if(restaurant.getMenu()!=null){
        for(Food food:restaurant.getMenu().getMenu()){
            Object row[] = new Object[2];
            row[0] = food;
            row[1] = food.getPrice();
            model.addRow(row);  
        }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "food name", "food price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("CHOOSE MENU");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("choose this food to palce order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(12, 12, 12)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          int row = jTable1.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Food f = (Food) jTable1.getValueAt(row, 0);
        WorkRequest workRequest=system.getWorkQueue().addWorkRequest();
        workRequest.setFood(f);
        workRequest.setCustomer(customer);
        workRequest.setRestaurant(restaurant);
        workRequest.setStatus("customer order");
        if(customer.getWorkQueue()==null){
            customer.setWorkQueue(new WorkQueue());
        }
       customer.getWorkQueue().addWorkRequest(workRequest);
       if(restaurant.getWorkQueue()==null){
           restaurant.setWorkQueue(new WorkQueue());
       }
       restaurant.getWorkQueue().addWorkRequest(workRequest);
       JOptionPane.showMessageDialog(null, "Customer order successfully!!", "Warning", JOptionPane.WARNING_MESSAGE);
       CustomerAreaJPanel cr=new CustomerAreaJPanel(userProcessContainer,customer,system);
       userProcessContainer.add("ManageSupplierAdministrative", cr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);     
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}