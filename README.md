# apimusiclist
Sprint Boot API for Music Genres 

The Genres are saved in the H2 DB at the boot of the app
The values saved are in a String Array at ApilistmusicApplication.java
The genres can be changed at the initialization changing this file or directly on the H2 db

To test the application with CURL:
LIST GENRES
curl -X GET "http://localhost:8080/listgenre"

SUBMIT MUSIC GENRE
curl -X PUT "http://localhost:8080/addmusic?email=fernando@fernando.com.py&genre=Rock"

STATS OF MUSIC GENRES
curl -X GET "http://localhost:8080/stats"

JUST TEST IF REST CONTROLLER IS UP
curl -X GET "http://localhost:8080/test"

