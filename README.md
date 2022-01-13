Intermedia Cucumber Selenium Test 
===========================  


# The Task  
## 1
Write a single feature and implement the steps so that the feature is fully runnable and passes. This feature must perform the following:
For this task, only use the Chrome browser

Go to google.co.uk in a browser, Search for the term "ITV" and assert the URL for the top result is https://www.itv.com/

Go to google.co.uk in a browser, Search for the term "BBC" and assert the URL for the top result is https://www.bbc.co.uk/

Go to google.co.uk in a browser, Search for the term "Channel 4" and assert the URL for the top result is https://www.channel4.com/


## 2
Write a second feature and implement the steps so that the feature is fully runnable and passes. This feature must perform the following:

Go to google.co.uk in a browser, Search for the term "intermedia" and assert
* the URL for the top result is http://intermedia.co.uk/ 
* the search result title for the top result is Intermedia: Cloud IT Application Provider
* the URL for the second result is http://intermedia.com/
* the search result title for the second result is Intermedia: All-In-One Cloud Communications Platform


Apologies if the Top Result in Google has changed since this was written. If its changed, change the assertions to match the actual results

   

# Setup      
 
1. Make sure you have Java 11 installed
    https://adoptium.net/?variant=openjdk11

2. Ensure you have a java IDE with the relevant plugins installed for cucumber. (E.g. Intellij IDEA)     
    https://www.jetbrains.com/idea/download  (Free Community Edition should be enough)

3. Run inside Intellij IDEA    
    Import as standard Maven project.    
    Then, set 'Cucumber java' defaults of this project as:    
    - Main class: `cucumber.api.cli.Main`       
    - Glue: `com.intermedia.qa`      
    - feature folder path: _point to folder where feature files are_  
    
 4. Chrome
 Ensure you have the latest version of Chrome installed
