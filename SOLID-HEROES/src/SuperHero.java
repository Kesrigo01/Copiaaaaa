public class SuperHero {

    private String name;

    public SuperHero(String name){
        this.name=name;
    }

    public void fly(){
        System.out.println(name + " vuela");
    }

    public void climbWall(){
        System.out.println(name + " trepa muros");
    }

    public void useSuperStrengt(){
        System.out.println(name + " usa superfuerza");
    }
    
}
