package com.demo.grammer.innerclass;

interface IContent {
    int value();
}

interface IDestination {
    String readLabel();
}
/**
 *
 * @author wanglf1207
 *
 */
public class Goods {

    private class Content implements IContent {
        private int i = 11;
        public int value() {
            System.out.println("内部类的value方法....");
            return i;
        }
    }
    protected class Destination implements IDestination {
        private String label;
        private Destination() {
            System.out.println("内部类Destination的默认构造方法  ...");
        }
        private Destination(String whereTo) {
            System.out.println("内部类的构造方法 Destination ...");
            label = whereTo;
        }
        public String readLabel() {
            System.out.println("内部类的 readLabel方法...");
            return label;
        }
    }

    public IDestination dest(String s) {
        System.out.println("外部类的dest方法....");
        return new Destination(s);
    }
    public IContent cont() {
        System.out.println("外部类的cont方法....");
        return new Content();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 调用方式一
         */
        Goods goods = new Goods();
        goods.cont();
        goods.dest("Beijing");

        /*
         * 调用方式二
         * Content()是內部类Content的默认构造方法
         */
        Goods.Content content = new Goods().new Content();
        content.value();

        Goods.Destination destination = new Goods().new Destination();
        destination.readLabel();
    }
}   