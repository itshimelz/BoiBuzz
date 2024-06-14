package components;

import javax.swing.ImageIcon;
import model.BookModel;
import swing.ScrollBar;

public class HomePanel extends javax.swing.JPanel {

    public HomePanel() {
        initComponents();
        init();
        slideshow1.initSlideshow(new SlideImagePanel(), new SlideImagePanel2());
    }

    public void init() {
        publicationScrollPane.setVerticalScrollBar(new ScrollBar());
    }

    public void testData() {
        int ID = 1;
        for (int i = 0; i <= 5; i++) {
            addBook(new BookModel(ID++, "Ammar Ache Jal", "Humayun Ahmed", "Test", 160, new ImageIcon(getClass().getResource("/icons/Eliot.jpg"))));
        }
    }

    public void addBook(BookModel data) {
        Item item = new Item();
        item.setData(data);
        publicationPanel.add(item);
        repaint();
        revalidate();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        scrollBar1 = new swing.ScrollBar();
        slideshow1 = new slideshow.Slideshow();
        publicationsLabel = new javax.swing.JLabel();
        publicationScrollPane = new javax.swing.JScrollPane();
        publicationPanel = new javax.swing.JPanel();
        item2 = new components.Item();
        item3 = new components.Item();
        item1 = new components.Item();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(scrollBar1);

        publicationsLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        publicationsLabel.setForeground(new java.awt.Color(51, 51, 51));
        publicationsLabel.setText("PUBLICATIONS");

        publicationScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        publicationScrollPane.setBorder(null);
        publicationScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        publicationScrollPane.setOpaque(false);

        publicationPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout publicationPanelLayout = new javax.swing.GroupLayout(publicationPanel);
        publicationPanel.setLayout(publicationPanelLayout);
        publicationPanelLayout.setHorizontalGroup(
            publicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(publicationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        publicationPanelLayout.setVerticalGroup(
            publicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, publicationPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(publicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        publicationScrollPane.setViewportView(publicationPanel);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("BOOKS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slideshow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(publicationScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(publicationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(publicationsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(publicationScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.Item item1;
    private components.Item item2;
    private components.Item item3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel publicationPanel;
    private javax.swing.JScrollPane publicationScrollPane;
    private javax.swing.JLabel publicationsLabel;
    private swing.ScrollBar scrollBar1;
    private slideshow.Slideshow slideshow1;
    // End of variables declaration//GEN-END:variables

}
