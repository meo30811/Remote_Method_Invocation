package server;

import java.io.Serializable;

public class User implements Serializable,Comparable {

	private String name;

	public User(String name)
	{
		this.name= name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	 public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	       User user = (User) o;

	        return user.equals(user.name);
	    }
	
    public int hashcode()
	{
		return name.hashCode();
	}
    
    @Override
    public int compareTo(Object o) {
       User other = (User) o;
        return this.name.compareTo(other.name);
    }
}
