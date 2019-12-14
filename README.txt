YouTube TESTPROJECT

This project is testing this functionalities on a YouTube web page and mediaplayer.
1.to sign in registered account (file TestLogIn.java). 
2. to scroll the video forward and backward (file TestForwardAndBack.java)
3. to increase and decrease volume,  mute and enable sound (file TestVolume.java)
4. to scroll homepage (file TestScroll.java)
5. to enable and disable subtitles in mediaplayer, if any (file TestSubtitle.java)

The file WebDriverSettings.java conteins steps @BeforeTest and @AfterTest

Background
You need to install the following programs, tools and frameworks:
IntelliJ IDEA (version 2019.1.1 (Community Edition))
յdk (version 1.8.0_222)
Maven (version 3.3.9)
Selenium webdriver (version 3.141.59)
TestNG framework (version 7.0.0)
Webdrivermanager (version 3.0.0)
Maven-surefire-plugin (version 2.12.4)
Maven-compiler-plugin (version 3.8.1)

...
Example
1. Create a maven project in IntelliJ IDEA.
2. Add dependensies of Selenium webdriver,TestNG, webdrivermanager and add plugins maven-surefire and maven-compiler from the site mvnrepository.com (actual versions) into the pom.xml file.
3.In root of project create testng.xml file and add classes and parameters.

Notes
OS - Ubuntu1604 .
Browser - Google Chrome 77.0.3865.90 (Official Build) (64-bit).

Author
Armenuhi Kocharyan




