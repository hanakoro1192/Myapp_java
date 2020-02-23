public class MyApp{

    public static void main(String[] args){

        User tom = new User();
        System.out.println(tom.name); 
        tom.sayHi();

        AdminUser bob = new AdminUser();
        System.out.println(bob.name);
        bob.sayHi(); //継承しているため使える
        bob.sayHello();
    }
}