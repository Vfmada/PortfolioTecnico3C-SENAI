
import java.util.Random;
import javafx.scene.control.ButtonBar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vfmad
 */
public class MenuJogos extends javax.swing.JFrame {
    Random gerador = new Random();
    int fichasRestantes;
    
    /**
     * Creates new form MenuJogos
     */
    public MenuJogos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jogo21 = new javax.swing.JButton();
        jogoSomadeDados = new javax.swing.JButton();
        jogoRoleta = new javax.swing.JButton();
        jorgesRestantesLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Jorge's Cassino");

        jogo21.setText("21");
        jogo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogo21ActionPerformed(evt);
            }
        });

        jogoSomadeDados.setText("Soma de Dados");
        jogoSomadeDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogoSomadeDadosActionPerformed(evt);
            }
        });

        jogoRoleta.setText("Roleta");
        jogoRoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogoRoletaActionPerformed(evt);
            }
        });

        jorgesRestantesLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Jorges Restantes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jogo21, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jorgesRestantesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jogoSomadeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jogoRoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jorgesRestantesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jogo21, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogoRoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogoSomadeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jogo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogo21ActionPerformed
        if(fichasRestantes >= 10){
            int jorge_jogadas = 0;
            int jogador_jogadas = 0;
            int jogador_somou = 0;
            int jorge_somou = 0;
            int jogador_carta1 = gerador.nextInt(10)+1;
            int jogador_carta2 = gerador.nextInt(10)+1;
            int jogador_carta3 = gerador.nextInt(10)+1;
            int jorge_carta1 = gerador.nextInt(10)+1;
            int jorge_carta2 = gerador.nextInt(10)+1;
            int jorge_carta3 = gerador.nextInt(10)+1;
            int soma_da_mesa = 0;
            
            int aposta = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos jorges vai apostar: "));
            if(aposta >= 10){
                if(fichasRestantes >= aposta){
                    int jogaprimeiro = gerador.nextInt(2);
                    if(jogaprimeiro == 0){
                        JOptionPane.showMessageDialog(null, "Por sorteio, Jorge joga primeiro");
                        while(soma_da_mesa < 21){
                            JOptionPane.showMessageDialog(null, "Vez do Jorge");
                            int escolhe_carta_descartar = gerador.nextInt(3);
                            if(escolhe_carta_descartar == 0){
                                JOptionPane.showMessageDialog(null, "Jorge adicionou " + jorge_carta1 + " à mesa.");
                                jorge_somou = jorge_carta1;
                                jogador_carta1 = gerador.nextInt(10)+1;
                            }
                            else if(escolhe_carta_descartar == 1){
                                JOptionPane.showMessageDialog(null, "Jorge adicionou " + jorge_carta2 + " à mesa.");
                                jorge_somou = jorge_carta2;
                                jogador_carta2 = gerador.nextInt(10)+1;
                            }
                            else if(escolhe_carta_descartar == 2){
                                JOptionPane.showMessageDialog(null, "Jorge adicionou " + jorge_carta3 + " à mesa.");
                                jorge_somou = jorge_carta3;
                                jogador_carta3 = gerador.nextInt(10)+1;
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Erro.");
                                break;
                            }
                            soma_da_mesa = soma_da_mesa + jorge_somou;
                            jorge_jogadas++;
                            
                            if(soma_da_mesa < 21){
                                JOptionPane.showMessageDialog(null, "Sua vez");
                                jogador_somou = Integer.parseInt(JOptionPane.showInputDialog("Os valores de suas cartas são: \n1°- " + jogador_carta1 + "\n2°- " + jogador_carta2 + "\n3°- " + jogador_carta3 + ". \n\nInsira a posição da carta que quer descartar e somar à mesa: "));
                                if(jogador_somou == 1){
                                    JOptionPane.showMessageDialog(null, "Você adicionou " + jogador_carta1 + " à mesa.");
                                    soma_da_mesa = soma_da_mesa + jogador_carta1;
                                    jogador_carta1 = gerador.nextInt(10)+1;
                                    JOptionPane.showMessageDialog(null, "Você comprou uma carta de valor " + jogador_carta1 + " do monte.");
                                }
                                else if(jogador_somou == 2){
                                    JOptionPane.showMessageDialog(null, "Você adicionou " + jogador_carta2 + " à mesa.");
                                    soma_da_mesa = soma_da_mesa + jogador_carta2;
                                    jogador_carta2 = gerador.nextInt(10)+1;
                                    JOptionPane.showMessageDialog(null, "Você comprou uma carta de valor " + jogador_carta2 + " do monte.");
                                }
                                else if(jogador_somou == 3){
                                    JOptionPane.showMessageDialog(null, "Você adicionou " + jogador_carta3 + " à mesa.");
                                    soma_da_mesa = soma_da_mesa + jogador_carta3;
                                    jogador_carta3 = gerador.nextInt(10)+1;
                                    JOptionPane.showMessageDialog(null, "Você comprou uma carta de valor " + jogador_carta3 + " do monte.");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Você inseriu um valor inválido.");
                                    break;
                                }
                                jogador_jogadas++;
                            }                        
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Por sorteio, você joga primeiro");
                        while(soma_da_mesa < 21){
                            JOptionPane.showMessageDialog(null, "Sua vez");
                                jogador_somou = Integer.parseInt(JOptionPane.showInputDialog("Os valores de suas cartas são: \n1°- " + jogador_carta1 + "\n2°- " + jogador_carta2 + "\n3°- " + jogador_carta3 + ". \n\nInsira a posição da carta que quer descartar e somar à mesa: "));
                                if(jogador_somou == 1){
                                    JOptionPane.showMessageDialog(null, "Você adicionou " + jogador_carta1 + " à mesa.");
                                    soma_da_mesa = soma_da_mesa + jogador_carta1;
                                    jogador_carta1 = gerador.nextInt(10)+1;
                                    JOptionPane.showMessageDialog(null, "Você comprou uma carta de valor " + jogador_carta1 + " do monte.");
                                }
                                else if(jogador_somou == 2){
                                    JOptionPane.showMessageDialog(null, "Você adicionou " + jogador_carta2 + " à mesa.");
                                    soma_da_mesa = soma_da_mesa + jogador_carta2;
                                    jogador_carta2 = gerador.nextInt(10)+1;
                                    JOptionPane.showMessageDialog(null, "Você comprou uma carta de valor " + jogador_carta2 + " do monte.");
                                }
                                else if(jogador_somou == 3){
                                    JOptionPane.showMessageDialog(null, "Você adicionou " + jogador_carta3 + " à mesa.");
                                    soma_da_mesa = soma_da_mesa + jogador_carta3;
                                    jogador_carta3 = gerador.nextInt(10)+1;
                                    JOptionPane.showMessageDialog(null, "Você comprou uma carta de valor " + jogador_carta3 + " do monte.");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Você inseriu um valor inválido.");
                                    break;
                                }
                                jogador_jogadas++;
                            
                            if(soma_da_mesa < 21){
                                JOptionPane.showMessageDialog(null, "Vez do Jorge");
                                int escolhe_carta_descartar = gerador.nextInt(3);
                                if(escolhe_carta_descartar == 0){
                                    JOptionPane.showMessageDialog(null, "Jorge adicionou " + jorge_carta1 + " à mesa.");
                                    jorge_somou = jorge_carta1;
                                    jogador_carta1 = gerador.nextInt(10)+1;
                                }
                                else if(escolhe_carta_descartar == 1){
                                    JOptionPane.showMessageDialog(null, "Jorge adicionou " + jorge_carta2 + " à mesa.");
                                    jorge_somou = jorge_carta2;
                                    jogador_carta2 = gerador.nextInt(10)+1;
                                }
                                else if(escolhe_carta_descartar == 2){
                                    JOptionPane.showMessageDialog(null, "Jorge adicionou " + jorge_carta3 + " à mesa.");
                                    jorge_somou = jorge_carta3;
                                    jogador_carta3 = gerador.nextInt(10)+1;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Erro.");
                                    break;
                                }
                                soma_da_mesa = soma_da_mesa + jorge_somou;
                                jorge_jogadas++;
                            }                        
                        }
                    }
                    if(soma_da_mesa == 21){
                        if(jorge_jogadas > jogador_jogadas){
                            JOptionPane.showMessageDialog(null, "Jorge ganhou. Soma das cartas na mesa: " + soma_da_mesa);
                            fichasRestantes = fichasRestantes - aposta;
                        }
                        else if(jogador_jogadas > jorge_jogadas){
                            JOptionPane.showMessageDialog(null, "Parabéns, você ganhou! Soma das cartas na mesa: " + soma_da_mesa + ". Como resultado, ganhou o dobro do valor de sua aposta.");
                            fichasRestantes = fichasRestantes + aposta*2;
                        }
                        else{
                            if(jogaprimeiro == 0){
                                if(jogador_jogadas == jorge_jogadas) {
                                    JOptionPane.showMessageDialog(null, "Parabéns, você ganhou! Soma das cartas na mesa: " + soma_da_mesa + ". Como resultado, ganhou o dobro do valor de sua aposta.");
                                    fichasRestantes = fichasRestantes + aposta*2;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao definir o vencedor. Soma das cartas na mesa: " + soma_da_mesa + " Você não perdeu o valor apostado.");
                                }
                            }
                            else if(jogaprimeiro == 1){
                                if(jorge_jogadas == jogador_jogadas) {
                                    JOptionPane.showMessageDialog(null, "Jorge ganhou. Soma das cartas na mesa: " + soma_da_mesa);
                                    fichasRestantes = fichasRestantes - aposta;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao definir o vencedor. Soma das cartas na mesa: " + soma_da_mesa + " Você não perdeu o valor apostado.");
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao definir o vencedor. Soma das cartas na mesa: " + soma_da_mesa + " Você não perdeu o valor apostado.");
                            }
                        }
                    }
                    else if(soma_da_mesa > 21){
                        if(jogador_jogadas > jorge_jogadas) {
                            JOptionPane.showMessageDialog(null, "Jorge ganhou. Soma das cartas na mesa: " + soma_da_mesa);
                            fichasRestantes = fichasRestantes - aposta;
                        }
                        else if(jorge_jogadas > jogador_jogadas){
                            JOptionPane.showMessageDialog(null, "Parabéns, você ganhou! Soma das cartas na mesa: " + soma_da_mesa + ". Como resultado, ganhou o dobro do valor de sua aposta.");
                            fichasRestantes = fichasRestantes + aposta*2;
                        }
                        else{
                            if(jogaprimeiro == 0){
                                if(jogador_jogadas == jorge_jogadas) {
                                    JOptionPane.showMessageDialog(null, "Jorge ganhou. Soma das cartas na mesa: " + soma_da_mesa);
                                    fichasRestantes = fichasRestantes - aposta;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao definir o vencedor. Soma das cartas na mesa: " + soma_da_mesa + " Você não perdeu o valor apostado.");
                                }
                            }
                            else if(jogaprimeiro == 1){
                                if(jorge_jogadas == jogador_jogadas) {
                                    JOptionPane.showMessageDialog(null, "Parabéns, você ganhou! Soma das cartas na mesa: " + soma_da_mesa + ". Como resultado, ganhou o dobro do valor de sua aposta.");
                                    fichasRestantes = fichasRestantes + aposta*2;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao definir o vencedor. Soma das cartas na mesa: " + soma_da_mesa + " Você não perdeu o valor apostado.");
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao definir o vencedor. Soma das cartas na mesa: " + soma_da_mesa + " Você não perdeu o valor apostado.");
                            }
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao definir o vencedor. Soma das cartas na mesa: " + soma_da_mesa + " Você não perdeu o valor apostado.");
                    }
                    iniciaFichas(fichasRestantes);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fichas insuficientes para este valor de aposta.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Valor de aposta inválido");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fichas insuficientes, caso queira continuar jogando, volte para o Cassino.");
        }
    }//GEN-LAST:event_jogo21ActionPerformed

    private void jogoSomadeDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogoSomadeDadosActionPerformed
        if(fichasRestantes >= 10){
            int dado1 = gerador.nextInt(6)+1;
            int dado2 = gerador.nextInt(6)+1;
            int somaCerta = dado1+dado2;
            
            int aposta = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos jorges vai apostar: "));
            if(aposta >= 10){
                if(fichasRestantes >= aposta){
                    int somaApostada = Integer.parseInt(JOptionPane.showInputDialog("Digite a soma em que vai apostar: (min. 2 e máx. 12)"));

                    if(somaApostada >= 2 && somaApostada <= 12){
                        JOptionPane.showMessageDialog(null, "O valor do primeiro dado foi de: " + dado1);
                        JOptionPane.showMessageDialog(null, "O valor do segundo dado foi de: " + dado2);
                        JOptionPane.showMessageDialog(null, "Valor da soma dos dados: " + somaCerta);

                        fichasRestantes = fichasRestantes - aposta;
                        
                        if(somaApostada == somaCerta){
                            JOptionPane.showMessageDialog(null, "Parabéns, você acertou a soma dos dados e como resultado ganhou o dobro do valor de sua aposta!");
                            fichasRestantes = fichasRestantes + aposta*2;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Soma apostada inválida");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fichas insuficientes para este valor de aposta.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Valor de aposta inválido");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fichas insuficientes, caso queira continuar jogando, volte para o Cassino.");
        }
        iniciaFichas(fichasRestantes);
    }//GEN-LAST:event_jogoSomadeDadosActionPerformed

    private void jogoRoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogoRoletaActionPerformed
        if(fichasRestantes >= 10){
            int corCerta = gerador.nextInt(2); //0 = vermelho, 1 = preto
            int numCerto = gerador.nextInt(37);
            int aposta = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos jorges vai apostar: "));
            if (aposta >= 10){
                if(fichasRestantes >= aposta){
                    int numeroAposta = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número de 0 a 36 para apostar: "));
                    int corApostada = 2;

                    if(numeroAposta >= 0 && numeroAposta <= 36){
                        if(numeroAposta > 0){corApostada = JOptionPane.showConfirmDialog(null, "Deseja apostar na cor vermelha? (Clicar em Não resulta em apostar na cor preta)", "Selecione uma cor", JOptionPane.YES_NO_OPTION);}

                        JOptionPane.showMessageDialog(null, "O número sorteado foi: " + numCerto);
                        if(numCerto > 0){
                            if(corCerta == 0){
                                JOptionPane.showMessageDialog(null, "E a cor sorteada foi: Vermelho");
                            }
                            else if(corCerta == 1){
                                JOptionPane.showMessageDialog(null, "E a cor sorteada foi: Preto");
                            }
                        }

                        fichasRestantes = fichasRestantes - aposta;    

                        if(numeroAposta == numCerto && numeroAposta != 0){
                            JOptionPane.showMessageDialog(null, "Parabéns, você acertou o número e como resultado ganhou 10 vezes o valor de sua aposta!");
                            fichasRestantes = fichasRestantes + aposta*10;
                        }
                        if(corApostada == corCerta){
                            JOptionPane.showMessageDialog(null, "Parabéns, você acertou a cor e como resultado ganhou o dobro do valor de sua aposta!");
                            fichasRestantes = fichasRestantes + aposta*2;
                        }
                        if(numeroAposta == numCerto && numeroAposta == 0){
                            JOptionPane.showMessageDialog(null, "Parabéns, você acertou o número 0 e como resultado ganhou 20 vezes o valor de sua aposta!");
                            fichasRestantes = fichasRestantes + aposta*20;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Número inválido");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fichas insuficientes para este valor de aposta.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Valor de aposta inválido");
            }   
        }
        else{
            JOptionPane.showMessageDialog(null, "Fichas insuficientes, caso queira continuar jogando, volte para o Cassino.");
        }
        iniciaFichas(fichasRestantes);
    }//GEN-LAST:event_jogoRoletaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJogos().setVisible(true);
            }
        });
    }
    
    public void iniciaFichas(int fichas){
        fichasRestantes = fichas;
        jorgesRestantesLabel.setText("J$ "+Integer.toString(fichasRestantes));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jogo21;
    private javax.swing.JButton jogoRoleta;
    private javax.swing.JButton jogoSomadeDados;
    private javax.swing.JLabel jorgesRestantesLabel;
    // End of variables declaration//GEN-END:variables
}
