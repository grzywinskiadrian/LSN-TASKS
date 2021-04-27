# LSN TASK 1

### TASK
The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order, plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.

### SOLUTION

After reading a whole line with integers separated by white spaces I save them in the Array (simple split function on the  inserted line) and count how many numbers were entered.
Then I just parse entered numbers to Integer and put it to TreeSet, which guarantees that saved number will be distinct and in ascending order. Also is very easy to read min and max value, because I need to check first and last value in the set.
