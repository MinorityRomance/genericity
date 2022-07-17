package genericity;

public class Info <T extends Object> implements Inf <T>{
    private T var;


    public void setVar(T var){
        this.var = var;
    }

    @Override
    public T getVar(){
        return this.var;
    }
}
