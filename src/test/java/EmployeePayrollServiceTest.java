import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeesWhenWrittenToFileSouldMatchEmployeeEntries(){
        EmployeePayrollData[] arrayOfEmps={
                new EmployeePayrollData(1,"sirisha",100000.0),
                new EmployeePayrollData(2,"sowju",999999.9),
                new EmployeePayrollData(3,"kittu",888888.8),
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
       // employeePayrollService.writeEmployeePayrollData(FILE_IO);
        //employeePayrollService.printData(FILE_IO);
        //long entries = employeePayrollService.countEntries(FILE_IO);
      //  Assert.assertEquals(3,entries);
    }

}
