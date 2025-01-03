/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import controller.*;
import java.awt.Image;
import java.util.Calendar;
import javax.swing.ImageIcon;
import java.util.Date;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import model.Flight;
import model.Ticket;


public class VFlight_Tickets extends javax.swing.JFrame {

    public VFlight_Tickets() {
        initComponents();
        loadFlightNumbers();
        
        cmbSearchFlightNumber.setSelectedIndex(-1);
        cmbSearchFlightClass.setSelectedIndex(-1);
        cmbFlightNumber.setSelectedIndex(-1); 
        cmbClass.setSelectedIndex(-1);
        
        Image icon = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
        this.setIconImage(icon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnFlightDetails = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnFlightTickets = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbClass = new javax.swing.JComboBox<>();
        cmbFlightNumber = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        spTicketPrice = new javax.swing.JSpinner();
        cmbSearchFlightNumber = new javax.swing.JComboBox<>();
        cmbSearchFlightClass = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Tickets");

        jPanel1.setBackground(new java.awt.Color(0, 0, 122));
        jPanel1.setPreferredSize(new java.awt.Dimension(238, 680));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo4.png"))); // NOI18N

        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnFlightDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFlightDetails.setText("Flight Details");
        btnFlightDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightDetailsActionPerformed(evt);
            }
        });

        btnReports.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReports.setText("Reports");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnFlightTickets.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFlightTickets.setText("Flight Tickets");
        btnFlightTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightTicketsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFlightDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFlightTickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnHome)
                .addGap(26, 26, 26)
                .addComponent(btnFlightDetails)
                .addGap(28, 28, 28)
                .addComponent(btnFlightTickets)
                .addGap(27, 27, 27)
                .addComponent(btnReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(62, 62, 62))
        );

        jPanel2.setBackground(new java.awt.Color(95, 184, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Flight Number");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Class");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Ticket Price");

        cmbClass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy Class", "Business Class" }));

        cmbFlightNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbFlightNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFlightNumberActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 5));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 83, 23));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 139, 44));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 0, 153));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("FLIGHT TICKETS");

        spTicketPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmbSearchFlightNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmbSearchFlightClass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSearchFlightClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy Class", "Business Class" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addGap(18, 18, 18)
                                .addComponent(cmbSearchFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbSearchFlightClass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbFlightNumber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spTicketPrice)
                                .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(cmbSearchFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSearchFlightClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd))
                .addContainerGap(188, Short.MAX_VALUE))
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
private void loadFlightNumbers() 
    {
        try 
        {
            CFlight_Details flightController = new CFlight_Details();
            List<String> flightNumbers = flightController.getAllFlightNumbers();

            cmbSearchFlightNumber.removeAllItems();
            cmbFlightNumber.removeAllItems();
            for (String flightNumber : flightNumbers) 
            {
                cmbSearchFlightNumber.addItem(flightNumber);
                cmbFlightNumber.addItem(flightNumber);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error loading flight numbers: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private JSpinner createPriceSpinner() 
    {
        double initialPrice = 0.0; 
        double minPrice = 0.0;     
        double maxPrice = 100000000.0; 
        double stepSize = 0.1;     

        SpinnerNumberModel priceModel = new SpinnerNumberModel(initialPrice, minPrice, maxPrice, stepSize);
        JSpinner spTicketPrice = new JSpinner(priceModel);

        JSpinner.NumberEditor priceEditor = new JSpinner.NumberEditor(spTicketPrice, "#,##0.00");
        spTicketPrice.setEditor(priceEditor);

        return spTicketPrice;
    }
    
    private void cmbFlightNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFlightNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFlightNumberActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       try 
        {
            String flightNumber = cmbFlightNumber.getSelectedItem() != null ? cmbFlightNumber.getSelectedItem().toString() : "";
            String flightClass = cmbClass.getSelectedItem() != null ? cmbClass.getSelectedItem().toString() : "";

            Object value = spTicketPrice.getValue();
            double ticketPrice;

            if (value instanceof Integer) 
            {
                ticketPrice = ((Integer) value).doubleValue();
            } 
            else if (value instanceof Double) 
            {
                ticketPrice = (Double) value;
            } 
            else 
            {
                throw new IllegalArgumentException("Invalid ticket price value.");
            }

            if (flightNumber.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Flight number is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (flightClass.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Flight class is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (ticketPrice <= 0) 
            {
                JOptionPane.showMessageDialog(this, "Ticket price must be greater than 0.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            CFlight_Tickets ticket_add = new CFlight_Tickets();
            ticket_add.addFlightTicket(flightNumber, flightClass, ticketPrice);
            JOptionPane.showMessageDialog(this, "Flight ticket price added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Add Error", JOptionPane.ERROR_MESSAGE);
        }

        clearForm();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try 
        {
            String flightNumber = cmbFlightNumber.getSelectedItem() != null ? cmbFlightNumber.getSelectedItem().toString() : "";
            String flightClass = cmbClass.getSelectedItem() != null ? cmbClass.getSelectedItem().toString() : "";

            if (flightNumber.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Please select a valid flight number.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (flightClass.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Please select a valid flight class.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double ticketPrice = 0.0;
            Object ticketPriceValue = spTicketPrice.getValue();
            if (ticketPriceValue instanceof Number) 
            {
                ticketPrice = ((Number) ticketPriceValue).doubleValue();
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Please enter a valid ticket price.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (ticketPrice <= 0) 
            {
                JOptionPane.showMessageDialog(this, "Ticket price must be greater than 0.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            CFlight_Tickets ticket_update = new CFlight_Tickets();
            ticket_update.updateFlightTicket(flightNumber, flightClass, ticketPrice);

            JOptionPane.showMessageDialog(this, "Flight ticket price updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Update Error", JOptionPane.ERROR_MESSAGE);
        }

        clearForm(); 
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try
        {
            String flightNumber = cmbSearchFlightNumber.getSelectedItem().toString().trim();
            String flightClass = cmbSearchFlightClass.getSelectedItem().toString().trim();
                        
            if (flightNumber.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Please enter a flight number to search.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (flightClass.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Please enter a flight class to search.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            CFlight_Tickets ticket_search = new CFlight_Tickets();
            Ticket ticket = ticket_search.getFlightTicket(flightNumber,flightClass);

            if (ticket != null) 
            {
                cmbFlightNumber.setSelectedItem(ticket.getFlightNumber());
                cmbClass.setSelectedItem(ticket.getflightClass());
                spTicketPrice.setValue(ticket.getticketPrice());
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Ticket not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Search Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try 
        {
            String flightNumber;
            flightNumber = cmbFlightNumber.getSelectedItem().toString();  

            if (flightNumber.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Flight number is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            CFlight_Tickets ticket_delete = new CFlight_Tickets();
            ticket_delete.deleteFlightTicket(flightNumber);  
            JOptionPane.showMessageDialog(this, "Flight ticket price deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Delete Error", JOptionPane.ERROR_MESSAGE);
        }

        clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFlightDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightDetailsActionPerformed
       VFlight_Details fDetails = new VFlight_Details();
       fDetails.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnFlightDetailsActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
       VReport report = new VReport();
       report.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       VStaff_Login slogin = new VStaff_Login();
       slogin.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       VStaff_Dashboard sdashboard = new VStaff_Dashboard();
       sdashboard.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnFlightTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightTicketsActionPerformed
       VFlight_Tickets fTickets = new VFlight_Tickets();
       fTickets.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnFlightTicketsActionPerformed
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VFlight_Tickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFlightDetails;
    private javax.swing.JButton btnFlightTickets;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbClass;
    private javax.swing.JComboBox<String> cmbFlightNumber;
    private javax.swing.JComboBox<String> cmbSearchFlightClass;
    private javax.swing.JComboBox<String> cmbSearchFlightNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner spTicketPrice;
    // End of variables declaration//GEN-END:variables

    private void clearForm() 
    {
        cmbFlightNumber.setSelectedIndex(-1);
        cmbClass.setSelectedIndex(-1);
        spTicketPrice.setValue(0); 
    }
}
