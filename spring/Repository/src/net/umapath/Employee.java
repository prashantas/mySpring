package net.umapath;

import org.springframework.stereotype.Repository;
@Repository("repo")
public class Employee {
	public String getName() {
		return"Vinod";
	}
	public String getAddress() {
		return"bangalore";
	}
}