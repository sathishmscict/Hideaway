/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dpulab.hideaway.view;

/**
 *
 * @author dipu
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        topPanel = new javax.swing.JPanel();
        navigationToolbar = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        verticalSeparator1 = new javax.swing.JSeparator();
        breadcrumbToolbar = new javax.swing.JToolBar();
        rootButton = new javax.swing.JButton();
        pathSeparator1 = new javax.swing.JLabel();
        verticalSeparator2 = new javax.swing.JSeparator();
        actionToolbar = new javax.swing.JToolBar();
        newFileButton = new javax.swing.JButton();
        newFolderButton = new javax.swing.JButton();
        addBookmarkButton = new javax.swing.JButton();
        horizontalSeparator1 = new javax.swing.JSeparator();
        sidePanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        recentsButton = new javax.swing.JButton();
        favoriteButton = new javax.swing.JButton();
        generateKeyPairButton = new javax.swing.JButton();
        horizontalSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        horizontalSeparator3 = new javax.swing.JSeparator();
        keystoreButton = new javax.swing.JButton();
        verticalSeparator3 = new javax.swing.JSeparator();
        mainPanel = new javax.swing.JPanel();
        dataViewerScrollPane = new javax.swing.JScrollPane();
        dataViewer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hideaway");
        setName("hideawayDashboard"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 600));

        topPanel.setBackground(new java.awt.Color(204, 207, 213));
        topPanel.setPreferredSize(new java.awt.Dimension(105, 50));

        navigationToolbar.setFloatable(false);
        navigationToolbar.setRollover(true);
        navigationToolbar.setBorderPainted(false);
        navigationToolbar.setMargin(new java.awt.Insets(3, 10, 3, 10));

        jButton1.setText("<html>&#10094;</html>");
        jButton1.setToolTipText("Backward");
        jButton1.setFocusPainted(false);
        jButton1.setMargin(new java.awt.Insets(8, 11, 8, 11));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        navigationToolbar.add(jButton1);

        jButton2.setText("<html>&#10095;</html>");
        jButton2.setToolTipText("Forward");
        jButton2.setFocusPainted(false);
        jButton2.setMargin(new java.awt.Insets(8, 11, 8, 11));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        navigationToolbar.add(jButton2);

        verticalSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        verticalSeparator1.setToolTipText("");

        breadcrumbToolbar.setFloatable(false);
        breadcrumbToolbar.setBorderPainted(false);
        breadcrumbToolbar.setDoubleBuffered(true);
        breadcrumbToolbar.setMargin(new java.awt.Insets(3, 10, 3, 10));

        rootButton.setFont(rootButton.getFont().deriveFont(rootButton.getFont().getStyle() | java.awt.Font.BOLD, rootButton.getFont().getSize()+8));
        rootButton.setText("<html>&#x1f5b4;</html>");
        rootButton.setToolTipText("Root Folder");
        rootButton.setBorderPainted(false);
        rootButton.setFocusPainted(false);
        rootButton.setFocusable(false);
        rootButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rootButton.setMargin(new java.awt.Insets(3, 3, 3, 3));
        rootButton.setSelected(true);
        rootButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        breadcrumbToolbar.add(rootButton);

        pathSeparator1.setFont(pathSeparator1.getFont().deriveFont(pathSeparator1.getFont().getSize()+10f));
        pathSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        pathSeparator1.setText(":");
        pathSeparator1.setToolTipText("");
        breadcrumbToolbar.add(pathSeparator1);

        verticalSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        verticalSeparator2.setToolTipText("");

        actionToolbar.setFloatable(false);
        actionToolbar.setRollover(true);
        actionToolbar.setBorderPainted(false);
        actionToolbar.setDoubleBuffered(true);
        actionToolbar.setMargin(new java.awt.Insets(3, 10, 3, 10));

        newFileButton.setFont(newFileButton.getFont().deriveFont(newFileButton.getFont().getSize()+12f));
        newFileButton.setText("<html>&#x1f5ba;</html>");
        newFileButton.setToolTipText("New file");
        newFileButton.setActionCommand("File");
        newFileButton.setFocusPainted(false);
        newFileButton.setMargin(new java.awt.Insets(3, 7, 3, 7));
        actionToolbar.add(newFileButton);

        newFolderButton.setFont(newFolderButton.getFont().deriveFont(newFolderButton.getFont().getSize()+12f));
        newFolderButton.setText("<html>&#x1f5bf;</html>");
        newFolderButton.setToolTipText("New folder");
        newFolderButton.setActionCommand("Folder");
        newFolderButton.setFocusPainted(false);
        newFolderButton.setMargin(new java.awt.Insets(3, 7, 3, 7));
        actionToolbar.add(newFolderButton);

        addBookmarkButton.setFont(addBookmarkButton.getFont().deriveFont(addBookmarkButton.getFont().getSize()+12f));
        addBookmarkButton.setText("<html>&#x2605;</html>");
        addBookmarkButton.setToolTipText("Bookmark folder");
        addBookmarkButton.setActionCommand("Favorite");
        addBookmarkButton.setFocusPainted(false);
        addBookmarkButton.setMargin(new java.awt.Insets(3, 7, 3, 7));
        actionToolbar.add(addBookmarkButton);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(navigationToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(verticalSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(breadcrumbToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(verticalSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(actionToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verticalSeparator2)
            .addComponent(verticalSeparator1)
            .addComponent(breadcrumbToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actionToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navigationToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sidePanel.setBackground(new java.awt.Color(224, 227, 233));

        homeButton.setFont(homeButton.getFont().deriveFont(homeButton.getFont().getSize()+5f));
        homeButton.setText("<html>&#x1f5b4; Home</html>");
        homeButton.setBorderPainted(false);

        recentsButton.setFont(recentsButton.getFont().deriveFont(recentsButton.getFont().getSize()+5f));
        recentsButton.setText("<html>&#x23f2; Recents</html>");
        recentsButton.setBorderPainted(false);

        favoriteButton.setFont(favoriteButton.getFont().deriveFont(favoriteButton.getFont().getSize()+5f));
        favoriteButton.setText("<html>&#x2605; Favorites</html>");
        favoriteButton.setBorderPainted(false);

        generateKeyPairButton.setBackground(new java.awt.Color(186, 182, 180));
        generateKeyPairButton.setText("Generate Key Pair");
        generateKeyPairButton.setToolTipText("");
        generateKeyPairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateKeyPairButtonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(192, 190, 196));
        jButton3.setFont(jButton3.getFont().deriveFont(jButton3.getFont().getSize()+3f));
        jButton3.setText("<html>&#x21a7; Import File</html>");

        jButton4.setBackground(new java.awt.Color(192, 190, 196));
        jButton4.setFont(jButton4.getFont().deriveFont(jButton4.getFont().getSize()+3f));
        jButton4.setText("<html>&#x21ca; Import Folder</html>");

        keystoreButton.setFont(keystoreButton.getFont().deriveFont(keystoreButton.getFont().getSize()+5f));
        keystoreButton.setText("<html>&#x1f5dd; Keystore</html>");
        keystoreButton.setBorderPainted(false);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(horizontalSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(favoriteButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(keystoreButton, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(recentsButton)
                    .addComponent(generateKeyPairButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(10, 10, 10))
            .addComponent(horizontalSeparator3)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(favoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horizontalSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(horizontalSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateKeyPairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keystoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        verticalSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        verticalSeparator3.setToolTipText("");

        mainPanel.setBackground(new java.awt.Color(250, 250, 255));

        dataViewer.setBackground(new java.awt.Color(250, 250, 255));
        dataViewer.setFont(dataViewer.getFont().deriveFont(dataViewer.getFont().getSize()+2f));
        dataViewer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dataViewer.setCellSelectionEnabled(true);
        dataViewer.setDoubleBuffered(true);
        dataViewer.setFillsViewportHeight(true);
        dataViewer.setRowHeight(24);
        dataViewer.setRowMargin(3);
        dataViewerScrollPane.setViewportView(dataViewer);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataViewerScrollPane)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataViewerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(verticalSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addComponent(horizontalSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(horizontalSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(verticalSeparator3)))
        );

        getAccessibleContext().setAccessibleDescription("Hideaway - Secure yourself with confidence");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generateKeyPairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateKeyPairButtonActionPerformed
        KeyPairGenerator kpGen = new KeyPairGenerator(this);
        kpGen.setVisible(true);
        kpGen.dispose();
    }//GEN-LAST:event_generateKeyPairButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar actionToolbar;
    private javax.swing.JButton addBookmarkButton;
    private javax.swing.JToolBar breadcrumbToolbar;
    private javax.swing.JTable dataViewer;
    private javax.swing.JScrollPane dataViewerScrollPane;
    private javax.swing.JButton favoriteButton;
    private javax.swing.JButton generateKeyPairButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JSeparator horizontalSeparator1;
    private javax.swing.JSeparator horizontalSeparator2;
    private javax.swing.JSeparator horizontalSeparator3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton keystoreButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JToolBar navigationToolbar;
    private javax.swing.JButton newFileButton;
    private javax.swing.JButton newFolderButton;
    private javax.swing.JLabel pathSeparator1;
    private javax.swing.JButton recentsButton;
    private javax.swing.JButton rootButton;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JSeparator verticalSeparator1;
    private javax.swing.JSeparator verticalSeparator2;
    private javax.swing.JSeparator verticalSeparator3;
    // End of variables declaration//GEN-END:variables
}
