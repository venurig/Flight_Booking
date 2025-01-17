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
import model.Flight;


public class VFlight_Details extends javax.swing.JFrame {

    public VFlight_Details() {
        initComponents();
        loadFlightNumbers();
        
        cmbSearchFlightNumber.setSelectedIndex(-1);
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
        btnHome = new javax.swing.JButton();
        btnFlightDetails = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnReports1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        cmbTo = new javax.swing.JComboBox<>();
        cmbFrom = new javax.swing.JComboBox<>();
        datecArrivalDate = new com.toedter.calendar.JDateChooser();
        datecDepartureDate = new com.toedter.calendar.JDateChooser();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        sDepartureTime = new javax.swing.JSpinner(sm);
        SpinnerDateModel sm1 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        sArrivalTime = new javax.swing.JSpinner(sm1);
        cmbSearchFlightNumber = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Details");

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

        btnReports1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReports1.setText("Flight Tickets");
        btnReports1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReports1ActionPerformed(evt);
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
                    .addComponent(btnReports1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btnReports1)
                .addGap(27, 27, 27)
                .addComponent(btnReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(62, 62, 62))
        );

        jPanel2.setBackground(new java.awt.Color(95, 184, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Flight Number");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("From");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("To");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Departure Date / Time");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Arrival Date / Time");

        txtFlightNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmbTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Melbourne Airport (MEL) - Australia", "Sydney Kingsford Smith Airport (SYD) - Australia", "Hazrat Shahjalal International Airport (DAC) - Bangladesh", "Beijing Capital International Airport (PEK) - China", "Guangzhou Baiyun International Airport (CAN) - China", "Charles de Gaulle Airport (CDG) - France", "Frankfurt am Main Airport (FRA) - Germany", "Chhatrapati Shivaji Maharaj International Airport (BOM) - India", "Chennai International Airport (MAA) - India", "Indira Gandhi International Airport (DEL) - India", "Kempegowda International Airport (BLR) - India", "Netaji Subhas Chandra Bose International Airport (CCU) - India", "Leonardo da Vinci International Airport (FCO) - Italy", "Malpensa Airport (MXP) - Italy", "Kansai International Airport (KIX) - Japan", "Narita International Airport (NRT) - Japan", "Kuwait International Airport (KWI) - Kuwait", "Kuala Lumpur International Airport (KUL) - Malaysia", "Velana International Airport (MLE) - Maldives", "Tribhuvan International Airport (KTM) - Nepal", "Allama Iqbal International Airport (LHE) - Pakistan", "Jinnah International Airport (KHI) - Pakistan", "Hamad International Airport (DOH) - Qatar", "Sheremetyevo International Airport (SVO) - Russia", "King Abdulaziz International Airport (JED) - Saudi Arabia", "King Khalid International Airport (RUH) - Saudi Arabia", "Changi International Airport (SIN) - Singapore", "O.R. Tambo International Airport (JNB) - South Africa", "Bandaranaike International Airport (CMB) - Sri Lanka", "China Bay Airport (TRR) - Sri Lanka", "Jaffna International Airport (JAF) - Sri Lanka", "Mattala Rajapaksa International Airport (HRI) - Sri Lanka", "Victoria Reservoir Airfield (KDZ) -Sri Lanka", "Suvarnabhumi Airport (BKK) - Thailand", "Heathrow Airport (LHR) - United Kingdom", "Abu Dhabi International Airport (AUH) - UAE", "Dubai International Airport (DXB) - UAE" }));

        cmbFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Melbourne Airport (MEL) - Australia", "Sydney Kingsford Smith Airport (SYD) - Australia", "Hazrat Shahjalal International Airport (DAC) - Bangladesh", "Beijing Capital International Airport (PEK) - China", "Guangzhou Baiyun International Airport (CAN) - China", "Charles de Gaulle Airport (CDG) - France", "Frankfurt am Main Airport (FRA) - Germany", "Chhatrapati Shivaji Maharaj International Airport (BOM) - India", "Chennai International Airport (MAA) - India", "Indira Gandhi International Airport (DEL) - India", "Kempegowda International Airport (BLR) - India", "Netaji Subhas Chandra Bose International Airport (CCU) - India", "Leonardo da Vinci International Airport (FCO) - Italy", "Malpensa Airport (MXP) - Italy", "Kansai International Airport (KIX) - Japan", "Narita International Airport (NRT) - Japan", "Kuwait International Airport (KWI) - Kuwait", "Kuala Lumpur International Airport (KUL) - Malaysia", "Velana International Airport (MLE) - Maldives", "Tribhuvan International Airport (KTM) - Nepal", "Allama Iqbal International Airport (LHE) - Pakistan", "Jinnah International Airport (KHI) - Pakistan", "Hamad International Airport (DOH) - Qatar", "Sheremetyevo International Airport (SVO) - Russia", "King Abdulaziz International Airport (JED) - Saudi Arabia", "King Khalid International Airport (RUH) - Saudi Arabia", "Changi International Airport (SIN) - Singapore", "O.R. Tambo International Airport (JNB) - South Africa", "Bandaranaike International Airport (CMB) - Sri Lanka", "China Bay Airport (TRR) - Sri Lanka", "Jaffna International Airport (JAF) - Sri Lanka", "Mattala Rajapaksa International Airport (HRI) - Sri Lanka", "Victoria Reservoir Airfield (KDZ) -Sri Lanka", "Suvarnabhumi Airport (BKK) - Thailand", "Heathrow Airport (LHR) - United Kingdom", "Abu Dhabi International Airport (AUH) - UAE", "Dubai International Airport (DXB) - UAE" }));
        cmbFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFromActionPerformed(evt);
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
        jLabel7.setText("FLIGHT DETAILS");

        JSpinner.DateEditor de = new JSpinner.DateEditor(sDepartureTime, "HH:mm:ss");
        sDepartureTime.setEditor(de);

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(sArrivalTime, "HH:mm:ss");
        sArrivalTime.setEditor(de1);

        cmbSearchFlightNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnSearch)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbSearchFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFlightNumber)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(datecArrivalDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(datecDepartureDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sArrivalTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sDepartureTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)))))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(cmbSearchFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datecDepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datecArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd))
                .addContainerGap(79, Short.MAX_VALUE))
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
            for (String flightNumber : flightNumbers) 
            {
                cmbSearchFlightNumber.addItem(flightNumber);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error loading flight numbers: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cmbFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFromActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    try 
        {
            String flightNumber;
            String fromDestination;
            String toDestination;
            String departureDate;
            String departureTime;
            String arrivalDate;
            String arrivalTime;

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
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
            departureDate = sdf.format(datecDepartureDate.getDate());
            arrivalDate = sdf.format(datecArrivalDate.getDate());
            
            if (datecDepartureDate.getDate() == null) 
            {
                JOptionPane.showMessageDialog(this, "Departure date is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (datecArrivalDate.getDate() == null) 
            {
                JOptionPane.showMessageDialog(this, "Arrival date is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (datecDepartureDate.getDate().after(datecArrivalDate.getDate())) 
            {
                JOptionPane.showMessageDialog(this, "Departure date cannot be after arrival date.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            departureTime = timeFormat.format(((Date) sDepartureTime.getValue()));
            arrivalTime = timeFormat.format(((Date) sArrivalTime.getValue()));
            
            if (sDepartureTime.getValue() == null) 
            {
                JOptionPane.showMessageDialog(this, "Departure time is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (sArrivalTime.getValue() == null) 
            {
                JOptionPane.showMessageDialog(this, "Arrival time is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            CFlight_Details fli_add = new CFlight_Details();
            fli_add.addFlightDetails(flightNumber, fromDestination, toDestination, departureDate,departureTime, arrivalDate, arrivalTime);
            JOptionPane.showMessageDialog(this, "Flight details added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
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
            String flightNumber;
            String fromDestination;
            String toDestination;
            String departureDate;
            String departureTime;
            String arrivalDate;
            String arrivalTime;

            flightNumber = txtFlightNumber.getText();
            if (flightNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Flight number is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (cmbFrom.getSelectedIndex() == -1 || cmbTo.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Please select both 'From' and 'To' destinations.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            fromDestination = cmbFrom.getSelectedItem().toString();
            toDestination = cmbTo.getSelectedItem().toString();

            if (fromDestination.equals(toDestination)) {
                JOptionPane.showMessageDialog(this, "From and To destinations cannot be the same.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (datecDepartureDate.getDate() == null || datecArrivalDate.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Both departure and arrival dates are required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            departureDate = sdf.format(datecDepartureDate.getDate());
            arrivalDate = sdf.format(datecArrivalDate.getDate());

            if (datecDepartureDate.getDate().after(datecArrivalDate.getDate())) {
                JOptionPane.showMessageDialog(this, "Departure date cannot be after arrival date.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            departureTime = timeFormat.format(((Date) sDepartureTime.getValue()));
            arrivalTime = timeFormat.format(((Date) sArrivalTime.getValue()));

            CFlight_Details fli_update = new CFlight_Details();
            fli_update.updateFlightDetails(flightNumber, fromDestination, toDestination, departureDate, departureTime, arrivalDate, arrivalTime);
            JOptionPane.showMessageDialog(this, "Flight details updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Update Error", JOptionPane.ERROR_MESSAGE);
        }

        clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try 
        {
            String flightNumber = cmbSearchFlightNumber.getSelectedItem().toString().trim();

            if (flightNumber.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Please enter a flight number to search.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            CFlight_Details fli_search = new CFlight_Details();
            Flight flight = fli_search.getFlightDetails(flightNumber);

            if (flight != null) 
            {
                txtFlightNumber.setText(flight.getFlightNumber());
                cmbFrom.setSelectedItem(flight.getFromDestination());
                cmbTo.setSelectedItem(flight.getToDestination());
                datecDepartureDate.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(flight.getDepartureDate()));
                datecArrivalDate.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(flight.getArrivalDate()));
                sDepartureTime.setValue(new SimpleDateFormat("HH:mm:ss").parse(flight.getDepartureTime()));
                sArrivalTime.setValue(new SimpleDateFormat("HH:mm:ss").parse(flight.getArrivalTime()));
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Flight not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
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
            flightNumber = txtFlightNumber.getText();  

            if (flightNumber.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Flight number is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            CFlight_Details fli_delete = new CFlight_Details();
            fli_delete.deleteFlightDetails(flightNumber);  
            JOptionPane.showMessageDialog(this, "Flight details deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
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

    private void btnReports1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReports1ActionPerformed
       VFlight_Tickets fTickets = new VFlight_Tickets();
       fTickets.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnReports1ActionPerformed
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VFlight_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFlightDetails;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnReports1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbFrom;
    private javax.swing.JComboBox<String> cmbSearchFlightNumber;
    private javax.swing.JComboBox<String> cmbTo;
    private com.toedter.calendar.JDateChooser datecArrivalDate;
    private com.toedter.calendar.JDateChooser datecDepartureDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner sArrivalTime;
    private javax.swing.JSpinner sDepartureTime;
    private javax.swing.JTextField txtFlightNumber;
    // End of variables declaration//GEN-END:variables

    private void clearForm() 
    {
        txtFlightNumber.setText("");
        cmbFrom.setSelectedIndex(-1);
        cmbTo.setSelectedIndex(-1);
        datecDepartureDate.setDate(null);
        datecArrivalDate.setDate(null); 
    }
}
