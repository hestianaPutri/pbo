package guiwithjava;

public class GuiWithJava extends javax.swing.JFrame {

    public GuiWithJava() {
        initComponents();
    }

    private void initComponents() {

        txtAngka1 = new javax.swing.JTextField();
        txtAngka2 = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        labelHasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator Sederhana");

        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnKali.setText("*");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnMod.setText("mod");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        labelHasil.setText("Hasil: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKurang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBagi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMod))
                    .addComponent(txtAngka1)
                    .addComponent(txtAngka2)
                    .addComponent(labelHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnKurang)
                    .addComponent(btnKali)
                    .addComponent(btnBagi)
                    .addComponent(btnMod))
                .addGap(18, 18, 18)
                .addComponent(labelHasil)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double angka1 = Double.parseDouble(txtAngka1.getText());
            double angka2 = Double.parseDouble(txtAngka2.getText());
            double hasil = angka1 + angka2;
            labelHasil.setText("Hasil: " + hasil);
        } catch (NumberFormatException e) {
            labelHasil.setText("Input tidak valid");
        }
    }

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double angka1 = Double.parseDouble(txtAngka1.getText());
            double angka2 = Double.parseDouble(txtAngka2.getText());
            double hasil = angka1 - angka2;
            labelHasil.setText("Hasil: " + hasil);
        } catch (NumberFormatException e) {
            labelHasil.setText("Input tidak valid");
        }
    }

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double angka1 = Double.parseDouble(txtAngka1.getText());
            double angka2 = Double.parseDouble(txtAngka2.getText());
            double hasil = angka1 * angka2;
            labelHasil.setText("Hasil: " + hasil);
        } catch (NumberFormatException e) {
            labelHasil.setText("Input tidak valid");
        }
    }

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double angka1 = Double.parseDouble(txtAngka1.getText());
            double angka2 = Double.parseDouble(txtAngka2.getText());
            double hasil = angka1 / angka2;
            labelHasil.setText("Hasil: " + hasil);
        } catch (NumberFormatException e) {
            labelHasil.setText("Input tidak valid");
        } catch (ArithmeticException e) {
            labelHasil.setText("Tidak dapat dibagi dengan nol");
        }
    }

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double angka1 = Double.parseDouble(txtAngka1.getText());
            double angka2 = Double.parseDouble(txtAngka2.getText());
            double hasil = angka1 % angka2;
            labelHasil.setText("Hasil: " + hasil);
        } catch (NumberFormatException e) {
            labelHasil.setText("Input tidak valid");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiWithJava().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnMod;
    private javax.swing.JLabel labelHasil;
    private javax.swing.JTextField txtAngka1;
    private javax.swing.JTextField txtAngka2;
}
