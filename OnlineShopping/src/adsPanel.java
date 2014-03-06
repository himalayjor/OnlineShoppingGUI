
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;


public class adsPanel extends javax.swing.JPanel {

    
    Image img2;
    
    public adsPanel() {
        initComponents();
        
	ClassLoader cldr = this.getClass().getClassLoader();

	URL imageURL   = cldr.getResource("images/yourAdHere.jpg");
	
        ImageIcon ic = new ImageIcon(imageURL);
        img2 = ic.getImage();
        
        Dimension d = new Dimension(img2.getWidth(null), img2.getHeight(null));
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(img2, 0, 0, this);
    }
    
    ImageIcon img[] = new ImageIcon[20];
  
    final void load(){
        img[0] = new ImageIcon(getClass().getResource("/images/dell.jpg"));
        img[1] = new ImageIcon(getClass().getResource("/images/add.jpg")); 
        img[2] = new ImageIcon(getClass().getResource("/images/tshirt.jpg")); 
        img[2] = new ImageIcon(getClass().getResource("/images/apple.jpg")); 
        img[4] = new ImageIcon(getClass().getResource("/images/leno.jpg")); 
        img[5] = new ImageIcon(getClass().getResource("/images/puma.jpg"));
        img[6] = new ImageIcon(getClass().getResource("/images/reebok.jpg")); 
        img[7] = new ImageIcon(getClass().getResource("/images/hp.jpg")); 
        img[8] = new ImageIcon(getClass().getResource("/images/soney.jpg")); 
        img[9] = new ImageIcon(getClass().getResource("/images/htc.jpg")); 
        img[10] = new ImageIcon(getClass().getResource("/images/nokia.jpg")); 
        img[11] = new ImageIcon(getClass().getResource("/images/micro.jpg"));
    }
    
  void changeImage(){
      load();
      changeImage2();
  }  
   
    private void changeImage2(){
        load();
        Thread t;
       
        t = new Thread(){
         @Override
        public void run(){
            while(true){
                    for(int j = 0; j < img.length; j++){
                        jLabel1.setIcon(img[j]);

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            System.out.println(ex);
                        }
                    }
            }
        }
      };
        t.start();
    }  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
