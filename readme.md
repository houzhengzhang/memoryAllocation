**采用动态分区存储器管理方案的模拟系统** 

* 设计目的

  * 设计一个模拟动态分区存储管理的系统。
  * 理解动态分区存储管理中内存的分配和回收的几种算法。
  * 理解“紧凑”技术。

* 设计要求

  * 数据结构

    空闲分区表

    | 编号     | 起始地址 | 长度     |  状态 |
    | ---------------- | ------------ | ---------------- | -------------|
    | 1         |     |   | 未分配 |
    |          |     |   | 空表目 |
    已分配分区表
    | 编号     | 起始地址 | 长度     |  占用进程名 |
    | ---------------- | ------------ | ---------------- | -------------|
    | 1         |     |   |  |
    |          |     |   | |

  * 分配和回收算法

    采用3种算法：首次适应算法、最佳适应算法和最坏适应算法，并用"紧凑"技术来处理存储器碎片（即将各进程占用分区集中移到用户内存区的高地址部分，形成一片连续的进程区，而在用户内存区的低地址部分形成一块较大的空闲区，然后再进行分配）。

  * 输入

    * 内存初始大小
    * 进程对内存的申请和释放。

  * 输出

    * ​ 可随时查看空闲分区表和已分配分区表；
    * ​ 图形演示内存的分配、回收和紧凑过程。