package bankAccountDIO.entities;

import java.util.Objects;

public class User {
private String name;
private int agency;
private int number;
private double balance;

public User() {};
public User(String name, int agency, int number, double balance) {
	
	this.name = name;
	this.agency = agency;
	this.number = number;
	this.balance = balance;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAgency() {
	return agency;
}
public void setAgency(int agency) {
	this.agency = agency;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}


@Override
public int hashCode() {
	return Objects.hash(agency, balance, name, number);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return agency == other.agency && Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
			&& Objects.equals(name, other.name) && number == other.number;
}
@Override
public String toString() {
	return "User [name=" + name + ", agency=" + agency + ", number=" + number + ", balance=" + balance + "]";
}



}
