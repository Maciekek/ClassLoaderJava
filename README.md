# ClassLoaderJava
Program was written for JVN Internals 2015 University of Gdansk

----

##About program

We had to write program that will replace definition of class during the lifetime of application. This substitution should take place without the participation of user. Application, actually overwritten ClassLoader download new definition of class from remote server.

To create server I used nodejs server generator [ExpressJS-generator](http://expressjs.com/starter/generator.html).
Generator did simply server (for this task even too powerful). There I set a file (new definition of class) to download by Java ClassLoader. Server listens on all of URL`s ```(/*)```

When ClassLoader download new class, returns it like a found class. This is the way how to prepare to dynamic substitution classes.


###Seting file on server 
First of all, you have to copy you new definition of class to special path. 
 ```webapp/server/routes/public``` Remember to set the name of this new class exactly the same like name of class in your program.


###Start server
```
node .\bin\www
```

Server listens on http://localhost:3000/

