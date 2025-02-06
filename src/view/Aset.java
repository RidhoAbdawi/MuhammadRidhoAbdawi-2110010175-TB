/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import database.KoneksiDB;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import helper.PDFGenerator;

public class Aset extends javax.swing.JFrame {
    private final Transaksi parentForm;
    private boolean isEditing = false;
    private int selectedId = -1;

    public Aset(Transaksi parent) {
        initComponents();
        this.parentForm = parent;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Add this line to center the form
        loadData();
        updateButtonStates(false);  // Initialize button states

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                parentForm.setVisible(true);
            }
        });
    }

    private void loadData() {
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);
    model.setColumnIdentifiers(new String[] { "ID", "Nama Aset", "Jumlah Stok", "Lokasi" });

    try (Connection conn = KoneksiDB.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_aset")) {

        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getInt("id_aset"), 
                rs.getString("nama_aset"),
                rs.getInt("jumlah_stok"),
                rs.getString("lokasi_aset")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    // Sembunyikan kolom ID agar tidak terlihat di tabel
    jTable2.getColumnModel().getColumn(0).setMinWidth(0);
    jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
    jTable2.getColumnModel().getColumn(0).setWidth(0);
}


    private void clearForm() {
        txtjumlah.setText("");
        txtnama.setText("");
        txtlokasi.setText("");
        updateButtonStates(false);
    }

    private void updateButtonStates(boolean isEditMode) {
        btnTambah3.setEnabled(!isEditMode);
        btnUbah1.setEnabled(isEditMode);
        btnHapus1.setEnabled(isEditMode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        input = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnUbah1 = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();
        btnTambah3 = new javax.swing.JButton();
        txtjumlah = new javax.swing.JTextField();
        txtlokasi = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        model3 = new javax.swing.JTextField();
        tabel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnCari1 = new javax.swing.JButton();
        btnCetak1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASET");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        input.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        java.awt.GridBagLayout inputLayout = new java.awt.GridBagLayout();
        inputLayout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        inputLayout.rowHeights = new int[] {0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0};
        input.setLayout(inputLayout);

        jLabel8.setText("Nama Aset");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        input.add(jLabel8, gridBagConstraints);

        jLabel9.setText("Lokasi Aset");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        input.add(jLabel9, gridBagConstraints);

        btnUbah1.setBackground(new java.awt.Color(102, 102, 102));
        btnUbah1.setForeground(new java.awt.Color(51, 51, 51));
        btnUbah1.setText("Ubah");
        btnUbah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbah1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        input.add(btnUbah1, gridBagConstraints);

        btnHapus1.setBackground(new java.awt.Color(204, 0, 0));
        btnHapus1.setText("Hapus");
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        input.add(btnHapus1, gridBagConstraints);

        btnTambah3.setBackground(new java.awt.Color(0, 153, 51));
        btnTambah3.setText("Tambahkan");
        btnTambah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        input.add(btnTambah3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        input.add(txtjumlah, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        input.add(txtlokasi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        input.add(txtnama, gridBagConstraints);

        jLabel10.setText("Jumlah Stok");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        input.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        input.add(model3, gridBagConstraints);

        getContentPane().add(input);

        tabel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tabel.setLayout(new java.awt.GridBagLayout());

        jLabel11.setText("Cari Aset");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        tabel.add(jLabel11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        tabel.add(jTextField4, gridBagConstraints);

        btnCari1.setText("Cari");
        btnCari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCari1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 20, 4);
        tabel.add(btnCari1, gridBagConstraints);

        btnCetak1.setText("Cetak");
        btnCetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetak1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        tabel.add(btnCetak1, gridBagConstraints);

        jScrollPane4.setPreferredSize(new java.awt.Dimension(200, 300));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable2.setPreferredSize(new java.awt.Dimension(60, 500));
        jTable2.setShowGrid(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        tabel.add(jScrollPane4, gridBagConstraints);

        getContentPane().add(tabel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbah1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUbah1ActionPerformed
         if (selectedId == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data terlebih dahulu");
        return;
    }

    try (Connection conn = KoneksiDB.getConnection()) {
        String sql = "UPDATE tbl_aset SET nama_aset=?, jumlah_stok=?, lokasi_aset=? WHERE id_aset=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        // Set parameters for the new table structure
        stmt.setString(1, txtnama.getText());
        stmt.setInt(2, Integer.parseInt(txtjumlah.getText()));
        stmt.setString(3, txtlokasi.getText());
        stmt.setInt(4, selectedId);
        
        stmt.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
        loadData();
        clearForm();
        selectedId = -1;
        isEditing = false;
        parentForm.refreshComboBoxes();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Jumlah stok harus berupa angka");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }// GEN-LAST:event_btnUbah1ActionPerformed

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHapus1ActionPerformed
        if (selectedId == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data terlebih dahulu");
        return;
    }

    if (JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        try (Connection conn = KoneksiDB.getConnection()) {
            String sql = "DELETE FROM tbl_aset WHERE id_aset=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, selectedId);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            loadData();
            clearForm();
            selectedId = -1;
            isEditing = false;
            parentForm.refreshComboBoxes();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    }// GEN-LAST:event_btnHapus1ActionPerformed

    private void btnTambah3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTambah3ActionPerformed
        try (Connection conn = KoneksiDB.getConnection()) {
    String sql = "INSERT INTO tbl_aset (nama_aset, jumlah_stok, lokasi_aset) VALUES (?, ?, ?)";
    PreparedStatement stmt = conn.prepareStatement(sql);
    
    // Validate numeric input for jumlah_stok
    int jumlahStok;
    try {
        jumlahStok = Integer.parseInt(txtjumlah.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Jumlah stok harus berupa angka");
        return;
    }
    
    stmt.setString(1, txtnama.getText());
    stmt.setInt(2, jumlahStok);
    stmt.setString(3, txtlokasi.getText());
    stmt.executeUpdate();

    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
    loadData();
    clearForm();
    parentForm.refreshComboBoxes();
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
}
    }// GEN-LAST:event_btnTambah3ActionPerformed

    private void btnCari1ActionPerformed(java.awt.event.ActionEvent evt) {
        String searchText = jTextField4.getText().trim();
    
    if (searchText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan kata kunci pencarian terlebih dahulu!");
        return;
    }
    
    searchText = searchText.toLowerCase();
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);

    try (Connection conn = KoneksiDB.getConnection()) {
        String sql = "SELECT * FROM tbl_aset WHERE LOWER(nama_aset) LIKE ? OR LOWER(lokasi_aset) LIKE ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + searchText + "%");
        stmt.setString(2, "%" + searchText + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        boolean found = false;
        while (rs.next()) {
            found = true;
            model.addRow(new Object[] {
                rs.getInt("id_aset"),
                rs.getString("nama_aset"),
                rs.getInt("jumlah_stok"),
                rs.getString("lokasi_aset")
            });
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan!");
            loadData(); // Reset table to show all data
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }

    private void btnCetak1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
        String[] headers = {"Nama Aset", "Jumlah Stok", "Lokasi"};
        String filename = "laporan_aset_" + System.currentTimeMillis() + ".pdf";
        PDFGenerator.generatePDF("Data Aset", headers, jTable2, filename);
        JOptionPane.showMessageDialog(this, "PDF berhasil dibuat: " + filename);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error membuat PDF: " + e.getMessage());
    }
    }

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTable2.getSelectedRow();
    if (row != -1) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        int clickedId = Integer.parseInt(tableModel.getValueAt(row, 0).toString());
        
        if (isEditing && clickedId == selectedId) {
            clearForm();
            isEditing = false;
            selectedId = -1;
            updateButtonStates(false);
        } else {
            selectedId = clickedId;
            txtnama.setText(tableModel.getValueAt(row, 1).toString());
            txtjumlah.setText(tableModel.getValueAt(row, 2).toString());
            txtlokasi.setText(tableModel.getValueAt(row, 3).toString());
            isEditing = true;
            updateButtonStates(true);
        }
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aset(new Transaksi()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari1;
    private javax.swing.JButton btnCetak1;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnTambah3;
    private javax.swing.JButton btnUbah1;
    private javax.swing.JPanel input;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField model3;
    private javax.swing.JPanel tabel;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtlokasi;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
