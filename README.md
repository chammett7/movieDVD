# movieDVD
## Introduction 
MovieDVD is a console based software application developed for a 
community library to mange its DVDs. 
* You must be a member to borrow a movie. 
In order to become a member you must be registered in the system through a librarian. 
Members are registered by their name, phone number and address. 
* Movies are categorized by title, director, starring, genre, duration, release date, 
and classification (G, PG, R, MA+). The community library may have multiple DVDs of the same movie. 
* A registered member can borrow up to 10 DVDs at one time; however, they can not borrow more than one 
copy of the same movie. When a member borrows a movie DVD the DVD is added to the members 
account. It is assumed that all members names and movie titles are unique. 


## Development 
### 1) Movie DVDs
* A class called 'Movie' was implemented where each DVD is an object of the class Movie. 
* A class called 'MovieCollection' was implemented to represent and sort through the DVDs. 
* MovieCollection uses a binary search tree to store and traverse through the DVDs.

### 2) Members 
* A class called Member was implemented where each member is represented by an object of the class Member. 
* A class called 'MemberCollection' was implemented to represent and sort through the DVDs. 
* MemberCollection uses an array to store its members.

## Run Instructions
* To start up the community library run the main method inside the MenuHandler. 
The opening page is presented below: 
![Main Menu](https://github.com/chammett7/movieDVD/blob/master/screenShots/mainMenu.jpg)

## Functionality and Testing
### Login 
* The application was created for both staff and registered members. 
* Upon start-up the user is presented with a main menu which is displayed above. 

### Staff Menu 
* If option 1 is chosen in the main menu you will be directed to the staff login.
* Staff login details are the same for every staff member where the username = "staff" and the password = "today123"
* If login details are incorrect a suitable error message is provided and you redirected back to the main menu.
![Staff Menu](https://github.com/chammett7/movieDVD/blob/master/screenShots/StaffMenu.jpg)
* If a choice is typed that is not in the menu a proper error message is provided:
![Not Menu Item](https://github.com/chammett7/movieDVD/blob/master/screenShots/notMenuItem.jpg)
#### Add New Movie DVD (option 1)
* Staff members can add new movie DVDs to the system through option 1 which is presented as follows:
![Add New Movie](https://github.com/chammett7/movieDVD/blob/master/screenShots/addNewMovie.jpg)
* After entering the new movie DVD they will be sent back to the staff menu.
#### Remove Movie DVD (option 2)
* Staff members can remove movies DVDs from the system through option 2 
which is presented as follows:
![Remove Movie](https://github.com/chammett7/movieDVD/blob/master/screenShots/removeMovie.jpg)
* After removing the movie DVD they will be sent back to the staff menu.
#### Register New Member (option 3)
* Staff members can register new members through option 3 which is presented as follows: 
![Register New Member](https://github.com/chammett7/movieDVD/blob/master/screenShots/registerNewMember.jpg)
* After registering a new member they will be sent back to the staff menu.
#### Finding Registered Member by Phone Number (option 4)
* Staff members can look up a registered member via their phone number. Option 4 is 
presented as follows: 
![Find Member by Phone](https://github.com/chammett7/movieDVD/blob/master/screenShots/findMemPhone.jpg)
* If the phone number does not exist in the system a suitable error message is provided.
#### Back to Main Menu (option 0)
* Option 0 is chosen when the staff member is ready to logout of the system. 
*Option 0 is presented as follows: 
![Back to Main](https://github.com/chammett7/movieDVD/blob/master/screenShots/backToMain.jpg)

### Member Menu
* If option 2 is chosen in the main menu you will be directed to the member login.
* In order to login to the member menu you must first create a member in the staff menu.
* Once a member is created login using details provided when member was registered in staff menu. 
![Member Login]()
* I the username and password entered are invalid you will be directed back to the main menu.

#### Display all Movies (option 1)
* Members can view all movies in the system through option 1. 
* IMPORTANT: only movies entered via the staff menu during run time will be visible.
* Option 1 is presented as follows: 
![Display all Movies]()

#### Borrow Movie (option 2)
* Members can borrow a movie via option 2.
* Option 2 is presented as follows: 
![Borrow Movie]()
* If the title of the movie entered is not in the system a suitable error message is provided. 
![Error Message]()


#### Return Movie (option 3)
* A member can return a borrowed movie via option 3. 
* If the movie entered to return is not in the members list of borrowed 
movies a suitable error message is provided. 
* Option 3 is presented as follows: 
![Return Movie]()

#### List Current Borrowed Movies (option 4)
* A member can view their currently borrowed movies via option 4. 
* Note that this action was preformed before option 3 in the screenshots
provided so the movie has not been removed from the members list
* Option 4 before the member returns the movie is presented as follows: 
![List Current Borrowed Movies 1]()
* Option 4 preformed after the the movie is returned is presented as follows: 
![List Current Borrowed Movies 2]()

#### Display the Top 10 Most Borrowed Movies (option 5)
* A member can display the top 10 most borrowed movies in the system via option 5.
* Each movie is categorized by its borrowed count. Borrowed count is an attribute
of each movie object. The algorithm used is outlined below. 
* Option 5 is presented as follows: 
![Top 10 Most Borrowed]()

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
to the in-order-traversal algorithm which visits the right node first. Making this algorithm have a worst case time 
complexity of O(n). Although the worst case time efficiency is not the best, I felt this 
was the most suitable algorithm for the purpose. On a real life system, where the latest 
insertions and counts of the program are put into memory the tree would take much less time to sort.

### Limitations 
Because of the console based nature of this program it has no ability to save information 
into memory after run time is complete. Due to this major limitation the only way 
to view the functionality of the program is to run the program, login to the staff menu, and input all 
movies and members.

## Author and Acknowledgement 
The program was written by myself, Cecil Hammett (chammett7) for a major assignment in my Algorithms and Complexity unit
at Queensland University of Technology. The unit took place in semester 1, 2020. Thank you cab301 teaching team for providing 
me with this assignment. MovieDVD was a fantastic way to utilize and learn binary search trees. 

