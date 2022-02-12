package ro.ctrln.inheritance;

import java.util.Objects;
//POJO Plain Old Java Object
public class Battleship {

    protected String battleshipName;
    private int battleshipCapacity;

    public String getBattleshipName(){
        return this.battleshipName;
    }

    public void setBattleshipName(String name){
        if (name.contains("bad"))
            return;
        this.battleshipName=name;
    }

    public int getBattleshipCapacity() {
        return battleshipCapacity;
    }

    public void setBattleshipCapacity(int battleshipCapacity) {
        this.battleshipCapacity = battleshipCapacity;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "battleshipName='" + battleshipName + '\'' +
                ", battleshipCapacity=" + battleshipCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battleship that = (Battleship) o;
        return battleshipCapacity == that.battleshipCapacity && battleshipName.equals(that.battleshipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battleshipName, battleshipCapacity);
    }

    public void escapeProcedure(int escapePods){
        System.out.println("Escape procedure initiated in Battleship class with " + escapePods + " escape pods");
    }
}
