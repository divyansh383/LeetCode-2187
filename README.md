# LeetCode-2187
PROBLEM -

You are given an array time where time[i] denotes the time taken by the ith bus to complete one trip.
Each bus can make multiple trips successively; that is, the next trip can start immediately after completing the current trip. Also, each bus operates independently; that is, the trips of one bus do not influence the trips of any other bus.
You are also given an integer totalTrips, which denotes the number of trips all buses should make in total. Return the minimum time required for all buses to complete at least totalTrips trips.

SOLUTION -

I've come across a LeetCode problem where I need to find the minimum amount of time required to complete a certain number of trips, given the time it takes to complete each trip. The solution code provided here is written in Java and contains two methods.
The first method, named "valid", takes in three arguments: the number of trips we are considering taking, an array containing the time it takes to complete each trip, and the total number of trips we need to complete. It calculates the total number of trips we can complete within the given time and returns true if we can complete the required number of trips within the given time, and false otherwise.
The second method, named "minimumTime", takes in two arguments: an array containing the time it takes to complete each trip, and the total number of trips we need to complete. It first checks if the given time array has only one element, in which case it simply multiplies that element with the total number of trips and returns the result as the answer. Otherwise, it calculates the maximum possible time required to complete all the trips by multiplying the maximum time from the time array with the total number of trips. It then initializes the range of possible answers with low as 1 and high as the minimum of the maximum time and the maximum value of a long. It then uses binary search to find the minimum time required to complete all the trips within the given time constraints, using the "valid" method to check if a certain number of trips can be completed within a given amount of time. Once the minimum time is found, it is returned as the answer.
In summary, this solution uses binary search to efficiently find the minimum time required to complete all the trips within the given time constraints.
