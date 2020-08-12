# movieDVD
## Introduction 
MovieDVD is a console based software application developed for a 
community library to mange its DVDs. The program was designed to satisfy the following 
guidelines: 
* In order to borrow a movie the user must be a registered member. 
* To become a registered member a staff member must input the user in the system. 
* Members are registered by their name, phone number and address. 
* Movies are categorized by title, director, starring, genre, duration, release date, 
and classification (G, PG, R, MA+). 
* The community library may have multiple DVDs of the same movie. 
* A registered member can borrow up to 10 DVDs at one time; however, they can not borrow more than one 
copy of the same movie. 
* When a registered member borrows a movie DVD the DVD is added to the members 
account. 
* It is assumed that all registered members names and all movie titles are unique. 


## Development 
### 1) Movie DVDs
* A class 'Movie' was implemented to represent each DVD as an object of the class Movie. 
* A class 'MovieCollection' was implemented to represent and sort through the collection DVDs. 
* 'MovieCollection' uses a binary search tree to store and traverse through the DVDs.

### 2) Members 
* A class 'Member' was implemented to represent each registered member as an object of the class Member. 
* A class 'MemberCollection' was implemented to represent and sort through the collection of registered members. 
* 'MemberCollection' uses an array to store its members.


## Functionality and Testing
### Run Instructions
* To start up the community library run the main method inside the MenuHandler. 

### Limitations 
Due to the console based nature of this program it has no ability to save information 
into memory after the application is terminated. Because of this major limitation the only way 
to view the functionality of the program is to run the program, login to the staff menu, and input all 
movies and members. 


### Main Menu 
* The application was created to be utilized by both staff and registered members. 
* Upon start-up the user is presented with a main menu.
* Within the main menu the user is prompted with two options.
* The option chosen, 1 for staff login, or 2 for member login, determines how the application will interact
with the user. 
* The opening page of the application is presented as follows: 
![Main Menu](https://github.com/chammett7/movieDVD/blob/master/screenShots/mainMenu.jpg)

* If a choice is typed that is not in the menu a proper error message is provided:
![Not Menu Item](https://github.com/chammett7/movieDVD/blob/master/screenShots/notMenuItem.jpg)



### Staff Menu 
* If option 1 is chosen in the main menu the user will be directed to the staff login.
* Staff login details are the same for every staff member. 
* To login as a staff member the username is "staff" and the password is "today123"
* If login details are incorrect a suitable error message is provided and the user is redirected back to the main menu.
* The staff menu is presented as follows: 
![Staff Menu](https://github.com/chammett7/movieDVD/blob/master/screenShots/StaffMenu.jpg)

#### Add New Movie DVD (option 1)
* Staff members can add new movie DVDs to the system via option 1.
* After entering the details of the new movie DVD the user will be sent back to the staff menu and the new movie will 
be saved into the list off movies.
* Option 1 is presented as follows:
![Add New Movie](https://github.com/chammett7/movieDVD/blob/master/screenShots/addNewMovie.jpg)


#### Remove Movie DVD (option 2)
* Staff members can remove movie DVDs from the system through option 2.
* After removing the movie DVD the user will be sent back to the staff menu and the movie will be deleted
from the list of movies.
* Option 2 is presented as follows:
![Remove Movie](https://github.com/chammett7/movieDVD/blob/master/screenShots/removeMovie.jpg)


#### Register New Member (option 3)
* Staff members can register new members into the system via option 3. 
* After registering a new member the user will be sent back to the staff menu and the new member will be added to the system.
* Option 3 is presented as follows: 
![Register New Member](https://github.com/chammett7/movieDVD/blob/master/screenShots/registerNewMember.jpg)


#### Finding Registered Member's Phone Number (option 4)
* Staff members can look up a registered member's phone number through option 4. 
* To find a users phone number the staff member is prompted to enter the users full name. 
* If the member searched for does not exist in the system a suitable error message is provided.
* Option 4 is presented as follows: 
![Find Member by Phone](https://github.com/chammett7/movieDVD/blob/master/screenShots/findMemPhone.jpg)


#### Back to Main Menu (option 0)
* A staff member can logout of the system via option 0. 
* Option 0 is presented as follows: 
![Back to Main](https://github.com/chammett7/movieDVD/blob/master/screenShots/backToMain.jpg)

### Member Menu
* If option 2 is chosen in the main menu the user will be directed to the member login.
* IMPORTANT: In order to login to the member menu the user must first be created via the staff menu.
* Once a member is created login using details provided when member was registered in staff menu.
* If the username and password entered are invalid you will be directed back to the main menu.
* The member login appears as follows: 
![Member Login](https://github.com/chammett7/movieDVD/blob/master/screenShots/memberLogin.jpg)


#### Display all Movies (option 1)
* Members can view all movies in the system through option 1. 
* IMPORTANT: movies must be entered in staff menu during run time.
* Movies are displayed in alphabetical order.
* Option 1 is presented as follows: 
![Display all Movies](https://github.com/chammett7/movieDVD/blob/master/screenShots/displayAllMovies.jpg)

#### Borrow Movie (option 2)
* Members can borrow a movie via option 2.
* To borrow a movie the user will need to enter the name of the movie they would like to borrow. 
* Option 2 is presented as follows: 
![Borrow Movie](https://github.com/chammett7/movieDVD/blob/master/screenShots/borrowMovie.jpg)
* If the title of the movie entered is not in the system a suitable error message is provided.
* An example of this error message is presented as follows: 
![Error Message](https://github.com/chammett7/movieDVD/blob/master/screenShots/errorMessage.jpg)


#### Return Movie (option 3)
* A member can return a borrowed movie via option 3. 
* If the movie entered to return is not in the members list of borrowed 
movies a suitable error message is provided. 
* Option 3 is presented as follows: 
![Return Movie](https://github.com/chammett7/movieDVD/blob/master/screenShots/returnMovie.jpg)

#### List Current Borrowed Movies (option 4)
* A member can view their current borrowed movies via option 4. 
* Note that this action was preformed before option 3 in the screenshots
provided so the movie has not been removed from the members list
* Option 4 before the member returns the movie is presented as follows: 
![List Current Borrowed Movies 1](https://github.com/chammett7/movieDVD/blob/master/screenShots/ListBorrowed1.jpg)
* Option 4 after the movie is returned is presented as follows: 
![List Current Borrowed Movies 2](https://github.com/chammett7/movieDVD/blob/master/screenShots/ListCurrentBorrowed2.jpg)

#### Display the Top 10 Most Borrowed Movies (option 5)
* A member can display the top 10 most borrowed movies in the system via option 5.
* Each movie is categorized by its borrowed count. Borrowed count is an attribute of each movie object. The algorithm used 
to complete this task is outlined below. 
* Option 5 is presented as follows: 
![Top 10 Most Borrowed](https://github.com/chammett7/movieDVD/blob/master/screenShots/top10Borrowed.jpg)

#### Back to Main Menu (option 0)
* A member can logout of the system via option 0.
* Option 0 will send the user back to the main menu. 

### Algorithm Used to Display the Top 10 Most Borrowed Movies
In order to display the top 10 most borrowed movies I first traversed over
the initial binary search tree found in the 'MovieCollection' class then sorted 
the borrowed movies into a new class 'BorrowedTree' based on borrowed count. 
If a movie is borrowed by a member the borrowed count of that movie increments. 

#### Analysis of Time Complexity
The first traversal of the initial tree 'MovieCollection' is an O(n) time
complexity. The linear O(n) means that by inserting n numbers into the new tree 
it is (1+2+3+.....+n-1) operations making the worst case time complexity of the 
new tree O(n^2). In order to print the top 10 from the new tree a I made a modification 
to the in-order-traversal algorithm which visits the right node first. The new algorithm has a worst case time 
complexity of O(n). Although the worst case time efficiency is not the best, however, I felt this 
was the most suitable algorithm for the purpose. On a real life system, where the latest 
insertions and counts of the program are put into memory the tree would take much less time to sort.



## Author and Acknowledgement 
The program was written for a major assignment in my Algorithms and Complexity unit
at Queensland University of Technology. The unit took place in semester 1, 2020. Thank you cab301 teaching team for providing 
me with this assignment. MovieDVD was a fantastic way to utilize and learn binary search trees. 

