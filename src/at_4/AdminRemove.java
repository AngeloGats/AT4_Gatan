/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package at_4;
// Refer to GatanLogin.java for explanation of the following classes below.
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Angelo Gatan
 */

public class AdminRemove extends javax.swing.JFrame {

    /**
     * Creates new form AdminRemove
     */
    public AdminRemove() {
        initComponents();
    }

    private static String Username, Password;
    private static final String filepath = "C:\\Users\\Angelo Gatan\\Documents\\NetBeansProjects\\AT_4\\src\\at_4\\users.json";
    private static JSONParser jsonParser = new JSONParser();
    private static JSONObject use = new JSONObject();
    private static JSONArray userlist = new JSONArray();
    private static JSONObject record = new JSONObject();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PassText = new javax.swing.JTextField();
        UsernameText = new javax.swing.JTextField();
        Remove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        PassText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTextActionPerformed(evt);
            }
        });

        UsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextActionPerformed(evt);
            }
        });

        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        jLabel1.setText("Remove Student From System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Remove)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassText, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Remove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(Close)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        setVisible(false); //Closes the frame.

    }//GEN-LAST:event_CloseActionPerformed

    private void PassTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTextActionPerformed

    private void UsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // Retrieve input values
        Username = UsernameText.getText();
        Password = PassText.getText();

        if (Username.isBlank() && Password.isBlank()) { //Check if textfields are blank
            JOptionPane.showMessageDialog(null, "Please Enter Username and Password", "Error", JOptionPane.ERROR_MESSAGE);
        } else { // If not, will give confirmation.
            int confirm = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to remove this student from the system?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) { // Will proceed to delete student from data if yes option is chosen.
                try {

                    filecheck();

                    boolean deleted = false; // Set to false as it is not deleted

                    for (int a = userlist.size() - 1; a >= 0; a--) {

                        JSONObject jsonObject = (JSONObject) userlist.get(a);

                        String Dusername = (String) jsonObject.get("username"); //Get username and password from data
                        String Dpassword = (String) jsonObject.get("password");
                        String Dtype = (String) jsonObject.get("type");

                        if (Username.equals(Dusername) && Password.equals(Dpassword)) { // If entered username and password is the same in the given database, data will be deleted.
                            userlist.remove(a);

                            deleted = true;

                            break;
                        }
                    }
                    if (deleted) {
                        save();
                        AdminFrame c = new AdminFrame(); // Closes current frame and returns to the admin frame
                        c.setVisible(true); 
                        setVisible(false);
                    } else { // Will give error if given data does not match in existing database.
                        JOptionPane.showMessageDialog(null, "Student Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception ex) { // Error occurs if there is something wrong in the json file.
                    JOptionPane.showMessageDialog(null, "Failed To Save.", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(AdminRemove.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }//GEN-LAST:event_RemoveActionPerformed
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
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(AdminRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(AdminRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(AdminRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(AdminRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new AdminRemove().setVisible(true);
        }
    });
}

    public static void filecheck() throws FileNotFoundException, IOException, ParseException { // Will check if file is found in the filepath or meets any of the conditions given.
    FileReader reader = new FileReader(filepath);

    if (reader.ready()) {

        Scanner sc = new Scanner(reader);
        String line = "";

        while (sc.hasNext()) {
            line = line + sc.nextLine();
        }

        if (!line.equals("")) {

            reader.close();
            FileReader reader2 = new FileReader(filepath);
            record = (JSONObject) jsonParser.parse(reader2);
            userlist = (JSONArray) record.get("users");
            reader2.close();
        }

    }

}

    public static void save() throws IOException {
    //saves new data to JSON file
    try {
        FileWriter file = new FileWriter(filepath); // Create a FileWriter object to write to the specified filepath
        file.write(record.toJSONString()); // Write the JSON string representation of the record to the file
        file.close();// Close the FileWriter
        JOptionPane.showMessageDialog(null, "Student succesfully deleted.", "Success", JOptionPane.INFORMATION_MESSAGE); // Show a success message when the file is saved successfully
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "An error Occured. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // Show an error message if the file fails to save
    }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JTextField PassText;
    private javax.swing.JButton Remove;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
