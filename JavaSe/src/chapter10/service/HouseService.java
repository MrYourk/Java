package chapter10.service;

import chapter10.domain.House;

/**
 * HouseService.java<=>类 [业务层]
 * //定义House[] ,保存House对象
 * 1. 响应HouseView的调用
 * 2. 完成对房屋信息的各种操作(增删改查c[create]r[read]u[update]d[delete])
 */
public class HouseService {

    private House[] houses;
    private int houseNum = 1; //记录当前有多少个房屋信息
    private int houseCount =1; //ID自增

    public HouseService(int size) {

        houses = new House[size];
        houses[0] = new House(1,"王老二","1128","湖南省",2000,"未出租");
    }

    //显示房屋信息
    public House[] list(){
        return houses;
    }

    //新增房屋信息
    public boolean add(House house){
        if (houseNum == houses.length){
            System.out.println("数组满了，无法新增");
            return false;
        }
        //把house对象加到houses中，表示新增房屋，HouseNum累加
        houses[houseNum++] = house;
        house .setId(++houseCount);

        return true;
    }

    //删除房屋信息
    public boolean del(int id){

        //查找目标下标签
        int index = -1;
        for (int i = 0; i < houseNum; i++) {//只遍历已有房屋信息
            if (id == houses[i].getId()){
                index = i;
                break;
            }
        }
        if (index == -1){
            //说明删除id不在数组中
            return false;
        }

        for (int i = 0; i < houseNum-1; i++) {
            houses[i] = houses[i+1];
        }
        //把当前存在的房屋信息的最后一个 设置为null
        houses[--houseNum] = null;
        return true;

    }

    //查找房屋信息
    public House select(int id){

        for (int i = 0; i < houseNum; i++) {//从现有房屋信息中查找
            if (houses[i].getId() == id){//说明找到了
               return houses[i];
            }
        }

        return null;
    }

    //更新房屋信息
    public boolean update(int id, House house){
        for (int i = 0; i < houseNum; i++) {
            if (houses[i].getId() == id){
                houses[i] = house;
                return true;
            }
        }
        return false;
    }

}
