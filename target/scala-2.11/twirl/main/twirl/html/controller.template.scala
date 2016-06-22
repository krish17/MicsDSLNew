
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
import service.Data._

Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*3.1*/("""package """),_display_(/*3.10*/{packageDir}),format.raw/*3.22*/(""".controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * """),_display_(/*10.5*/{module.description}),format.raw/*10.25*/("""
 """),format.raw/*11.2*/("""*/
@Singleton
class """),_display_(/*13.8*/{module.name}),format.raw/*13.21*/("""Controller @Inject() extends Controller """),format.raw/*13.62*/("""{"""),format.raw/*13.63*/("""

    """),_display_(/*15.6*/for(action <- module.actions; actionData <- action.data) yield /*15.62*/ {_display_(Seq[Any](format.raw/*15.64*/("""
        """),format.raw/*16.9*/("""/**
         * """),_display_(/*17.13*/{actionData.name}),format.raw/*17.30*/("""
         """),format.raw/*18.10*/("""* """),_display_(/*18.13*/{actionData.description}),format.raw/*18.37*/("""
         """),format.raw/*19.10*/("""*/
        def """),_display_(/*20.14*/{actionData.actionName}),_display_(/*20.38*/actionData/*20.48*/.input.map/*20.58*/{p=>_display_(Seq[Any](format.raw/*20.62*/("""(id: String)""")))}),format.raw/*20.75*/(""" """),format.raw/*20.76*/("""= Action """),format.raw/*20.85*/("""{"""),format.raw/*20.86*/(""" """),format.raw/*20.87*/("""implicit request =>
            Ok(""""),_display_(/*21.18*/{module.name}),format.raw/*21.31*/("""/"""),_display_(/*21.33*/{actionData.name}),format.raw/*21.50*/(""": """),_display_(/*21.53*/{actionData.description}),format.raw/*21.77*/(""" """),format.raw/*21.78*/("""- Not Implemented")
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
    """)))}),format.raw/*23.6*/("""
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
                  DATE: Tue Jun 21 21:24:29 EDT 2016
                  SOURCE: C:/Users/Krishna/MicsDSL/src/main/scala/twirl/controller.scala.html
                  HASH: 68e7d1a149f6bacb794be73b75a23924d2278f96
                  MATRIX: 416->1|585->54|613->80|648->89|680->101|798->193|839->213|869->216|918->240|952->253|1020->294|1049->295|1084->304|1156->360|1196->362|1233->372|1277->389|1315->406|1354->417|1384->420|1429->444|1468->455|1512->472|1556->496|1575->506|1594->516|1636->520|1680->533|1709->534|1746->543|1775->544|1804->545|1869->583|1903->596|1932->598|1970->615|2000->618|2045->642|2074->643|2130->672|2159->673|2196->680|2225->682|2253->683
                  LINES: 14->1|19->1|20->3|20->3|20->3|27->10|27->10|28->11|30->13|30->13|30->13|30->13|32->15|32->15|32->15|33->16|34->17|34->17|35->18|35->18|35->18|36->19|37->20|37->20|37->20|37->20|37->20|37->20|37->20|37->20|37->20|37->20|38->21|38->21|38->21|38->21|38->21|38->21|38->21|39->22|39->22|40->23|41->24|41->24
                  -- GENERATED --
              */
          