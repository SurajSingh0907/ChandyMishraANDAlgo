# ChandyMishraANDAlgo

It's a fully distributed deadlock detection algorithm is given by Chandy, Misra, and Hass (1983).
This is considered an edge-chasing, probe-based algorithm.
It is also considered one of the best deadlock detection algorithms for distributed systems.

############################### Input set:###############################
follow command prompted message to proceed:
sample inputs:

::::: Options:<code> ::::
1. RunAlgo: run
2. End: end
Enter your choice :run
Enter no. of processes :5
Now enter dependecies across processes (mention 1, when there's dependecies between process, else 0)
P1 | P2 | P3 | P4 | P5 |

Enter complete row 1 (space separated) having 5 elements :
0 1 0 0 0
Enter complete row 2 (space separated) having 5 elements :
0 0 1 0 0
Enter complete row 3 (space separated) having 5 elements :
0 0 0 1 0
Enter complete row 4 (space separated) having 5 elements :
0 0 0 0 1
Enter complete row 5 (space separated) having 5 elements :
1 0 0 0 0

Here: 
Options are:
rqt : to request token for a site
end : to come out of process

4. See: provided complete input and output sample of execution in : sampleInputOutput.txt at root directory
