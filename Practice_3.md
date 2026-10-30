START

    DISPLAY "Enter number of employee: "
    INPUT n

    IF n <= 0 THEN
        DISPLAY "Number of must be positive."
        END
    END IF

    CREATE City with size n

    FOR i = 0 TO n  DO

        DISPLAY "Enter details for each employee ", i + 1

        DISPLAY "Employee ID: "
        INPUT employeeId

        DISPLAY "Employee's name: "
        INPUT name

        DISPLAY "Basic salary: "
        INPUT basicSalary

        CREATE Salary(employeeId,name,basicSalary)

        ADD Salary to Employee

    END FOR

    DISPLAY "======= RESULTS ======="

    CALL employeemanagement.displayAllEmployee()

    getGrossSalary(){
        return(basicSalary +(0.2 * basicSalary) + (0.1 * basicSalary))
    }

    DISPLAY "Gross Salary: $", getGrossSalary()

    CLOSE input

END

