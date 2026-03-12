package com.motorph.model;

public class RegularEmployee extends Employee {

    public RegularEmployee(Employee base) {
        super(
                base.getEmployeeId(),
                base.getLastName(),
                base.getFirstName(),
                base.getPosition(),
                base.getStatus(),
                base.getBasicSalary(),
                base.getRiceSubsidy(),
                base.getPhoneAllowance(),
                base.getClothingAllowance()
        );
    }

    @Override
    public double calculateRegularPay(double hours) {
        return getBasicSalary() / 2; // semi-monthly salary
    }
}
