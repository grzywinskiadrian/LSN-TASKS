# LSN TASK 2

### TASK
Again, the input is a long list of integers. Provide a working code that will find all the pairs (in this integer list) that sum up to 13. Each pair in the output should have first number not greater than the second one and lines should be sorted in an ascending order.

### SOLUTION
After reading a whole line with integers separated by white spaces I process them by counting occurrences of each number in the TreeMap. I used TreeMap because it is helpful during writing the output.
First number has to be not greater than the second one, so during writing the output I check if the number is smaller or equal than the half of the sum (13 / 2 <= 6 - integer dividing) and if value equal 13 - i was entered in the input phase. If both values were inserted then I write n lines for that pair, where n is the bigger value of occurrences for both numbers.