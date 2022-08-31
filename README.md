# Code Review Assignment

#### Overview
This assigment is to test your technical skill via the process of a `Code review`
This means that we will walk together through the example codebase that we created and invite you to provide the code from feedback.
What is good? And which parts are bad? And believe me, some parts are really bad! 

#### Warm-up and application buildup
It contains a warmup exercise in the `CustomerService` class, which you will do together with the interviewers.
After that the assignment will be about the `Order application` 
This application contains a simple `CRUD` microservice that allows the user to place, find and delete orders.

#### Type of feedback
The kind of feedback we look for is mainly on clean code and good software design principles.
The errors are not necessarily specific to Java or Spring, but would be the same error if the code base was written in another language (e.g. Python or C#)
Also, try to stay away from personal preferences and try to focus on stuff that is always really wrong.

## Package Structure for Order Entity

* Controller
* Repository
    * Interface defining the contract
    * In memory implementation using a Map structure
* Model
    * Order class 
* Service
    * Connecting Controller and Repository
    * Interface & implementation