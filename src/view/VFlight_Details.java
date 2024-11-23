/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Image;
import javax.swing.ImageIcon;
import controller.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class VFlight_Details extends javax.swing.JFrame {

    
    public VFlight_Details() {
        initComponents();
        
        cmbFrom.setSelectedIndex(-1); 
        cmbTo.setSelectedIndex(-1); 
        
        Image icon = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
        this.setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbTo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbFrom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        datecDepartureDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        datecArrivalDate = new com.toedter.calendar.JDateChooser();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearchFlightNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 5, 154));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo4.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Home");

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("Flight Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(105, 173, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Flight Number");

        txtFlightNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFlightNumber.setName("txtFlightName"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("From");

        cmbTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abu Dhabi International Airport (AUH)", "Bandaranaike International Airport (CMB)", "Charles de Gaulle Airport (CDG)", "Chennai International Airport (MAA)", "Chhatrapati Shivaji Maharaj International Airport (BOM)", "Cochin International Airport (COK)", "Dubai International Airport (DXB)", "Frankfurt Airport (FRA)", "Hamad International Airport (DOH)", "Incheon International Airport (ICN)", "Indira Gandhi International Airport (DEL)", "Kempegowda International Airport (BLR)", "King Khalid International Airport (RUH)", "Kuala Lumpur International Airport (KUL)", "Kuwait International Airport (KWI)", "London Heathrow Airport (LHR)", "Melbourne Airport (MEL)", "Montreal-Trudeau International Airport (YUL)", "Narita International Airport (NRT)", "Singapore Changi Airport (SIN)", "Soekarno–Hatta International Airport (CGK)", "Suvarnabhumi Airport (BKK)", "Sydney Kingsford Smith Airport (SYD)", "Toronto Pearson International Airport (YYZ)", "Trivandrum International Airport (TRV)", "Velana International Airport (MLE)" }));
        cmbTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbToActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("To");

        cmbFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abu Dhabi International Airport (AUH)", "Bandaranaike International Airport (CMB)", "Charles de Gaulle Airport (CDG)", "Chennai International Airport (MAA)", "Chhatrapati Shivaji Maharaj International Airport (BOM)", "Cochin International Airport (COK)", "Dubai International Airport (DXB)", "Frankfurt Airport (FRA)", "Hamad International Airport (DOH)", "Incheon International Airport (ICN)", "Indira Gandhi International Airport (DEL)", "Kempegowda International Airport (BLR)", "King Khalid International Airport (RUH)", "Kuala Lumpur International Airport (KUL)", "Kuwait International Airport (KWI)", "London Heathrow Airport (LHR)", "Melbourne Airport (MEL)", "Montreal-Trudeau International Airport (YUL)", "Narita International Airport (NRT)", "Singapore Changi Airport (SIN)", "Soekarno–Hatta International Airport (CGK)", "Suvarnabhumi Airport (BKK)", "Sydney Kingsford Smith Airport (SYD)", "Toronto Pearson International Airport (YYZ)", "Trivandrum International Airport (TRV)", "Velana International Airport (MLE)" }));
        cmbFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFromActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Departure Date");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Arrival Date");

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Delete");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datecArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(txtFlightNumber)
                        .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(datecDepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearchFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datecDepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datecArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try 
        {
            String flightNumber;
            String fromDestination;
            String toDestination;
            String departureDate;
            String arrivalDate;

            flightNumber = txtFlightNumber.getText();
            if (flightNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Flight number is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            fromDestination=cmbFrom.getSelectedItem().toString();
            toDestination=cmbTo.getSelectedItem().toString();
            if (fromDestination.equals("--Select--") || toDestination.equals("--Select--")) 
            {
                JOptionPane.showMessageDialog(this, "Please select valid destinations.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (fromDestination.equals(toDestination)) 
            {
                JOptionPane.showMessageDialog(this, "From and To destinations cannot be the same.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            departureDate = sdf.format(datecDepartureDate.getDate());
            arrivalDate = sdf.format(datecArrivalDate.getDate());
            if (datecDepartureDate.getDate() == null || datecArrivalDate.getDate() == null) 
            {
                JOptionPane.showMessageDialog(this, "Both departure and arrival dates are required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (datecDepartureDate.getDate().after(datecArrivalDate.getDate())) 
            {
                JOptionPane.showMessageDialog(this, "Departure date cannot be after arrival date.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            CFlight_Details fli_add = new CFlight_Details();
            fli_add.addFlightDetails(flightNumber, fromDestination, toDestination, departureDate, arrivalDate);
            JOptionPane.showMessageDialog(this, "Flight details added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        clearForm();
    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFromActionPerformed
        
    }//GEN-LAST:event_cmbFromActionPerformed

    private void cmbToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbToActionPerformed
        
    }//GEN-LAST:event_cmbToActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String flightNumber;
        String fromDestination;
        String toDestination;
        String departureDate;
        String arrivalDate;
        flightNumber=txtFlightNumber.getText();
        fromDestination=cmbFrom.getSelectedItem().toString();
        toDestination=cmbTo.getSelectedItem().toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        departureDate = sdf.format(datecDepartureDate.getDate());
        arrivalDate = sdf.format(datecArrivalDate.getDate());
        if (flightNumber.isEmpty() || fromDestination.isEmpty() || toDestination.isEmpty() || departureDate.isEmpty() || arrivalDate.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

    }//GEN-LAST:event_btnSearchActionPerformed

    private void clearForm() 
    {
        txtFlightNumber.setText("");
        cmbFrom.setSelectedIndex(-1); 
        cmbTo.setSelectedIndex(-1);
        datecDepartureDate.setDate(null); 
        datecArrivalDate.setDate(null);
        txtFlightNumber.requestFocus(); 
    }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VFlight_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbFrom;
    private javax.swing.JComboBox<String> cmbTo;
    private com.toedter.calendar.JDateChooser datecArrivalDate;
    private com.toedter.calendar.JDateChooser datecDepartureDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtSearchFlightNumber;
    // End of variables declaration//GEN-END:variables

    private void getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
