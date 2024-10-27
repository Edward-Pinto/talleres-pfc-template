package taller

class ConjuntosDifusos() {
    
    type ConjDifuso = Int => Double

    def pertenece ( elem : Int , s : ConjDifuso ) : Double = {
        s(elem)
    }

    def muchoMayorQue ( a : Int, m: Int ) : ConjDifuso = {
        def mma( x :Int) : Double = {
            if ( x <= a ) 0.0
            else if ( x > a && x <= m) (x-a).toDouble / (m-a).toDouble
            else 1.0
        }
        mma
    }

    def grande(d: Int, e: Int): ConjDifuso = {
        require(d >= 1, "d debe ser mayor o igual a 1")
        require(e > 1, "e debe ser mayor a 1")
        (n: Int) => Math.pow(n.toDouble / (n + d), e)
    }

    
    def complemento (c : ConjDifuso) : ConjDifuso = {
        (x: Int) => 1.0 - c(x)
    }

    def union( cd1 : ConjDifuso , cd2 : ConjDifuso ) : ConjDifuso = {
        (x: Int) => math.max(cd1(x) , cd2(x))
    }

    def interseccion( cd1 : ConjDifuso , cd2 : ConjDifuso ) : ConjDifuso = {
        (x: Int) => math.min(cd1(x) , cd2(x))
    }
    
    def inclusion ( cd1 : ConjDifuso , cd2 : ConjDifuso ) : Boolean = {
        @annotation.tailrec
        def aux( x : Int ) : Boolean = {
            if ( x > 100 ) true
            else if (cd1.pertenece(x) > cd2.pertenece(x)) false
            else aux(x+1)
        }
        aux(0)
    }
    
    def igualdad ( cd1 : ConjDifuso , cd2 : ConjDifuso ) : Boolean = {
        inclusion(cd1, cd2) && inclusion(cd2, cd1)
    }
    
}