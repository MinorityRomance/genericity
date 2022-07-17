package genericity;

public class Driver {
    public static void main(String[] args){
        Info<String> i = new Info<String>();
        i.setVar("我落泪情绪零碎");

        Info<Object> k = new Info<Object>();
        k.setVar(new Object());

       // System.out.println(i.getVar().length());
        fun1(i);
        fun1(k);

        fun(new Object());
        fun(new String("a"));
    }
    public static <T extends Object> T fun(T data){
        Info<T> i = new Info<T>();
        i.setVar(data);

        return data;
    }
    public static void fun1(Info<? super String> temp ){
        System.out.println(temp.getVar());
    }
    public static <T extends Object> void fun2() throws Exception{


    }
}
