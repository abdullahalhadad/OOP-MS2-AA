package com.motorph.model;

public class ContractualEmployee extends Employee {

    public ContractualEmployee(Employee base) {
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
        return hours * getHourlyRate();
    }
}
