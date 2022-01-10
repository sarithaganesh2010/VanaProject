Intermedia Cucumber Selenium Test 
===========================  


# The Task  

Write a single feature and implement the steps so that the feature is fully runnable and passes. This feature must perform the following:
For this task, only use the Chrome browser

Go to google.co.uk in a browser
Search for the term "ITV" and assert the URL for the top result is https://www.itv.com/

Go to google.co.uk in a browser
Search for the term "BBC" and assert the URL for the top result is https://www.bbc.co.uk/

Go to google.co.uk in a browser
Search for the term "Channel 4" and assert the URL for the top result is https://www.channel4.com/


Apologies if the Top Result in Google has changed since this was written. If its changed, change the assertions to match the new top result
 
NB: A feature file is living documentation that describes the requirement making it easy for someone to understand the scope of the story / requirement.   

# Setup      

Getting up and running for your dev-env is as easy as counting 1 to 4 :-)     

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