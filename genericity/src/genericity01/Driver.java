package genericity01;

public class Driver {
    public static void main(String[] args){
        Person<Contact> contactPerson = new Person<Contact>(new Contact("艾欧尼亚","111"));
        Person<Introduction> introductionPerson =new Person<>(new Introduction("刀锋",11));
        System.out.println(contactPerson);
        System.out.println(introductionPerson.toString());

    }
}
