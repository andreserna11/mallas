/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.interfaz;

import com.mallas.entidades.EntUsuario;
import com.mallas.negocio.UsuarioNegocio;
import java.awt.Color;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author samsung
 */
public class PassRecovery extends javax.swing.JFrame {

    /**
     * Creates new form PassRecovery
     */
    UsuarioNegocio userN = new UsuarioNegocio();
    EntUsuario userE = new EntUsuario();

    public PassRecovery() throws Exception{
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelEnviar = new javax.swing.JLabel();
        jLabelAtras = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(8, 102, 198));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(464, 556));

        jPanel1.setBackground(new java.awt.Color(8, 102, 198));
        jPanel1.setPreferredSize(new java.awt.Dimension(464, 556));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mallas/imagenes/logo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Correo Electronico:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("¡Es sencillo! Solo escribe el correo electronico y presiona Enviar");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 102, 198));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recuperar Contraseña");

        jLabelEnviar.setBackground(new java.awt.Color(8, 102, 198));
        jLabelEnviar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEnviar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEnviar.setText("Enviar");
        jLabelEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEnviar.setOpaque(true);
        jLabelEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEnviarMouseClicked(evt);
            }
        });

        jLabelAtras.setBackground(new java.awt.Color(8, 102, 198));
        jLabelAtras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelAtras.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtras.setText("Atras");
        jLabelAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAtras.setOpaque(true);
        jLabelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabelEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(102, 102, 102)
                .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCerrar)
                        .addComponent(jLabelMinimizar)))
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
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

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseEntered
        jLabelMinimizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelMinimizarMouseEntered

    private void jLabelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseExited
        jLabelMinimizar.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_jLabelMinimizarMouseExited

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cerrar la aplicación?", "Salir", JOptionPane.YES_NO_OPTION);

        if (JOptionPane.YES_OPTION == confirmar) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jLabelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseEntered
        jLabelCerrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelCerrarMouseEntered

    private void jLabelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseExited
        jLabelCerrar.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_jLabelCerrarMouseExited

    private void jLabelAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAtrasMouseClicked
        try {
            InicioSesion is = new InicioSesion();
            this.dispose();
            is.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(PassRecovery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelAtrasMouseClicked

    private void jLabelEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEnviarMouseClicked
        String email = txtCorreo.getText();

        if (enviarContraseña(email)) {
            JOptionPane.showMessageDialog(this, "¡Mensaje enviado satisfactoriamente! Porfavor revise el correo electronico", "Enviado con éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error en el envío de la contraseña, porfavor vuelva a intentarlo", "Error de envío", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jLabelEnviarMouseClicked

    public boolean enviarContraseña(String email) {

        final String from = "mallasguardianmed@hotmail.com";
        final String pass = "golito";
        final String subject = "Recuperación de Contraseña - Mallas Guardián";
        String clave = "", user = "", name = "", lastName = "", mail = "", rol = "", estado = "";

        Properties props = new Properties();
        props = System.getProperties();

        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.live.com");
        props.put("mail.smtp.port", "25");

        try {

            if (txtCorreo.getText().trim().length() > 0) {
                userE = userN.buscarCorreoEnt(email);
                if (userE != null) {
                    user = userE.getUsuario();
                    clave = userE.getClave();
                    name = userE.getNombre();
                    lastName = userE.getApellido();
                    mail = userE.getCorreo();
                    rol = userE.getRol();
                    estado = userE.getEstado();
                } else {
                    JOptionPane.showMessageDialog(this, "El Correo no esta registrado con ninguna cuenta de usuario", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Porfavor ingrese el Correo electronico", "Error de Envío", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Session session1 = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, pass);
                }
            });

            Message message = new MimeMessage(session1);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(email));
            message.setSubject(subject);
            message.setText("Estos son tus datos de usuario, esperamos que no se te vuelvan a olvidar. \n \n" +
                    "- Nombre de Usuario: " + user + "\n" + "- Clave: " + clave + "\n" + "- Nombre: " + name + "\n" + "- Apellidos: " + lastName
                    + "\n" + "- Correo Registrado: " + mail + "\n" + "- Perfil: " + rol + "\n" + "- Estado de la cuenta: " + estado + "\n \n" +
                    "Gracias por utilizar el Centro de Control Administrativo Mallas Guardián, ¡Buen día!");

            Transport.send(message);
            return true;
        } catch (MessagingException e) {
            return false;
        }

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
            java.util.logging.Logger.getLogger(PassRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PassRecovery().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(PassRecovery.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAtras;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelEnviar;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
