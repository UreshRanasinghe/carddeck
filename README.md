# carddeck

This program allows a magician to shuffle, draw and sort cards.
The program use standard 52 french cards but it could be extended with other card as well (ie. Italian cards for Scopa).

I used java to develop the application. For the example the user interface is in console but it can be easily exported as a web application using spring framework and jsp.


The project uses maven so we can use maven commands to test and run the program.

/*************************************
		Build
*************************************/
1. Open command Prompt
2. Execute CD command to the project folder
3. Run maven command: mvn compile

/*************************************
		Test
*************************************/
1. Open command Prompt
2. Execute CD command to the project folder
3. Run maven command: mvn clean test


/*************************************
		Run
*************************************/
1. Open command Prompt
2. Execute CD command to the project folder
3. Run maven command: mvn exec:java -Dexec.mainClass=com.erwin.Main
4. The program displays a menu (the user interface)
5. Press the desirable number to choose an option (from 1 to 5).
