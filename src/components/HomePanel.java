package components;

import event.EventBook;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import model.BookModel;
import swing.ScrollBar;

public class HomePanel extends javax.swing.JPanel {

    public HomePanel() {
        initComponents();
        slideshow1.initSlideshow(new SlideImagePanel(), new SlideImagePanel2());
    }

    public void init() {
        publicationScrollPane.setHorizontalScrollBar(new ScrollBar());
//        testData();
    }
    
//    private void testData() {
//        int ID = 1;
//        for (int i = 0; i <= 5; i++) {
//            publicationPanel.addBook(new BookModel(ID++, "Ammar Ache Jal", "Humayun Ahmed", "Test", 160, new ImageIcon(getClass().getResource("/icons/Eliot.jpg"))));
//        }
//    }
//
//    private EventBook event;
//
//    public void addBook(BookModel data) {
//        Item item = new Item();
//        item.setData(data);
//        item.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent me) {
//                if (SwingUtilities.isLeftMouseButton(me)) {
//                    event.itemClick(item, data);
//                }
//            }
//        });
//        publicationPanel.add(item);
//        publicationPanel.repaint();
//        publicationPanel.revalidate();
//    }

    

    

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
                .addContainerGap(685, Short.MAX_VALUE))
        );
        publicationPanelLayout.setVerticalGroup(
            publicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, publicationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(publicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        publicationScrollPane.setViewportView(publicationPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(slideshow1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(0, 0, 0)
                            .addComponent(publicationScrollPane)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(publicationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.Item item2;
    private components.Item item3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel publicationPanel;
    private javax.swing.JScrollPane publicationScrollPane;
    private javax.swing.JLabel publicationsLabel;
    private swing.ScrollBar scrollBar1;
    private slideshow.Slideshow slideshow1;
    // End of variables declaration//GEN-END:variables

    public void addBook(BookModel bookModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
