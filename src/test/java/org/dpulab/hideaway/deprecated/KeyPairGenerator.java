/*
 * Copyright (C) 2018 dipu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.dpulab.hideaway.view;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.operator.OperatorCreationException;
import org.dpulab.hideaway.utils.CryptoService;
import org.dpulab.hideaway.utils.Reporter;

/**
 *
 * @author dipu
 */
@Deprecated
public class KeyPairGenerator extends javax.swing.JDialog {

    /**
     * Creates new form NameBuilder
     *
     * @param parent
     */
    public KeyPairGenerator(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        loadCountryList();
        clearInputs();
    }

    public X500Name getSubject() {
        String alias = this.aliasInput.getText();
        if (alias == null) {
            return null;
        }
        return CryptoService.getDefault().generateX500Name(
                alias,
                this.nameInput.getText(),
                this.emailInput.getText(),
                this.orgUnitInput.getText(),
                this.organizationInput.getText(),
                this.getCountryCode());
    }
    
    private void loadCountryList() {
        String[] locales = Locale.getISOCountries();
        for (int i = 0; i < locales.length; ++i) {
            Locale obj = new Locale("", locales[i]);
            locales[i] = String.format("%s - %s", obj.getDisplayCountry(), obj.getCountry());
        }
        Arrays.sort(locales);
        this.countrySelector.setModel(new DefaultComboBoxModel<>(locales));
    }

    private String getCountryCode() {
        String code = (String) this.countrySelector.getSelectedItem();
        if (code == null) return null;
        String[] parts = code.split(" ");
        return parts[parts.length - 1];
    }

    private void generateAndSave() {
        try {
            this.errorLabel.setText("");
            // check the alias name
            String alias = this.aliasInput.getText();
            if (StringUtils.isEmpty(alias)) {
                throw new InputMismatchException("Can not create key without an alias");
            }
            // check if alias exists
            //if (CipherIO.instance().containsKeyPair(alias)) {
            //    throw new InputMismatchException("Alias <b>" + alias + "</b> already exists in the key store.");
            //}
            // get the subjects data
            X500Name subject = this.getSubject();
            // generate RSA key pair
            KeyPair keyPair = CryptoService.getDefault().generateKeyPair(4096);
            // self sign the key
            Certificate certificate = CryptoService.getDefault().generateSelfSignedX509Certificate(keyPair, subject);
            // save to keystore
            //CipherIO.instance().storeKeyPair(alias, keyPair, certificate);
            // clear and exit
            this.clearInputs();
            this.setVisible(false);
        } catch (InputMismatchException ex) {
            this.errorLabel.setText(String.format("<html>Error: %s</html>", ex.getMessage()));
        } catch (IOException | GeneralSecurityException | OperatorCreationException ex) {
            Reporter.put(this.getClass(), ex);
            this.errorLabel.setText(String.format("<html>%s</html>", ex.toString()));
        }
    }

    private void clearInputs() {
        this.errorLabel.setText("");
        this.aliasInput.setText("");
        this.nameInput.setText("");
        this.emailInput.setText("");
        this.orgUnitInput.setText("");
        this.organizationInput.setText("");
        this.countrySelector.setSelectedIndex(-1);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameHeaderPanel = new javax.swing.JPanel();
        frameTitleLabel = new javax.swing.JLabel();
        frameActionPanel = new javax.swing.JPanel();
        generateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        frameBodyPanel = new javax.swing.JPanel();
        aliasLabel = new javax.swing.JLabel();
        aliasInput = new javax.swing.JTextField();
        aliasHintLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        organizationLabel = new javax.swing.JLabel();
        organizationInput = new javax.swing.JTextField();
        organizationHintLabel = new javax.swing.JLabel();
        orgUnitLabel = new javax.swing.JLabel();
        orgUnitInput = new javax.swing.JTextField();
        orgUnitHintLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        countrySelector = new javax.swing.JComboBox<>();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generate RSA pair");
        setMinimumSize(new java.awt.Dimension(550, 540));
        setPreferredSize(new java.awt.Dimension(550, 600));

        frameHeaderPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 204, 204)));

        frameTitleLabel.setFont(frameTitleLabel.getFont().deriveFont(frameTitleLabel.getFont().getSize()+8f));
        frameTitleLabel.setForeground(new java.awt.Color(0, 153, 153));
        frameTitleLabel.setText("Generate RSA key pair");

        javax.swing.GroupLayout frameHeaderPanelLayout = new javax.swing.GroupLayout(frameHeaderPanel);
        frameHeaderPanel.setLayout(frameHeaderPanelLayout);
        frameHeaderPanelLayout.setHorizontalGroup(
            frameHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHeaderPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(frameTitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameHeaderPanelLayout.setVerticalGroup(
            frameHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHeaderPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(frameTitleLabel)
                .addGap(15, 15, 15))
        );

        frameActionPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 102, 102)));

        generateButton.setFont(generateButton.getFont().deriveFont(generateButton.getFont().getStyle() | java.awt.Font.BOLD, generateButton.getFont().getSize()+2));
        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(cancelButton.getFont().deriveFont(cancelButton.getFont().getSize()+2f));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameActionPanelLayout = new javax.swing.GroupLayout(frameActionPanel);
        frameActionPanel.setLayout(frameActionPanelLayout);
        frameActionPanelLayout.setHorizontalGroup(
            frameActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameActionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        frameActionPanelLayout.setVerticalGroup(
            frameActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameActionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        aliasLabel.setFont(aliasLabel.getFont().deriveFont(aliasLabel.getFont().getSize()+2f));
        aliasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aliasLabel.setLabelFor(aliasInput);
        aliasLabel.setText("Key Alias:");

        aliasInput.setFont(aliasInput.getFont());

        aliasHintLabel.setForeground(new java.awt.Color(0, 153, 153));
        aliasHintLabel.setText("The alias under which you key is saved.");

        nameLabel.setFont(nameLabel.getFont().deriveFont(nameLabel.getFont().getSize()+2f));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setLabelFor(nameInput);
        nameLabel.setText("Name:");

        nameInput.setFont(nameInput.getFont());

        emailLabel.setFont(emailLabel.getFont().deriveFont(emailLabel.getFont().getSize()+2f));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLabel.setLabelFor(emailInput);
        emailLabel.setText("Email:");

        emailInput.setFont(emailInput.getFont());

        organizationLabel.setFont(organizationLabel.getFont().deriveFont(organizationLabel.getFont().getSize()+2f));
        organizationLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        organizationLabel.setLabelFor(organizationInput);
        organizationLabel.setText("Organization:");

        organizationInput.setFont(organizationInput.getFont());

        organizationHintLabel.setForeground(new java.awt.Color(0, 153, 153));
        organizationHintLabel.setText("The name of your organization");

        orgUnitLabel.setFont(orgUnitLabel.getFont().deriveFont(orgUnitLabel.getFont().getSize()+2f));
        orgUnitLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orgUnitLabel.setLabelFor(orgUnitInput);
        orgUnitLabel.setText("Org. Unit:");

        orgUnitInput.setFont(orgUnitInput.getFont());

        orgUnitHintLabel.setForeground(new java.awt.Color(0, 153, 153));
        orgUnitHintLabel.setText("The organizational unit that requires this key.");

        countryLabel.setFont(countryLabel.getFont().deriveFont(countryLabel.getFont().getSize()+2f));
        countryLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countryLabel.setLabelFor(countrySelector);
        countryLabel.setText("Country:");

        countrySelector.setToolTipText("Select your country");

        errorLabel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(153, 102, 0));
        errorLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout frameBodyPanelLayout = new javax.swing.GroupLayout(frameBodyPanel);
        frameBodyPanel.setLayout(frameBodyPanelLayout);
        frameBodyPanelLayout.setHorizontalGroup(
            frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameBodyPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(countryLabel)
                    .addComponent(emailLabel)
                    .addComponent(orgUnitLabel)
                    .addComponent(organizationLabel)
                    .addComponent(nameLabel)
                    .addComponent(aliasLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameBodyPanelLayout.createSequentialGroup()
                        .addComponent(organizationHintLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(frameBodyPanelLayout.createSequentialGroup()
                        .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(organizationInput)
                            .addComponent(orgUnitInput)
                            .addComponent(nameInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aliasInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countrySelector, javax.swing.GroupLayout.Alignment.LEADING, 0, 402, Short.MAX_VALUE)
                            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameBodyPanelLayout.createSequentialGroup()
                                .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(orgUnitHintLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aliasHintLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))))
        );
        frameBodyPanelLayout.setVerticalGroup(
            frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameBodyPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aliasLabel)
                    .addComponent(aliasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(aliasHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationLabel))
                .addGap(0, 0, 0)
                .addComponent(organizationHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgUnitInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgUnitLabel))
                .addGap(0, 0, 0)
                .addComponent(orgUnitHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryLabel)
                    .addComponent(countrySelector, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(frameActionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(frameBodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frameHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(frameBodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(frameActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.clearInputs();
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        this.generateAndSave();
    }//GEN-LAST:event_generateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aliasHintLabel;
    private javax.swing.JTextField aliasInput;
    private javax.swing.JLabel aliasLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JComboBox<String> countrySelector;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel frameActionPanel;
    private javax.swing.JPanel frameBodyPanel;
    private javax.swing.JPanel frameHeaderPanel;
    private javax.swing.JLabel frameTitleLabel;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel orgUnitHintLabel;
    private javax.swing.JTextField orgUnitInput;
    private javax.swing.JLabel orgUnitLabel;
    private javax.swing.JLabel organizationHintLabel;
    private javax.swing.JTextField organizationInput;
    private javax.swing.JLabel organizationLabel;
    // End of variables declaration//GEN-END:variables
}
