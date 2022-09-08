package com.dinotaurent.RelojU.Gui;

import com.dinotaurent.RelojU.controllers.RelojController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@SpringBootApplication
public class Ventana extends JFrame {

    @Autowired
    private RelojController controller;

    private JPanel mainPanel;
    private JLabel hora;
    private JButton colombiaButton;
    private JButton australiaButton;
    private JButton alemaniaButton;
    private JButton japonButton;
    private JLabel texto1;
    private JButton sorpresaButton;


    public Ventana() {
        setContentPane(mainPanel);
        setTitle("Reloj");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        alemaniaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    hora.setText(controller.getAlemania());
                } catch (Exception ex) {
                    System.out.println(ex);
                    hora.setText("Espera 1 segundo");
                }
            }
        });

        colombiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    hora.setText(controller.getColombia());
                } catch (Exception ex) {
                    System.out.println(ex);
                    hora.setText("Espera 1 segundo");
                }
            }
        });

        japonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    hora.setText(controller.getJapon());
                } catch (Exception ex) {
                    System.out.println(ex);
                    hora.setText("Espera 1 segundo");
                }
            }
        });

        australiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    hora.setText(controller.getAustralia());
                } catch (Exception ex) {
                    System.out.println(ex);
                    hora.setText("Espera 1 segundo");
                }
            }
        });


    }
}
