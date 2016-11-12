
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object msg extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Deixe uma mensagem</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/ulbra.png")),format.raw/*9.95*/("""">
        <link rel='stylesheet' href='"""),_display_(/*10.39*/routes/*10.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*10.107*/("""'>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/main.css")),format.raw/*11.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.at("images/image.jpg")),format.raw/*12.95*/("""">
    </head>
    <body>
        """),_display_(/*15.10*/content),format.raw/*15.17*/("""
    """),format.raw/*16.5*/("""<!--div class="container">
            
    </div-->
        <!--footer class="footer">
            <div class="container"-->
                <!--p class="text-muted">SignalJ Chat Demo</p-->
            <!--/div-->
        <!--/footer-->
        <script type='text/javascript' src='"""),_display_(/*24.46*/routes/*24.52*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*24.106*/("""'></script>
        <script src="/signalj/jquery.signalR.js"></script>
        <script type="text/javascript" charset="utf-8" src="/signalj/hubs.js"></script>
        <script type="text/javascript" charset="utf-8" src=""""),_display_(/*27.62*/routes/*27.68*/.Assets.at("javascripts/chat.js")),format.raw/*27.101*/(""""></script>
    </body>
</html>"""))}
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 18:47:50 CST 2016
                  SOURCE: /home/leandro/workspace_java/signalj-chat-java/app/views/msg.scala.html
                  HASH: dfbed53e9ecb2943b4e3b363c2b8aece7df004f2
                  MATRIX: 719->1|822->16|849->17|1199->341|1213->347|1263->377|1331->418|1346->424|1430->486|1513->542|1528->548|1583->582|1671->643|1686->649|1737->679|1799->714|1827->721|1859->726|2169->1009|2184->1015|2260->1069|2507->1289|2522->1295|2577->1328
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|43->15|43->15|44->16|52->24|52->24|52->24|55->27|55->27|55->27
                  -- GENERATED --
              */
          