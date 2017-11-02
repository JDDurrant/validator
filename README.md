NOTE: I didn't write the following specification. It was given to me for the purpose of assessing my performance on a Java course.

# Project Specification
Write two validation applications.

## String Validator
Taking input from the console in the form of a scanner.

The user types in two strings.

The first is a string to be searched (source string). The second is the search string.

Your application needs to display a message when:
1. The two strings are the same
2. The source string starts with the search string
3. The source string ends with the search string
4. The source string contains the search string

The documentation on String is available at [this URL](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html).

Suggested source strings: "tomorrow", "toto", "timbuktu", "the", "hello", "heat", "carcas"

## Time Validator:
The application adds together two inputs of hours and minutes.

Your application should check that the hours are in the range 0-23 and the minutes are in the range 0-59.

The application should display error messages if the values are invalid.

Valid values are then added together.

Hint: The easiest way to handle values over 24 hours is to convert all values to minutes and do the calculation.

The values should be displayed in a 24 hour format.

### Optional task:

Attempt the same as above but this time subtracting one value from another.

The second set of values must be less than the first.