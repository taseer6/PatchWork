# Automation Framework 

This automation framwork is for testing web applications. Framework is build using
Cucumber, Java, Maven and TestNG. 

## Project Description

Project is developed on BDD approach and used page object model as design pattern along with page factory of selenium.  It enables you to write and execute automated acceptance tests.

In page object model each web page has a Page Object. Selenium is used for interacting with the web related operations and to locate elements.

Cucumber uses Gherkin language for writing feature files, TestNG will manage test suits. Maven is used for project management

ExtentReport is used for report.

## Installation

Pre-requisite You need to have following softwares installed on your computer

1) Install JDK 1.8 and set path
2) Install Maven and set path
3) Intellij
4) Intellij Plugins: Maven,TestNG and Cucumber
5) Installation In order to start using the project you need to clone the project from git.
6) driver should be updated in the drivers' directory.


## Project structure

```
├── AutomationFrameworkCucumber.iml
├── README.md
├── output
|  └── report.html
├── pom.xml
├── src
|  ├── main
|  |  ├── java
|  |  |  ├── constants
|  |  |  ├── pageObjects
|  |  |  ├── stepDefinitions
|  |  |  └── utils
|  |  └── resources
|  └── test
|     ├── java
|     |  └── runners
|     ├── resource
|     |  ├── drivers
|     |  ├── features
|     |  ├── properties
|     |  └── testng
|     └── resources
└── target


1) src/main/java/constants - contains constants common accross project
2) src/main/java/pageObjects - contains all classes of web pages.
3) src/main/java/stepDefination - Cucumber step defination class
4) src/main/java/utils - Utility classes
5) src/test/java/runners - runner classes for cucumber
6) src/test/java/resources/drivers - contains drivers
7) src/test/java/resources/features - contains feature files
8) src/test/java/resources/properties - contains properties files stores configuration files
9) src/test/java/resources/testNG - Contains testNG.xml files for test case managements
  ```


## Execute test cases in the framework
Navigate to your project directory from terminal and run following commands 

``` 
mvn clean test
```

## Reprots 
Output folder contains the Extent and Cucumber reports.
