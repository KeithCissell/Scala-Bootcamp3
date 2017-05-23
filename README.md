# Iteration2
Iteration2 of the scala learning modules.

## Book Work
Working along with O'Reilly's Programming Scala 2nd Edition.

### Chapter 10 - The Scala Object System Part 1
- Variance Under Inheritance
  - Covariant (`+T`) - specific subtypes of a broad supertype
  - Contravariant (`-T`) - some supertype of a specific subtype
  - Invariant (`T`) - neither covariant or contravariant
  - Mixed - two or more variances can be mixed in definitions
- Function Rule
  - A function's arguments must be contravariant
  - A function's return values must me covariant
  - This way, the return's scope cannot be larger than the argument's scope
    - argument(super) < = return(sub)
    - Breaking this rule would cause surprises such as
      - The argument passed in could have methods called on it that is not defined in the return type
- Type Declarations with Variance
  - Covariant (`+T`) - the value used must be a subtype of `T`
  - Contravariant (`-T`) - the value used must be a supertype of `T`
  - Invariant (`T`) - the type designer decides how the type should vary under inheritance
