package ProyCrote3;

import java.awt.Color;

public class CalculadoraFrame extends javax.swing.JFrame {
    
    private double num1, num2;
    
    CalculadoraClass calculadora = new CalculadoraClass(num1, num2);
    
    private String signo;
    
    public CalculadoraFrame() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        calculadora = new CalculadoraClass();
        
        calculadora.setNum1(num1);
        calculadora.setNum2(num2);
        
    }
    
    boolean cambioColorS = false;
    boolean cambioColorR = false;
    boolean cambioColorM = false;
    boolean cambioColorD = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSiete = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultip = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSiete.setBackground(new java.awt.Color(204, 204, 255));
        btnSiete.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnCero.setBackground(new java.awt.Color(204, 204, 255));
        btnCero.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnSuma.setBackground(new java.awt.Color(255, 159, 10));
        btnSuma.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(255, 159, 10));
        btnResta.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnResta.setText("-");
        btnResta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultip.setBackground(new java.awt.Color(255, 159, 10));
        btnMultip.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnMultip.setText("*");
        btnMultip.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMultip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultipActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(255, 159, 10));
        btnDiv.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnBorrar.setText("C");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnUno.setBackground(new java.awt.Color(204, 204, 255));
        btnUno.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setBackground(new java.awt.Color(204, 204, 255));
        btnDos.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(204, 204, 255));
        btnTres.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(new java.awt.Color(204, 204, 255));
        btnCuatro.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(204, 204, 255));
        btnCinco.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(204, 204, 255));
        btnSeis.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnOcho.setBackground(new java.awt.Color(204, 204, 255));
        btnOcho.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setBackground(new java.awt.Color(204, 204, 255));
        btnNueve.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResultado)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSiete, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnUno, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMultip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMultip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed

        txtResultado.setText(txtResultado.getText() + "7");
        
        if (cambioColorS || cambioColorR || cambioColorM || cambioColorD){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            btnResta.setBackground(new Color(255, 159, 10));
            btnMultip.setBackground(new Color(255, 159, 10));
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed

        txtResultado.setText(txtResultado.getText() + "0");
        
        if (cambioColorS || cambioColorR || cambioColorM || cambioColorD){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            btnResta.setBackground(new Color(255, 159, 10));
            btnMultip.setBackground(new Color(255, 159, 10));
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed

        num1 = Double.parseDouble(txtResultado.getText());

        signo = "+";
        
        btnSuma.setBackground(new Color(255, 205,127));
        cambioColorS = true;

        txtResultado.setText("");

    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed

        num1 = Double.parseDouble(txtResultado.getText());

        signo = "-";
        
        btnResta.setBackground(new Color(255, 205,127));
        cambioColorR = true;

        txtResultado.setText("");

    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultipActionPerformed

        num1 = Double.parseDouble(txtResultado.getText());

        signo = "*";
        
        btnMultip.setBackground(new Color(255, 205,127));
        cambioColorM = true;

        txtResultado.setText("");

    }//GEN-LAST:event_btnMultipActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed

        num1 = Double.parseDouble(txtResultado.getText());

        signo = "/";
        
        btnDiv.setBackground(new Color(255, 205,127));
        cambioColorD = true;

        txtResultado.setText("");

    }//GEN-LAST:event_btnDivActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed

        num2 = Double.parseDouble(txtResultado.getText());
        
        if (cambioColorS){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorR){
            
            btnResta.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorM){
            
            btnMultip.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorD){
            
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

        switch(signo){

            case "+":
                
                txtResultado.setText(Double.toString(calculadora.suma(num1, num2)));
                
                break;

            case "-":
                
                txtResultado.setText(Double.toString(calculadora.resta(num1, num2)));
                
                break;

            case "*":
                
                txtResultado.setText(Double.toString(calculadora.multiplicacion(num1, num2)));
            
                break;

            case "/":
                
                txtResultado.setText(Double.toString(calculadora.division(num1, num2)));
                
                break;

        }

    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        if (calculadora != null) {
            
            txtResultado.setText("");
            this.calculadora.setNum1(0);
            this.calculadora.setNum2(0);
            
        }
        
        if (cambioColorS || cambioColorR || cambioColorM || cambioColorD){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            btnResta.setBackground(new Color(255, 159, 10));
            btnMultip.setBackground(new Color(255, 159, 10));
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed

        txtResultado.setText(txtResultado.getText() + "1");
        
        if (cambioColorS){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorR){
            
            btnResta.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorM){
            
            btnMultip.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorD){
            
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed

        txtResultado.setText(txtResultado.getText() + "2");
        
        if (cambioColorS){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorR){
            
            btnResta.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorM){
            
            btnMultip.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorD){
            
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed

        txtResultado.setText(txtResultado.getText() + "3");
        
        if (cambioColorS){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorR){
            
            btnResta.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorM){
            
            btnMultip.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorD){
            
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed

        txtResultado.setText(txtResultado.getText() + "4");
        
        if (cambioColorS){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorR){
            
            btnResta.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorM){
            
            btnMultip.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorD){
            
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed

        txtResultado.setText(txtResultado.getText() + "5");
        
        if (cambioColorS){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorR){
            
            btnResta.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorM){
            
            btnMultip.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorD){
            
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed

        txtResultado.setText(txtResultado.getText() + "6");
        
        if (cambioColorS){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorR){
            
            btnResta.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorM){
            
            btnMultip.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorD){
            
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed

        txtResultado.setText(txtResultado.getText() + "8");
        
        if (cambioColorS){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorR){
            
            btnResta.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorM){
            
            btnMultip.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorD){
            
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed

        txtResultado.setText(txtResultado.getText() + "9");
        
        if (cambioColorS){
            
            btnSuma.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorR){
            
            btnResta.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorM){
            
            btnMultip.setBackground(new Color(255, 159, 10));
            
        }
        
        if (cambioColorD){
            
            btnDiv.setBackground(new Color(255, 159, 10));
            
        }

    }//GEN-LAST:event_btnNueveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultip;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}