/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.principal;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Calculadora extends javax.swing.JFrame {

    Usuario usuario;
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
    }
    
    public Calculadora(Usuario usuario){
        this();
        this.usuario = usuario;
        lblMostrarNome.
    }
    
    double num1, num2;
    String operador;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtVisor = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        lblMostrarNome = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 20));

        txtVisor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtVisor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVisorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVisorFocusLost(evt);
            }
        });
        txtVisor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVisorKeyTyped(evt);
            }
        });
        jPanel1.add(txtVisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, 100));

        btnLimpar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 270, 40));

        btnAdicao.setBackground(new java.awt.Color(255, 153, 0));
        btnAdicao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAdicao.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicao.setText("+");
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 60, 50));

        btnNum7.setBackground(new java.awt.Color(204, 204, 204));
        btnNum7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum7.setText("7");
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, 50));

        btnNum8.setBackground(new java.awt.Color(204, 204, 204));
        btnNum8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum8.setText("8");
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 60, 50));

        btnNum9.setBackground(new java.awt.Color(204, 204, 204));
        btnNum9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum9.setText("9");
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 60, 50));

        btnDivisao.setBackground(new java.awt.Color(255, 153, 51));
        btnDivisao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDivisao.setForeground(new java.awt.Color(255, 255, 255));
        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 60, 50));

        btnNum4.setBackground(new java.awt.Color(204, 204, 204));
        btnNum4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum4.setText("4");
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 50));

        btnNum5.setBackground(new java.awt.Color(204, 204, 204));
        btnNum5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum5.setText("5");
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 60, 50));

        btnNum6.setBackground(new java.awt.Color(204, 204, 204));
        btnNum6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum6.setText("6");
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 60, 50));

        btnMultiplicacao.setBackground(new java.awt.Color(255, 153, 0));
        btnMultiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacao.setText("*");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 50));

        btnNum1.setBackground(new java.awt.Color(204, 204, 204));
        btnNum1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum1.setText("1");
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 60, 50));

        btnNum2.setBackground(new java.awt.Color(204, 204, 204));
        btnNum2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum2.setText("2");
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 60, 50));

        btnNum3.setBackground(new java.awt.Color(204, 204, 204));
        btnNum3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum3.setText("3");
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 60, 50));

        btnSubtracao.setBackground(new java.awt.Color(255, 153, 0));
        btnSubtracao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        btnSubtracao.setText("-");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubtracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 60, 50));

        btnNum0.setBackground(new java.awt.Color(204, 204, 204));
        btnNum0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum0.setText("0");
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNum0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 60, 50));

        btnPonto.setBackground(new java.awt.Color(204, 204, 204));
        btnPonto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPonto.setText(".");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 60, 50));

        btnIgual.setBackground(new java.awt.Color(255, 153, 0));
        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel1.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 60, 50));
        jPanel1.add(lblMostrarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 220, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtVisor.setText(" ");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        txtVisor.setText(txtVisor.getText()+"8");
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        txtVisor.setText(txtVisor.getText()+"1");
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        JOptionPane.showMessageDialog(null, "Sistema em desenvolvimento, tente novamente mais tarde.");
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        txtVisor.setText(txtVisor.getText()+"2");
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        txtVisor.setText(txtVisor.getText()+"3");
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        txtVisor.setText(txtVisor.getText()+"4");
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        txtVisor.setText(txtVisor.getText()+"5");
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        txtVisor.setText(txtVisor.getText()+"6");
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        txtVisor.setText(txtVisor.getText()+"7");
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        txtVisor.setText(txtVisor.getText()+"9");
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        txtVisor.setText(txtVisor.getText()+"0");
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        num1 = Double.parseDouble(txtVisor.getText());
        operador = "+";
        txtVisor.setText(" ");
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        num1 = Double.parseDouble(txtVisor.getText());
        operador = "+";
        txtVisor.setText(" ");
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        num1 = Double.parseDouble(txtVisor.getText());
        operador = "+";
        txtVisor.setText(" ");
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        num1 = Double.parseDouble(txtVisor.getText());
        operador = "+";
        txtVisor.setText(" ");
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        num2 = Double.parseDouble(txtVisor.getText());
        
        Double resultado = 0.0;
        
        if(operador.equals("+")){
            resultado = num1 + num2;
        }else if(operador.equals("-")){
            resultado = num1 - num2;
        }else if(operador.equals("/")){
            resultado = num1 / num2;
        }else if(operador.equals("*")){
            resultado = num1 * num2;
        }
        
    }//GEN-LAST:event_btnIgualActionPerformed

    private void txtVisorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVisorKeyTyped
        Character c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtVisorKeyTyped

    private void txtVisorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVisorFocusGained
        txtVisor.backgroud(Color.white);
    }//GEN-LAST:event_txtVisorFocusGained

    private void txtVisorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVisorFocusLost
        txtVisor.backgroud(Color.gray);
    }//GEN-LAST:event_txtVisorFocusLost

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMostrarNome;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables
}
