First I implemented Position_ interface in the Node Class which does the work as given in the ques. 
Then I implemented LinkedList_ interface in Linked List class. There I wrote the functions of add and positions. For Positions function, I made listiter class that implements Iterator<Position_<T>> interface. I was uncomfortable in using the function position so I added a new function of mine positions2 which return the data of the node. For that, I wrote listiter2 to implement it.
Then I implemented GradeInfo_, in Gradeinfo Class. 
Then I implemented CourseGrade_ interface in CourseGrade class. 
Then I implemented Student_ interface in Student class. I have also added one function i.e. addcourse from my side in this class which add Gradeinfo_ ,coursetitle, and courssnum to a student. 
Then I implement Entity_ interface in the entity class. Here also I added one function (addstudent) which add student to the link list.
Now I made Hostel, Department and course class extending entity class. In the course class, I added subname variable that is the coursetitle of that course.
I also made a class named "all"  whose objects are linked list of allCourses, allDepartments, allHostels and allStudents.
It has two functions for each class For ex. existstudent and returnstudent. ExistStudent return boolean value true if the student existed beforehand and false otherwise. ReturnStudent returns the student if existed and null otherwise. Likewise two functions for all other linklist also are made.
These were all the classes i made for the main program.
Finally, I wrote the main function. It has two function getData and answerquery.
In getData function, I take two files as input students.txt and courses.txt. By using bufferedReader I read stuendts.txt line by line. First I checked if the hostel existed or not if not then added the hostel to allHostel the same for department and student. Then I added the student to the hostel and department.
Then I read the second file courses.txt line by line.
First I checked course existed or not if not then added the course to allCourses linked list. Then I found the student using entry no. from allStudents linkedlist and added it to the course linklist.
In the answerQueries function, I read the file twice. For the first time, I count the number of queries and made an array qr of the size of no. of queries. Then I read the file again and stored the lines in array qr. Now I started a loop in array qr and started using it from last.
Now I made three cases for SHARE , COURSETITLE ,  and INFO. 
In SHARE as I don't know it is hoostel, department or courses so 
I looped it through all and found the linkedlist corresponding to it.Then I put two iterator in linkedlist from first I counted the no. of students in that list and then made array "ans" of that size for sorting the entry numbers. Then using the second iterator I added it to the array "ans" . then i sorted the array and print the output. If nobody shares the entity with the student then the blank line is printed
In COURSETITLE  i iterated through allCourses and find the course if there is no course then an only blank line is printed else I printed that courseTitle using subname function that I made.
In INFO I iterated through allStudents and find the student then I made two iterators for the courselist of the student as above in SHARE query and sorted the courses and their grades. If the student does not exist then a blank line is printed






