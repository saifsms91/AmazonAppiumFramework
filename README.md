
#Appium--testng-POM-framework #


Highlights:
This is a sample POM framework to automate Amazon Android app


#Technology stack:
- TestNG (test runner)
- Appium (mobile testing)
- Selenium (web app testing) [Used as a wrapper for appium]
- Allure (reporting)
- Java (Programming Language)
- Maven (Dependency Manager)
- Page Object Model

** Prerequisites** 

- Appium configuration should be up and running (Can use appium-doctor -h to see the configuration)
- Android tab Simulator or Galaxy S tab real device **(On small devices if the element is not visible due to screen size or keypad the test's will fail)**

** Steps to run the code ** 

* Import the project as maven project preferable in eclipse to avoid any issues
* Click Next
* Click Browse and select the folder that is the root of the Maven project (contains the pom.xml file)
* Click Next
* Click Finish

Note: 
- Havn't used assertion in the test cases every where except first one which is to verify email
- We can also create the methods in normal call and call these method in the test class to only assert them
- for now I have deleted the test-output folder though allure-resukts folder is still there
- Allure report may not generate report due to some configuration issue
- Currently all the elements found have been kept on two pages AmazonHomePageAndroid , LandingPageAndroid and same goes for test cases.

