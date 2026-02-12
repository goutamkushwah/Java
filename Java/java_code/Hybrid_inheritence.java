class GrandFather{
    void GrandFather() {
        System.out.println("GrandFather class method");
    }
}
class Father extends GrandFather{
    void Father() {
        System.out.println("Father class method");
    }
}
class son extends Father{
    void son() {
        System.out.println("Son class method");
    }
}
class Daughter extends Father{
    void Daughter() {
        System.out.println("Daughter class method");
    }
}

public class Hybrid_inheritence {
    public static void main(String[] args) {
        son s = new son();
        Daughter d = new Daughter();
        s.GrandFather();
        s.Father();
        s.son();
        d.GrandFather();
        d.Father();
        d.Daughter();
        Father f = new Father();
        f.GrandFather();
        f.Father();
    
    }
}
