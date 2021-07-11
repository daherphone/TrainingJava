package section10;

import java.util.ArrayList;

public class Team<T extends Player> {
String name;
ArrayList<T> members=new ArrayList<T>();
int played=0;
int tied=0;
int won=0;
int lost =0;
public Team(String name) {
	this.name=name;
}
 public boolean addPlayer(T t) {
	 if(t==null)return false;
	 if(members.contains(t)) {System.out.println("This player already exist in the team.");
	 return false;
	 }
	 else { System.out.println(t.getName() + " picked for team " + this.name);
	 return this.members.add(t);}
 }
 public void matchResult(Team<T> opponent, int ourScore, int theirScore ) {
	 String message;

     if(ourScore > theirScore) {
         won++;
         message = " beat ";
     } else if(ourScore == theirScore) {
         tied++;
         message = " drew with ";

     } else {
         lost++;
         message = " lost to ";
     }
     played++;
     if(opponent != null) {
         System.out.println(this.getName() + message + opponent.getName());
         opponent.matchResult(null, theirScore, ourScore);
     }
	 
 }

 public String getName() {
	return name;
}
 public int ranking() {
     return (won * 2) + tied;
 }
}
