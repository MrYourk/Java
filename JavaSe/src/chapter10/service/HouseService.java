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

    public HouseService(int size) {

        houses = new House[size];
        houses[0] = new House(1,"王老二","1128","深圳龙湖区",2000,"未出租");
    }


    public House[] list(){
        return houses;
    }

}
