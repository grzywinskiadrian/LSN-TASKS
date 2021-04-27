# LSN TASK 1

### TASK
The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order, plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.

### SOLUTION

After reading a whole line with integers separated by white spaces I save them in the Array (simple split function on the  inserted line) and count how many numbers were entered.
Then I just parse entered numbers to Integer and put it to TreeSet, which guarantees that saved number will be distinct and in ascending order. Also is very easy to read min and max value, because I need to check first and last value in the set.


# LSN TASK 2

### TASK
Again, the input is a long list of integers. Provide a working code that will find all the pairs (in this integer list) that sum up to 13. Each pair in the output should have first number not greater than the second one and lines should be sorted in an ascending order.

### SOLUTION
After reading a whole line with integers separated by white spaces I process them by counting occurrences of each number in the TreeMap. I used TreeMap because it is helpful during writing the output.
First number has to be not greater than the second one, so during writing the output I check if the number is smaller or equal than the half of the sum (13 / 2 <= 6 - integer dividing) and if value equal 13 - i was entered in the input phase. If both values were inserted then I write n lines for that pair, where n is the bigger value of occurrences for both numbers.

# LSN TASK 3

### TASK
The first line of input contains a positive number n, next n lines contains pairs of positive integers, where each pair identifies a connection between two vertices in a graph. Please provide a working code that will give us the answer for the following questions: how many separated graphs are in the input.

### SOLUTION
I am reading the pairs of positive integers in the loop, where number of iterations was entered by user before.
For each pair I have to check which scenario is happening
- Numbers not exists in any graphs - I have to create new graph
- Numbers exists in exactly one graph - I have to add inserted verticles for that graph
- Numbers exists in more than one graph - I have to add inserted verticles to one graph and merge that graph with others, in this case really useful was reduce function in streams and creating new graph which contains every suitable graph for inserted verticles. Old graphs are deleted and new one is added to list.

Graphs are stored as List of Sets so I have only distinct verticles in each graph.