
public class Player implements Comparable {
    private String name, team, position;
    private int sal, weight;
    
public Player(String n, String t, String p, int s, int w){
    name=n;
    team=t;
    position=p;
    sal=s;
    weight=w;
}    

public String getName(){
    return name;
}

public String getTeam(){
    return team;
}

public String toString(){
String info="Name:\t"+name+"\n";
info+="------------------------------------------\n";
info+="Team:\t"+team+"\n";
info+="Position:\t"+position+"\n";
info+="Salary:\t$"+sal+"\n";
info+="Weight:\t"+weight+"lb";

return info;
}

    
public int compareTo(Object o) {
    return name.compareTo(((Player)o).getName());
}

}
