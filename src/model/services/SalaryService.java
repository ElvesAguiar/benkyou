package model.services;

import model.entities.Employee;

public class SalaryService {

    private TaxService service = new TaxService();
    private  PensionService pensionService = new PensionService();
    public double netSalary (Employee employee) {
        return employee.getGrossSalary() - service.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }
}
