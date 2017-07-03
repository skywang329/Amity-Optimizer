package amitycalculator;
//Importing external libraries
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditNPCValuesUI extends javax.swing.JFrame {//Class for editing npc values UI
    
    //Initialize NPC variable
    NPC editNPC;
    
    public EditNPCValuesUI() {
        initComponents();
    }
    
    public EditNPCValuesUI(NPC suppliedEditNPC) {//Initializes the window
        //Transferrs data supplied to this method into initialized empty NPC object
        editNPC = suppliedEditNPC;
        initComponents();
        
        editNPCName.setText(editNPC.getNPCName());//Inputs what NPC values read from file into their corresponding textboxes to allow for easy editing
        editNPCTopicNUM.setText(Integer.toString(editNPC.Topics.size()));
        editNPCFavor.setText(Integer.toString(editNPC.getNPCFavorLevel()));
        editNPCInterest.setText(Integer.toString(editNPC.getNPCInterestLevel()));
        
        String[] constellationChoices = new String[editNPCConstellation.getModel().getSize()];
        int pos = -1;
        for (int i = 0; i < constellationChoices.length; i++) {
            constellationChoices[i] = editNPCConstellation.getModel().getElementAt(i);
            if (editNPC.getConstellation().getName().equals(constellationChoices[i])) {
                pos = i;
            }
        }
        editNPCConstellation.setSelectedIndex(pos); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editNPCName = new javax.swing.JTextField();
        editNPCTopicNUM = new javax.swing.JTextField();
        editNPCFavor = new javax.swing.JTextField();
        editNPCInterest = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        editNPCConstellation = new javax.swing.JList<>();
        proceedButton = new javax.swing.JButton();
        saveExitButton = new javax.swing.JButton();
        noSaveExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NPC Name");

        jLabel2.setText("Amount of Topics");

        jLabel3.setText("NPC Favor Level");

        jLabel4.setText("Edit - NPC Basics ");

        jLabel5.setText("NPC Interest Level");

        jLabel6.setText("Constellation");

        editNPCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNPCNameActionPerformed(evt);
            }
        });

        editNPCTopicNUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNPCTopicNUMActionPerformed(evt);
            }
        });

        editNPCConstellation.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "BlackDragon", "Camel", "Giant", "Shield", "Boat", "Hammer", "Seal", "Key", "Goblin", "Wagon", "Owl", "Elephant" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(editNPCConstellation);

        proceedButton.setText("Confirm and Proceed to Editing Individual Topic Data");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        saveExitButton.setText("Save Values (Name, Favor, Interest, Constellation) and Exit Editing UI");
        saveExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExitButtonActionPerformed(evt);
            }
        });

        noSaveExitButton.setText("Exit Editing UI Without Saving Values");
        noSaveExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSaveExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proceedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(saveExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(noSaveExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editNPCName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editNPCTopicNUM))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editNPCFavor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editNPCInterest))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(editNPCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(editNPCTopicNUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(editNPCFavor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(editNPCInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proceedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveExitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noSaveExitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        editNPC.setNPCName(editNPCName.getText());
        editNPC.setNPCFavorLevel(Integer.parseInt(editNPCFavor.getText()));
        editNPC.setNPCInterestLevel(Integer.parseInt(editNPCInterest.getText()));
        editNPC.setConstellation(new Constellation(editNPCConstellation.getSelectedValue()));
        
        String topicNames = "";
        String topicInterestLevels = "";
        String topicFavorLevels = "";
        
        JOptionPane.showMessageDialog (null, "WARNING: If the number you have input for AMOUNT OF TOPICS is less than the original, \nthis program will only read and allow you to edit the first <number you have input> of topics. \nThe ones that follow will be truncated.", "WARNING:", JOptionPane.WARNING_MESSAGE);
        
        for (int count = 0; count < Integer.parseInt(editNPCTopicNUM.getText()); count++) {
            
            JTextField topicNameField = new JTextField(editNPC.Topics.get(count).getTopicName());
            JTextField topicInterestLevelField = new JTextField(Integer.toString(editNPC.Topics.get(count).getTopicInterestLevel()));
            JTextField topicFavorLevelField = new JTextField(Integer.toString(editNPC.Topics.get(count).getTopicFavorLevel()));
            
            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Topic " + (count + 1) + " Name"));
            panel.add(topicNameField);
            panel.add(new JLabel("Topic " + (count + 1) + " Interest Level"));
            panel.add(topicInterestLevelField);
            panel.add(new JLabel("Topic " + (count + 1) + "  Favor Level"));
            panel.add(topicFavorLevelField);
            
            int result = JOptionPane.showConfirmDialog(null, panel, "Test", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            if (result == JOptionPane.OK_OPTION) {
                topicNames += topicNameField.getText() + ",";
                topicInterestLevels += topicInterestLevelField.getText() + ",";
                topicFavorLevels += topicFavorLevelField.getText() + ",";
            } else {
                //System.out.println("Cancelled");
            }
        }
        //removing last comma
        topicNames = topicNames.substring(0, topicNames.length()-1);
        topicInterestLevels = topicInterestLevels.substring(0, topicInterestLevels.length()-1);
        topicFavorLevels = topicFavorLevels.substring(0, topicFavorLevels.length()-1);
        
        //Writing to file
        String homeDir = System.getProperty("user.home");
        String path = homeDir + "/NetBeansProjects/AmityCalculator/build/classes/amitycalculator/npcfiles/" + editNPC.getNPCName() + ".txt";
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                //
            }
        }
        
        try {
            Path wiki_path = Paths.get(path);
            List<String> lines = Files.readAllLines(wiki_path);
            lines.set(0, editNPC.getNPCName());
            lines.set(1, editNPC.getConstellation().getName());
            lines.set(2, topicNames);
            lines.set(3, topicInterestLevels);
            lines.set(4, topicFavorLevels);
            lines.set(5, Integer.toString(editNPC.getNPCFavorLevel()));
            lines.set(6, Integer.toString(editNPC.getNPCInterestLevel()));
            Files.write(file.toPath(), lines); // You can add a charset and other options too
            //System.out.println("Test.");
            JOptionPane.showMessageDialog (null, "NPC Successfully Edited.", "Success:", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog (null, "An Error Has Occured: Contact the Developer. Error code #0002.", "Error:", JOptionPane.ERROR_MESSAGE);
        }
        
        AmityCalculatorUI newWindow = new AmityCalculatorUI();
        newWindow.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_proceedButtonActionPerformed

    private void saveExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExitButtonActionPerformed
        //Writes edited values to NPC object first
        editNPC.setNPCName(editNPCName.getText());
        editNPC.setNPCFavorLevel(Integer.parseInt(editNPCFavor.getText()));
        editNPC.setNPCInterestLevel(Integer.parseInt(editNPCInterest.getText()));
        editNPC.setConstellation(new Constellation(editNPCConstellation.getSelectedValue()));
        
        //Then writes data of NPC object to file
        String homeDir = System.getProperty("user.home");
        String path = homeDir + "/NetBeansProjects/AmityCalculator/build/classes/amitycalculator/npcfiles/" + editNPC.getNPCName() + ".txt";
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                //
            }
        }
        
        try {
            Path wiki_path = Paths.get(path);
            List<String> lines = Files.readAllLines(wiki_path);
            lines.set(0, editNPC.getNPCName());
            lines.set(1, editNPC.getConstellation().getName());
            lines.set(5, Integer.toString(editNPC.getNPCFavorLevel()));
            lines.set(6, Integer.toString(editNPC.getNPCInterestLevel()));
            Files.write(file.toPath(), lines); // You can add a charset and other options too
            //System.out.println("Test.");
            JOptionPane.showMessageDialog (null, "NPC Successfully Edited.", "Success:", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog (null, "An Error Has Occured: Contact the Developer. Error code #0002.", "Error:", JOptionPane.ERROR_MESSAGE);
        }
        
        //Refresh main window close current window
        AmityCalculatorUI newWindow = new AmityCalculatorUI();
        newWindow.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_saveExitButtonActionPerformed

    private void noSaveExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSaveExitButtonActionPerformed
        //Refreshes main window and closes current window
        AmityCalculatorUI newWindow = new AmityCalculatorUI();
        newWindow.setVisible(true);
        setVisible(false);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_noSaveExitButtonActionPerformed

    private void editNPCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNPCNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNPCNameActionPerformed

    private void editNPCTopicNUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNPCTopicNUMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNPCTopicNUMActionPerformed

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
            java.util.logging.Logger.getLogger(EditNPCValuesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditNPCValuesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditNPCValuesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditNPCValuesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditNPCValuesUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> editNPCConstellation;
    private javax.swing.JTextField editNPCFavor;
    private javax.swing.JTextField editNPCInterest;
    private javax.swing.JTextField editNPCName;
    private javax.swing.JTextField editNPCTopicNUM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton noSaveExitButton;
    private javax.swing.JButton proceedButton;
    private javax.swing.JButton saveExitButton;
    // End of variables declaration//GEN-END:variables
}