package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestsConjDifusos extends AnyFunSuite {
  val objConjDifusos = new ConjuntosDifusos()

  test("cd1 está incluido en cd2 pero no es igual") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    val cd2 = objConjDifusos.muchoMayorQue(1, 10)
    assert(inclusion(cd1, cd2) == true)
    assert(igualdad(cd1, cd2) == false)
  }

  test("cd1 está incluido en cd2 y es igual") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    val cd2 = objConjDifusos.muchoMayorQue(1, 5)
    assert(inclusion(cd1, cd2) == true)
    assert(igualdad(cd1, cd2) == true)
  }

  test("cd1 no está incluido en cd2") {
    val cd1 = objConjDifusos.muchoMayorQue(1, 5)
    val cd2 = objConjDifusos.muchoMayorQue(1, 3)
    assert(inclusion(cd1, cd2) == false)
    assert(igualdad(cd1, cd2) == false)
  }