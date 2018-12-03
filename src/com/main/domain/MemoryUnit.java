package com.main.domain;


import javax.swing.*;
import javax.xml.stream.FactoryConfigurationError;
import java.util.LinkedList;
import java.util.Random;

/**
 * @ Date: 2018/12/3 15:18
 * @ Description: 内存单元类：成员包括开始位置和存储区域块大小
 */
public class MemoryUnit {
    private static LinkedList<Memory> memories;
    private static int[] arr;

    // TODO length总长度的输入
    private static int totalLength = 0;

    public MemoryUnit() {
        init();
    }

    public static LinkedList<Memory> getMemories() {
        return memories;
    }

    public static void init() {
        memories = new LinkedList<>();
        memories.add( new Memory(0, totalLength, true));
    }

    public static void setTotalLength(int totalLength) {
        MemoryUnit.totalLength = totalLength;
    }

    /**
     * 申请新的内存块 FF申请方式
     *
     * @param length 要申请块大小
     * @return 成功返回true, 申请失败返回false
     */
    public static boolean applyMemoryFF(int length) {
        if (length <= 0 || length > totalLength) {
            return false;
        }
        for (int i = 0; i < memories.size(); i++) {
            if (memories.get(i).isState() && memories.get(i).getLength() >= length) {
                memories.add(i + 1, new Memory(memories.get(i).getStart() +
                        memories.get(i).getLength() - length, length, false));
                memories.get(i).setLength(memories.get(i).getLength() - length);
                // 判断分配后是否为空
                if (memories.get(i).getLength() == 0) {
                    memories.remove(i);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * 申请新的内存块 BF申请方式
     *
     * @param length 要申请块大小
     * @return 成功返回true, 申请失败返回false
     */
    public static boolean applyMemoryBF(int length) {
        if (length <= 0 || length > totalLength) {
            return false;
        }
        int index = 0;
        int minLen = totalLength + 1;
        for (int i = 0; i < memories.size(); i++) {
            if (memories.get(i).isState() && memories.get(i).getLength() >= length && memories.get(i).getLength() <= minLen) {
                index = i;
                minLen = memories.get(i).getLength();
            }
        }
        if (minLen == totalLength + 1)
            return false;
        if (minLen >= length) {
            memories.add(index + 1, new Memory(memories.get(index).getStart()
                    + memories.get(index).getLength() - length, length, false));
            memories.get(index).setLength(memories.get(index).getLength() - length);
            // 判断分配后是否为空
            if (memories.get(index).getLength() == 0) {
                memories.remove(index);
            }
            return true;
        }
        return false;
    }

    /**
     * 申请新的内存块 WF申请方式
     *
     * @param length 要申请块大小
     * @return 成功返回true, 申请失败返回false
     */
    public static boolean applyMemoryWF(int length) {
        if (length <= 0 || length > totalLength) {
            return false;
        }
        int index = 0;
        int maxLen = 0;
        for (int i = 0; i < memories.size(); i++) {
            if (memories.get(i).isState() && memories.get(i).getLength() >= length &&
                    memories.get(i).getLength() >= maxLen) {
                index = i;
                maxLen = memories.get(i).getLength();
            }
        }
        if (maxLen < length)
            return false;
        else {
            memories.add(index + 1, new Memory(memories.get(index).getStart()
                    + memories.get(index).getLength() - length, length, false));
            memories.get(index).setLength(memories.get(index).getLength() - length);
            if (memories.get(index).getLength() == 0)
                memories.remove(index);
            return true;
        }
    }

    public static boolean delMemory(int start) {
        for (int i = 0; i < memories.size(); i++) {
            if (memories.get(i).getStart() == start && !memories.get(i).isState()) {
                memories.get(i).setState(true);
                // 向上紧凑
                if (i < memories.size() - 1 && memories.get(i + 1).isState()) {
                    memories.get(i).setLength(memories.get(i).getLength() + memories.get(i + 1).getLength());
                    memories.remove(i + 1);
                }
                // 向下紧凑
                if (i > 0 && memories.get(i - 1).isState()) {
                    memories.get(i - 1).setLength(memories.get(i-1).getLength() + memories.get(i).getLength());
                    memories.remove(i);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * 打印分区信息
     */
    public static void arrayPrint() {
        System.out.println();
        for (int i = 0; i < memories.size(); i++) {
            System.out.printf("%d %d %s ||", memories.get(i).getStart(), memories.get(i).getLength(),
                    memories.get(i).isState() ? "空闲" : "占用");
        }
        System.out.println();
    }
    /**
     * 内存全部初始化
     */
    public static void clear(){
        if(memories!=null)
            memories.clear();
        init();
    }

    /**
     * 返回空闲分区数量
     * @return 空闲分区数量
     */
    public static int getUsefulNum(){
        int res=0;
        for(int i=0;i<memories.size();i++){
            if(memories.get(i).isState()
            )
                res++;
        }
        return res;
    }

    /**
     *
     * @param arr1
     */
    public static void initNew(int[] arr1){
        arr=arr1;
        Random ran=new Random();
        if(memories!=null)
            memories.clear();
        boolean flag=true;
        int start=0;
        for(int i=0;i<arr.length;i++){
            int t=arr[i];
            if(start+t< totalLength-1){
                memories.add(new Memory(start,t,flag));
            }else{
                memories.add(new Memory(start,totalLength-start,flag));
                start+=t;
                break;

            }
            flag=!flag;
            start+=t;


        }
        if(start<totalLength-1)
            memories.add(new Memory(start,totalLength-start,flag));
    }

}
