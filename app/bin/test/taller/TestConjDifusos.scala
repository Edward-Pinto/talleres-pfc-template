package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestsConjDifusos extends AnyFunSuite {
  val objConjDifusos = new ConjuntosDifusos()


  //PERTENENCIA
  test("cd1 pertenecia 0.0") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    assert(cd1(0) == 0.0)
  }
  test("cd1 pertenecia 1.0") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    assert(cd1(6) == 1.0)
  }

  //COMLPEMENTO
  test("complemento") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    val complemtocd1 = objConjDifusos.complemento(cd1)
    assert(complemtocd1(0) == 1.0)
    assert(complemtocd1(6) == 0.0)
  }



  //UNION E INTERSECCION
  test("cd1 union e intersección cd2") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    val cd2 = objConjDifusos.muchoMayorQue(1, 10) 

    //UNION
    val conjuntounion = objConjDifusos.union(cd1, cd2)
    assert(conjuntounion(10) ==  cd1(10))   

    //INTERSECCION
    val conjuntointerseccion = objConjDifusos.interseccion(cd1, cd2)
    assert(conjuntointerseccion(5) ==  cd2(5))  

  }
  //INCLUSION E IGUALDAD
  test("cd1 está incluido en cd2 pero no es igual") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    val cd2 = objConjDifusos.muchoMayorQue(1, 10)
    assert(objConjDifusos.inclusion(cd1, cd2) == true)
    assert(objConjDifusos.igualdad(cd1, cd2) == false)
      
  }

  test("cd1 está incluido en cd2 y es igual") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    val cd2 = objConjDifusos.muchoMayorQue(1, 5)
    assert(objConjDifusos.inclusion(cd1, cd2) == true)
    assert(objConjDifusos.igualdad(cd1, cd2) == true)
  }

  test("cd1 no está incluido en cd2") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    val cd2 = objConjDifusos.muchoMayorQue(1, 3)
    assert(objConjDifusos.inclusion(cd1, cd2) == false)
    assert(objConjDifusos.igualdad(cd1, cd2) == false)
  }
}