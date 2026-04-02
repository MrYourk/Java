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

    private HouseService houseService = new HouseService(10);

    //主菜单
    public void mainMenu(){

        do {
            System.out.println("================房屋出租系统================");
            System.out.println("\t\t1. 新增房屋");
            System.out.println("\t\t2. 查找房屋");
            System.out.println("\t\t3. 删除房屋");
            System.out.println("\t\t4. 修改房屋");
            System.out.println("\t\t5. 房屋列表");
            System.out.println("\t\t6. 退出系统");
            System.out.print("请选择对应的列表：");
            key = Utility.readMenuSelection();

            switch (key){
                case '1':
                    this.addHouse();
                    break;
                case '2':
                    this.selectHouse();
                    break;
                case '3':
                    this.delHouse();
                    break;
                case '4':
                    this.updateHouse();
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
        System.out.println("编号\t\t房主\t\t电话\t\t户籍地\t\t月租\t\t状态(已出租/未出租)");
        House[] houses = houseService.list();

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }

    //新增房屋信息
    public void addHouse(){
        System.out.println("-----------------添加房屋-----------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(13);
        System.out.print("户籍地：");
        String address = Utility.readString(20);
        System.out.print("月租：");
        int rent = Utility.readInt(5);
        System.out.print("状态（已出租/未出租）：");
        String status = Utility.readString(4);

        House house = new House(0,name,phone,address,rent,status);

        if (houseService.add(house)){
            System.out.println("-----------------添加成功-----------------");
        } else {
            System.out.println("-----------------添加失败-----------------");
        }

    }

    //删除房屋信息
    public void delHouse(){
        System.out.println("-----------------删除房屋-----------------");
        System.out.print("请选择删除房屋编号（-1退出）：");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("-----------------放弃删除-----------------");
            return;
        }

        key = Utility.readConfirmSelection();
        if (key == 'Y'){
            if (houseService.del(delId)){
                System.out.println("-----------------删除成功-----------------");
            }else {
                System.out.println("-----------------编号不存在-----------------");
            }

        } else {
            System.out.println("-----------------放弃删除-----------------");
        }

    }

    //查找房屋信息
    public void selectHouse() {
        System.out.println("-----------------查找房屋-----------------");
        System.out.print("请输入要查找的房屋ID：");
        int selectId = Utility.readInt();
        House houses = houseService.select(selectId);

        if (houses == null){
            System.out.println("-----------------没有该房屋信息-----------------");
        } else {
            System.out.println(houses);
        }

    }

    //修改房屋信息
    public void updateHouse(){
        System.out.println("-----------------修改房屋信息-----------------");
        System.out.print("请选择修改房屋编号：");
        int updateId = Utility.readInt();
        House house = houseService.select(updateId);
        System.out.print("姓名("+house.getName()+")：");
        String name = Utility.readString(5);
        System.out.print("电话("+house.getPhone()+")：");
        String phone = Utility.readString(13);
        System.out.print("户籍地("+house.getAddress()+")：");
        String address = Utility.readString(20);
        System.out.print("租金("+house.getRent()+")：");
        int rent = Utility.readInt();
        System.out.print("状态("+house.getStatus()+")：");
        String status = Utility.readString(4);
        House newHouse = new House(house.getId(),name,phone,address,rent,status);
        if (houseService.update(updateId,newHouse)){
            System.out.println("-----------------修改成功-----------------");
        } else {
            System.out.println("-----------------修改失败-----------------");
        }

    }


}
