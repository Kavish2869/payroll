package com.cg.payroll.services;

import java.util.*;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

public interface PayrollServices {
	int acceptAssociateDetails(String firstName, String lastName, String emailId, String department, 
			String designation, String pancard, int yearlyInvestmentUnder8oC, int basicSalary, 
			int epf, int companyPf, int accountNumber,String bankName, String ifscCode);
	
	double calculateNetSalary(int associateId) throws AssociateDetailNotFoundException;
	Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException;
	List<Associate> getAllAssociatesDetails();
	double calculateTax(int associateId) throws AssociateDetailNotFoundException;
	double calculateGrossSalary(int associateId) throws AssociateDetailNotFoundException;    
}