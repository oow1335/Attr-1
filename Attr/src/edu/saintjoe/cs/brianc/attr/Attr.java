package edu.saintjoe.cs.brianc.attr;

public class Attr {
	  private final String name;
	  private Object value = null;
//
	  public Attr(String name) {
	    this.name = name;
	    }
// This is a one peramater constructor, we know its name but not
	  public Attr(String name, Object value) {
	    this.name = name;
	    this.value = value;
	    }

	  public String getname() {
	    return name;
	    }

	  public Object getvalue() {
	    return value;
	    }

	  public Object setValue(Object newValue) {
	    Object oldVal = value;
	    value = newValue;
	    return oldVal;
	    }

	  public String toString() {
	    return name + "='" + value + "'";
	    }
	}
