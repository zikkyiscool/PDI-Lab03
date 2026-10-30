START

    INPUT numberOfStudents

    IF numberOfStudents <= 0 THEN
        DISPLAY "Number must be positive!"
        STOP
    END IF

    INITIALIZE Student array with numberOfStudents

    FOR each student from 1 to numberOfStudents DO

        INPUT studentId
        INPUT name

        INPUT math
        INPUT physic
        INPUT chemistry
        INPUT it
        INPUT pe

        CREATE Student object using the input data

        ADD Student object to the array

    END FOR

    DISPLAY "===== RESULTS ====="

    FOR each student in the array DO

        CALCULATE total = math + physic + chemistry + it + pe

        CALCULATE average = total / 5

        IF average >= 90 THEN
            grade = "A"
        ELSE IF average >= 75 THEN
            grade = "B"
        ELSE IF average >= 50 THEN
            grade = "C"
        ELSE
            grade = "F"
        END IF

        DISPLAY studentId
        DISPLAY name
        DISPLAY total
        DISPLAY average
        DISPLAY grade

    END FOR

END