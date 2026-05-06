package chapter11.abstract_;

abstract public class Template {
    //模式设计模式
    public abstract void job();

    public void calculateTemplate(){

        //得到开始时间
        long start = System.currentTimeMillis();
        job(); //动态机制绑定

        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间：" + (end-start));
    }
}
