$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/nhscostcheckertool/featurefile/Nhshelp.feature");
formatter.feature({
  "line": 1,
  "name": "NHS treatment help checker tool for person from Wales",
  "description": "",
  "id": "nhs-treatment-help-checker-tool-for-person-from-wales",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify that the user should gets help with nhs costs page(Age above 19 below 60)",
  "description": "",
  "id": "nhs-treatment-help-checker-tool-for-person-from-wales;verify-that-the-user-should-gets-help-with-nhs-costs-page(age-above-19-below-60)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch the NHS Costs Checker tool application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user has selected start Button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user has selected country as \"Wales\" and click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user enters the date of birth above nineteen below sixty click on Next Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user selects living with partner as yes and click next button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user selects for claim any benifits or credits as no and click next button in page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user selects for pregnant or have you given birth in the last 12 months as no and click next button in page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user selects for an injury or illness caused by serving in the armed forces as no and click next button in page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user selects for diabetes as no and click next button in page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user selects for glaucoma as no and click next button in page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user selects for partner live permanently in a care home as no and click next button in page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user selects for you and your partner have more than £16,000 in savings, investments or property as no and click next button in page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user should get a result of get help with NHS costs page",
  "keyword": "Then "
});
formatter.match({
  "location": "NhshelpStepdefinition.user_launch_the_NHS_Costs_Checker_tool_application()"
});
formatter.result({
  "duration": 3785847499,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_select_start()"
});
formatter.result({
  "duration": 767907381,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wales",
      "offset": 30
    }
  ],
  "location": "NhshelpStepdefinition.user_has_selected_country_as_and_click_on_next_button(String)"
});
formatter.result({
  "duration": 1475000790,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.the_user_enters_the_date_of_birth_above_nineteen_below_sixty_click_on_Next_Button()"
});
formatter.result({
  "duration": 2856325102,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_selects_living_with_partner_as_yes_and_click_next_button()"
});
formatter.result({
  "duration": 1515288778,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_selects_for_claim_any_benifits_or_credits_as_no_and_click_next_button_in_page()"
});
formatter.result({
  "duration": 1340237043,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 62
    }
  ],
  "location": "NhshelpStepdefinition.user_selects_for_pregnant_or_have_you_given_birth_in_the_last_months_as_no_and_click_next_button_in_page(int)"
});
formatter.result({
  "duration": 1332513526,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_selects_for_an_injury_or_illness_caused_by_serving_in_the_armed_forces_as_no_and_click_next_button_in_page()"
});
formatter.result({
  "duration": 1269239311,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_selects_for_diabetes_as_no_and_click_next_button_in_page()"
});
formatter.result({
  "duration": 1266527418,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_selects_for_glaucoma_as_no_and_click_next_button_in_page()"
});
formatter.result({
  "duration": 1122981013,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_selects_for_partner_live_permanently_in_a_care_home_as_no_and_click_next_button_in_page()"
});
formatter.result({
  "duration": 1495644591,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 54
    },
    {
      "val": "000",
      "offset": 57
    }
  ],
  "location": "NhshelpStepdefinition.user_selects_for_you_and_your_partner_have_more_than_£_in_savings_investments_or_property_as_yes_and_click_next_button_in_page(int,int)"
});
formatter.result({
  "duration": 1368990249,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_should_get_a_result_of_get_help_with_NHS_costs_page()"
});
formatter.result({
  "duration": 81237733,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify that the user can get help with NHS Costs when the age is under 16",
  "description": "",
  "id": "nhs-treatment-help-checker-tool-for-person-from-wales;verify-that-the-user-can-get-help-with-nhs-costs-when-the-age-is-under-16",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "User launch the NHS Costs Checker tool application",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user has selected start Button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user has selected country as \"Wales\" and click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the user enters the date of birth under sixteen and click on Next Button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user should get a under sixteen result of get help with NHS costs page",
  "keyword": "Then "
});
formatter.match({
  "location": "NhshelpStepdefinition.user_launch_the_NHS_Costs_Checker_tool_application()"
});
formatter.result({
  "duration": 410377608,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_select_start()"
});
formatter.result({
  "duration": 799566655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wales",
      "offset": 30
    }
  ],
  "location": "NhshelpStepdefinition.user_has_selected_country_as_and_click_on_next_button(String)"
});
formatter.result({
  "duration": 1569591086,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.the_user_enters_the_date_of_birth_under_sixteen_and_click_on_Next_Button()"
});
formatter.result({
  "duration": 3291009989,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_should_get_a_under_sixteen_result_of_get_help_with_NHS_costs_page()"
});
formatter.result({
  "duration": 92856671,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Verify that the user gets Full time education question page when their age is between 16 to 19",
  "description": "",
  "id": "nhs-treatment-help-checker-tool-for-person-from-wales;verify-that-the-user-gets-full-time-education-question-page-when-their-age-is-between-16-to-19",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "User launch the NHS Costs Checker tool application",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user has selected start Button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user has selected country as \"Wales\" and click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "the user enters the date of birth between sixteen and nineteen and click on Next Button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user should get full-time education page",
  "keyword": "Then "
});
formatter.match({
  "location": "NhshelpStepdefinition.user_launch_the_NHS_Costs_Checker_tool_application()"
});
formatter.result({
  "duration": 379924850,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_select_start()"
});
formatter.result({
  "duration": 965969974,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wales",
      "offset": 30
    }
  ],
  "location": "NhshelpStepdefinition.user_has_selected_country_as_and_click_on_next_button(String)"
});
formatter.result({
  "duration": 1402632334,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.the_user_enters_the_date_of_birth_between_sixteen_and_nineteen_and_click_on_Next_Button()"
});
formatter.result({
  "duration": 4069978821,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_should_get_full_time_education_page()"
});
formatter.result({
  "duration": 1124680154,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Verify that the user gets Partner page question when their age is 60 and above",
  "description": "",
  "id": "nhs-treatment-help-checker-tool-for-person-from-wales;verify-that-the-user-gets-partner-page-question-when-their-age-is-60-and-above",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "User launch the NHS Costs Checker tool application",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user has selected start Button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user has selected country as \"Wales\" and click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "the user enters the date of birth above sixty and click on Next Button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user should get Partner page question",
  "keyword": "Then "
});
formatter.match({
  "location": "NhshelpStepdefinition.user_launch_the_NHS_Costs_Checker_tool_application()"
});
formatter.result({
  "duration": 537871464,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_select_start()"
});
formatter.result({
  "duration": 871172777,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wales",
      "offset": 30
    }
  ],
  "location": "NhshelpStepdefinition.user_has_selected_country_as_and_click_on_next_button(String)"
});
formatter.result({
  "duration": 1372356920,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.the_user_enters_the_date_of_birth_above_sixty_and_click_on_Next_Button()"
});
formatter.result({
  "duration": 4230242408,
  "status": "passed"
});
formatter.match({
  "location": "NhshelpStepdefinition.user_should_get_Partner_page_question()"
});
formatter.result({
  "duration": 100865909,
  "status": "passed"
});
});