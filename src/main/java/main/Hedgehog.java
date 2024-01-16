package main;

public class Hedgehog {
    private String name; 
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }
    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak(String teksti){
        System.out.println(name+":"+teksti);

    }
    public void juoksee(int kierrosta){
        while(kierrosta !=0){
            System.out.println(this.name+" juoksee kovaa vauhtia!");
            kierrosta=kierrosta-1;
        }

    }

    public void esita(){
        System.out.println("Olen "+this.name+" ja ikäni on "+this.age+" vuotta, mutta antaisitko silti syötteen?");
    }

}