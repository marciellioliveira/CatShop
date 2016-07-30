package catshop;

import configuracao.Configuracao;
import escolheranimal.EscolherAnimal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marcielli
 */
public class Main extends javax.swing.JFrame implements ActionListener{ //1


    /**
     * Creates new form Main
     */
    
    private String qntClicks;
    private int count = 0;
    private int i;
    
    
    
    
    public Main() {
        
        initComponents();

        jButtonClicks.addActionListener(this); //2        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) { //3        
        
        boolean statusBtn=false;
        
        if(e.getSource() == jButtonClicks) {
            
            //Nível 1
            
            if(statusBtn = true) {
            
                count+=1;

                qntClicks = Integer.toString(count);

                jLabelClicks.setText(qntClicks);
                                
            }                       
            
            switch (count) {
                case 50:
                    jLabelNivel.setText("2");
                    jLabelObjetivoJogoStatus.setText("50");
                    break;
                case 100:
                    jLabelNivel.setText("3");
                    jLabelObjetivoJogoStatus.setText("100");
                    break;
                case 150:
                    jLabelNivel.setText("4");
                    jLabelObjetivoJogoStatus.setText("150");
                    break;
                case 200:
                    jLabelNivel.setText("5");
                    jLabelObjetivoJogoStatus.setText("200");
                    break;
                case  250:
                    jLabelNivel.setText("6");
                    jLabelObjetivoJogoStatus.setText("250");
                    break;
                case 300:
                    jLabelNivel.setText("7");
                    jLabelObjetivoJogoStatus.setText("300");
                    break;
                case 350:
                    jLabelNivel.setText("8");
                    jLabelObjetivoJogoStatus.setText("350");
                    break;
                case 400:
                    jLabelNivel.setText("9");
                    jLabelObjetivoJogoStatus.setText("400");
                    break;
                case 450:
                    jLabelNivel.setText("10");
                    jLabelObjetivoJogoStatus.setText("450");
                    break;
                case 500:
                    jLabelNivel.setText("11");
                    jLabelObjetivoJogoStatus.setText("500");
                    break;
                default:
                    break;
            }
                        
        } 
                      
    }
   
   
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jButtonClicks = new javax.swing.JButton();
        jPanelMeowClicks = new javax.swing.JPanel();
        jLabelMeowClicks = new javax.swing.JLabel();
        jLabelClicks = new javax.swing.JLabel();
        jSeparatorMeowClicks = new javax.swing.JSeparator();
        jPanelFases = new javax.swing.JPanel();
        jLabelFases = new javax.swing.JLabel();
        jLabelNivel = new javax.swing.JLabel();
        jSeparatorFases = new javax.swing.JSeparator();
        jPanelObjetivo = new javax.swing.JPanel();
        jLabelObjetivo = new javax.swing.JLabel();
        jLabelObjetivoJogo = new javax.swing.JLabel();
        jSeparatorObjetivo = new javax.swing.JSeparator();
        jPanelObjetivoStatus = new javax.swing.JPanel();
        jLabelObjetivoStatus = new javax.swing.JLabel();
        jLabelObjetivoJogoStatus = new javax.swing.JLabel();
        jSeparatorObjetivoStatus = new javax.swing.JSeparator();
        jButtonConfiguracao = new javax.swing.JButton();
        jButtonEditeSeuAnimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBackground.setBackground(new java.awt.Color(255, 255, 255));

        jButtonClicks.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClicks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/images.png"))); // NOI18N
        jButtonClicks.setBorder(null);
        jButtonClicks.setBorderPainted(false);
        jButtonClicks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClicksMouseClicked(evt);
            }
        });
        jButtonClicks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClicksActionPerformed(evt);
            }
        });

        jPanelMeowClicks.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMeowClicks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));

        jLabelMeowClicks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMeowClicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMeowClicks.setText("Meow Clicks");

        jLabelClicks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelClicks.setForeground(new java.awt.Color(0, 0, 255));
        jLabelClicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClicks.setText("0");

        javax.swing.GroupLayout jPanelMeowClicksLayout = new javax.swing.GroupLayout(jPanelMeowClicks);
        jPanelMeowClicks.setLayout(jPanelMeowClicksLayout);
        jPanelMeowClicksLayout.setHorizontalGroup(
            jPanelMeowClicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeowClicksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMeowClicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMeowClicks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMeowClicksLayout.createSequentialGroup()
                        .addGroup(jPanelMeowClicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelMeowClicksLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jSeparatorMeowClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelClicks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMeowClicksLayout.setVerticalGroup(
            jPanelMeowClicksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeowClicksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMeowClicks)
                .addGap(1, 1, 1)
                .addComponent(jSeparatorMeowClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelFases.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFases.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));

        jLabelFases.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFases.setText("Fases");

        jLabelNivel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNivel.setForeground(new java.awt.Color(0, 0, 255));
        jLabelNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNivel.setText("1");

        javax.swing.GroupLayout jPanelFasesLayout = new javax.swing.GroupLayout(jPanelFases);
        jPanelFases.setLayout(jPanelFasesLayout);
        jPanelFasesLayout.setHorizontalGroup(
            jPanelFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFasesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelFasesLayout.createSequentialGroup()
                        .addGroup(jPanelFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelFasesLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jSeparatorFases, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFasesLayout.setVerticalGroup(
            jPanelFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFasesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFases)
                .addGap(1, 1, 1)
                .addComponent(jSeparatorFases, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelObjetivo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelObjetivo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));

        jLabelObjetivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObjetivo.setText("Objetivo");

        jLabelObjetivoJogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelObjetivoJogo.setForeground(new java.awt.Color(0, 0, 255));
        jLabelObjetivoJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObjetivoJogo.setText("+50 Clicks");

        javax.swing.GroupLayout jPanelObjetivoLayout = new javax.swing.GroupLayout(jPanelObjetivo);
        jPanelObjetivo.setLayout(jPanelObjetivoLayout);
        jPanelObjetivoLayout.setHorizontalGroup(
            jPanelObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObjetivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObjetivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelObjetivoLayout.createSequentialGroup()
                        .addGroup(jPanelObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelObjetivoLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jSeparatorObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelObjetivoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelObjetivoLayout.setVerticalGroup(
            jPanelObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObjetivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelObjetivo)
                .addGap(1, 1, 1)
                .addComponent(jSeparatorObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelObjetivoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelObjetivoStatus.setBackground(new java.awt.Color(255, 255, 255));
        jPanelObjetivoStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));

        jLabelObjetivoStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelObjetivoStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObjetivoStatus.setText("Objetivo Status");

        jLabelObjetivoJogoStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelObjetivoJogoStatus.setForeground(new java.awt.Color(0, 0, 255));
        jLabelObjetivoJogoStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObjetivoJogoStatus.setText("0");

        javax.swing.GroupLayout jPanelObjetivoStatusLayout = new javax.swing.GroupLayout(jPanelObjetivoStatus);
        jPanelObjetivoStatus.setLayout(jPanelObjetivoStatusLayout);
        jPanelObjetivoStatusLayout.setHorizontalGroup(
            jPanelObjetivoStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObjetivoStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelObjetivoStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObjetivoStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelObjetivoStatusLayout.createSequentialGroup()
                        .addGroup(jPanelObjetivoStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelObjetivoStatusLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jSeparatorObjetivoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelObjetivoJogoStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelObjetivoStatusLayout.setVerticalGroup(
            jPanelObjetivoStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObjetivoStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelObjetivoStatus)
                .addGap(1, 1, 1)
                .addComponent(jSeparatorObjetivoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelObjetivoJogoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonConfiguracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonConfiguracao.setForeground(new java.awt.Color(0, 0, 255));
        jButtonConfiguracao.setText("Configuração");
        jButtonConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfiguracaoActionPerformed(evt);
            }
        });

        jButtonEditeSeuAnimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEditeSeuAnimal.setForeground(new java.awt.Color(0, 0, 255));
        jButtonEditeSeuAnimal.setText("Edite seu Animal");
        jButtonEditeSeuAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditeSeuAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelMeowClicks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfiguracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClicks, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelObjetivoStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditeSeuAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelMeowClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelFases, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelObjetivoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonConfiguracao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonEditeSeuAnimal, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButtonClicks, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(822, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonClicksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClicksActionPerformed
        
            

    }//GEN-LAST:event_jButtonClicksActionPerformed


    private void jButtonClicksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClicksMouseClicked


    }//GEN-LAST:event_jButtonClicksMouseClicked

    private void jButtonConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfiguracaoActionPerformed
        Configuracao config = new Configuracao();
        config.setVisible(true);
        
    }//GEN-LAST:event_jButtonConfiguracaoActionPerformed

    private void jButtonEditeSeuAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditeSeuAnimalActionPerformed
        EscolherAnimal escAnimal = new EscolherAnimal();
        escAnimal.setVisible(true);
    }//GEN-LAST:event_jButtonEditeSeuAnimalActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonClicks;
    private javax.swing.JButton jButtonConfiguracao;
    private javax.swing.JButton jButtonEditeSeuAnimal;
    private javax.swing.JLabel jLabelClicks;
    private javax.swing.JLabel jLabelFases;
    private javax.swing.JLabel jLabelMeowClicks;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelObjetivo;
    private javax.swing.JLabel jLabelObjetivoJogo;
    private javax.swing.JLabel jLabelObjetivoJogoStatus;
    private javax.swing.JLabel jLabelObjetivoStatus;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelFases;
    private javax.swing.JPanel jPanelMeowClicks;
    private javax.swing.JPanel jPanelObjetivo;
    private javax.swing.JPanel jPanelObjetivoStatus;
    private javax.swing.JSeparator jSeparatorFases;
    private javax.swing.JSeparator jSeparatorMeowClicks;
    private javax.swing.JSeparator jSeparatorObjetivo;
    private javax.swing.JSeparator jSeparatorObjetivoStatus;
    // End of variables declaration//GEN-END:variables

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


}