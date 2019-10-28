Feature: NHS treatment help checker tool for person from Wales  

Scenario: Verify that the user should gets help with nhs costs page(Age above 19 below 60) 
	Given User launch the NHS Costs Checker tool application 
 	And user has selected start Button
 	And user has selected country as "Wales" and click on next button
 	When the user enters the date of birth above nineteen below sixty click on Next Button
 	And user selects living with partner as yes and click next button
 	And user selects for claim any benifits or credits as no and click next button in page
	And user selects for pregnant or have you given birth in the last 12 months as no and click next button in page
	And user selects for an injury or illness caused by serving in the armed forces as no and click next button in page
	And user selects for diabetes as no and click next button in page
	And user selects for glaucoma as no and click next button in page
	And user selects for partner live permanently in a care home as no and click next button in page
	And user selects for you and your partner have more than £16,000 in savings, investments or property as no and click next button in page
	Then user should get a result of get help with NHS costs page

Scenario: Verify that the user can get help with NHS Costs when the age is under 16
	Given User launch the NHS Costs Checker tool application 
 	And user has selected start Button
 	And user has selected country as "Wales" and click on next button
 	When the user enters the date of birth under sixteen and click on Next Button
	Then user should get a under sixteen result of get help with NHS costs page 
	
Scenario: Verify that the user gets Full time education question page when their age is between 16 to 19
	Given User launch the NHS Costs Checker tool application 
 	And user has selected start Button
 	And user has selected country as "Wales" and click on next button
 	When the user enters the date of birth between sixteen and nineteen and click on Next Button
 	Then user should get full-time education page
 	
Scenario: Verify that the user gets Partner page question when their age is 60 and above
	Given User launch the NHS Costs Checker tool application 
 	And user has selected start Button
 	And user has selected country as "Wales" and click on next button
 	When the user enters the date of birth above sixty and click on Next Button
	Then user should get Partner page question
	