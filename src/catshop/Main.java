package catshop;

import configuracao.Configuracao;
import escolheranimal.EscolherAnimal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcielli
 */
public class Main extends javax.swing.JFrame implements ActionListener{ 

    private String qntClicks;
    private int count = 0;
    private int i;
    private String numAle;
    private final String message = "Deseja Jogar?";
    private final String title = "CatShop";
    
    private double valor = 0.00;
    private final double real = 1.00;
    private final double centavo = 0.01;
    
    private final double valorCompraAutoClick = 0.50; //?
    private double compra;
    private double cents1, cents2, cents3, cents4, cents5, cents6, cents7, cents8, cents9, cents10;
    private double somaDinheiro;
    
    Random gerarNumClicks = new Random(); 
    
    public Main() {
        
        initComponents();

        jButtonClicks.addActionListener(this);        
        
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null, "Boa Sorte!");
                        int aleatorioNum0 = gerarNumClicks.nextInt(10)+10;  
                        jLabelObjetivoJogo.setText(""+aleatorioNum0);
                       // numAle = Integer.toString(aleatorioNum0);
                        jLabelNivel.setText("1");  
                        jLabelQntDinheiro.setText(""+valor);
                        jLabelMsgPodeComprar.setText("Compra trancada!");
                        jLabelMsgPodeComprar.setForeground(Color.red);
                        
        } else {
            
            JOptionPane.showMessageDialog(null, "Tchau.");
            System.exit(0);
            
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {         
        
        boolean statusBtn=false;
        
        if(e.getSource() == jButtonClicks) {
            
            //Nível 1            
            if(statusBtn = true) {
            
                count+=1;

                qntClicks = Integer.toString(count);
                
                jLabelClicks.setText(qntClicks);
             
                int objJogo = Integer.parseInt(""+jLabelObjetivoJogo.getText());      
                
                DecimalFormat decimal = new DecimalFormat( "0.00" );
                
               for(i=0; i<10; i++) {

                   //tava aqui

                switch (jLabelNivel.getText()) {
                    
                    case "0":       //Nível 1
                           //Está sendo iniciado no Construtor
                    break;
                    
                    case "1":    //Nível 2
                        int objJogo1 = Integer.parseInt(""+jLabelObjetivoJogo.getText());    
                        int aleatorioNum1 = gerarNumClicks.nextInt(objJogo1)+(objJogo1+20);                     
                        if(objJogo1 - count == 0) {
                            
                            double objJogo1Double = Integer.parseInt(""+jLabelObjetivoJogo.getText()); 
                            
                            cents1 = objJogo1Double/100;
                            somaDinheiro = valor + cents1;
                                                           
                            jLabelObjetivoJogo.setText(""+aleatorioNum1);
                            jLabelNivel.setText("2");
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro));   
                            
                        }
                    break;
                    
                    case "2":      //Nível 3
                        int objJogo2 = Integer.parseInt(""+jLabelObjetivoJogo.getText());                     
                        int aleatorioNum2 = gerarNumClicks.nextInt(objJogo2)+(objJogo2+30);
                        if(objJogo2 - count == 0) {
                            
                            double objJogo2Double = Integer.parseInt(""+jLabelObjetivoJogo.getText()); 
                            
                            cents2 = objJogo2Double / 100; 
                            somaDinheiro = somaDinheiro + cents2;
                                            
                            jLabelObjetivoJogo.setText(""+aleatorioNum2);
                            jLabelNivel.setText("3");
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro)); 
                            
                            
                        }
                    break;
                    
                    case "3":    //Nível 4                    
                        int objJogo3 = Integer.parseInt(""+jLabelObjetivoJogo.getText());                     
                        int aleatorioNum3 = gerarNumClicks.nextInt(objJogo3)+(objJogo3+40);                        
                        if(objJogo3 - count == 0) {
                            
                        double objJogo3Double = Integer.parseInt(""+jLabelObjetivoJogo.getText());  
                        
                            cents3 = objJogo3Double/100;
                            somaDinheiro = somaDinheiro + cents3;
                             
                            jLabelObjetivoJogo.setText(""+aleatorioNum3);
                            jLabelNivel.setText("4");
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro));  
                            
                        }
                    break;
                    
                    case "4":    //Nível 5                   
                        int objJogo4 = Integer.parseInt(""+jLabelObjetivoJogo.getText());                     
                        int aleatorioNum4 = gerarNumClicks.nextInt(objJogo4)+(objJogo4+50); 
                        if(objJogo4 - count == 0) {
                            
                            double objJogo4Double = Integer.parseInt(""+jLabelObjetivoJogo.getText());  
                            
                            cents4 = objJogo4Double / 100;
                            somaDinheiro = somaDinheiro + cents4;
                                                              
                            jLabelObjetivoJogo.setText(""+aleatorioNum4);
                            jLabelNivel.setText("5");
                        
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro));  
                            
                        }
                    break;
                    
                    case "5":    //Nível 6                   
                        int objJogo5 = Integer.parseInt(""+jLabelObjetivoJogo.getText());                     
                        int aleatorioNum5 = gerarNumClicks.nextInt(objJogo5)+(objJogo5+60); 
                        if(objJogo5 - count == 0) {

                            double objJogo5Double = Integer.parseInt(""+jLabelObjetivoJogo.getText()); 
                            
                            cents5 = objJogo5Double / 100;
                            somaDinheiro = somaDinheiro + cents5;
                                                      
                            jLabelObjetivoJogo.setText(""+aleatorioNum5);
                            jLabelNivel.setText("6");
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro));
                            
                        }
                    break;
                    
                    case "6":    //Nível 7                  
                        int objJogo6 = Integer.parseInt(""+jLabelObjetivoJogo.getText());                     
                        int aleatorioNum6 = gerarNumClicks.nextInt(objJogo6)+(objJogo6+70);  
                        if(objJogo6 - count == 0) {
 
                            double objJogo6Double = Integer.parseInt(""+jLabelObjetivoJogo.getText());
                            
                            cents6 = objJogo6Double / 100;
                            somaDinheiro = somaDinheiro + cents6;
                                                     
                            jLabelObjetivoJogo.setText(""+aleatorioNum6);
                            jLabelNivel.setText("7");
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro));
                            
                        }
                    break;
                    
                    case "7":    //Nível 8                    
                        int objJogo7 = Integer.parseInt(""+jLabelObjetivoJogo.getText());                     
                        int aleatorioNum7 = gerarNumClicks.nextInt(objJogo7)+(objJogo7+80);
                        if(objJogo7 - count == 0) {
                     
                            double objJogo7Double = Integer.parseInt(""+jLabelObjetivoJogo.getText()); 
                            
                            cents7 = objJogo7Double / 100;
                            somaDinheiro = somaDinheiro + cents7;    
                                                                                 
                            jLabelObjetivoJogo.setText(""+aleatorioNum7);
                            jLabelNivel.setText("8");
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro));
                            
                        }
                    break;
                    
                    case "8":    //Nível 9                    
                        int objJogo8 = Integer.parseInt(""+jLabelObjetivoJogo.getText());                     
                        int aleatorioNum8 = gerarNumClicks.nextInt(objJogo8)+(objJogo8+90);
                        if(objJogo8 - count == 0) {
                            
                            double objJogo8Double = Integer.parseInt(""+jLabelObjetivoJogo.getText());  
                            
                            cents8 = objJogo8Double / 100;
                            somaDinheiro = somaDinheiro + cents8;    
                                                     
                            jLabelObjetivoJogo.setText(""+aleatorioNum8);
                            jLabelNivel.setText("9");
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro));
                            
                        }
                    break;
                    
                    case "9":    //Nível 10                        
                        int objJogo9 = Integer.parseInt(""+jLabelObjetivoJogo.getText());                     
                        int aleatorioNum9 = gerarNumClicks.nextInt(objJogo9)+objJogo9+100; 
                        if(objJogo9 - count == 0) {
                
                            double objJogo9Double = Integer.parseInt(""+jLabelObjetivoJogo.getText()); 
                            
                            cents9 = objJogo9Double / 100;
                            somaDinheiro = somaDinheiro + cents9;    
                                                    
                            jLabelObjetivoJogo.setText(""+aleatorioNum9);
                            jLabelNivel.setText("10");
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro));
                            
                        }
                    break;
                  
                    case "10":    //Nível 11                   
                        int objJogo10 = Integer.parseInt(""+jLabelObjetivoJogo.getText());                     
                        int aleatorioNum10 = gerarNumClicks.nextInt(objJogo10)+(objJogo10+110);
                        if(objJogo10 - count == 0) {
                
                            double objJogo10Double = Integer.parseInt(""+jLabelObjetivoJogo.getText());
                            
                            cents10 = objJogo10Double / 100;
                            somaDinheiro = somaDinheiro + cents10;    
                                                    
                            jLabelObjetivoJogo.setText(""+aleatorioNum10);
                            jLabelNivel.setText("11");
                            
                            jLabelQntDinheiro.setText(""+decimal.format(somaDinheiro));
                            
                        }
                    break;
                    
                }
                
               }                
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
        jPanelDinheiro = new javax.swing.JPanel();
        jLabelDinheiro = new javax.swing.JLabel();
        jSeparatorDinheiro = new javax.swing.JSeparator();
        jLabelQntDinheiroRS = new javax.swing.JLabel();
        jLabelQntDinheiro = new javax.swing.JLabel();
        jButtonConfiguracao = new javax.swing.JButton();
        jButtonEditeSeuAnimal = new javax.swing.JButton();
        jPanelDinheiro1 = new javax.swing.JPanel();
        jLabelDinheiro1 = new javax.swing.JLabel();
        jLabelMsgPodeComprar = new javax.swing.JLabel();
        jSeparatorDinheiro1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButtonSalvarJogo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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
        jLabelFases.setText("Fases (Reais)");

        jLabelNivel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNivel.setForeground(new java.awt.Color(0, 0, 255));
        jLabelNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNivel.setText("0");

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
                        .addGap(0, 12, Short.MAX_VALUE)))
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
        jLabelObjetivo.setText("Objetivo (Centavos)");

        jLabelObjetivoJogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelObjetivoJogo.setForeground(new java.awt.Color(0, 0, 255));
        jLabelObjetivoJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObjetivoJogo.setText("0");

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

        jPanelDinheiro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDinheiro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));

        jLabelDinheiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDinheiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDinheiro.setText("Dinheiro");

        jLabelQntDinheiroRS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelQntDinheiroRS.setForeground(new java.awt.Color(0, 0, 255));
        jLabelQntDinheiroRS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelQntDinheiroRS.setText("R$");

        jLabelQntDinheiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelQntDinheiro.setForeground(new java.awt.Color(0, 0, 255));
        jLabelQntDinheiro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanelDinheiroLayout = new javax.swing.GroupLayout(jPanelDinheiro);
        jPanelDinheiro.setLayout(jPanelDinheiroLayout);
        jPanelDinheiroLayout.setHorizontalGroup(
            jPanelDinheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDinheiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDinheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDinheiroLayout.createSequentialGroup()
                        .addComponent(jLabelDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelDinheiroLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelDinheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDinheiroLayout.createSequentialGroup()
                                .addComponent(jLabelQntDinheiroRS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelQntDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparatorDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelDinheiroLayout.setVerticalGroup(
            jPanelDinheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDinheiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDinheiro)
                .addGap(1, 1, 1)
                .addComponent(jSeparatorDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDinheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQntDinheiroRS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQntDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanelDinheiro1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDinheiro1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));

        jLabelDinheiro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDinheiro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDinheiro1.setText("Comprar");

        jLabelMsgPodeComprar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMsgPodeComprar.setForeground(new java.awt.Color(0, 0, 255));
        jLabelMsgPodeComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("AutoClick");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDinheiro1Layout = new javax.swing.GroupLayout(jPanelDinheiro1);
        jPanelDinheiro1.setLayout(jPanelDinheiro1Layout);
        jPanelDinheiro1Layout.setHorizontalGroup(
            jPanelDinheiro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDinheiro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDinheiro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDinheiro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDinheiro1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelDinheiro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMsgPodeComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jSeparatorDinheiro1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDinheiro1Layout.setVerticalGroup(
            jPanelDinheiro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDinheiro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDinheiro1)
                .addGap(1, 1, 1)
                .addComponent(jSeparatorDinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMsgPodeComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonSalvarJogo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvarJogo.setForeground(new java.awt.Color(0, 0, 255));
        jButtonSalvarJogo.setText("Salvar Jogo");
        jButtonSalvarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarJogoActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Regra do Jogo");

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelMeowClicks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelObjetivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConfiguracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClicks, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditeSeuAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDinheiro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvarJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jPanelDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jPanelDinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalvarJogo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        setSize(new java.awt.Dimension(826, 562));
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

    private void jButtonSalvarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarJogoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       double qntDinheiro = Double.parseDouble(jLabelQntDinheiro.getText());
       
       if(qntDinheiro > 0.50) {
       
       compra = qntDinheiro - 0.50;
        
        String atualizarQntDinheiro = String.valueOf(compra);
        jLabelQntDinheiro.setText(atualizarQntDinheiro);
       
       } else {
       
       JOptionPane.showMessageDialog(null, "Espertinho, tentando comprar sem ter dinheiro?");
       JOptionPane.showMessageDialog(null, "Clique mais um pouquinho até ter dinheiro suficiente para comprar!");
        
       }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButtonClicks;
    private javax.swing.JButton jButtonConfiguracao;
    private javax.swing.JButton jButtonEditeSeuAnimal;
    private javax.swing.JButton jButtonSalvarJogo;
    private javax.swing.JLabel jLabelClicks;
    private javax.swing.JLabel jLabelDinheiro;
    private javax.swing.JLabel jLabelDinheiro1;
    private javax.swing.JLabel jLabelFases;
    private javax.swing.JLabel jLabelMeowClicks;
    private javax.swing.JLabel jLabelMsgPodeComprar;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelObjetivo;
    private javax.swing.JLabel jLabelObjetivoJogo;
    private javax.swing.JLabel jLabelQntDinheiro;
    private javax.swing.JLabel jLabelQntDinheiroRS;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelDinheiro;
    private javax.swing.JPanel jPanelDinheiro1;
    private javax.swing.JPanel jPanelFases;
    private javax.swing.JPanel jPanelMeowClicks;
    private javax.swing.JPanel jPanelObjetivo;
    private javax.swing.JSeparator jSeparatorDinheiro;
    private javax.swing.JSeparator jSeparatorDinheiro1;
    private javax.swing.JSeparator jSeparatorFases;
    private javax.swing.JSeparator jSeparatorMeowClicks;
    private javax.swing.JSeparator jSeparatorObjetivo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
      
    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * @return the arredondarValor
     */

}
