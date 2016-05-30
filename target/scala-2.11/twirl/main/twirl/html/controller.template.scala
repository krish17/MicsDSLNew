
package twirl.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object controller_Scope0 {
import mics.dsl._

class controller extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,mics.dsl.service.ModuleWithActions,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(packageDir: String, module: mics.dsl.service.ModuleWithActions):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*2.1*/("""package """),_display_(/*2.10*/{packageDir}),format.raw/*2.22*/(""".controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * """),_display_(/*9.5*/{module.moduleDescription}),format.raw/*9.31*/("""
 """),format.raw/*10.2*/("""*/
@Singleton
class """),_display_(/*12.8*/{module.moduleName}),format.raw/*12.27*/("""Controller @Inject() extends Controller """),format.raw/*12.68*/("""{"""),format.raw/*12.69*/("""

    """),format.raw/*14.5*/("""/**
     * Create an Action to render an HTML page with a welcome message.
     * The configuration in the `routes` file means that this method
     * will be called when the application receives a `GET` request with
     * a path of `/`.
     */
    def index = Action """),format.raw/*20.24*/("""{"""),format.raw/*20.25*/("""
      """),format.raw/*21.7*/("""Ok(views.html.index("Your new application is ready."))
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/("""

"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(packageDir:String,module:mics.dsl.service.ModuleWithActions): play.twirl.api.HtmlFormat.Appendable = apply(packageDir,module)

  def f:((String,mics.dsl.service.ModuleWithActions) => play.twirl.api.HtmlFormat.Appendable) = (packageDir,module) => apply(packageDir,module)

  def ref: this.type = this

}


}

/**/
object controller extends controller_Scope0.controller
              /*
                  -- GENERATED --
                  DATE: Mon May 30 17:41:46 EDT 2016
                  SOURCE: C:/Users/Krishna/MicsDSL/src/main/scala/twirl/controller.scala.html
                  HASH: b8bb1ebe88e0d4bf202690a5ca428472bff8ec75
                  MATRIX: 427->1|586->65|614->67|649->76|681->88|798->180|844->206|874->209|923->233|963->252|1031->293|1060->294|1095->302|1399->578|1428->579|1463->587|1550->647|1578->648|1609->652|1637->653
                  LINES: 14->1|19->1|20->2|20->2|20->2|27->9|27->9|28->10|30->12|30->12|30->12|30->12|32->14|38->20|38->20|39->21|40->22|40->22|42->24|42->24
                  -- GENERATED --
              */
          