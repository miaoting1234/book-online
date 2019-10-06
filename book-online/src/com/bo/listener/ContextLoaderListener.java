package com.bo.listener;

import com.bo.entity.Book;
import com.bo.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mq_xu
 * @ClassName ContextLoaderListener
 * @Description 上下文加载监听，在服务器启动的时候即刻生效，用来生成用户数据和图书数据
 * @Date 2019/9/27
 * @Version 1.0
 **/

@WebListener
public class ContextLoaderListener implements ServletContextListener {

    /**
     * @Description 容器初始化方法
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器启动");
        //创建并生成用户数据列表
        List<User> userList = new ArrayList<>(3);
        User[] users = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "mt", "user1.jpg", "江苏南京", LocalDate.of(2019, 6, 11)),
                new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "小仙女", "user2.jpg", "江苏苏州", LocalDate.of(2019, 2, 18)),
                new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "不缪", "user3.jpg", "四川成都", LocalDate.of(2019, 8, 19))
        };
        userList = Arrays.asList(users);

        //创建并生成图书数据列表
        List<Book> bookList = new ArrayList<>(10);
        Book[] books = {
                new Book(1, "中国道路与人口老龄化", "book1.jpg", "厉以宁"),
                new Book(2, "中国当代书画名家代表作画语录", "book2.jpg", "杨延文"),
                new Book(3, "汉魏六朝文精选", "book3.jpg", "吴先宁"),
                new Book(4, "中国百年流行小说", "book4.jpg", "谭光辉"),
                new Book(5, "全球森林", "book5.jpg", "钟晓阳"),
                new Book(6, "漫长的婚约", "book6.jpg", "塞巴斯蒂安"),
                new Book(7, "庸人自扰", "book7.jpg", "戴伦•麦加维"),
                new Book(8, "绿山墙的安妮", "book8.jpg", "耶茨"),
                new Book(9, "敌人与邻居", "book9.jpg", "伊恩·布莱克"),
                new Book(10, "哀伤纪", "book10.jpg", "钟晓阳"),
                new Book(11, "漫长的婚约", "book11.jpg", " 塞巴斯蒂安"),
                new Book(12, "庸人自扰", "book12.jpg", "戴伦•麦加维"),
                new Book(13,"一百本好书","book13.jpg","理查德·耶茨"),
                new Book(14,"今日图书","book14.jpg","戴伦•麦加维"),
                new Book(15,"前世今生","book15.jpg","理查德·耶茨")
        };
        bookList = Arrays.asList(books);

        //获得全局变量
        ServletContext servletContext = sce.getServletContext();
        //设置全局变量属性，将用户和图书列表数据记入，整个应用可以共享
        servletContext.setAttribute("userList", userList);
        servletContext.setAttribute("bookList", bookList);
    }

    /**
     * 销毁方法
     *
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("容器销毁");
    }
}
