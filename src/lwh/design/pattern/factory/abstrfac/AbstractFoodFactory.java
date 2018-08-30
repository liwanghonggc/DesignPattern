package lwh.design.pattern.factory.abstrfac;

import lwh.design.pattern.factory.Noodle;

/**
 * 抽象饭店,抽象工厂类
 * 之前介绍的工厂都是单产品系的,抽象工厂是多产品系的
 * 举例：每个饭店不仅卖面条,还提供饮料卖
 */
public abstract class AbstractFoodFactory {

    /** 生产面条 **/
    public abstract Noodle createNoodle();

    /** 生产饮料 **/
    public abstract Drink createDrink();
}
