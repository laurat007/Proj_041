/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hakathon;

/**
 *
 * @author florence
 */
public class HappyFinal extends javax.swing.JFrame {

    /**
     * Creates new form HappyFinal
     */
    public HappyFinal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/if_sport_badges-12_2064034.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 60, 128, 128);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/if_sport_badges-11_2064035.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(730, 70, 128, 128);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/if_sport_badges-10_2064036.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(730, 240, 128, 128);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/if_sport_badges-09_2064037.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 420, 128, 128);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/if_sport_badges-06_2064040.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(740, 420, 128, 128);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/if_sport_badges-03_2064079.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1100, 260, 128, 128);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/if_sport_badges-05_2064041.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 240, 128, 128);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(746, 521, 0, 0);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HappyFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HappyFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HappyFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HappyFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HappyFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
