package mode.application;


import model.entities.Employee;
import model.services.PensionService;
import model.services.SalaryService;
import model.services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        SalaryService salaryService = new SalaryService(new TaxService(),new PensionService());

        //forma errada


        System.out.print("name: ");
        String name= sc.nextLine();
        System.out.print("Salario bruto: ");
        double groosSalary = sc.nextDouble();
        Employee employee = new Employee(name, groosSalary);
        double netSalary = salaryService.netSalary(employee);
        System.out.printf("Salario liquido = %.2f%n" , netSalary);

        sc.close();
    }

}
