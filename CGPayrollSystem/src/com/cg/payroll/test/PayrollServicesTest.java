package com.cg.payroll.test;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.util.*;

public class PayrollServicesTest {
private static PayrollServices services;

@BeforeClass
public static void setUpTestEnv() {
	services = new PayrollServicesImpl();
}

@Before
public void setUpTestData() {
	Associate associate1 = new Associate(101,78000,"Satish","Mahajan","Training","Manager",
			"DTDYF736","satish.mahajan@capgemini.com", new Salary(87738,1800,1800), new BankDetails(12345,"HDFC","4563" ));
	Associate associate2 = new Associate(102,77000,"Satish","Majan","Training","Ex-Manager",
			"DTJHS36","satish.majan@capgemini.com", new Salary(81738,1200,1200), new BankDetails(12332,"HDFC","5453" ));
	
	PayrollDBUtil.associates.put(associate1.getAssociateId(),associate1);
	PayrollDBUtil.associates.put(associate2.getAssociateId(),associate2);
	
	PayrollDBUtil.ASSOCIATE_ID_COUNTER=102;
}

@After
public void tearDownTestData() {
	PayrollDBUtil.associates.clear();
	PayrollDBUtil.ASSOCIATE_ID_COUNTER=100;
}

@Test(expected=AssociateDetailNotFoundException.class)
public void testGetAssociateDetailsForInvalidAssociateId() throws AssociateDetailNotFoundException {
	services.getAssociateDetails(2512);
}

@Test
public void testGetAssociateDetailsValidAssociateId() throws AssociateDetailNotFoundException {
	Associate expectedAssociate = new Associate(101,78000,"Satish","Mahajan","Training","Manager",
			"DTDYF736","satish.mahajan@capgemini.com", new Salary(87738,1800,1800), new BankDetails(12345,"HDFC","4563" ));
	Associate actualAssociate =services.getAssociateDetails(101);
	Assert.assertEquals(expectedAssociate, actualAssociate);
	
}

@Test(expected=AssociateDetailNotFoundException.class)
public void testCalculateNetSalaryForInvalidAssociateId() throws AssociateDetailNotFoundException {
	services.calculateNetSalary(1011);
}
@Test
public void testAcceptAssociateDetailsForValidData() {
	int expectedId=103;
	int actualId=services.acceptAssociateDetails("AB", "cd", "abc@xy", "department", "designation", "pancard", 100, 200, 10, 20, 12345, "bankName", "ifscCode");
	Assert.assertEquals(expectedId, actualId);
}
@Test(expected=AssociateDetailNotFoundException.class)
public void testAcceptAssociateDetailsForInvalidData() throws AssociateDetailNotFoundException {
	services.getAssociateDetails(12343);
}
@Test
public void testCalculateNetSalaryForValidAssociateId() throws AssociateDetailNotFoundException {
	int expectedNetSalary = 192236;
	int actualNetSalary=(int)services.calculateNetSalary(101);
	Assert.assertEquals(expectedNetSalary, actualNetSalary);
}

@Test
public void testGetAllAssociateDetails() {
	Associate associate1= new Associate(101,78000,"Satish","Mahajan","Training","Manager",
			"DTDYF736","satish.mahajan@capgemini.com", new Salary(87738,1800,1800), new BankDetails(12345,"HDFC","4563" ));
	Associate associate2=new Associate(102,77000,"Satish","Majan","Training","Ex-Manager",
			"DTJHS36","satish.majan@capgemini.com", new Salary(81738,1200,1200), new BankDetails(12332,"HDFC","5453" ));
	ArrayList <Associate> expectedAssociateList = new ArrayList<>();
	expectedAssociateList.add(associate1);
	expectedAssociateList.add(associate2);
	ArrayList <Associate> actualAssociateList = (ArrayList<Associate>) services.getAllAssociatesDetails();
	Assert.assertEquals(expectedAssociateList, actualAssociateList);
}
@AfterClass
public static void tearDownEnv() {
	services=null;
}
}