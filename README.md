# Iteration 3
Iteration 3 of the scala learning modules.

## Book Work
Working along with O'Reilly's Programming Scala 2nd Edition.

### Chapter 11 - The Scala Object System Part 2
- Abstract members do not require an override declaration from submembers
- Concrete members requires an override statement for submembers
- When to use Override
  - Never declare override on abstract members, it's unnecessary
  - Avoid overriding concrete members when you can
  - `toString` and other trivial times where the original member doesn't have much impact
- declarations without a body are abstract
- Overriding a val requires redeclaration of type as well
