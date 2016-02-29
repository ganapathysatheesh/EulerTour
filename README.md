# EulerTour
Project to find the Euler tour in a graph provided 

The project is to find if the given graph has an Euler Tour/path or not. If the Euler tour is present, we print the Euler Tour. 

How to run the Project

1) Compile the java files.
2) EulerUtil is the class which has the main driver program to be run 
3) Use "java EulerUtil FileName" to read input from a file or "java EulerUtil" to input the graph from the console
4) The program prints the Euler Tour/Path if one exists

Input format:

numberOfNodes numberOfEdges Edge1.Vertex1 Edge1.Vertex2 Edge1.weight ... .... ..... EdgeN.VertexU EdgeN.VertexV EdgeN.weight

Output format: 

list of edges in the Euler Tour in correct order. 

#All edges are undirected 

Sample input

6 10
1 2 1
1 3 1
1 4 1
1 6 1
2 3 1
3 6 1
3 4 1
4 5 1
4 6 1
5 6 1

Sample output

(1,2)
(2,3)
(3,6)
(4,6)
(4,5)
(5,6)
(1,6)
(1,3)
(3,4)
(1,4)

Explanation
The actual tour is 1->2->3->6->4->5->6->1->3->4->1. If the edge (1,4) did not exist, then the graph has an Euler path between 1 and 4, and the output is same as above, except for the last line is not there. In this case, the algorithm outputs the path starting at node 1, which is the smaller node of 1 and 4. 
