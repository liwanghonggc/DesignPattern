package lwh.design.pattern.observer;

//主题
public interface Subject {

    //注册
    void registerObserver(Observer o);

    //移除
    void removeObserver(Observer o);

    //主题改变时,进行通知
    void notifyObservers();

}
