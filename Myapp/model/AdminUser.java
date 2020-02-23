public class AdminUser extends User{ //小クラス

    AdminUser(String name){ //コンストラクタの設定
        super(name); //引き継ぐ 親クラス
    }

    //メソットの追加
    void sayHello(){
        System.out.println("Hello!!" + this.name); 
    }

    //親クラスの上書きも可能となる
    @Override //overrideしたことを表す
    void sayHi(){
        System.out.println("[admin] Hi!!" + this.name); 
    }
}