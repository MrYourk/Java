package chapter10;

import chapter10.view.MouserView;

public class MouseRunApp {
    // 这一行必须严格这么写！！！
     public static void main(String[] args) {
        //程序入口
        MouserView mouserView = new MouserView();
        mouserView.mainMenu();
    }
}