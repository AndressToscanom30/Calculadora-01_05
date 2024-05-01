
import javax.swing.JOptionPane;

public class TriquiTraqui extends javax.swing.JFrame {

    public TriquiTraqui() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    boolean jugador1 = true;
    boolean jugador2 = false;
    
    boolean uno = false;
    boolean dos = false;
    boolean tres = false;
    boolean cuatro = false;
    boolean cinco = false;
    boolean seis = false;
    boolean siete = false;
    boolean ocho = false;
    boolean nueve = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jl5 = new javax.swing.JLabel();
        jl6 = new javax.swing.JLabel();
        jl7 = new javax.swing.JLabel();
        jl8 = new javax.swing.JLabel();
        jl9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 220));

        jl1.setBackground(new java.awt.Color(255, 255, 255));
        jl1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl1.setForeground(new java.awt.Color(51, 51, 51));
        jl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl1.setMaximumSize(new java.awt.Dimension(55, 55));
        jl1.setMinimumSize(new java.awt.Dimension(55, 55));
        jl1.setOpaque(true);
        jl1.setPreferredSize(new java.awt.Dimension(55, 55));
        jl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl1MousePressed(evt);
            }
        });

        jl2.setBackground(new java.awt.Color(255, 255, 255));
        jl2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl2.setForeground(new java.awt.Color(51, 51, 51));
        jl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2.setMaximumSize(new java.awt.Dimension(55, 55));
        jl2.setMinimumSize(new java.awt.Dimension(55, 55));
        jl2.setOpaque(true);
        jl2.setPreferredSize(new java.awt.Dimension(55, 55));
        jl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl2MousePressed(evt);
            }
        });

        jl3.setBackground(new java.awt.Color(255, 255, 255));
        jl3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl3.setForeground(new java.awt.Color(51, 51, 51));
        jl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl3.setMaximumSize(new java.awt.Dimension(55, 55));
        jl3.setMinimumSize(new java.awt.Dimension(55, 55));
        jl3.setOpaque(true);
        jl3.setPreferredSize(new java.awt.Dimension(55, 55));
        jl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl3MousePressed(evt);
            }
        });

        jl4.setBackground(new java.awt.Color(255, 255, 255));
        jl4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl4.setForeground(new java.awt.Color(51, 51, 51));
        jl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl4.setMaximumSize(new java.awt.Dimension(55, 55));
        jl4.setMinimumSize(new java.awt.Dimension(55, 55));
        jl4.setOpaque(true);
        jl4.setPreferredSize(new java.awt.Dimension(55, 55));
        jl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl4MousePressed(evt);
            }
        });

        jl5.setBackground(new java.awt.Color(255, 255, 255));
        jl5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl5.setForeground(new java.awt.Color(51, 51, 51));
        jl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl5.setMaximumSize(new java.awt.Dimension(55, 55));
        jl5.setMinimumSize(new java.awt.Dimension(55, 55));
        jl5.setOpaque(true);
        jl5.setPreferredSize(new java.awt.Dimension(55, 55));
        jl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl5MousePressed(evt);
            }
        });

        jl6.setBackground(new java.awt.Color(255, 255, 255));
        jl6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl6.setForeground(new java.awt.Color(51, 51, 51));
        jl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl6.setMaximumSize(new java.awt.Dimension(55, 55));
        jl6.setMinimumSize(new java.awt.Dimension(55, 55));
        jl6.setOpaque(true);
        jl6.setPreferredSize(new java.awt.Dimension(55, 55));
        jl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl6MousePressed(evt);
            }
        });

        jl7.setBackground(new java.awt.Color(255, 255, 255));
        jl7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl7.setForeground(new java.awt.Color(51, 51, 51));
        jl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl7.setMaximumSize(new java.awt.Dimension(55, 55));
        jl7.setMinimumSize(new java.awt.Dimension(55, 55));
        jl7.setOpaque(true);
        jl7.setPreferredSize(new java.awt.Dimension(55, 55));
        jl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl7MousePressed(evt);
            }
        });

        jl8.setBackground(new java.awt.Color(255, 255, 255));
        jl8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl8.setForeground(new java.awt.Color(51, 51, 51));
        jl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl8.setMaximumSize(new java.awt.Dimension(55, 55));
        jl8.setMinimumSize(new java.awt.Dimension(55, 55));
        jl8.setOpaque(true);
        jl8.setPreferredSize(new java.awt.Dimension(55, 55));
        jl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl8MousePressed(evt);
            }
        });

        jl9.setBackground(new java.awt.Color(255, 255, 255));
        jl9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl9.setForeground(new java.awt.Color(51, 51, 51));
        jl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl9.setMaximumSize(new java.awt.Dimension(55, 55));
        jl9.setMinimumSize(new java.awt.Dimension(55, 55));
        jl9.setOpaque(true);
        jl9.setPreferredSize(new java.awt.Dimension(55, 55));
        jl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl1MousePressed

        if (!uno){
            
            uno = true;
            
            if (jugador1){
            
                jl1.setText("X");
                jugador1 = false;
                jugador2 = true;
            
            }

            else if (jugador2){

                jl1.setText("O");
                jugador2 = false;
                jugador1 = true;

            }
            
        }
        
        hayGanador();
        verificarFinJuego();

    }//GEN-LAST:event_jl1MousePressed

    private void jl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl2MousePressed

        if (!dos){
            
            dos = true;
            
            if (jugador1){
            
                jl2.setText("X");
                jugador1 = false;
                jugador2 = true;
            
            }

            else if (jugador2){

                jl2.setText("O");
                jugador2 = false;
                jugador1 = true;

            }
            
        }
        
        hayGanador();
        verificarFinJuego();

    }//GEN-LAST:event_jl2MousePressed

    private void jl3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl3MousePressed

        if (!tres){
            
            tres = true;
            
            if (jugador1){
            
                jl3.setText("X");
                jugador1 = false;
                jugador2 = true;
            
            }

            else if (jugador2){

                jl3.setText("O");
                jugador2 = false;
                jugador1 = true;

            }
            
        }
        
        hayGanador();
        verificarFinJuego();

    }//GEN-LAST:event_jl3MousePressed

    private void jl4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl4MousePressed

        if (!cuatro){
            
            cuatro = true;
            
            if (jugador1){
            
                jl4.setText("X");
                jugador1 = false;
                jugador2 = true;
            
            }

            else if (jugador2){

                jl4.setText("O");
                jugador2 = false;
                jugador1 = true;

            }
            
        }
        
        hayGanador();
        verificarFinJuego();

    }//GEN-LAST:event_jl4MousePressed

    private void jl5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl5MousePressed

        if (!cinco){
            
            cinco = true;
            
            if (jugador1){
            
                jl5.setText("X");
                jugador1 = false;
                jugador2 = true;
            
            }

            else if (jugador2){

                jl5.setText("O");
                jugador2 = false;
                jugador1 = true;

            }
            
        }
        
        hayGanador();
        verificarFinJuego();

    }//GEN-LAST:event_jl5MousePressed

    private void jl6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl6MousePressed

        if (!seis){
            
            seis = true;
            
            if (jugador1){
            
                jl6.setText("X");
                jugador1 = false;
                jugador2 = true;
            
            }

            else if (jugador2){

                jl6.setText("O");
                jugador2 = false;
                jugador1 = true;

            }
            
        }
        
        hayGanador();
        verificarFinJuego();

    }//GEN-LAST:event_jl6MousePressed

    private void jl7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl7MousePressed

        if (!siete){
            
            siete = true;
            
            if (jugador1){
            
                jl7.setText("X");
                jugador1 = false;
                jugador2 = true;
            
            }

            else if (jugador2){

                jl7.setText("O");
                jugador2 = false;
                jugador1 = true;

            }
            
        }
        
        hayGanador();
        verificarFinJuego();

    }//GEN-LAST:event_jl7MousePressed

    private void jl8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl8MousePressed

        if (!ocho){
            
            ocho = true;
            
            if (jugador1){
            
                jl8.setText("X");
                jugador1 = false;
                jugador2 = true;
            
            }

            else if (jugador2){

                jl8.setText("O");
                jugador2 = false;
                jugador1 = true;

            }
            
        }
        
        hayGanador();
        verificarFinJuego();

    }//GEN-LAST:event_jl8MousePressed

    private void jl9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl9MousePressed

        if (!nueve){
            
            nueve = true;
            
            if (jugador1){
            
                jl9.setText("X");
                jugador1 = false;
                jugador2 = true;
            
            }

            else if (jugador2){

                jl9.setText("O");
                jugador2 = false;
                jugador1 = true;

            }
            
        }
        
        hayGanador();
        verificarFinJuego();

    }//GEN-LAST:event_jl9MousePressed

    private boolean finDelJuego() {
        
        return uno && dos && tres && cuatro && cinco && seis && siete && ocho && nueve;
        
    }
    
    private void verificarFinJuego() {
        
        if (finDelJuego()) {
            
            JOptionPane.showMessageDialog(this, "¡El juego ha terminado en empate!", "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
            reiniciarJuego();
            
        }
    }
    
    private void hayGanador() {
        
        if (jl1.getText().equals("X") && jl2.getText().equals("X") && jl3.getText().equals("X") || jl4.getText().equals("X") && jl5.getText().equals("X") && jl6.getText().equals("X") || jl7.getText().equals("X") && jl8.getText().equals("X") && jl9.getText().equals("X")){
            
            JOptionPane.showMessageDialog(this, "¡El jugador 1 ha ganado!", "¡¡Hay ganador!!", JOptionPane.INFORMATION_MESSAGE);
            reiniciarJuego();
            
        }
        
        else if(jl1.getText().equals("X") && jl4.getText().equals("X") && jl7.getText().equals("X") || jl2.getText().equals("X") && jl5.getText().equals("X") && jl8.getText().equals("X") || jl3.getText().equals("X") && jl6.getText().equals("X") && jl9.getText().equals("X")){
            
            JOptionPane.showMessageDialog(this, "¡El jugador 1 ha ganado!", "¡¡Hay ganador!!", JOptionPane.INFORMATION_MESSAGE);
            reiniciarJuego();
            
        }
        
        else if (jl1.getText().equals("X") && jl5.getText().equals("X") && jl9.getText().equals("X") || jl3.getText().equals("X") && jl5.getText().equals("X") && jl7.getText().equals("X")){
            
            JOptionPane.showMessageDialog(this, "¡El jugador 1 ha ganado!", "¡¡Hay ganador!!", JOptionPane.INFORMATION_MESSAGE);
            reiniciarJuego();
            
        }
        
        else if (jl1.getText().equals("O") && jl2.getText().equals("O") && jl3.getText().equals("O") || jl4.getText().equals("O") && jl5.getText().equals("O") && jl6.getText().equals("O") || jl7.getText().equals("O") && jl8.getText().equals("O") && jl9.getText().equals("O")){

            JOptionPane.showMessageDialog(this, "¡El jugador 2 ha ganado!", "¡¡Hay ganador!!", JOptionPane.INFORMATION_MESSAGE);
            reiniciarJuego();

        }

        else if(jl1.getText().equals("O") && jl4.getText().equals("O") && jl7.getText().equals("O") || jl2.getText().equals("O") && jl5.getText().equals("O") && jl8.getText().equals("O") || jl3.getText().equals("O") && jl6.getText().equals("O") && jl9.getText().equals("O")){

            JOptionPane.showMessageDialog(this, "¡El jugador 2 ha ganado!", "¡¡Hay ganador!!", JOptionPane.INFORMATION_MESSAGE);
            reiniciarJuego();

        }

        else if (jl1.getText().equals("O") && jl5.getText().equals("O") && jl9.getText().equals("O") || jl3.getText().equals("O") && jl5.getText().equals("O") && jl7.getText().equals("O")){

            JOptionPane.showMessageDialog(this, "¡El jugador 2 ha ganado!", "¡¡Hay ganador!!", JOptionPane.INFORMATION_MESSAGE);
            reiniciarJuego();

        }
        
    }
    
    private void reiniciarJuego() {
        
        jugador1 = true;
        jugador2 = false;
        uno = false;
        dos = false;
        tres = false;
        cuatro = false;
        cinco = false;
        seis = false;
        siete = false;
        ocho = false;
        nueve = false;
        
        jl1.setText("");
        jl2.setText("");
        jl3.setText("");
        jl4.setText("");
        jl5.setText("");
        jl6.setText("");
        jl7.setText("");
        jl8.setText("");
        jl9.setText("");
        
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriquiTraqui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jl9;
    // End of variables declaration//GEN-END:variables
}