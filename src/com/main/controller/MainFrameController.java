package com.main.controller;

import com.main.domain.Memory;
import com.main.domain.MemoryUnit;
import com.main.model.CurMemoryTableModel;
import com.main.model.FreeMemoryTableModel;
import com.main.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @ Date: 2018/12/3 15:10
 * @ Description:
 */
public class MainFrameController {
    MainFrame mainFrame;
    private JComboBox allocationComBox;
    private JTextField reqMemorySizeJFT;
    private JButton applyBtn;
    private JTextField retMemoryBegJFT;
    private JButton returnBtn;
    private JTextField initMenoryJFT;
    private JButton initMemoryBtn;
    private JTable curMemoryTable;
    private JTable freeMemoryTable;

    private CurMemoryTableModel curMemoryTableModel;
    private FreeMemoryTableModel freeMemoryTableModel;

    // 记录当前选择的分配算法
    private int currentAlgorith = -1;

    public MainFrameController() {
        initCompoents();
        initListeners();


    }

    public void showMainWindows() {
        mainFrame.setVisible(true);
    }

    private void initCompoents() {
        mainFrame = new MainFrame();
        allocationComBox = mainFrame.getAllocationComBox();
        reqMemorySizeJFT = mainFrame.getReqMemorySizeJFT();
        applyBtn = mainFrame.getApplyBtn();
        retMemoryBegJFT = mainFrame.getRetMemoryBegJFT();
        returnBtn = mainFrame.getReturnBtn();
        initMenoryJFT = mainFrame.getInitMenoryJFT();
        initMemoryBtn = mainFrame.getInitMemoryBtn();
        curMemoryTable = mainFrame.getCurMemoryTable();
        freeMemoryTable = mainFrame.getFreeMemoryTable();

        allocationComBox.addItem("请选择分配算法");
        allocationComBox.addItem("首次适应算法");
        allocationComBox.addItem("最佳适应算法");
        allocationComBox.addItem("最坏适应算法");

        // 设置model
        curMemoryTableModel = new CurMemoryTableModel();
        curMemoryTable.setModel(curMemoryTableModel);

        freeMemoryTableModel = new FreeMemoryTableModel();
        freeMemoryTable.setModel(freeMemoryTableModel);

    }

    private void initListeners() {
        // 初始化内存大小
        initMemoryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取初始化内存大小
                String initMemorySize = initMenoryJFT.getText();
                if (!"".equals(initMemorySize)) {
                    MemoryUnit.setTotalLength(Integer.parseInt(initMemorySize));
                    // 初始化
                    MemoryUnit.init();
                    // 更新table
                    curMemoryTableModel.setMemories(MemoryUnit.getMemories());
                    curMemoryTable.updateUI();
                    freeMemoryTableModel.setMemories(MemoryUnit.getMemories());
                    freeMemoryTable.updateUI();

                    initMenoryJFT.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "请填写初始化内存大小！");
                }
            }
        });

        allocationComBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                    // 最佳适应算法 1
                    // 最坏适应算法 2
                    // 首次适应算法 3
                    if (e.getItem() == "最佳适应算法") {
                        currentAlgorith = 1;
                    } else if (e.getItem() == "最坏适应算法") {
                        currentAlgorith = 2;
                    } else if (e.getItem() == "首次适应算法") {
                        currentAlgorith = 3;
                    } else currentAlgorith = -1;
                }
            }
        });

        applyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取申请内存大小
                String reqMemorySize = reqMemorySizeJFT.getText();
                if("".equals(reqMemorySize)){
                    JOptionPane.showMessageDialog(null, "请填写申请内存大小！");
                    return;
                }
                reqMemorySizeJFT.setText("");
                switch (currentAlgorith) {
                    case 1:
                        MemoryUnit.applyMemoryBF(Integer.parseInt(reqMemorySize));
                        break;
                    case 2:
                        MemoryUnit.applyMemoryWF(Integer.parseInt(reqMemorySize));
                        break;
                    case 3:
                        MemoryUnit.applyMemoryFF(Integer.parseInt(reqMemorySize));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "请选择内存分配算法！");
                        break;
                }
                // 更新table
                curMemoryTableModel.setMemories(MemoryUnit.getMemories());
                curMemoryTable.updateUI();
                freeMemoryTableModel.setMemories(MemoryUnit.getMemories());
                freeMemoryTable.updateUI();
            }
        });

        // 归还内存
        returnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取归还内存起始地址
                String retMemoryBeg = retMemoryBegJFT.getText();
                if("".equals(retMemoryBeg)){
                    JOptionPane.showMessageDialog(null, "请填写内存起始地址！");
                    return;
                }
                retMemoryBegJFT.setText("");
                MemoryUnit.delMemory(Integer.parseInt(retMemoryBeg));
                // 更新table
                curMemoryTableModel.setMemories(MemoryUnit.getMemories());
                curMemoryTable.updateUI();
                freeMemoryTableModel.setMemories(MemoryUnit.getMemories());
                freeMemoryTable.updateUI();
            }
        });


    }
}
