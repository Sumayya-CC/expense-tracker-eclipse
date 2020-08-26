package com.example.etracker.Service;


import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.etracker.Dao.Etracker_Dao;
import com.example.etracker.Model.User;


@Service
public class Etracker_ServiceImpl implements Etracker_Service{
	
	@Autowired
	Etracker_Dao epTrackDao;
	
	public Map<String, java.lang.Object> graph1(int userId,int year){
		return epTrackDao.graph1(userId,year);
	}
	public Map<String, java.lang.Object> graph2(int userId, int year, int month){
		return epTrackDao.graph2(userId,year,month);
	}
	public Collection<Map<String,java.lang.Object>>  graph3(int userId, int year){
		return epTrackDao.graph3(userId,year);
	}
	
	public Collection<Map<String,java.lang.Object>> graph4(int userId, int year, int month){
		return epTrackDao.graph4(userId,year,month);
	}
	public List<Map<String, Object>> monthlycategorysum(int userId,int month,int year) {
		return epTrackDao.monthlycategorysum(userId,month,year);
	}

	public List<Map<String, Object>> yearlycategorysum(int userId,int year) {
		return epTrackDao.yearlycategorysum(userId,year);
	}
	
	public void addincome(int userId, String item, int categoryId, double amount, String transactionDate) {
			epTrackDao.addincome(userId,item,categoryId,amount,transactionDate);
		
	}
	public void addexpense(int userId, String item, int categoryId, double amount, String transactionDate) {
		    epTrackDao.addexpense(userId,item,categoryId,amount,transactionDate);
	
	}
	
	public void addincomecategory( String categoryName) {
		    epTrackDao.addincomecategory(categoryName);
	 
    }
    public void addexpensecategory(String categoryName) {
	        epTrackDao.addexpensecategory(categoryName);

    }

	
	
	public Collection<Map<String, Object>> getIncome(int userId) {
		return epTrackDao.getIncome(userId);
	}


	
	public Collection<Map<String, Object>> getExpense(int userId) {
		return epTrackDao.getExpense(userId);
	}


	public Collection<Map<String, Object>> getIncomeExpense(int userId) {
		return epTrackDao.getIncomeExpense(userId);
	}
	
	public int addUser(long id, String name, String emailId, String password ) {
		return epTrackDao.addUser(id, name, emailId, password);
		
	}
	public List<User> getUser(String emailId, String password) {
		return epTrackDao.selectUser(emailId,password);
	}
	public int resetPassword(String emailId, String password) {
		return epTrackDao.resetPassword(emailId,password);
	}
	@Override
	public List<Map<String, Object>> liscategoryexpense() {
		return epTrackDao.liscategoryexpense();

	}
	@Override
	public List<Map<String, Object>> liscategoryincome() {
		return epTrackDao.liscategoryincome();

	}
	

	
}
