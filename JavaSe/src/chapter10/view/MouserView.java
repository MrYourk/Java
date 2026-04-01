package chapter10.view;

import chapter10.utils.Utility;

/**
 * 1. 显示界面
 * 2. 接收用户的输入
 * 3. 调用HouseService完成对房屋信息的各种操作
 */
public class MouserView {

    private boolean loop = true;
    private char key = ' ';

    //主菜单
    public void mainMenu(){

        do {
            System.out.println("================房屋出租系统================");
            System.out.println("\t\t1. 新增房屋");
            System.out.println("\t\t2. 删除房屋");
            System.out.println("\t\t3. 修改房屋信息");
            System.out.println("\t\t4. 查找房屋信息");
            System.out.println("\t\t4. 查看房屋信息");
            System.out.println("\t\t6. 退出系统");
            System.out.print("请选择对应的列表：");
            key = Utility.readMenuSelection();

            switch (key){
                case '1':
                    System.out.println("1");
                    break;
                case '2':
                    System.out.println("2");
                    break;
                case '3':
                    System.out.println("3");
                    break;
                case '4':
                    System.out.println("4");
                    break;
                case '5':
                    System.out.println("5");
                    break;
                case '6':
                    this.exit();
                    break;
            }

        } while (loop);
    }
    //退出
    public void exit(){
        //提供 Y/N 输入选择，Y 退出系统，n继续
        key = Utility.readConfirmSelection();
        if (key == 'Y'){
            loop = false;
        }
    }



}
