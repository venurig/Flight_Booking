/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.CFlight_Details;
import java.awt.BorderLayout;
import java.awt.Image;
import java.sql.Connection; 
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import model.*; 
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;


/**
 *
 * @author V E N U R I
 */
public class VReport extends javax.swing.JFrame 
{
    
    public VReport() {
        initComponents();
        loadFlightNumbers();
        
        cmbFlightNumber.setSelectedIndex(-1);
        
        reportPanel.setLayout(new java.awt.BorderLayout());
        
        Image icon = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
        this.setIconImage(icon);
    }

    private void generateAllBookingReport()
    {
        try 
        {
            JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\V E N U R I\\Documents\\GitHub\\Flight_Booking_System\\src\\model\\All_Flight_Booking_Report.jrxml"); 
            
            Connection con = DBConnection.createDBConnection();
            
            if (con != null) 
            {
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), con);
                JRViewer viewer = new JRViewer(jasperPrint);

                reportPanel.removeAll();
                reportPanel.add(viewer, BorderLayout.CENTER);
                reportPanel.revalidate();
                reportPanel.repaint();
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "Error: Unable to establish database connection.");
            }
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }  
    
    private void generateBookingReport()
    {
        try 
        {
            HashMap a = new HashMap();
            a.put("fb.flightNumber", cmbFlightNumber.getSelectedItem());
            
            
            JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\V E N U R I\\Documents\\GitHub\\Flight_Booking_System\\src\\model\\Booking_Report.jrxml"); 
            JasperReport jasperReport = JasperCompileManager.compileReport(jdesign);
            Connection con = DBConnection.createDBConnection();
            
            if (con != null) 
            {
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, a, con);
                JRViewer viewer = new JRViewer(jasperPrint);

                reportPanel.removeAll();
                reportPanel.add(viewer, BorderLayout.CENTER);
                reportPanel.revalidate();
                reportPanel.repaint();
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "Error: Unable to establish database connection.");
            }
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
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
        btnFlightTickets = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnGenerateReport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnUL317GenerateReport = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbFlightNumber = new javax.swing.JComboBox<>();
        reportPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking Report");

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
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFlightDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFlightTickets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnHome)
                .addGap(27, 27, 27)
                .addComponent(btnFlightDetails)
                .addGap(27, 27, 27)
                .addComponent(btnFlightTickets)
                .addGap(28, 28, 28)
                .addComponent(btnReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(61, 61, 61))
        );

        jPanel3.setBackground(new java.awt.Color(95, 184, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("REPORTS");

        btnGenerateReport.setBackground(new java.awt.Color(0, 0, 153));
        btnGenerateReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerateReport.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("All Flight Booking Report");

        btnUL317GenerateReport.setBackground(new java.awt.Color(0, 0, 153));
        btnUL317GenerateReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUL317GenerateReport.setForeground(new java.awt.Color(255, 255, 255));
        btnUL317GenerateReport.setText("Generate Report");
        btnUL317GenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUL317GenerateReportActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Flight Number");

        cmbFlightNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(267, 267, 267))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUL317GenerateReport)
                    .addComponent(btnGenerateReport))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnGenerateReport))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUL317GenerateReport)
                    .addComponent(jLabel4)
                    .addComponent(cmbFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadFlightNumbers() 
    {
        try 
        {
            CFlight_Details flightController = new CFlight_Details();
            List<String> flightNumbers = flightController.getAllFlightNumbers();

            cmbFlightNumber.removeAllItems();
            for (String flightNumber : flightNumbers) 
            {
                cmbFlightNumber.addItem(flightNumber);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error loading flight numbers: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnFlightDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightDetailsActionPerformed
       VFlight_Details fDetails = new VFlight_Details();
       fDetails.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnFlightDetailsActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       VStaff_Dashboard sdashboard = new VStaff_Dashboard();
       sdashboard.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       VStaff_Login slogin = new VStaff_Login();
       slogin.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnFlightTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightTicketsActionPerformed
       VFlight_Tickets fTickets = new VFlight_Tickets();
       fTickets.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnFlightTicketsActionPerformed

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
        generateAllBookingReport();
    }//GEN-LAST:event_btnGenerateReportActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
       VReport report = new VReport();
       report.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnUL317GenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUL317GenerateReportActionPerformed
        generateBookingReport();
    }//GEN-LAST:event_btnUL317GenerateReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {  
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VReport().setVisible(true);
            }
        });
    }
                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFlightDetails;
    private javax.swing.JButton btnFlightTickets;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnUL317GenerateReport;
    private javax.swing.JComboBox<String> cmbFlightNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel reportPanel;
    // End of variables declaration//GEN-END:variables
}
