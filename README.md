# codefellowship
## Lab16 + Lab17 Spring Authorization

This repository includes some basic implementation of Spring Authorization on a Java Web Application.

#### Classes
- AppUser
- AppUserController
- CodefellowshipApplication
- CodefellowshipController
- UserDetailServiceImpl
- WebSecurityConfig
- Post
- PostController


#### Interfaces
- AppUserRepository
- PostRepository

#### Routes/API
CodefellowshipController
#### @GetMapping("/")
- /
[http://localhost:8080/](http://localhost:8080/)

it will return Codefellowship.html and this is the home page we can use index and then we didnt have to use this GetMapping
and it have evrey links to can signup or login 


appUserController

#### @GetMapping("/signup")
- /signup
[http://localhost:8080/signup](http://localhost:8080/signup)
it will return you to signup.html file that have a form you should fill it to can signup in your data

#### @GetMapping("/login")
- /login
[http://localhost:8080/login](http://localhost:8080/login)

after you signup you can login use this rout and it will return login bage that have a form you should fill it in same data that you used in signup "the same data you have in database"
#### @GetMapping("/logout")
- /logout
[http://localhost:8080/logout](http://localhost:8080/logout)
you can use this rout to can logout and login again in another account 

#### @GetMapping("/myprofile")
- /myprofile
[http://localhost:8080/myprofile](http://localhost:8080/myprofile)
after you sign in you can view your your profile using this rout

#### @GetMapping("/users/{id}")
- /users/1
[http://localhost:8080/users/1](http://localhost:8080/users/1)
here you can use this rout and write the id for the user you want to see his profile that mean the link here you can see the first user profile.


#### @GetMapping("/post")
- /post
[http://localhost:8080/post](http://localhost:8080/post)

this rout it will return the postpage.html that will have post form that you will fill it in you text you want to post it.

#### @PostMapping("/posts")
- /posts
[http://localhost:8080/posts](http://localhost:8080/posts)
this rout we use it in action in form that we have it in postpage to have data and cat post them and have it in database



#### Git start the DataBase :
I wrote this commands to start it in terminal Ubuntu
- sudo service postgresql
- sudo service postgresql start
- sudo -i -u postgres
- psql
- CREATE DATABASE codefellowship


## In this repository, I worked with "Motasim Al Azzam" as a partner.      
# codefellowship
## Lab16 + Lab17 Spring Authorization

This repository includes some basic implementation of Spring Authorization on a Java Web Application.

#### Classes
- AppUser
- AppUserController
- CodefellowshipApplication
- CodefellowshipController
- UserDetailServiceImpl
- WebSecurityConfig
- Post
- PostController


#### Interfaces
- AppUserRepository
- PostRepository

#### Routes/API
CodefellowshipController
#### @GetMapping("/")
- /
[http://localhost:8080/](http://localhost:8080/)

it will return Codefellowship.html and this is the home page we can use index and then we didnt have to use this GetMapping
and it have evrey links to can signup or login 


appUserController

#### @GetMapping("/signup")
- /signup
[http://localhost:8080/signup](http://localhost:8080/signup)
it will return you to signup.html file that have a form you should fill it to can signup in your data

#### @GetMapping("/login")
- /login
[http://localhost:8080/login](http://localhost:8080/login)

after you signup you can login use this rout and it will return login bage that have a form you should fill it in same data that you used in signup "the same data you have in database"
#### @GetMapping("/logout")
- /logout
[http://localhost:8080/logout](http://localhost:8080/logout)
you can use this rout to can logout and login again in another account 

#### @GetMapping("/myprofile")
- /myprofile
[http://localhost:8080/myprofile](http://localhost:8080/myprofile)
after you sign in you can view your your profile using this rout

#### @GetMapping("/users/{id}")
- /users/1
[http://localhost:8080/users/1](http://localhost:8080/users/1)
here you can use this rout and write the id for the user you want to see his profile that mean the link here you can see the first user profile.


#### @GetMapping("/post")
- /post
[http://localhost:8080/post](http://localhost:8080/post)

this rout it will return the postpage.html that will have post form that you will fill it in you text you want to post it.

#### @PostMapping("/posts")
- /posts
[http://localhost:8080/posts](http://localhost:8080/posts)
this rout we use it in action in form that we have it in postpage to have data and cat post them and have it in database



#### Git start the DataBase :
I wrote this commands to start it in terminal Ubuntu
- sudo service postgresql
- sudo service postgresql start
- sudo -i -u postgres
- psql
- CREATE DATABASE codefellowship


## In this repository, I worked with "Motasim Al Azzam" as a partner.      


# codefellowship
## Lab16 + Lab17 Spring Authorization

This repository includes some basic implementation of Spring Authorization on a Java Web Application.

#### Classes
- AppUser
- AppUserController
- CodefellowshipApplication
- CodefellowshipController
- UserDetailServiceImpl
- WebSecurityConfig
- Post
- PostController


#### Interfaces
- AppUserRepository
- PostRepository

#### Routes/API
CodefellowshipController
#### @GetMapping("/")
- /
[http://localhost:8080/](http://localhost:8080/)

it will return Codefellowship.html and this is the home page we can use index and then we didnt have to use this GetMapping
and it have evrey links to can signup or login 


appUserController

#### @GetMapping("/signup")
- /signup
[http://localhost:8080/signup](http://localhost:8080/signup)
it will return you to signup.html file that have a form you should fill it to can signup in your data

#### @GetMapping("/login")
- /login
[http://localhost:8080/login](http://localhost:8080/login)

after you signup you can login use this rout and it will return login bage that have a form you should fill it in same data that you used in signup "the same data you have in database"
#### @GetMapping("/logout")
- /logout
[http://localhost:8080/logout](http://localhost:8080/logout)
you can use this rout to can logout and login again in another account 

#### @GetMapping("/myprofile")
- /myprofile
[http://localhost:8080/myprofile](http://localhost:8080/myprofile)
after you sign in you can view your your profile using this rout

#### @GetMapping("/users/{id}")
- /users/1
[http://localhost:8080/users/1](http://localhost:8080/users/1)
here you can use this rout and write the id for the user you want to see his profile that mean the link here you can see the first user profile.


#### @GetMapping("/post")
- /post
[http://localhost:8080/post](http://localhost:8080/post)

this rout it will return the postpage.html that will have post form that you will fill it in you text you want to post it.

#### @PostMapping("/posts")
- /posts
[http://localhost:8080/posts](http://localhost:8080/posts)
this rout we use it in action in form that we have it in postpage to have data and cat post them and have it in database



#### Git start the DataBase :
I wrote this commands to start it in terminal Ubuntu
- sudo service postgresql
- sudo service postgresql start
- sudo -i -u postgres
- psql
- CREATE DATABASE codefellowship


## In this repository, I worked with "Motasim Al Azzam" as a partner.      





# codefellowship
## Lab18 + Lab19 Spring Authorization

This repository includes some basic implementation of Spring Authorization on a Java Web Application.

#### Classes
- AppUser
- AppUserController
- CodefellowshipApplication
- CodefellowshipController
- UserDetailServiceImpl
- WebSecurityConfig
- Post
- PostController


#### Interfaces
- AppUserRepository
- PostRepository

#### Routes/API
CodefellowshipController
#### @GetMapping("/")
- /
[http://localhost:8080/](http://localhost:8080/)

it will return Codefellowship.html and this is the home page we can use index and then we didnt have to use this GetMapping
and it have evrey links to can signup or login 


appUserController

#### @GetMapping("/signup")
- /signup
[http://localhost:8080/signup](http://localhost:8080/signup)
it will return you to signup.html file that have a form you should fill it to can signup in your data

#### @GetMapping("/login")
- /login
[http://localhost:8080/login](http://localhost:8080/login)

after you signup you can login use this rout and it will return login bage that have a form you should fill it in same data that you used in signup "the same data you have in database"
#### @GetMapping("/logout")
- /logout
[http://localhost:8080/logout](http://localhost:8080/logout)
you can use this rout to can logout and login again in another account 

#### @GetMapping("/myprofile")
- /myprofile
[http://localhost:8080/myprofile](http://localhost:8080/myprofile)
after you sign in you can view your your profile using this rout

#### @GetMapping("/users/{id}")
- /users/1
[http://localhost:8080/users/1](http://localhost:8080/users/1)
here you can use this rout and write the id for the user you want to see his profile that mean the link here you can see the first user profile.


#### @GetMapping("/post")
- /post
[http://localhost:8080/post](http://localhost:8080/post)

this rout it will return the postpage.html that will have post form that you will fill it in you text you want to post it.

#### @PostMapping("/posts")
- /posts
[http://localhost:8080/posts](http://localhost:8080/posts)
this rout we use it in action in form that we have it in postpage to have data and cat post them and have it in database


#### @GetMapping("/users")
- /users
[http://localhost:8080/users](http://localhost:8080/users)
in this rout you can see all the user they signup and have account and behind every user you can find follow botton that you can use it to follow any user

#### @GetMapping("/following")
- /following
[http://localhost:8080/following](http://localhost:8080/following)
in this rout you can see every users you are followed them.


#### @GetMapping("/feed")
- /feed
[http://localhost:8080/feed](http://localhost:8080/feed)
afetr that this rout it will render all the post from all users that you following them


#### Git start the DataBase :
I wrote this commands to start it in terminal Ubuntu
- sudo service postgresql
- sudo service postgresql start
- sudo -i -u postgres
- psql
- \connect codefellowship


## In this repository, I worked with "Motasim Al Azzam" as a partner.      


