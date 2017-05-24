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
- Scala type `AnyRef` is equivalent to `java.lang.Object`
- Products
  - Case Classes
    - Products can be used to work with fields of an instance
    - `val p: Product = Person("Keith", 21)`
    - `p.productArity` = returns Int of the number of fields int he instance
    - `p.productElement(x)` returns Any, the x element of the instance
      - Note: this returns Any as the type so there are some drawbacks here
    - `p.productIterator foreach ...` iterates through the field elements
  - Tuple
    - Product Tuples can be used on instances and preserve the element's type
    - `Product2[+T1,+T2]` declaration
    - elements in a product tuple can be accessed as if they were a tuple
