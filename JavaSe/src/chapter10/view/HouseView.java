package chapter10.view;

import chapter10.domain.House;
import chapter10.service.HouseService;
import chapter10.utils.Utility;

/**
 * 1. 显示界面
 * 2. 接收用户的输入
 * 3. 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true;
    private char key = ' ';

    private HouseService houseService = new HouseService(2);

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
                    listHouse();
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

    //查看房屋信息列表
    public void listHouse(){
        System.out.println("-----------------房屋列表-----------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(已出租/未出租)");
        House[] houses = houseService.list();

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }



}
