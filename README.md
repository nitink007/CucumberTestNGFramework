# Cucumber TestNG Automation Framework
-
_Steps to get started_
- Clone the repository `https://github.com/nitink007/CucumberTestNGFramework.git`
- Open the repo in an IDE (like Intellij Idea)
- Open Run configuration -> Edit Configuration -> Select Maven
- Enter the following in Command line 
`clean test verify -Dsurefire.suiteXmlFiles=/path/to/testng.xml`
- Press OK, this will save the configuration which will be used later
- _If running outside IDE the use `mvn clean test verify -Dsurefire.suiteXmlFiles=/path/to/testng.xml`_
- Download the Selenium server from `https://www.selenium.dev/downloads/`
- Download chrome driver from `https://chromedriver.chromium.org/downloads`
Note: `Chromedriver` and the chrome version should match and Selenium server should be compatible with the selenium dependency used in the project.