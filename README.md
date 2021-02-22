# EnergyAustralia_MusicGetAPI
 Music Festival
Energy Australia - Online challenge
Test Strategy


**Problem Statement :**
Your team is tasked with listing out music festival data in a particular manner: at the top level, it should show the band record label, below that it should list out all bands under their management, and below that it should display which festivals they've attended, if any. All entries should be sorted alphabetically.
For example:
Record Label 1
Band X
Omega Festival
Band Y
Record Label 2
Band A
Alpha Festival
Beta Festival
The data is provided to you via an API by another team; they assure you all the data is available but it's in a different format and provide you with the Swagger documentation needed to get started.
Use this API as is to output the format specified above in any medium you desire; let it be a website, terminal, file or morse code if that's what you want to do - we just want to see the result somehow.

**Understanding:**
As this role is for Tester.
I here by looking API as my testing scope.
SCOPE : To test GET API - provided with the Swagger documentation thoroughly.
**Testing Approach:**
1. We started Doing the Manual testing first.
2. Once we got confidence in execution and understood how API is working - We started working on Automating API for future reference.

**Manual Approach/Testing:**
Tool Used : Postman , console logs, Network Logs

Attached are the test cases - API_TestCases.xlsx

Steps Followed:
1. We created a Test Plan - Having test cases - Positive , Negative , security e.t.c
2. We executed GeT API - using postman.
3. We directly executed the API on browser - to check the browser compatibility and check the console and network logs.


**Automation Testing:**
Tool Used : Eclipse

Language Used : Java 15, 

Framework : TestNG , used Maven for Jar dependencies 


I have used - RestAssured Package for calling the API and for further verification.
For Verification - assert have been implemented.
Reports - Check - index.html in test-output folder.
I have also logged test cases result in Console Logs.


**Things for improvement || Still to integrated :**
> More test cases can be added, Project shared is just a sample for further executions.
> API Call can be configured to form a simple UI and do the automation for same.
As in testing scope I can design a UI framework as described.
> more assertion ad per requirement can be set.
