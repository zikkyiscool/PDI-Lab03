START

    DISPLAY "Enter number of cities: "
    INPUT n

    IF n <= 0 THEN
        DISPLAY "Number of must be positive."
        END
    END IF

    CREATE City with size n

    FOR i = 0 TO n  DO

        DISPLAY "Enter details for city ", i + 1

        DISPLAY "City's name: "
        INPUT name

        DISPLAY "Temperature: "
        INPUT tempC

        CREATE Temperature(name,tempC)

        ADD Temperature to City

    END FOR

    DISPLAY "======= RESULTS ======="

    CALL City.displayAllCities()

    getTempF(){
        return(TempC*(9/5) + 32 )
    }

    DISPLAY "Temperature in Fahrenheit: F", getTempF()

    CLOSE input

END

