/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.interfaz;

import com.mallas.negocio.UsuarioNegocio;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.ICONIFIED;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author samsung
 */
public class InicioSesion extends javax.swing.JFrame {

    
    String usuario, clave;
    UsuarioNegocio userN;

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() throws Exception{
        initComponents();
        userN = new UsuarioNegocio();
        super.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/com/mallas/imagenes/Desktop Icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabelIngresar = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jLabelForgot = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(8, 102, 198));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelIngresar.setBackground(new java.awt.Color(8, 102, 198));
        jLabelIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIngresar.setText("Ingresar");
        jLabelIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelIngresar.setOpaque(true);
        jLabelIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIngresarMouseClicked(evt);
            }
        });

        jLabelSalir.setBackground(new java.awt.Color(8, 102, 198));
        jLabelSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSalir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalir.setText("Salir");
        jLabelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalir.setOpaque(true);
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });

        jLabelForgot.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelForgot.setForeground(new java.awt.Color(51, 51, 255));
        jLabelForgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelForgot.setText("¿Olvidaste tu contraseña?");
        jLabelForgot.setToolTipText("");
        jLabelForgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelForgot.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabelForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelForgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelForgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelForgotMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(8, 102, 198));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicio de Sesión");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUsuario)
                    .addComponent(jLabelForgot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtClave))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelForgot)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mallas/imagenes/logo.png"))); // NOI18N

        jLabelCerrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrar.setText("x");
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseExited(evt);
            }
        });

        jLabelMinimizar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelMinimizar.setForeground(new java.awt.Color(204, 204, 204));
        jLabelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimizar.setText("_");
        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCerrar)
                        .addComponent(jLabelMinimizar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cerrar la aplicación?", "Salir", JOptionPane.YES_NO_OPTION);

        if (JOptionPane.YES_OPTION == confirmar) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cerrar la aplicación?", "Salir", JOptionPane.YES_NO_OPTION);

        if (JOptionPane.YES_OPTION == confirmar) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jLabelForgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForgotMouseEntered

        Font font = jLabelForgot.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLabelForgot.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_jLabelForgotMouseEntered

    private void jLabelForgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForgotMouseExited
        Font font = jLabelForgot.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE);
        jLabelForgot.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_jLabelForgotMouseExited

    private void jLabelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseEntered
        jLabelCerrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelCerrarMouseEntered

    private void jLabelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseExited
        jLabelCerrar.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_jLabelCerrarMouseExited

    private void jLabelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseEntered
        jLabelMinimizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelMinimizarMouseEntered

    private void jLabelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseExited
        jLabelMinimizar.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_jLabelMinimizarMouseExited

    private void jLabelIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIngresarMouseClicked

        boolean valido = validarCampos();
        String userValido;

        /**
         *Se válida el usuario a ingresar */
        if (valido) {
            userValido = userN.verificarUsuario(usuario, clave);
            if (!userValido.equals("none")) {
                if ("Administrador".equals(userValido)) {
                    try {
                        this.dispose();
                        MenuPrincipal mp = new MenuPrincipal();
                        mp.setVisible(true);
                    } catch (Exception ex) {
                        Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    this.dispose();
                    MenuPrincipalE mpe = new MenuPrincipalE();
                    mpe.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario y/o la clave esta errada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jLabelIngresarMouseClicked

    private void jLabelForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForgotMouseClicked
        try {
            PassRecovery pr = new PassRecovery();
            this.dispose();
            pr.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelForgotMouseClicked

    public boolean validarCampos() {

        boolean resp = true;

        usuario = txtUsuario.getText();
        clave = txtClave.getText();
       
        /**
         *Se realizan las validaciones de los campos de texto*/
        
        if ((usuario.trim().length() == 0) && (clave.trim().length() == 0)) {            
            JOptionPane.showMessageDialog(this, "Porfavor ingrese el Usuario y Clave", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
            resp = false;
            return resp;

        }

        if (usuario.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el Usuario", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
            resp = false;
            return resp;
        }

        if (clave.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese la Clave", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
            resp = false;
            return resp;
        }

        return resp;
    }

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InicioSesion().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelForgot;
    private javax.swing.JLabel jLabelIngresar;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
