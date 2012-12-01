/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import grafo.Vertex;

import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;
import model.IUsuario;

/**
 *
 * @author larissa
 */
public class AmigosNome extends javax.swing.JPanel {
    IUsuario usuario = Principal.getUsuario();
    /**
     * Creates new form AmigosNome
     */
    public AmigosNome() {
        initComponents();
        menu_amigosnome.setFont(menu_amigosinterajo.getFont().deriveFont(Font.BOLD));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        menu_amigos = new javax.swing.JButton();
        menu_amigosnome = new javax.swing.JButton();
        menu_amigosinterajo = new javax.swing.JButton();
        menu_paginas = new javax.swing.JButton();
        menu_paginaspalavra = new javax.swing.JButton();
        menu_paginasrecomendadas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(58, 89, 152));

        jPanel1.setBackground(new java.awt.Color(58, 89, 152));
        jPanel1.setBorder(null);
        jPanel1.setForeground(new java.awt.Color(1, 63, 119));

        menu_amigos.setBackground(new java.awt.Color(255, 255, 255));
        menu_amigos.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        menu_amigos.setForeground(new java.awt.Color(255, 255, 255));
        menu_amigos.setText("Amigos");
        menu_amigos.setBorderPainted(false);
        menu_amigos.setContentAreaFilled(false);
        menu_amigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        menu_amigosnome.setBackground(new java.awt.Color(255, 255, 255));
        menu_amigosnome.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        menu_amigosnome.setForeground(new java.awt.Color(255, 255, 255));
        menu_amigosnome.setText("Buscar por nome");
        menu_amigosnome.setBorderPainted(false);
        menu_amigosnome.setContentAreaFilled(false);
        menu_amigosnome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_amigosnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_amigosnomeActionPerformed(evt);
            }
        });

        menu_amigosinterajo.setBackground(new java.awt.Color(255, 255, 255));
        menu_amigosinterajo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        menu_amigosinterajo.setForeground(new java.awt.Color(255, 255, 255));
        menu_amigosinterajo.setText("Amigos que mais interajo");
        menu_amigosinterajo.setBorderPainted(false);
        menu_amigosinterajo.setContentAreaFilled(false);
        menu_amigosinterajo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_amigosinterajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_amigosinterajoActionPerformed(evt);
            }
        });

        menu_paginas.setBackground(new java.awt.Color(255, 255, 255));
        menu_paginas.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        menu_paginas.setForeground(new java.awt.Color(255, 255, 255));
        menu_paginas.setText("Páginas");
        menu_paginas.setBorderPainted(false);
        menu_paginas.setContentAreaFilled(false);
        menu_paginas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        menu_paginaspalavra.setBackground(new java.awt.Color(255, 255, 255));
        menu_paginaspalavra.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        menu_paginaspalavra.setForeground(new java.awt.Color(255, 255, 255));
        menu_paginaspalavra.setText("Buscar por palavra-chave");
        menu_paginaspalavra.setBorderPainted(false);
        menu_paginaspalavra.setContentAreaFilled(false);
        menu_paginaspalavra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_paginaspalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_paginaspalavraActionPerformed(evt);
            }
        });

        menu_paginasrecomendadas.setBackground(new java.awt.Color(255, 255, 255));
        menu_paginasrecomendadas.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        menu_paginasrecomendadas.setForeground(new java.awt.Color(255, 255, 255));
        menu_paginasrecomendadas.setText("Páginas recomendadas para mim");
        menu_paginasrecomendadas.setBorderPainted(false);
        menu_paginasrecomendadas.setContentAreaFilled(false);
        menu_paginasrecomendadas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_paginasrecomendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_paginasrecomendadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_amigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_paginas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_paginaspalavra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_amigosinterajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_amigosnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_paginasrecomendadas))
                .addContainerGap())
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu_amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_amigosnome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_amigosinterajo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu_paginas)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_paginaspalavra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_paginasrecomendadas)
                .addGap(57, 57, 57))
        );

        jPanel2.setBackground(new java.awt.Color(58, 89, 152));
        jPanel2.setBorder(null);

        jLabel2.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite o nome:");

        jLabel3.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecione o nome do amigo abaixo para ver detalhes");

        buscar.setBackground(new java.awt.Color(1, 63, 119));
        buscar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					buscarActionPerformed(evt);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (VerticeJaExisteException e) {
					e.printStackTrace();
				} catch (ParDeVerticesNaoExistenteException e) {
					e.printStackTrace();
				}
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}                
                
            },
            new String [] {
                "Nome", "Link"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jLabel3))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(58, 89, 152));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");

        jLabel1.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar amigos por nome");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menu_amigosnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_amigosnomeActionPerformed
        Principal.AmigosNome();
    }//GEN-LAST:event_menu_amigosnomeActionPerformed

    private void menu_amigosinterajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_amigosinterajoActionPerformed
        Principal.AmigosInterajo();
    }//GEN-LAST:event_menu_amigosinterajoActionPerformed

    private void menu_paginaspalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_paginaspalavraActionPerformed
        Principal.PaginaPalavraChave();
    }//GEN-LAST:event_menu_paginaspalavraActionPerformed

    private void menu_paginasrecomendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_paginasrecomendadasActionPerformed
        Principal.PaginasRecomendadas();
    }//GEN-LAST:event_menu_paginasrecomendadasActionPerformed
    
    private void preencherTabela(List<Vertex> listaAmigos) {

        limparTabela();
        if (listaAmigos.isEmpty()) {
           JOptionPane.showMessageDialog(this, "Nenhum nome encontrado!");
        } else {
            for (int i=0; i< listaAmigos.size(); i++) {
                    jTable1.setValueAt(listaAmigos.get(i).getName(), i, 0);
                    jTable1.setValueAt("www.facebook.com/" + listaAmigos.get(i).getId(), i, 1);
            }
        }
    }

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException, VerticeJaExisteException, ParDeVerticesNaoExistenteException {//GEN-FIRST:event_buscarActionPerformed
        if (nome.getText().equals("")) {
        } else {
            preencherTabela(usuario.buscarAmigos(nome.getText())); 
        }
    }//GEN-LAST:event_buscarActionPerformed
    
        
    private void limparTabela() {
        for (int i=0; i<jTable1.getRowCount(); i++) {
            jTable1.setValueAt("", i, 0);
            jTable1.setValueAt("", i, 1);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton menu_amigos;
    private javax.swing.JButton menu_amigosinterajo;
    private javax.swing.JButton menu_amigosnome;
    private javax.swing.JButton menu_paginas;
    private javax.swing.JButton menu_paginaspalavra;
    private javax.swing.JButton menu_paginasrecomendadas;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}