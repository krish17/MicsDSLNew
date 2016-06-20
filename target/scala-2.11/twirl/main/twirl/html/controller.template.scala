
package twirl.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object controller_Scope0 {
import mics.dsl._

class controller extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,service.Data.ModuleData,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(packageDir: String, module: service.Data.ModuleData):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*2.1*/("""package """),_display_(/*2.10*/{packageDir}),format.raw/*2.22*/(""".controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * """),_display_(/*9.5*/{module.description}),format.raw/*9.25*/("""
 """),format.raw/*10.2*/("""*/
@Singleton
class """),_display_(/*12.8*/{module.name}),format.raw/*12.21*/("""Controller @Inject() extends Controller """),format.raw/*12.62*/("""{"""),format.raw/*12.63*/("""

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

  def render(packageDir:String,module:service.Data.ModuleData): play.twirl.api.HtmlFormat.Appendable = apply(packageDir,module)

  def f:((String,service.Data.ModuleData) => play.twirl.api.HtmlFormat.Appendable) = (packageDir,module) => apply(packageDir,module)

  def ref: this.type = this

}


}

/**/
object controller extends controller_Scope0.controller
              /*
                  -- GENERATED --
                  DATE: Mon Jun 20 12:16:39 EDT 2016
                  SOURCE: C:/Users/Krishna/MicsDSL/src/main/scala/twirl/controller.scala.html
                  HASH: 381f3dbe288fc35b369578f50cb094a353e4a08a
                  MATRIX: 416->1|564->54|592->56|627->65|659->77|776->169|816->189|846->192|895->216|929->229|997->270|1026->271|1061->279|1365->555|1394->556|1429->564|1516->624|1544->625|1575->629|1603->630
                  LINES: 14->1|19->1|20->2|20->2|20->2|27->9|27->9|28->10|30->12|30->12|30->12|30->12|32->14|38->20|38->20|39->21|40->22|40->22|42->24|42->24
                  -- GENERATED --
              */
          