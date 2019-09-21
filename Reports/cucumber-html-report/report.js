$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "DB Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Check Login Functionality with valid user name and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Chrome is opened \u0026 Login Page is dispalyed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsForLogin.chrome_is_opened_Login_Page_is_dispalyed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username \u0026 Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepsForLogin.user_enters_username_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "StepsForLogin.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "HomePage Should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsForLogin.homepage_Should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});