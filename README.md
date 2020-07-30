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

## Functionality and Testing
### Login 
The application was created for both staff and registered members. Upon start-up the user is 
presented with a main menu. To start up the community library run the main method inside the MenuHandler class. 
The opening page is presented below: 
![Main Menu](https://github.com/chammett7/movieDVD/blob/master/screenShots/mainMenu.jpg)

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





