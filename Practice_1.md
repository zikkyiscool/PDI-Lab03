START

    DISPLAY "Enter number of books: "
    INPUT n

    IF n <= 0 THEN
        DISPLAY "Number of books must be positive."
        END
    END IF

    CREATE Library with size n

    FOR i = 0 TO n - 1 DO

        DISPLAY "Enter details for book ", i + 1

        DISPLAY "Book ID: "
        INPUT id

        DISPLAY "Title: "
        INPUT title

        DISPLAY "Author: "
        INPUT author

        DISPLAY "Price: "
        INPUT price

        CREATE Book(id, title, author, price)

        ADD Book to Library

    END FOR

    DISPLAY "===== LIBRARY BOOKS ====="

    CALL library.displayAllBooks()

    averagePrice = library.calculateAveragePrice()

    DISPLAY "Average price: $", averagePrice

    CLOSE input

END
