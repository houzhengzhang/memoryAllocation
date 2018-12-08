package com.main.utils;

import java.awt.*;

/**
 * @ Date: 2018/12/5 20:25
 * @ Description:
 */
public class MyCanvas extends Canvas {
    private Graphics pen;
    private Color color;
    private int wide;
    private int lenth;
    private int start;

    public MyCanvas(Color color, int start, int wide, int totalLength) {

        this.wide = (int) (850 * (wide * 1.0 / totalLength)) - 1;
        lenth = wide;
        setSize(this.wide, 199);
        this.color = color;
        this.start = start;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        pen = g;
        pen.setColor(color);
        pen.fillRect(0, 0, wide, 199);

        pen.setColor(Color.black);
        pen.drawLine(0, 0, 0, 199);

        pen.setFont(new Font("宋体",Font.BOLD,13));
        pen.setColor(Color.blue);
        pen.drawString(String.valueOf(start) , 2, 20);
        pen.drawString(String.valueOf(start + lenth - 1) , wide - 27, 20);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

}