package ui;
import java.awt.CardLayout;

import javax.swing.JOptionPane;
/**
 *
 * @author varun
 */
public class MainFrame extends javax.swing.JFrame {
    FormPanel formPanel = new FormPanel();
    CardLayout layout = new CardLayout();
    ViewPanel viewPanel = new ViewPanel();

    public MainFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        SplitPane = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        formButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        SplitPane.setDividerLocation(95);
        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        formButton.setText("form");
        formButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formButtonActionPerformed(evt);
            }
        });
        viewButton.setText("view");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(formButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(viewButton)
                .addGap(158, 158, 158))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formButton)
                    .addComponent(viewButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        SplitPane.setTopComponent(topPanel);
        bottomPanel.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(bottomPanel);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pack();
    }
    private void formButtonActionPerformed(java.awt.event.ActionEvent evt) {
        formPanel=new FormPanel(bottomPanel);
        bottomPanel.add(formPanel);
        layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        boolean submitted = formPanel.getSubmitted();
        if(submitted){
            // If the user has submitted the form
            viewPanel = new ViewPanel(formPanel.getNewUser());
            bottomPanel.add(viewPanel);
            layout = (CardLayout) bottomPanel.getLayout();
            layout.next(bottomPanel);
        }
        else {
            // If incase the user has not submitted the form
            JOptionPane.showMessageDialog(this, "No data has been entered");
        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton formButton;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton viewButton;
}
