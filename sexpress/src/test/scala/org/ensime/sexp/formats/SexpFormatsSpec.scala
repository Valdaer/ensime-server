// Copyright: 2010 - 2016 https://github.com/ensime/ensime-server/graphs
// Licence: http://www.gnu.org/licenses/gpl-3.0.en.html
package org.ensime.sexp.formats

import org.ensime.sexp._

class SexpFormatsSpec extends FormatSpec with SexpFormats {

  def assertFormat(sexp: Sexp): Unit = assertFormat(sexp, sexp)

  describe("SexpFormats") {
    it("should support SexpAtoms") {
      assertFormat(SexpNil)
      assertFormat(SexpPosInf)
      assertFormat(SexpNegInf)
      assertFormat(SexpNaN)
      assertFormat(SexpNumber(1))
      assertFormat(SexpString("hello"))
      assertFormat(SexpSymbol("hello"))
    }

    it("should support SexpList") {
      assertFormat(SexpList(foo, bar))
    }

    it("should support SexpCons") {
      assertFormat(SexpCons(foo, bar))
    }
  }
}
