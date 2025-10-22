public class Pokemon {

    String name;
    int cp; 
    int level;
    String a1;
    String a2;
    String a3;
    String a4;

    Pokemon(){
        level = 1;
    }

    Pokemon(String name, int level, int cp, String a1, String a2, String a3, String a4) {
        this.name = name;
        this.level = level;
        this.cp = cp;
        this.a1 = a1;
        this.a2 = a2; 
        this.a3 = a3;
        this.a4 = a4;
    }

    void a1(){
        System.out.println(name + ", attack with " + a1 + "!");
    }
    void a2(){
        System.out.println(name + ", attack with " + a2 + "!");
    }
    void a3(){
        System.out.println(name + ", attack with " + a3 + "!");
    }
    void a4(){
        System.out.println(name + ", attack with " + a4 + "!");
    }
    
}