package com.cg.payroll.beans;

public class Salary {

	private double basicSalary, hra, conveyenceAllowance;
	private double otherAllowance, personalAllowance, monthlyTax, epf;
	private double companyPf, grossSalary, netSalary;
	public double calculateNonTaxableAmount;
	
	public Salary() {
		// TODO Auto-generated constructor stub
	}

	public Salary(double basicSalary, double epf, double companyPf)
			 {
		super();
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.conveyenceAllowance = conveyenceAllowance;
		this.otherAllowance = otherAllowance;
		this.personalAllowance = personalAllowance;
		this.monthlyTax = monthlyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
		this.calculateNonTaxableAmount = calculateNonTaxableAmount;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getConveyenceAllowance() {
		return conveyenceAllowance;
	}

	public void setConveyenceAllowance(double conveyenceAllowance) {
		this.conveyenceAllowance = conveyenceAllowance;
	}

	public double getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}

	public double getPersonalAllowance() {
		return personalAllowance;
	}

	public void setPersonalAllowance(double personalAllowance) {
		this.personalAllowance = personalAllowance;
	}

	public double getMonthlyTax() {
		return monthlyTax;
	}

	public void setMonthlyTax(double monthlyTax) {
		this.monthlyTax = monthlyTax;
	}

	public double getEpf() {
		return epf;
	}
	public void setEpf(double epf) {
		this.epf = epf;
	}
	public double getCalculateNonTaxableAmount() {
		return calculateNonTaxableAmount;
	}

	public void setCalculateNonTaxableAmount(double calculateNonTaxableAmount) {
		this.calculateNonTaxableAmount = calculateNonTaxableAmount;
	}

	public double getCompanyPf() {
		return companyPf;
	}

	public void setCompanyPf(double companyPf) {
		this.companyPf = companyPf;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basicSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(companyPf);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(conveyenceAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(epf);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(grossSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(monthlyTax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(netSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(otherAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(personalAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		if (Double.doubleToLongBits(basicSalary) != Double.doubleToLongBits(other.basicSalary))
			return false;
		if (Double.doubleToLongBits(companyPf) != Double.doubleToLongBits(other.companyPf))
			return false;
		if (Double.doubleToLongBits(conveyenceAllowance) != Double.doubleToLongBits(other.conveyenceAllowance))
			return false;
		if (Double.doubleToLongBits(epf) != Double.doubleToLongBits(other.epf))
			return false;
		if (Double.doubleToLongBits(grossSalary) != Double.doubleToLongBits(other.grossSalary))
			return false;
		if (Double.doubleToLongBits(hra) != Double.doubleToLongBits(other.hra))
			return false;
		if (Double.doubleToLongBits(monthlyTax) != Double.doubleToLongBits(other.monthlyTax))
			return false;
		if (Double.doubleToLongBits(netSalary) != Double.doubleToLongBits(other.netSalary))
			return false;
		if (Double.doubleToLongBits(otherAllowance) != Double.doubleToLongBits(other.otherAllowance))
			return false;
		if (Double.doubleToLongBits(personalAllowance) != Double.doubleToLongBits(other.personalAllowance))
			return false;
		return true;
	}
	
}
