# Iteration2
Iteration2 of the scala learning modules.

## Book Work
Working along with O'Reilly's Programming Scala 2nd Edition.

### Chapter 9 - Traits
- 'Mixins' - reusable state or behavior
- defender/default method - method defined in mixin
- Adding traits to a class
  - Defining a class: use 'extends' for the first trait and then 'with' for any more
  - Instantiating a class: use 'with' for all traits
- Stackable Traits
  - if the method has a body to it, it should be declared as 'abstract'
  - this will allow any call to 'super' to be correctly interpreted
- Linearization - resolving the priority of traits and classes in an inheritance tree
