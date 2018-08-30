package lwh.design.pattern.factory.normal;

import lwh.design.pattern.factory.Noodle;

/**
 * 抽象工厂类,普通工厂就是把简单工厂中具体的工厂类,划分成两层:抽象工厂层+具体的工厂子类层
 *
 * 特点：不仅做出来的产品要抽象,工厂也应该要抽象
 *
 * 与简单工厂相比：
 * 1) 工厂方法使得一个产品的实例化延迟到其具体工厂子类
 * 2) 拥抱变化,当需求变化,只需增删相应的类,不需要修改已有的类,对扩展开放,对修改封闭
 *
 * 缺点：
 * 每次新增一个具体的产品类,也要同时新增一个具体的工厂类
 *
 */
public abstract class NoodleFactory {

    public abstract Noodle createNoodle();
}
