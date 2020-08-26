package com.example.etracker.Service;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.example.etracker.Model.User;

public interface Etracker_Service {
	
    public Map<String, java.lang.Object> graph1(int userId, int year);
	public Map<String, java.lang.Object> graph2(int userId, int year, int month);
	public Collection<Map<String,java.lang.Object>>  graph3(int userId, int year);
	public Collection<Map<String,java.lang.Object>> graph4(int userId, int year, int month);
	public List<Map<String, Object>> monthlycategorysum(int userId,int month,int year);
	public List<Map<String, Object>> yearlycategorysum(int userId,int year);
	
	public void addincome(int userId, String item, int categoryId, double amount, String transactionDate);
	public void addexpense(int userId, String item, int categoryId, double amount, String transactionDate);
	public void addincomecategory(  String categoryName);
	public void addexpensecategory( String categoryName);

	

	public Collection<Map<String,Object>>  getIncome(int userId);

	public Collection<Map<String, Object>> getExpense(int userId);

	public Collection<Map<String, Object>> getIncomeExpense(int userId);
	
	public List<User> getUser(String emailId, String password);
	public int resetPassword(String emailId, String password);

	public int addUser(long l, String name, String emailId, String password );
	
	public List<Map<String, Object>> liscategoryexpense();
	public List<Map<String, Object>> liscategoryincome();
	
}
