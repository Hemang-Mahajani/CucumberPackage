@DWH-1365
Feature: Default

	#Feature: Create Test topic on local kafdrop
	#   
	@DWH-1364
	Scenario: Test topic creation on kafdrop using create_topic.py
		
		Given User has repo cloned to local IDE
		And User executes the file with topic name "TestTopic1"
		When User navigates to "http://localhost:9000/"
		And user scrolls to test topics
		Then User is able to see "TestTopic1" in the list