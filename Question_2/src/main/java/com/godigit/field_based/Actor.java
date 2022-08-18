package com.godigit.field_based;

public class Actor {
public String actorName;
public int mobileNumber;
@Override
public String toString() {
	return "Actor [actorName=" + actorName + ", mobileNumber=" + mobileNumber + "]";
}
public String getActorName() {
	return actorName;
}
public void setActorName(String actorName) {
	this.actorName = actorName;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber = mobileNumber;
}

}
