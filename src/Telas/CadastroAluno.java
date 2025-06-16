package Telas;

import Classes.Aluno;
import Controller.ControllerAluno;
import javax.swing.JOptionPane;

public class CadastroAluno extends javax.swing.JFrame {

    ControllerAluno ca = new ControllerAluno();

    public CadastroAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngpSexoAluno = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfdNomeAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdRAAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFeminino = new javax.swing.JRadioButton();
        btnVerCadastros = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 450));

        jLabel1.setText("Nome");

        jLabel2.setText("RA");

        jLabel3.setText("Sexo");

        btngpSexoAluno.add(rbtnMasculino);
        rbtnMasculino.setText("Masculino");

        btngpSexoAluno.add(rbtnFeminino);
        rbtnFeminino.setText("Feminino");

        btnVerCadastros.setText("Ver cadastros");
        btnVerCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCadastrosActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setText("Cadastrar Aluno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerCadastros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(tfdRAAluno)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnFeminino)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdRAAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtnMasculino)
                    .addComponent(rbtnFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVerCadastros)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Aluno aluno = new Aluno();

        String raTxt = tfdRAAluno.getText();
        String nome = tfdNomeAluno.getText();
        String sexo = "";
        int ra = Integer.parseInt(raTxt);
        
        if (rbtnMasculino.isSelected()) {
            sexo = "Masculino";
        }
        if (rbtnFeminino.isSelected()) {
            sexo = "Feminino";
        }

        if (nome.isEmpty() || raTxt.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome e RA são obrigatórios");
            return;
        }

        if (!nome.matches("[A-Za-zÀ-ÿ ]+")) {
            JOptionPane.showMessageDialog(null, "O nome não pode conter números ou caracteres especiais!");
            return;
        }
        if (!raTxt.matches("\\d{7}")) {
            JOptionPane.showMessageDialog(null, "RA deve conter exatamente 7 dígitos numéricos!");
            return;
        }
        
        if (rbtnMasculino.isSelected()) {
            sexo = "Masculino";
        } else if (rbtnFeminino.isSelected()) {
            sexo = "Feminino";
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione o sexo do aluno!");
            return;
        }
        
        aluno.setNome(nome);
        aluno.setRA(ra);
        aluno.setSexo(sexo);
        
        
        if (ca.save(aluno)) {
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!!!");

            tfdNomeAluno.setText("");
            tfdRAAluno.setText("");
            btngpSexoAluno.clearSelection();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVerCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCadastrosActionPerformed
        VerAlunos va  = new VerAlunos(null, true, ca);
        va.setLocationRelativeTo(this);
        va.setVisible(true);
    }//GEN-LAST:event_btnVerCadastrosActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        EditarAluno ea = new EditarAluno(this, true, ca);
        ea.setLocationRelativeTo(this);
        ea.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirAluno ea = new ExcluirAluno(this, true, ca);
        ea.setLocationRelativeTo(this);
        ea.setVisible(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Menu m = new Menu();
        m.setLocationRelativeTo(this);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVerCadastros;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup btngpSexoAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbtnFeminino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField tfdNomeAluno;
    private javax.swing.JTextField tfdRAAluno;
    // End of variables declaration//GEN-END:variables
}
