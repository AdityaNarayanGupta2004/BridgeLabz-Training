package junit.demo.employeewage_test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.demo.employeewage.EmployeeWage;

class EmployeeWageTest {

    private EmployeeWage employeeWage;

    @BeforeEach
    void setUp() {
        employeeWage = new EmployeeWage();
    }

    @Test
    void testAddCompany() {
        employeeWage.addCompanyEmpWage("TCS", 20, 20, 100);
        employeeWage.computeEmpWage();

        assertTrue(employeeWage.getTotalWage("TCS") > 0);
    }

    @Test
    void testMultipleCompanies() {
        employeeWage.addCompanyEmpWage("TCS", 20, 20, 100);
        employeeWage.addCompanyEmpWage("Infosys", 25, 22, 120);

        employeeWage.computeEmpWage();

        assertTrue(employeeWage.getTotalWage("TCS") > 0);
        assertTrue(employeeWage.getTotalWage("Infosys") > 0);
    }

    @Test
    void testUnknownCompany() {
        assertEquals(0, employeeWage.getTotalWage("ABC"));
    }

    @Test
    void testZeroMaxHours() {
        employeeWage.addCompanyEmpWage("Test", 20, 20, 0);
        employeeWage.computeEmpWage();

        assertEquals(0, employeeWage.getTotalWage("Test"));
    }

}

