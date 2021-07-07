package lecture04;

public class Fighter {
    private int hitPoint; //privateのint型hitPoint変数を宣言する
    private int power;
    private String name;

    public Fighter(int hitPoint,int power,String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.setHitPoint(enemy.getHitPoint() - this.power);
        System.out.println(""+name+"　は　"+enemy.getName()+"　に　"+power+"ダメージを与えた");
    }

    public boolean isAlive(){
        if(this.hitPoint <= 0){
            System.out.println(""+name+"　は倒れた");
            return false;
        }
        return true;

    }

    public int getHitPoint(){
        return hitPoint; //
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public String getName(){
        return name;
    }
}
