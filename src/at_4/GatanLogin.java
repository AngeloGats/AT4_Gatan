/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package at_4;

import java.io.FileNotFoundException; // To ensure if the file exists or not in the specified filepath
import java.io.FileReader; // As the name states, it reads the file.
import java.io.IOException; // Throws exceptions for any errors occured.
import java.util.Scanner; // Input userdata on text fields
import java.util.logging.Level; // Categorize log messages
import java.util.logging.Logger; // Logging system
import javax.swing.JOptionPane; // Adds options
import org.json.simple.JSONArray; // Allows objects to be classified into set of arrays
import org.json.simple.JSONObject; // Allows json data to be classified as objects
import org.json.simple.parser.JSONParser; // Parser for JSON.
import org.json.simple.parser.ParseException; // Creates an exception in parsing the JSON.

/**
 *
 * @author Angelo Gatan
 */
public class GatanLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
 
    private static String username, password, type; // Declaration of variables to store username, password, and type of role in the system.
    private static String filepath ="C:\\Users\\Angelo Gatan\\Documents\\NetBeansProjects\\AT_4\\src\\at_4\\users.json" ; // Path to JSON file data.
    private static JSONParser jsonParser = new JSONParser(); // JSON Parser of file data
    private static JSONObject record = new JSONObject(); // To hole parsed data.
    private static JSONArray userlist = new JSONArray(); // To hold list of users and their data.
    public GatanLogin() {
        initComponents(); // Initializes components.
        setResizable(false); // Prevents window from being resized
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") 
    
    // Note I cannot edit the following below.
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PassTextField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        ClearButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsNameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        PassTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTextFieldActionPerformed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ClearButton1.setText("Clear");
        ClearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("University of Lakeview Management System");

        jLabel4.setText("(BAREBONE PROTOTYPE,  DEMONSTRATION TO SCHOOL ADMIN PURPOSES ONLY.)");

        jLabel6.setText("[INSERT LOGO HERE]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LoginButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addComponent(ClearButton1))
                        .addComponent(UsNameTextField)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PassTextField)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addComponent(PassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButton1)
                    .addComponent(LoginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try {
            username = UsNameTextField.getText(); // Get username from text field.
            password = PassTextField.getText(); // Get password from text field.

            filecheck(); // Checks if file exists.           
            int check = 0;
            String foundtype = ""; // Initialize foundtype outside the loop

            for (int a = 0; a < userlist.size(); a++) {
                JSONObject userobject = (JSONObject) userlist.get(a);
                String foundusname = (String) userobject.get("username");
                String foundpass = (String) userobject.get("password");
                foundtype = (String) userobject.get("type");

                if (username.equals(foundusname) && password.equals(foundpass)) {
                    check++;
                    break;
                }
            }

            if (check == 1) { // If match is detected, select base on type.
                if ("Admin".equals(foundtype)) {
                    AdminFrame x = new AdminFrame();
                    x.setVisible(true);
                    setVisible(false);
                } else if ("Student".equals(foundtype)) {
                    StudentFrame y = new StudentFrame();
                    y.setVisible(true);
                    setVisible(false);
                }
            } else {
                // Optionally show an error message for invalid login
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            Logger.getLogger(GatanLogin.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ClearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButton1ActionPerformed
        PassTextField.setText("");
        UsNameTextField.setText("");
        // To sum it up, using the (.setText) will forcibly change the text fields to whatever it is set to.
    }//GEN-LAST:event_ClearButton1ActionPerformed

    private void PassTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTextFieldActionPerformed

    private void UsNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsNameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GatanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatanLogin().setVisible(true);
            }
        });
    }
    
     public static void filecheck() throws FileNotFoundException, IOException, ParseException{ // Will check if file is found in the filepath or meets any of the conditions given.
         FileReader reader = new FileReader(filepath);
        
        if(reader.ready())
        {
            
            Scanner sc = new Scanner(reader);
            String line="";
            
            while (sc.hasNext())
            {
                line = line + sc.nextLine();
            }
            
            if(!line.equals(""))
            {
            
                reader.close();
                FileReader reader2 = new FileReader(filepath);
                record = (JSONObject) jsonParser.parse(reader2);
                userlist = (JSONArray) record.get("users");
                reader2.close();
            }
            
        }
        
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton1;
    private javax.swing.JButton LoginButton;
    private javax.swing.JTextField PassTextField;
    private javax.swing.JTextField UsNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
