package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        //创建Notice类三个对象，三个公告
        Notice notice1 = new Notice(1,"欢迎来到慕课网","管理员",new Date());
        Notice notice2 = new Notice(2,"请同学们按时提交作业","老师",new Date());
        Notice notice3 = new Notice(3,"考情通知","老师",new Date());

        //添加到公告 ArrayList
        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

        // 显示公告
        System.out.println("公告的内容：");
        for (int i=0; i < noticeList.size(); i++) {
            //get(i)获得的是 Object类，需要强制转换为Notice类才能使用getTitle()
            System.out.println(i + 1 + ":" + ((Notice) noticeList.get(i)).getTitle());
        }
        System.out.println("======================");

        //在第一条公告后面 add 添加一条新公告
        Notice notice4 = new Notice(4,"在线编辑器可以使用啦！","老师", new Date());
        noticeList.add(1,notice4);
        System.out.println("增加后公告的内容：");
        for (int i=0; i < noticeList.size(); i++) {
            //get(i)获得的是 Object类，需要强制转换为Notice类才能使用getTitle()
            System.out.println(i + 1 + ":" + ((Notice) noticeList.get(i)).getTitle());
        }
        System.out.println("======================");

        //删除 remove 公告
        noticeList.remove(
                2);
        System.out.println("删除后公告的内容：");
        for (int i=0; i < noticeList.size(); i++) {
            //get(i)获得的是 Object类，需要强制转换为Notice类才能使用getTitle()
            System.out.println(i + 1 + ":" + ((Notice) noticeList.get(i)).getTitle());
        }
        System.out.println("======================");

        // 修改 set
        notice4.setTitle("Java在线编辑器可以使用啦！");
        noticeList.set(1,notice4);
        System.out.println("修改后公告的内容：");
        for (int i=0; i < noticeList.size(); i++) {
            //get(i)获得的是 Object类，需要强制转换为Notice类才能使用getTitle()
            System.out.println(i + 1 + ":" + ((Notice) noticeList.get(i)).getTitle());
        }
    }
}
