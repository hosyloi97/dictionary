/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrloiho.hust.design;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr Loi Ho
 */
public class Dictionary extends javax.swing.JFrame {

    /**
     * Creates new form Dictionary
     */
    public Dictionary() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameDictionary = new javax.swing.JLabel();
        inputText = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listResult = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameDictionary.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        nameDictionary.setText("Eng- Vie Dictionary");

        inputText.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        inputText.setForeground(new java.awt.Color(153, 153, 153));
        inputText.setText("Input text here...");
        inputText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTextFocusLost(evt);
            }
        });
        inputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        listResult.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        listResult.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listResult);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 134, Short.MAX_VALUE)
                .addComponent(nameDictionary)
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nameDictionary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTextFocusGained
        // clear text field if the text is "Input here..."
        if (inputText.getText().trim().equals("")) {
            inputText.setText("");
            inputText.setForeground(Color.black);
        }
    }//GEN-LAST:event_inputTextFocusGained

    private void inputTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTextFocusLost
        // if the inputText has nothing
        //        we will set default is "Input text here!"
        if (inputText.getText().trim().equals("")) {
            inputText.setText("Input text here...");
            inputText.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_inputTextFocusLost

    private void inputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextActionPerformed
        // TODO add your handling code here:
        //        String inputString= new String();
        inputText.setText(inputText.getText());
    }//GEN-LAST:event_inputTextActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, inputText);
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dictionary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> listResult;
    private javax.swing.JLabel nameDictionary;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
