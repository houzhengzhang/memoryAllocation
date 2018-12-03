/*
 * Created by JFormDesigner on Mon Dec 03 14:37:25 CST 2018
 */

package com.main.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author jframe
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("采用动态分区存储器管理方案的模拟系统");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane3 = new JScrollPane();
        freeMemoryTable = new JTable();
        panel3 = new JPanel();
        allocationComBox = new JComboBox();
        label9 = new JLabel();
        label10 = new JLabel();
        reqMemorySizeJFT = new JTextField();
        applyBtn = new JButton();
        label11 = new JLabel();
        retMemoryBegJFT = new JTextField();
        returnBtn = new JButton();
        label3 = new JLabel();
        initMenoryJFT = new JTextField();
        initMemoryBtn = new JButton();
        scrollPane4 = new JScrollPane();
        curMemoryTable = new JTable();
        label4 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u5df2\u5206\u914d\u5206\u533a\u8868");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(label1);
            label1.setBounds(40, 0, 130, 25);

            //---- label2 ----
            label2.setText("\u7a7a\u95f2\u5206\u533a\u8868");
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(label2);
            label2.setBounds(655, 0, 110, label2.getPreferredSize().height);

            //======== scrollPane3 ========
            {
                scrollPane3.setViewportView(freeMemoryTable);
            }
            panel1.add(scrollPane3);
            scrollPane3.setBounds(584, 35, 240, 295);

            //======== panel3 ========
            {
                panel3.setBorder(new EtchedBorder());
                panel3.setLayout(null);
                panel3.add(allocationComBox);
                allocationComBox.setBounds(110, 30, 130, allocationComBox.getPreferredSize().height);

                //---- label9 ----
                label9.setText("\u5185\u5b58\u5206\u914d\u7b97\u6cd5\uff1a");
                panel3.add(label9);
                label9.setBounds(10, 35, 104, label9.getPreferredSize().height);

                //---- label10 ----
                label10.setText("\u8bbe\u7f6e\u7533\u8bf7\u5185\u5b58\u5757\u5927\u5c0f\uff1a");
                panel3.add(label10);
                label10.setBounds(10, 112, 135, 25);
                panel3.add(reqMemorySizeJFT);
                reqMemorySizeJFT.setBounds(140, 112, 84, 25);

                //---- applyBtn ----
                applyBtn.setText("\u7533\u8bf7");
                panel3.add(applyBtn);
                applyBtn.setBounds(240, 112, 75, 25);

                //---- label11 ----
                label11.setText("\u8fd4\u8fd8\u5185\u5b58\u5757\u8d77\u59cb\u5730\u5740\uff1a");
                panel3.add(label11);
                label11.setBounds(10, 149, label11.getPreferredSize().width, 25);
                panel3.add(retMemoryBegJFT);
                retMemoryBegJFT.setBounds(140, 149, 84, 25);

                //---- returnBtn ----
                returnBtn.setText("\u8fd4\u8fd8");
                panel3.add(returnBtn);
                returnBtn.setBounds(240, 149, 75, 25);

                //---- label3 ----
                label3.setText("\u521d\u59cb\u5316\u5185\u5b58\u5927\u5c0f\uff1a");
                panel3.add(label3);
                label3.setBounds(10, 75, label3.getPreferredSize().width, 25);
                panel3.add(initMenoryJFT);
                initMenoryJFT.setBounds(140, 75, 84, 25);

                //---- initMemoryBtn ----
                initMemoryBtn.setText("\u521d\u59cb\u5316");
                panel3.add(initMemoryBtn);
                initMemoryBtn.setBounds(240, 75, 75, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel3);
            panel3.setBounds(238, 35, 333, 295);

            //======== scrollPane4 ========
            {
                scrollPane4.setViewportView(curMemoryTable);
            }
            panel1.add(scrollPane4);
            scrollPane4.setBounds(0, 35, 225, 295);

            //---- label4 ----
            label4.setText("\u64cd\u4f5c\u9762\u677f");
            panel1.add(label4);
            label4.setBounds(new Rectangle(new Point(365, 0), label4.getPreferredSize()));

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(15, 15, 855, 380);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane3;
    private JTable freeMemoryTable;
    private JPanel panel3;
    private JComboBox allocationComBox;
    private JLabel label9;
    private JLabel label10;
    private JTextField reqMemorySizeJFT;
    private JButton applyBtn;
    private JLabel label11;
    private JTextField retMemoryBegJFT;
    private JButton returnBtn;
    private JLabel label3;
    private JTextField initMenoryJFT;
    private JButton initMemoryBtn;
    private JScrollPane scrollPane4;
    private JTable curMemoryTable;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JComboBox getAllocationComBox() {
        return allocationComBox;
    }

    public JButton getApplyBtn() {
        return applyBtn;
    }

    public JButton getReturnBtn() {
        return returnBtn;
    }

    public JTextField getReqMemorySizeJFT() {
        return reqMemorySizeJFT;
    }

    public JTextField getRetMemoryBegJFT() {
        return retMemoryBegJFT;
    }

    public JTextField getInitMenoryJFT() {
        return initMenoryJFT;
    }

    public JButton getInitMemoryBtn() {
        return initMemoryBtn;
    }

    public JTable getCurMemoryTable() {
        return curMemoryTable;
    }

    public JTable getFreeMemoryTable() {
        return freeMemoryTable;
    }
}
