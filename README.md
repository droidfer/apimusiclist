# ApiMusicList
_"API Music List" is an API server to add and list stats of genres of music submited by users. This is meant to work with the mobile application https://github.com/droidfer/musicphone due the json response adjust to this app_

<!-- ABOUT THE TECH -->
## About The API Technologies
The project is build with:
  - Java Sprint Boot
  - H2 Database Engine

<!-- CONFIGURATION-->
## Initial Setup

###### DB Configuration:
The configuration of the DB in H2 is on file application.propierties

###### Genres List:
The list of genres in the app are set in the H2 DB for the API to function
Anyhow, due this is meant to be a simple project, currently to manage the genres you should access directly from H2 db
Also, a list of genres are load on boot from file ApilistmusicApplication.java (String Array) that can be edit according your preference


<!-- TESTING-->
## Testing
Here are some CURL commands can be apply to test the API
Considering on this examples that this work on server localhost:8080 (ip:localhost, port: 8080)
Should be modified at your convinience

* LIST GENRES
```sh
curl -X GET "http://localhost:8080/listgenre"
```


* SUBMIT MUSIC GENRE

_PUT example adding values email(fernando@fernando.com.py) and genre (Rock)_

```sh
curl -X PUT "http://localhost:8080/addmusic?email=fernando@fernando.com.py&genre=Rock"
```

* STATS OF MUSIC GENRES

```sh
curl -X GET "http://localhost:8080/stats"
```

* TEST

_This is just meant to test if REST CONTROLLER is up. I find this useful, but, doesnt contribuite on the app porpouse or performance_
```sh
curl -X GET "http://localhost:8080/test"
```


