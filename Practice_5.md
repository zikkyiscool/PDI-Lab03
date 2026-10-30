START

    INPUT numberOfCustomers

    IF numberOfCustomers <= 0 THEN
        DISPLAY "Number must be positive"
        STOP
    END IF

    CREATE Bank with numberOfCustomers

    FOR each customer from 1 to numberOfCustomers DO

        INPUT accountNumber
        WHILE accountNumber is not 14 digits DO
            DISPLAY "Invalid account number"
            INPUT accountNumber
        END WHILE

        INPUT name
        INPUT balance

        WHILE balance < 0 DO
            DISPLAY "Balance cannot be negative"
            INPUT balance
        END WHILE

        CREATE Customer object
        ADD Customer object to Bank

    END FOR

    REPEAT
        DISPLAY "===== BANKING SYSTEM ====="
        DISPLAY "1. Deposit"
        DISPLAY "2. Withdraw"
        DISPLAY "3. Display Account Details"
        DISPLAY "4. Exit"

        INPUT choice

        IF choice >= 1 AND choice <= 3 THEN

            INPUT accountNumber
            FIND customer using accountNumber

            IF customer is not found THEN
                DISPLAY "Account not found"

            ELSE
                IF choice = 1 THEN
                    INPUT amount

                    IF amount > 0 THEN
                        balance = balance + amount
                        DISPLAY "Deposit successful"
                    ELSE
                        DISPLAY "Invalid amount"
                    END IF

                ELSE IF choice = 2 THEN
                    INPUT amount

                    IF amount <= 0 THEN
                        DISPLAY "Invalid amount"
                    ELSE IF amount > balance THEN
                        DISPLAY "Insufficient balance"
                    ELSE
                        balance = balance - amount
                        DISPLAY "Withdrawal successful"
                    END IF

                ELSE IF choice = 3 THEN
                    DISPLAY accountNumber
                    DISPLAY name
                    DISPLAY balance
                END IF
            END IF

        ELSE IF choice != 4 THEN
            DISPLAY "Invalid choice"
        END IF

    UNTIL choice = 4

    DISPLAY "Thank you for using our banking system"

END

