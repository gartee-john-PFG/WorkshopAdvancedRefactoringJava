# WorkshopAdvancedRefactoringJava
Base Files for Advanbced Refactoring in Java Workshop

## Refactoring
### What is it?
* Change code structure without changing behavior
* Requires 100% branch coverage on code you are planning to refactor
* **Strongly** recommend running mutations testing on the code to be refactored, even if covered with unit tests. This ensures you have edge cases covered as well in your tests
* If tests are missing, consider using Approvals
### Recommended approach
* First, establish your test coverage
* Make very small changes
* Always run your tests whenever you touch your code.  Be paranoid!
* Commit after every change/test run...you can always squash commits later, but now you have a place to come back to a working system.
### Patterns to look for
* Extracted methods that reference only one object...these are candidates for moving to the appropriate class.
* Extract complex conditionals to well-named methods to improve readability
* Extract code blocks to well-named methods
* Look for data/methods only used together...is this a new class?
* Look at switch statements (or comparable if statements) to see if polymorphism could eliminate them
* Eliminate boolean expressions in method parameter lists...split to two different well-named functions.
* Use code coverage to help you eliminate unexecuted code during refactoring steps
