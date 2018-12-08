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
        label11 = new JLabel();
        retMemoryBegJFT = new JTextField();
        returnBtn = new JButton();
        label3 = new JLabel();
        initMenoryJFT = new JTextField();
        initMemoryBtn = new JButton();
        panel2 = new JPanel();
        label10 = new JLabel();
        label5 = new JLabel();
        processNameJFT = new JTextField();
        reqMemorySizeJFT = new JTextField();
        applyBtn = new JButton();
        resetBtn = new JButton();
        scrollPane4 = new JScrollPane();
        curMemoryTable = new JTable();
        label4 = new JLabel();
        canvas = new JPanel();

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
            label2.setBounds(695, 0, 110, label2.getPreferredSize().height);

            //======== scrollPane3 ========
            {
                scrollPane3.setViewportView(freeMemoryTable);
            }
            panel1.add(scrollPane3);
            scrollPane3.setBounds(625, 35, 240, 315);

            //======== panel3 ========
            {
                panel3.setBorder(new EtchedBorder());
                panel3.setLayout(null);
                panel3.add(allocationComBox);
                allocationComBox.setBounds(120, 30, 130, allocationComBox.getPreferredSize().height);

                //---- label9 ----
                label9.setText("\u5185\u5b58\u5206\u914d\u7b97\u6cd5\uff1a");
                panel3.add(label9);
                label9.setBounds(20, 35, 104, label9.getPreferredSize().height);

                //---- label11 ----
                label11.setText("\u8fd4\u8fd8\u5185\u5b58\u5757\u8d77\u59cb\u5730\u5740\uff1a");
                panel3.add(label11);
                label11.setBounds(15, 215, label11.getPreferredSize().width, 25);
                panel3.add(retMemoryBegJFT);
                retMemoryBegJFT.setBounds(145, 215, 84, 25);

                //---- returnBtn ----
                returnBtn.setText("\u8fd4\u8fd8");
                panel3.add(returnBtn);
                returnBtn.setBounds(255, 210, 60, 35);

                //---- label3 ----
                label3.setText("\u521d\u59cb\u5316\u5185\u5b58\u5927\u5c0f\uff1a");
                panel3.add(label3);
                label3.setBounds(20, 75, label3.getPreferredSize().width, 25);
                panel3.add(initMenoryJFT);
                initMenoryJFT.setBounds(130, 75, 84, 25);

                //---- initMemoryBtn ----
                initMemoryBtn.setText("\u521d\u59cb\u5316");
                panel3.add(initMemoryBtn);
                initMemoryBtn.setBounds(240, 75, 80, 35);

                //======== panel2 ========
                {
                    panel2.setBorder(new EtchedBorder());
                    panel2.setLayout(null);

                    //---- label10 ----
                    label10.setText("\u7533\u8bf7\u5185\u5b58\u5757\u5927\u5c0f");
                    panel2.add(label10);
                    label10.setBounds(5, 10, 110, 25);

                    //---- label5 ----
                    label5.setText("\u8fdb\u7a0b\u540d");
                    panel2.add(label5);
                    label5.setBounds(140, 10, 65, 25);
                    panel2.add(processNameJFT);
                    processNameJFT.setBounds(125, 40, 75, 25);
                    panel2.add(reqMemorySizeJFT);
                    reqMemorySizeJFT.setBounds(15, 40, 64, 25);

                    //---- applyBtn ----
                    applyBtn.setText("\u7533\u8bf7");
                    panel2.add(applyBtn);
                    applyBtn.setBounds(230, 30, 65, 35);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel2.getComponentCount(); i++) {
                            Rectangle bounds = panel2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel2.setMinimumSize(preferredSize);
                        panel2.setPreferredSize(preferredSize);
                    }
                }
                panel3.add(panel2);
                panel2.setBounds(15, 115, 305, 85);

                //---- resetBtn ----
                resetBtn.setText("\u91cd\u7f6e");
                panel3.add(resetBtn);
                resetBtn.setBounds(115, 265, 105, 35);

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
            panel3.setBounds(275, 35, 333, 315);

            //======== scrollPane4 ========
            {
                scrollPane4.setViewportView(curMemoryTable);
            }
            panel1.add(scrollPane4);
            scrollPane4.setBounds(0, 35, 265, 315);

            //---- label4 ----
            label4.setText("\u64cd\u4f5c\u9762\u677f");
            panel1.add(label4);
            label4.setBounds(new Rectangle(new Point(405, 0), label4.getPreferredSize()));

            //======== canvas ========
            {
                canvas.setForeground(Color.white);
                canvas.setBackground(Color.white);
                canvas.setBorder(LineBorder.createBlackLineBorder());
                canvas.setLayout(null);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < canvas.getComponentCount(); i++) {
                        Rectangle bounds = canvas.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = canvas.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    canvas.setMinimumSize(preferredSize);
                    canvas.setPreferredSize(preferredSize);
                }
            }
            panel1.add(canvas);
            canvas.setBounds(15, 375, 850, 200);

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
        panel1.setBounds(15, 15, 885, 600);

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
    private JLabel label11;
    private JTextField retMemoryBegJFT;
    private JButton returnBtn;
    private JLabel label3;
    private JTextField initMenoryJFT;
    private JButton initMemoryBtn;
    private JPanel panel2;
    private JLabel label10;
    private JLabel label5;
    private JTextField processNameJFT;
    private JTextField reqMemorySizeJFT;
    private JButton applyBtn;
    private JButton resetBtn;
    private JScrollPane scrollPane4;
    private JTable curMemoryTable;
    private JLabel label4;
    private JPanel canvas;
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

    public JTextField getProcessNameJFT() {
        return processNameJFT;
    }

    public JButton getResetBtn() {
        return resetBtn;
    }

    public JPanel getCanvas() {
        return canvas;
    }
}
