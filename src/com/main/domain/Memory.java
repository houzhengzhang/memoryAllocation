package com.main.domain;

/**
 * @ Date: 2018/12/3 15:15
 * @ Description:
 */
public class Memory {
    private int start;      // 开始位置
    private int length;     // 存储区域长度
    private boolean state;  // true代表空闲，false代表占用

    public Memory(int start, int length) {
        this.start = start;
        this.length = length;
    }

    public Memory(int start, int length, boolean state) {
        this.start = start;
        this.length = length;
        this.state = state;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "start=" + start +
                ", length=" + length +
                ", state=" + state +
                '}';
    }
}
