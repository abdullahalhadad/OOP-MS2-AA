package com.motorph.model;

import com.motorph.util.AppConstants;

public class ContractualEmployee extends Employee {

    public ContractualEmployee(int employeeId, String lastName, String firstName,
                               String position, String status, double basicSalary,
                               double riceSubsidy, double phoneAllowance, double clothingAllowance) {

        super(employeeId, lastName, firstName, position, status,
                basicSalary, riceSubsidy, phoneAllowance, clothingAllowance);
    }

    @Override
    public double calculateGrossPay() {
        // Hourly-based computation (example: uses full working hours)
        double hoursWorked = AppConstants.STANDARD_WORK_DAYS_PER_MONTH *
                AppConstants.REGULAR_HOURS_PER_DAY;

        return hoursWorked * getHourlyRate();
    }

    @Override
    public double calculateDeductions() {
        // Example: lower deductions than regular
        return calculateGrossPay() * 0.10;
    }

    @Override
    public double calculateNetPay() {
        return calculateGrossPay() - calculateDeductions();
    }
}
