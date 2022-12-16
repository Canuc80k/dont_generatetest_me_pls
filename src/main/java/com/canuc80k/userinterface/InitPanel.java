package com.canuc80k.userinterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;

public class InitPanel extends JPanel {
    private final int GENERATE_OPTION_INDEX = 0;
    private final int ZIP_OPTION_INDEX = 1;
    private final int CLEAR_OPTION_INDEX = 2;
    private final int CONFIG_OPTION_INDEX = 3;

    private JLabel topLabel;
    private List<String> options = new ArrayList<String>();

    InitPanel() {
        options.add("Generate test");
        options.add("Zip");
        options.add("Clear");
        options.add("Config");

        setPreferredSize(new Dimension(HomeFrame.APP_WIDTH, HomeFrame.TOPPANEL_HEIGHT));
        setBackground(Color.decode("#d7def8"));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        topLabel = new JLabel("What do you want to do?");
        topLabel.setFont(new Font("Open Sans Bold", Font.PLAIN, 14));
        topLabel.setSize(new Dimension(HomeFrame.APP_WIDTH, 50));
        add(topLabel);

        add(Box.createRigidArea(new Dimension(0, 10)));

        options.forEach(option -> {
            JLabel optionDescription = new JLabel(option);
            optionDescription.setFont(new Font("Open Sans Regular", Font.PLAIN, 14));
            optionDescription.setSize(new Dimension(HomeFrame.APP_WIDTH, 50));
            optionDescription.addMouseListener(new MouseInputListener() {
                public void mouseClicked(MouseEvent e) {
                    String choosedOption = ((JLabel) e.getSource()).getText();

                    if (choosedOption.equals(options.get(GENERATE_OPTION_INDEX))) {
                    }
                    if (choosedOption.equals(options.get(ZIP_OPTION_INDEX))) {
                    }
                    if (choosedOption.equals(options.get(CLEAR_OPTION_INDEX))) {
                    }
                    if (choosedOption.equals(options.get(CONFIG_OPTION_INDEX))) {
                        HomeFrame currentFrame = (HomeFrame) SwingUtilities.windowForComponent(topLabel);
                        System.out.println(currentFrame);
                        currentFrame.setTopPanel(new ConfigPanel());
                    }
                }

                public void mousePressed(MouseEvent e) {
                }

                public void mouseReleased(MouseEvent e) {
                }

                public void mouseEntered(MouseEvent e) {
                }

                public void mouseExited(MouseEvent e) {
                }

                public void mouseDragged(MouseEvent e) {
                }

                public void mouseMoved(MouseEvent e) {
                }

            });
            this.add(optionDescription);
        });
    }
}