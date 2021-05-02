$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "As an Authentic user I should be able to login and perform a search",
  "description": "",
  "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Authentic user should successfully login",
  "description": "",
  "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;authentic-user-should-successfully-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enter \"\u003cvalid email\u003e\" and \"\u003cvalid password\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should successfully login and make a search",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;authentic-user-should-successfully-login;",
  "rows": [
    {
      "cells": [
        "valid email",
        "valid password"
      ],
      "line": 11,
      "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;authentic-user-should-successfully-login;;1"
    },
    {
      "cells": [
        "taseer6@hotmail.com",
        "12345"
      ],
      "line": 12,
      "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;authentic-user-should-successfully-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5332921949,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_login_page()"
});
formatter.result({
  "duration": 1583469742,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Authentic user should successfully login",
  "description": "",
  "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;authentic-user-should-successfully-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enter \"taseer6@hotmail.com\" and \"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should successfully login and make a search",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "taseer6@hotmail.com",
      "offset": 9
    },
    {
      "val": "12345",
      "offset": 35
    }
  ],
  "location": "LoginSteps.i_enter_and(String,String)"
});
formatter.result({
  "duration": 1882556030,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_successfully_login_and_make_a_search()"
});
formatter.result({
  "duration": 137209678,
  "status": "passed"
});
formatter.after({
  "duration": 3125394833,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Invalid user should get warning notification",
  "description": "",
  "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;invalid-user-should-get-warning-notification",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I enter \"\u003cinvalid email\u003e\" and \"\u003cinvalid password\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should get login warning notification",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;invalid-user-should-get-warning-notification;",
  "rows": [
    {
      "cells": [
        "invalid email",
        "invalid password"
      ],
      "line": 18,
      "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;invalid-user-should-get-warning-notification;;1"
    },
    {
      "cells": [
        "wrongemail@hotmail.com",
        "12345"
      ],
      "line": 19,
      "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;invalid-user-should-get-warning-notification;;2"
    },
    {
      "cells": [
        "taseer66@hotmail.com",
        "wrongpassword"
      ],
      "line": 20,
      "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;invalid-user-should-get-warning-notification;;3"
    },
    {
      "cells": [
        "taseer6624@hotmail.com",
        "wrongpassword"
      ],
      "line": 21,
      "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;invalid-user-should-get-warning-notification;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4453976031,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_login_page()"
});
formatter.result({
  "duration": 1430189520,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Invalid user should get warning notification",
  "description": "",
  "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;invalid-user-should-get-warning-notification;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I enter \"wrongemail@hotmail.com\" and \"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should get login warning notification",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "wrongemail@hotmail.com",
      "offset": 9
    },
    {
      "val": "12345",
      "offset": 38
    }
  ],
  "location": "LoginSteps.i_enter_and(String,String)"
});
formatter.result({
  "duration": 1654181072,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_get_login_warning_notification()"
});
formatter.result({
  "duration": 50743999,
  "status": "passed"
});
formatter.after({
  "duration": 3124844189,
  "status": "passed"
});
formatter.before({
  "duration": 4696486884,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_login_page()"
});
formatter.result({
  "duration": 1009137037,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Invalid user should get warning notification",
  "description": "",
  "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;invalid-user-should-get-warning-notification;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I enter \"taseer66@hotmail.com\" and \"wrongpassword\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should get login warning notification",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "taseer66@hotmail.com",
      "offset": 9
    },
    {
      "val": "wrongpassword",
      "offset": 36
    }
  ],
  "location": "LoginSteps.i_enter_and(String,String)"
});
formatter.result({
  "duration": 1860534691,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_get_login_warning_notification()"
});
formatter.result({
  "duration": 46697741,
  "status": "passed"
});
formatter.after({
  "duration": 3126985653,
  "status": "passed"
});
formatter.before({
  "duration": 4463263293,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_login_page()"
});
formatter.result({
  "duration": 1771071013,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Invalid user should get warning notification",
  "description": "",
  "id": "as-an-authentic-user-i-should-be-able-to-login-and-perform-a-search;invalid-user-should-get-warning-notification;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I enter \"taseer6624@hotmail.com\" and \"wrongpassword\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should get login warning notification",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "taseer6624@hotmail.com",
      "offset": 9
    },
    {
      "val": "wrongpassword",
      "offset": 38
    }
  ],
  "location": "LoginSteps.i_enter_and(String,String)"
});
formatter.result({
  "duration": 2025248662,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_get_login_warning_notification()"
});
formatter.result({
  "duration": 45258792,
  "status": "passed"
});
formatter.after({
  "duration": 3128340103,
  "status": "passed"
});
});