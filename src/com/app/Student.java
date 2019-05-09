package com.app;

public class Student {
private String stdName;

public Student() {
	super();
}

public String getStdName() {
	return stdName;
}

public void setStdName(String stdName) {
	this.stdName = stdName;
}

@Override
public String toString() {
	return "Student [stdName=" + stdName + "]";
}

}
