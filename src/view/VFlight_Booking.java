/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.*;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class VFlight_Booking extends javax.swing.JFrame {

    
    public VFlight_Booking() {
        initComponents();
        loadFlightNumbers();
        
        cmbFrom.setSelectedIndex(-1); 
        cmbTo.setSelectedIndex(-1);
        cmbClass.setSelectedIndex(-1);
        cmbFlightNumber.setSelectedIndex(-1);
        
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
        btnFlightBooking = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbFlightNumber = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbFrom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbTo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbClass = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        spPassengers = new javax.swing.JSpinner();
        btnBooking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Booking");

        jPanel1.setBackground(new java.awt.Color(0, 0, 122));

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

        btnFlightBooking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFlightBooking.setText("Flight Booking");
        btnFlightBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightBookingActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFlightDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFlightBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnHome)
                .addGap(27, 27, 27)
                .addComponent(btnFlightDetails)
                .addGap(29, 29, 29)
                .addComponent(btnFlightBooking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(64, 64, 64))
        );

        jPanel2.setBackground(new java.awt.Color(95, 184, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Flight Booking");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Flight Number");

        cmbFlightNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("From");

        cmbFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Melbourne Airport (MEL) - Australia", "Sydney Kingsford Smith Airport (SYD) - Australia", "Hazrat Shahjalal International Airport (DAC) - Bangladesh", "Beijing Capital International Airport (PEK) - China", "Guangzhou Baiyun International Airport (CAN) - China", "Charles de Gaulle Airport (CDG) - France", "Frankfurt am Main Airport (FRA) - Germany", "Chhatrapati Shivaji Maharaj International Airport (BOM) - India", "Chennai International Airport (MAA) - India", "Indira Gandhi International Airport (DEL) - India", "Kempegowda International Airport (BLR) - India", "Netaji Subhas Chandra Bose International Airport (CCU) - India", "Leonardo da Vinci International Airport (FCO) - Italy", "Malpensa Airport (MXP) - Italy", "Kansai International Airport (KIX) - Japan", "Narita International Airport (NRT) - Japan", "Kuwait International Airport (KWI) - Kuwait", "Kuala Lumpur International Airport (KUL) - Malaysia", "Velana International Airport (MLE) - Maldives", "Tribhuvan International Airport (KTM) - Nepal", "Allama Iqbal International Airport (LHE) - Pakistan", "Jinnah International Airport (KHI) - Pakistan", "Hamad International Airport (DOH) - Qatar", "Sheremetyevo International Airport (SVO) - Russia", "King Abdulaziz International Airport (JED) - Saudi Arabia", "King Khalid International Airport (RUH) - Saudi Arabia", "Changi International Airport (SIN) - Singapore", "O.R. Tambo International Airport (JNB) - South Africa", "Bandaranaike International Airport (CMB) - Sri Lanka", "China Bay Airport (TRR) - Sri Lanka", "Jaffna International Airport (JAF) - Sri Lanka", "Mattala Rajapaksa International Airport (HRI) - Sri Lanka", "Victoria Reservoir Airfield (KDZ) -Sri Lanka", "Suvarnabhumi Airport (BKK) - Thailand", "Heathrow Airport (LHR) - United Kingdom", "Abu Dhabi International Airport (AUH) - UAE", "Dubai International Airport (DXB) - UAE" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("To");

        cmbTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Melbourne Airport (MEL) - Australia", "Sydney Kingsford Smith Airport (SYD) - Australia", "Hazrat Shahjalal International Airport (DAC) - Bangladesh", "Beijing Capital International Airport (PEK) - China", "Guangzhou Baiyun International Airport (CAN) - China", "Charles de Gaulle Airport (CDG) - France", "Frankfurt am Main Airport (FRA) - Germany", "Chhatrapati Shivaji Maharaj International Airport (BOM) - India", "Chennai International Airport (MAA) - India", "Indira Gandhi International Airport (DEL) - India", "Kempegowda International Airport (BLR) - India", "Netaji Subhas Chandra Bose International Airport (CCU) - India", "Leonardo da Vinci International Airport (FCO) - Italy", "Malpensa Airport (MXP) - Italy", "Kansai International Airport (KIX) - Japan", "Narita International Airport (NRT) - Japan", "Kuwait International Airport (KWI) - Kuwait", "Kuala Lumpur International Airport (KUL) - Malaysia", "Velana International Airport (MLE) - Maldives", "Tribhuvan International Airport (KTM) - Nepal", "Allama Iqbal International Airport (LHE) - Pakistan", "Jinnah International Airport (KHI) - Pakistan", "Hamad International Airport (DOH) - Qatar", "Sheremetyevo International Airport (SVO) - Russia", "King Abdulaziz International Airport (JED) - Saudi Arabia", "King Khalid International Airport (RUH) - Saudi Arabia", "Changi International Airport (SIN) - Singapore", "O.R. Tambo International Airport (JNB) - South Africa", "Bandaranaike International Airport (CMB) - Sri Lanka", "China Bay Airport (TRR) - Sri Lanka", "Jaffna International Airport (JAF) - Sri Lanka", "Mattala Rajapaksa International Airport (HRI) - Sri Lanka", "Victoria Reservoir Airfield (KDZ) -Sri Lanka", "Suvarnabhumi Airport (BKK) - Thailand", "Heathrow Airport (LHR) - United Kingdom", "Abu Dhabi International Airport (AUH) - UAE", "Dubai International Airport (DXB) - UAE" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Class");

        cmbClass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy Class", "Business Class" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Passengers");

        spPassengers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnBooking.setBackground(new java.awt.Color(0, 0, 153));
        btnBooking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(255, 255, 255));
        btnBooking.setText("Booking");
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBooking)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(cmbFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbFlightNumber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spPassengers)))
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBooking)
                .addContainerGap(89, Short.MAX_VALUE))
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
            CFlight_Details controller = new CFlight_Details();
            List<String> flightNumbers = controller.getAllFlightNumbers();

            DefaultComboBoxModel<String> flightNumberModel = new DefaultComboBoxModel<>();
            
            for (String flightNumber : flightNumbers) 
            {
                flightNumberModel.addElement(flightNumber);
            }

            cmbFlightNumber.setModel(flightNumberModel);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error loading flight numbers: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VPassenger_Dashboard dashboard = new VPassenger_Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnFlightDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightDetailsActionPerformed
        VPassenger_View_Flight_Details pfDetails = new VPassenger_View_Flight_Details();
        pfDetails.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFlightDetailsActionPerformed

    private void btnFlightBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightBookingActionPerformed
        VFlight_Booking fbooking = new VFlight_Booking();
        fbooking.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFlightBookingActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        try
        {
            String flightNumber;
            String fromDestination;
            String toDestination;
            String flightClass;
            int passengers;
            
            flightNumber=cmbFlightNumber.getSelectedItem().toString();
            fromDestination=cmbFrom.getSelectedItem().toString();
            toDestination=cmbTo.getSelectedItem().toString();
            flightClass=cmbClass.getSelectedItem().toString();
            passengers = (int) spPassengers.getValue();
            
            String username = LoggedInUser.username; 
            String password = LoggedInUser.password;
            
            if (username == null || password == null) 
            {
            throw new Exception("User is not logged in. Please log in and try again.");
            }
            
            CFlight_Booking fli_book = new CFlight_Booking();
            fli_book.bookFlight(flightNumber, fromDestination, toDestination, flightClass, passengers, username, password);
            JOptionPane.showMessageDialog(this, "Flight booking successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Add Error", JOptionPane.ERROR_MESSAGE);
        }
        
        clearForm();
        
    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        VPassenger_Login plogin = new VPassenger_Login();
        plogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    
    public static void main(String args[]) 
    {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VFlight_Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnFlightBooking;
    private javax.swing.JButton btnFlightDetails;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cmbClass;
    private javax.swing.JComboBox<String> cmbFlightNumber;
    private javax.swing.JComboBox<String> cmbFrom;
    private javax.swing.JComboBox<String> cmbTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner spPassengers;
    // End of variables declaration//GEN-END:variables

    private void clearForm() 
    {
        cmbFlightNumber.setSelectedIndex(-1);
        cmbFrom.setSelectedIndex(-1);
        cmbTo.setSelectedIndex(-1);
        cmbClass.setSelectedIndex(-1);
        spPassengers.setValue(0); 
    }
}
