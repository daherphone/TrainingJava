package section10;

import java.util.Objects;

public abstract class Player {
String Name;
public Player(String name) {
	this.Name=name;
}
public void setName(String name) {
	Name = name;
}
public String getName() {
	return Name;
}
@Override
public int hashCode() {
	return Objects.hash(Name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Player other = (Player) obj;
	return Objects.equals(Name, other.Name);
}


}
