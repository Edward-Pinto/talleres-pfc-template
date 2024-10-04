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
    /*
    def inclusion ( cd1 : ConjDifuso , cd2 : ConjDifuso ) : Boolean = {

    }
    def igualdad ( cd1 : ConjDifuso , cd2 : ConjDifuso ) : Boolean = {


    }
    */
}