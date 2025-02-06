package view;

import database.KoneksiDB;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.Date;
import helper.PDFGenerator;

public class Transaksi extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */

     // Enum for transaction types
    public enum JenisTransaksi {
        MASUK("masuk"),
        KELUAR("keluar");
        
        private final String value;
        
        JenisTransaksi(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }
    public Transaksi() {
        initComponents();
        setLocationRelativeTo(null); // Add this line to center the form
        loadData();
        loadComboBoxes();
        updateButtonStates(false);  // Initialize button states
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnUbah1 = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();
        btnTambah3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbpengguna = new javax.swing.JComboBox<>();
        cbaset = new javax.swing.JComboBox<>();
        txtjumlah = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox<>();
        table = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnCari1 = new javax.swing.JButton();
        btnCetak1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penyewaan");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        input.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        java.awt.GridBagLayout inputLayout = new java.awt.GridBagLayout();
        inputLayout.columnWidths = new int[] {0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0};
        inputLayout.rowHeights = new int[] {0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0, 11, 0};
        input.setLayout(inputLayout);

        jLabel7.setText("Pengguna");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        input.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Aset");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        input.add(jLabel8, gridBagConstraints);

        jLabel9.setText("Jenis Transaksi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        input.add(jLabel9, gridBagConstraints);

        btnUbah1.setBackground(new java.awt.Color(102, 102, 102));
        btnUbah1.setText("Ubah");
        btnUbah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbah1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
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
        gridBagConstraints.gridx = 4;
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

        jLabel1.setText("Jumlah Transaksi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        input.add(jLabel1, gridBagConstraints);

        cbpengguna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbpengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpenggunaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        input.add(cbpengguna, gridBagConstraints);

        cbaset.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        input.add(cbaset, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        input.add(txtjumlah, gridBagConstraints);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        input.add(cbjenis, gridBagConstraints);

        getContentPane().add(input);

        table.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        table.setLayout(new java.awt.GridBagLayout());

        jLabel11.setText("Cari Transaksi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        table.add(jLabel11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        table.add(jTextField4, gridBagConstraints);

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
        table.add(btnCari1, gridBagConstraints);

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
        table.add(btnCetak1, gridBagConstraints);

        jScrollPane4.setPreferredSize(new java.awt.Dimension(400, 300));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable2.setPreferredSize(new java.awt.Dimension(90, 500));
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
        table.add(jScrollPane4, gridBagConstraints);

        getContentPane().add(table);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setBorderPainted(false);

        jMenu2.setBackground(new java.awt.Color(204, 255, 204));
        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setText("PENGGUNA");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(204, 255, 204));
        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setText("ASET");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Add at class level
    private int selectedId = -1;
    private boolean isEditing = false;

    private void cbpenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpenggunaActionPerformed
    
    private void btnUbah1ActionPerformed(java.awt.event.ActionEvent evt) {
    if (selectedId == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data terlebih dahulu");
        return;
    }

    try (Connection conn = KoneksiDB.getConnection()) {
        String sql = "UPDATE tbl_transaksi_aset SET " +
                    "id_pengguna = (SELECT id_pengguna FROM tbl_pengguna WHERE nama_pengguna=?), " +
                    "id_aset = (SELECT id_aset FROM tbl_aset WHERE nama_aset=?), " +
                    "jenis_transaksi=?, jumlah_transaksi=? " +
                    "WHERE id_transaksi=?";
                    
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, cbpengguna.getSelectedItem().toString());
        stmt.setString(2, cbaset.getSelectedItem().toString());
        stmt.setString(3, cbjenis.getSelectedItem().toString());
        stmt.setInt(4, Integer.parseInt(txtjumlah.getText()));
        stmt.setInt(5, selectedId);
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
        loadData();
        clearForm();
        selectedId = -1;
        isEditing = false;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}

   private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {
    if (selectedId == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data terlebih dahulu");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, 
        "Apakah Anda yakin ingin menghapus data ini?", 
        "Konfirmasi Hapus", 
        JOptionPane.YES_NO_OPTION);
        
    if (confirm == JOptionPane.YES_OPTION) {
        try (Connection conn = KoneksiDB.getConnection()) {
            String sql = "DELETE FROM tbl_transaksi_aset WHERE id_transaksi=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, selectedId);
            
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                loadData();
                clearForm();
                selectedId = -1;
                isEditing = false;
                updateButtonStates(false);
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak dapat dihapus");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
}

    private void btnTambah3ActionPerformed(java.awt.event.ActionEvent evt) {
    try (Connection conn = KoneksiDB.getConnection()) {
        String sql = "INSERT INTO tbl_transaksi_aset (id_pengguna, id_aset, jenis_transaksi, jumlah_transaksi) " +
                "VALUES ((SELECT id_pengguna FROM tbl_pengguna WHERE nama_pengguna=?), " +
                "(SELECT id_aset FROM tbl_aset WHERE nama_aset=?), ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, cbpengguna.getSelectedItem().toString());
        stmt.setString(2, cbaset.getSelectedItem().toString());
        stmt.setString(3, cbjenis.getSelectedItem().toString());
        stmt.setInt(4, Integer.parseInt(txtjumlah.getText()));
        stmt.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
        loadData();
        clearForm();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Jumlah harus berupa angka");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}

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
        String sql = "SELECT t.*, a.nama_aset, p.nama_pengguna FROM tbl_transaksi_aset t " +
                    "JOIN tbl_aset a ON t.id_aset = a.id_aset " +
                    "JOIN tbl_pengguna p ON t.id_pengguna = p.id_pengguna " +
                    "WHERE LOWER(a.nama_aset) LIKE ? OR LOWER(p.nama_pengguna) LIKE ?";
                    
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + searchText + "%");
        stmt.setString(2, "%" + searchText + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        boolean found = false;
        while (rs.next()) {
            found = true;
            model.addRow(new Object[] {
                rs.getInt("id_transaksi"),
                rs.getString("nama_aset"),
                rs.getString("nama_pengguna"),
                rs.getString("jenis_transaksi"),
                rs.getInt("jumlah_transaksi"),
                rs.getTimestamp("tanggal_transaksi")
            });
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan!");
            loadData();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}

private void btnCetak1ActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        String[] headers = {"Nama Aset", "Nama Pengguna", "Jenis Transaksi", "Jumlah", "Tanggal"};
        String filename = "laporan_transaksi_" + System.currentTimeMillis() + ".pdf";
        PDFGenerator.generatePDF("Laporan Transaksi Aset", headers, jTable2, filename);
        JOptionPane.showMessageDialog(this, "PDF berhasil dibuat: " + filename);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error membuat PDF: " + e.getMessage());
    }
}

private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
    int row = jTable2.getSelectedRow();
    if (row != -1) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int clickedId = Integer.parseInt(model.getValueAt(row, 0).toString());
        
        if (isEditing && clickedId == selectedId) {
            clearForm();
            isEditing = false;
            selectedId = -1;
            updateButtonStates(false);
        } else {
            selectedId = clickedId;
            cbaset.setSelectedItem(model.getValueAt(row, 1).toString());
            cbpengguna.setSelectedItem(model.getValueAt(row, 2).toString());
            cbjenis.setSelectedItem(model.getValueAt(row, 3).toString());
            txtjumlah.setText(model.getValueAt(row, 4).toString());
            // Note: tanggal_transaksi is auto-generated
            isEditing = true;
            updateButtonStates(true);
        }
    }
}

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenu3ActionPerformed

    }// GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        Aset pcForm = new Aset(this);
        pcForm.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        Pengguna pelangganForm = new Pengguna(this);
        pelangganForm.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jMenu2MouseClicked

    private void loadData() {
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);
    model.setColumnIdentifiers(new String[] { 
        "ID", "Nama Aset", "Nama Pengguna", "Jenis Transaksi", "Jumlah", "Tanggal" 
    });

    try (Connection conn = KoneksiDB.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "SELECT t.*, a.nama_aset, p.nama_pengguna FROM tbl_transaksi_aset t " +
                    "JOIN tbl_aset a ON t.id_aset = a.id_aset " +
                    "JOIN tbl_pengguna p ON t.id_pengguna = p.id_pengguna")) {

        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getInt("id_transaksi"),
                rs.getString("nama_aset"),
                rs.getString("nama_pengguna"),
                rs.getString("jenis_transaksi"),
                rs.getInt("jumlah_transaksi"),
                rs.getTimestamp("tanggal_transaksi")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    // Hide ID column
    jTable2.getColumnModel().getColumn(0).setMinWidth(0);
    jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
    jTable2.getColumnModel().getColumn(0).setWidth(0);
}

private void loadComboBoxes() {
    try (Connection conn = KoneksiDB.getConnection()) {
        // Load Pengguna
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_pengguna");
        cbpengguna.removeAllItems();
        while (rs.next()) {
            cbpengguna.addItem(rs.getString("nama_pengguna"));
        }

        // Load Aset
        rs = stmt.executeQuery("SELECT * FROM tbl_aset");
        cbaset.removeAllItems();
        while (rs.next()) {
            cbaset.addItem(rs.getString("nama_aset"));
        }

        // Load Jenis Transaksi
        cbjenis.removeAllItems();
        for (JenisTransaksi jenis : JenisTransaksi.values()) {
            cbjenis.addItem(jenis.getValue());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}

    private void clearForm() {
        cbpengguna.setSelectedIndex(0);
        cbaset.setSelectedIndex(0);
        cbjenis.setSelectedIndex(0);
        txtjumlah.setText("");
        updateButtonStates(false);
    }

    private void updateButtonStates(boolean isEditMode) {
        btnTambah3.setEnabled(!isEditMode);
        btnUbah1.setEnabled(isEditMode);
        btnHapus1.setEnabled(isEditMode);
    }

    public void refreshComboBoxes() {
        loadComboBoxes();
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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari1;
    private javax.swing.JButton btnCetak1;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnTambah3;
    private javax.swing.JButton btnUbah1;
    private javax.swing.JComboBox<String> cbaset;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JComboBox<String> cbpengguna;
    private javax.swing.JPanel input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel table;
    private javax.swing.JTextField txtjumlah;
    // End of variables declaration//GEN-END:variables
}
