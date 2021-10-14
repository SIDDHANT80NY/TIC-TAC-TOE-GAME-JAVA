
import java.awt.Color;
import static java.time.Clock.system;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class XOXO extends javax.swing.JFrame {
    private Object JOptionPanel;
    private Object system;
    private String startgame ="x";
    private int xCount = 0;
    private int oCount = 0;
    

    /**
     * Creates new form XOXO
     */
    public XOXO() {
        initComponents();
    }
private void choose_a_player()
{
    if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
}
private void winninggame()
{
    String b1 = TXT1.getText();
    String b2 = TXT2.getText();
    String b3 = TXT3.getText();
    
    String b4 = TXT4.getText();
    String b5 = TXT5.getText();
    String b6 = TXT6.getText();
    
    String b7 = TXT7.getText();
    String b8 = TXT8.getText();
    String b9 = TXT9.getText();
    
    
    // player x coding 
    
    if(b1==("x")&& b2==("x")&& b3==("x"))
    {
        TXT1.setBackground(Color.ORANGE);
        TXT2.setBackground(Color.ORANGE);
        TXT3.setBackground(Color.ORANGE);
    }
    else if(b4==("x")&& b5==("x")&& b6==("x"))
    {
        TXT4.setBackground(Color.ORANGE);
        TXT5.setBackground(Color.ORANGE);
        TXT6.setBackground(Color.ORANGE);
    }
    else if(b7==("x")&& b8==("x")&& b9==("x"))
    {
        TXT7.setBackground(Color.ORANGE);
        TXT8.setBackground(Color.ORANGE);
        TXT9.setBackground(Color.ORANGE);
    }
    else if(b1==("x")&& b4==("x")&& b7==("x"))
    {
        TXT1.setBackground(Color.ORANGE);
        TXT4.setBackground(Color.ORANGE);
        TXT7.setBackground(Color.ORANGE);
    }
    else if(b2==("x")&& b5==("x")&& b8==("x"))
    {
        TXT2.setBackground(Color.ORANGE);
        TXT5.setBackground(Color.ORANGE);
        TXT8.setBackground(Color.ORANGE);
    }
    else if(b3==("x")&& b6==("x")&& b9==("x"))
    {
        TXT3.setBackground(Color.ORANGE);
        TXT6.setBackground(Color.ORANGE);
        TXT9.setBackground(Color.ORANGE);
    }
    else if(b1==("x")&& b5==("x")&& b9==("x"))
    {
        TXT1.setBackground(Color.ORANGE);
        TXT5.setBackground(Color.ORANGE);
        TXT9.setBackground(Color.ORANGE);
    }
       else if(b3==("x")&& b5==("x")&& b7==("x"))
    {
        TXT3.setBackground(Color.ORANGE);
        TXT5.setBackground(Color.ORANGE);
        TXT7.setBackground(Color.ORANGE);
    }
     
       
        // player O coding 
    
       else if(b1==("o")&& b2==("o")&& b3==("o"))
    {
        TXT1.setBackground(Color.GREEN);
        TXT2.setBackground(Color.GREEN);
        TXT3.setBackground(Color.GREEN);
    }
       else if(b4==("o")&& b5==("o")&& b6==("o"))
    {
        TXT4.setBackground(Color.GREEN);
        TXT5.setBackground(Color.GREEN);
        TXT6.setBackground(Color.GREEN);
    }
       else if(b7==("o")&& b8==("o")&& b9==("o"))
    {
        TXT7.setBackground(Color.GREEN);
        TXT8.setBackground(Color.GREEN);
        TXT9.setBackground(Color.GREEN);
    }
       else if(b1==("o")&& b4==("o")&& b7==("o"))
    {
        TXT1.setBackground(Color.GREEN);
        TXT4.setBackground(Color.GREEN);
        TXT7.setBackground(Color.GREEN);
    }
       else  if(b2==("o")&& b5==("o")&& b8==("o"))
    {
        TXT2.setBackground(Color.GREEN);
        TXT5.setBackground(Color.GREEN);
        TXT8.setBackground(Color.GREEN);
    }
   else if(b3==("o")&& b6==("o")&& b9==("o"))
    {
        TXT3.setBackground(Color.GREEN);
        TXT6.setBackground(Color.GREEN);
        TXT9.setBackground(Color.GREEN);
    }
      else  if(b1==("o")&& b5==("o")&& b9==("o"))
    {
        TXT1.setBackground(Color.GREEN);
        TXT5.setBackground(Color.GREEN);
        TXT9.setBackground(Color.GREEN);
    }
      else  if(b3==("o")&& b5==("o")&& b7==("o"))
    {
        TXT3.setBackground(Color.GREEN);
        TXT5.setBackground(Color.GREEN);
        TXT7.setBackground(Color.GREEN);
    }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TXT7 = new javax.swing.JButton();
        TXT1 = new javax.swing.JButton();
        TXT2 = new javax.swing.JButton();
        TXT4 = new javax.swing.JButton();
        TXT8 = new javax.swing.JButton();
        TXT3 = new javax.swing.JButton();
        TXT6 = new javax.swing.JButton();
        TXT9 = new javax.swing.JButton();
        TXT5 = new javax.swing.JButton();
        jbt = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZZ.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        TXT7.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        TXT7.setForeground(new java.awt.Color(204, 0, 0));
        TXT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT7ActionPerformed(evt);
            }
        });

        TXT1.setBackground(new java.awt.Color(255, 255, 255));
        TXT1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        TXT1.setForeground(new java.awt.Color(204, 0, 0));
        TXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT1ActionPerformed(evt);
            }
        });

        TXT2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        TXT2.setForeground(new java.awt.Color(204, 0, 0));
        TXT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT2ActionPerformed(evt);
            }
        });

        TXT4.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        TXT4.setForeground(new java.awt.Color(204, 0, 0));
        TXT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT4ActionPerformed(evt);
            }
        });

        TXT8.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        TXT8.setForeground(new java.awt.Color(204, 0, 0));
        TXT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT8ActionPerformed(evt);
            }
        });

        TXT3.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        TXT3.setForeground(new java.awt.Color(204, 0, 0));
        TXT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT3ActionPerformed(evt);
            }
        });

        TXT6.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        TXT6.setForeground(new java.awt.Color(204, 0, 0));
        TXT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT6ActionPerformed(evt);
            }
        });

        TXT9.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        TXT9.setForeground(new java.awt.Color(204, 0, 0));
        TXT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT9ActionPerformed(evt);
            }
        });

        TXT5.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        TXT5.setForeground(new java.awt.Color(204, 0, 0));
        TXT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT5ActionPerformed(evt);
            }
        });

        jbt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbt.setText("EXIT");
        jbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton12.setText("RESET");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RULE:-The first player to get 3 marks in a row (up, down, across, or diagonally) is the winner.");

        jLabel4.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("SROY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TXT4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TXT7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(TXT8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
private JFrame frame;
    private void jbtActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
      frame = new JFrame("exit");
      {
          System.exit(0);
      }
    }                                   

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code herE:
        TXT1.setText(null);
        TXT2.setText(null);
        TXT3.setText(null);
          
        TXT4.setText(null);
        TXT5.setText(null);
        TXT6.setText(null);

        TXT7.setText(null);
        TXT8.setText(null);
        TXT9.setText(null);
        
        TXT1.setBackground(Color.LIGHT_GRAY);
        TXT2.setBackground(Color.LIGHT_GRAY);
        TXT3.setBackground(Color.LIGHT_GRAY);
          
        TXT4.setBackground(Color.LIGHT_GRAY);
        TXT5.setBackground(Color.LIGHT_GRAY);
        TXT6.setBackground(Color.LIGHT_GRAY);

        TXT7.setBackground(Color.LIGHT_GRAY);
        TXT8.setBackground(Color.LIGHT_GRAY);
        TXT9.setBackground(Color.LIGHT_GRAY);

    }                                         

    private void TXT1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        TXT1.setText(startgame);
         if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
         winninggame();
    }                                    

    private void TXT2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
              TXT2.setText(startgame);
         if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
         winninggame();
    }                                    

    private void TXT3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
              TXT3.setText(startgame);
         if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
         winninggame();
    }                                    

    private void TXT4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
              TXT4.setText(startgame);
         if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
         winninggame();
    }                                    

    private void TXT5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
              TXT5.setText(startgame);
         if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
         winninggame();
    }                                    

    private void TXT6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
              TXT6.setText(startgame);
         if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
         winninggame();
    }                                    

    private void TXT7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
              TXT7.setText(startgame);
         if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
         winninggame();
    }                                    

    private void TXT8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
              TXT8.setText(startgame);
         if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
         winninggame();
    }                                    

    private void TXT9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
              TXT9.setText(startgame);
         if(startgame.equalsIgnoreCase("x"))
    {
        startgame = "o";
    }
    else
    {
        startgame = "x";
    }
         winninggame();
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
            java.util.logging.Logger.getLogger(XOXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XOXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XOXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XOXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XOXO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton TXT1;
    private javax.swing.JButton TXT2;
    private javax.swing.JButton TXT3;
    private javax.swing.JButton TXT4;
    private javax.swing.JButton TXT5;
    private javax.swing.JButton TXT6;
    private javax.swing.JButton TXT7;
    private javax.swing.JButton TXT8;
    private javax.swing.JButton TXT9;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbt;
    // End of variables declaration                   
}
