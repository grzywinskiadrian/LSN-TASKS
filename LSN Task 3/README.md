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