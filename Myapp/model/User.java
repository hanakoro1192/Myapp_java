public class User{ //親クラス
    String name;

    //constructor クラスと同じメソットを作成
    User(String name){
        this.name = name;
    }

    //this()

    User(){
        // this.name = "Me";
        this("Me!!");
    }

    void sayHi(){
        System.out.println("Hi!!" + this.name); 
    }

}