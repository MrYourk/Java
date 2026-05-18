package chapter13.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {

        News n1 = new News("新闻一：新冠确认sdfsdfdsfdsfsdfdsf");
        News n2 = new News("新闻二：男子突然想起");

        List list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        for (int i = list.size() -1 ; i >= 0 ;i--){
            News news = (News)list.get(i);
            System.out.println(News.processTitle(news.getTitle()));
        }


    }

}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public static String processTitle(String title){
        if (title == null){
            return "";
        }
        if (title.length() > 15) {
            return title.substring(0,15) + "...";
        } else {
            return title;
        }
    }

    @Override
    public String toString() {
        return "title= "+ title ;
    }
}
