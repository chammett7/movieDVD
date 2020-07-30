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

## Functionality 
#### 1) Login 
The application was created for both staff and registered members. Upon start-up the user is 
presented with a main menu. To start up the community library run the main method inside the MenuHandler class. 
The opening page is presented below: 
![Main Menu](https://github.com/chammett7/movieDVD/blob/master/screenShot/mainMenu.jpg)



