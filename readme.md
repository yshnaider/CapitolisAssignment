## Selenim project with testNG on Maven

This is an automation project done with selenium and testNG on Maven framework. The test are writen for different use cases on [this website][1].</br>

>Prerequesites:
1. Install java jdk and java jre and add them to System Variables-->path. </br>
2. Download Maven from [maven link][2] and add the direcory path in two variables to system variables: M2_HOME, MAVEN_HOME.

>Run the project - two options:</br>
1. open your terminal on MAC/Linux(cmd on windows), navigate to the project path and run the following command: mvn clean install.
2. Open the project in java supported IDE and run the testng.xml.
3. You can run the tests on different browsers by changing **value** field in ___parameter name="browser" value="chrome"___ in testNG.xml file. The options are: "chrome", "ie", "firefox".

[1]:[http://the-internet.herokuapp.com/]
[2]:[https://maven.apache.org/download.cgi]

