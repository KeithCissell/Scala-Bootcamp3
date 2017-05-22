# Iteration2
Iteration2 of the scala learning modules.

## Book Work
Working along with O'Reilly's Programming Scala 2nd Edition.

### Chapter 8 - Object Oriented Programming
- Companions: object and a class with the same name
- Class method and attribute names
  - can share the same name if the method takes arguments
- Factories
  - Implementation: Objects with Apply methods
- Value Classes
  - wraps around an existing AnyVal (usually) class and allows declaration/override of methods
  - Example: `class Dollar(val value: Float) extends AnyVal { ... }`
- Universal Trait
  - derives from Any
  - defines only methods
  - does no initialization of its own
- Unary Methods
  - `def unary_X : Type = ...`
  - Where `X` is the operator character we want to use
  - Example: Nagative `unary_-` called `-myinstance`
- Validating Input on construction reduces the need for other developers to validate the type
- Require
  - `require(validationCriterion(obj), invalidAction)`
  - used in the constructor of a class to check validity and handle invalid input
- `???` operator that simply throws an error. Good for a place holder of a method during development
