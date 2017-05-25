// src/main/scala/bookwork/ch10-objectsystem1/func.sc

class CSuper            { def msuper()  = println("CSuper") }
class C                 { def m()       = println("C") }
class CSub              { def msub()    = println("CSub") }

var f: C => C = (c: C)      => new C
    f         = (c: CSuper) => new CSub
    f         = (c: CSuper) => new C
    f         = (c: C)      => new CSub
    f         = (c: CSub)   => new CSuper   // COMPILATION ERROR
