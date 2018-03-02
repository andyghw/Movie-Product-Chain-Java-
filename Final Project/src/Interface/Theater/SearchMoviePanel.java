/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Theater;

import Business.EcoSystem;
import com.google.gson.JsonIOException;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JPanel;
import com.google.gson.JsonParser;
import java.io.FileReader;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author andyg
 */
public class SearchMoviePanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchMoviePanel
     */
    private JPanel card;
    private EcoSystem business;
    public SearchMoviePanel(JPanel card,EcoSystem business) {
        initComponents();
        this.card=card;
        this.business=business;
    }
    
   public static String loadJSON(String url) {
         StringBuilder json = new StringBuilder();
        try {
             URL oracle = new URL(url);
             URLConnection yc = oracle.openConnection();
             BufferedReader in = new BufferedReader(new InputStreamReader(
                     yc.getInputStream(),"utf-8"));//防止乱码
             String inputLine = null;
             while ((inputLine = in.readLine()) != null) {
                 json.append(inputLine);
             }
             in.close();
         } catch (MalformedURLException e) {
         } catch (IOException e) {
         }
         return json.toString();
     }
   
   public String parseJson(String j){
       JsonParser parse =new JsonParser();
       try {
            JsonObject json=(JsonObject) parse.parse(j);  //创建jsonObject对象
            titleText.setText(json.get("Title").getAsString());
            directorText.setText(json.get("Director").getAsString());     
            actorText.setText(json.get("Actors").getAsString());
            ratingText.setText(String.valueOf(json.get("imdbRating").getAsDouble()));
            runtimeText.setText(json.get("Runtime").getAsString());
            String postURL=json.get("Poster").getAsString();
            return postURL;
        } catch (JsonIOException e) {
            e.printStackTrace();
            return null;
        } 
   }
   
   public void showPoster(String postURL){
        try {
             
                    URL url = new URL(postURL);
                    BufferedImage image = ImageIO.read(url);
                    posterLabel.setIcon(new ImageIcon(image));
                } catch (Exception exp) {
                    exp.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        backButton5 = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        directorText = new javax.swing.JTextField();
        ratingText = new javax.swing.JTextField();
        actorText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        runtimeText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        posterLabel = new javax.swing.JLabel();

        jPanel1 = new JPanel (){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Image img=Toolkit.getDefaultToolkit().getImage("theater.png");
                g.drawImage(img, 0, 0, this.getParent().getWidth(), this.getParent().getHeight(), this);
            }
        };

        backButton5.setBackground(new java.awt.Color(153, 153, 153));
        backButton5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        backButton5.setText("< Back");
        backButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton5ActionPerformed(evt);
            }
        });

        searchText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        searchButton.setBackground(new java.awt.Color(153, 153, 153));
        searchButton.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Title Keywords");

        titleText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        titleText.setEnabled(false);

        directorText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        directorText.setEnabled(false);

        ratingText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        ratingText.setEnabled(false);

        actorText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        actorText.setEnabled(false);
        actorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actorTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Movie Information");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Runtime");

        runtimeText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        runtimeText.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Director");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Actors");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("imdbRating");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel1.setText("Title");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(searchButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(runtimeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(ratingText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(actorText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(directorText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(titleText, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(posterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton5)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(directorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(actorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ratingText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(runtimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(posterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton5ActionPerformed
        card.remove(this);
        CardLayout layout=(CardLayout)card.getLayout();
        layout.previous(card);
        // TODO add your handling code here:
    }//GEN-LAST:event_backButton5ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String middleURL=searchText.getText().replace(" ", "+");
        if(middleURL == ""||middleURL ==null||middleURL.length()==0){
            JOptionPane.showMessageDialog(null, "No Consequence!");
        }
        else{
        String url="http://www.omdbapi.com/?t="+middleURL+"&apikey=fc13c95d";
        String json = loadJSON(url);
        String postURL=parseJson(json);
        showPoster(postURL);
        }

        
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void actorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actorTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actorText;
    private javax.swing.JButton backButton5;
    private javax.swing.JTextField directorText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel posterLabel;
    private javax.swing.JTextField ratingText;
    private javax.swing.JTextField runtimeText;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JTextField titleText;
    // End of variables declaration//GEN-END:variables
}
