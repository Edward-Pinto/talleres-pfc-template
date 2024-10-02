package taller

class ConjuntosDifusos() {
    
    type ConjDifuso = Int => Double

    def pertenece ( elem : Int , s : ConjDifuso ) : Double = {
        s(elem)
    }

    def grande(d: Int, e: Int): ConjDifuso = {
        require(d >= 1, "d debe ser mayor o igual a 1")
        0
        (n: Int) => Math.pow(n.toDouble / (n + d), e)
    }
    def interseccion( cd1 : ConjDifuso , cd2 : ConjDifuso ) : ConjDifuso = {
    // Implementaci´on de la funci´on interseccion

    }
    def inclusion ( cd1 : ConjDifuso , cd2 : ConjDifuso ) : Boolean = {
    // Implementaci´on de la funci´on inclusion

    }
    def igualdad ( cd1 : ConjDifuso , cd2 : ConjDifuso ) : Boolean = {
    // Implementaci´on de la funci´on igualdad

    }
}