
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

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
        <title>Informa&ccedil;&atilde;o </title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/ulbra.png")),format.raw/*9.95*/("""">
        <link rel='stylesheet' href='"""),_display_(/*10.39*/routes/*10.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*10.107*/("""'>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/main.css")),format.raw/*11.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.at("images/image.jpg")),format.raw/*12.95*/("""">
    </head>
    <body><!--nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a id="home" class="navbar-brand" href="#">Chat Ulbra</a>
                </div>
            </div>
        </nav-->
        <script type='text/javascript' src='"""),_display_(/*27.46*/routes/*27.52*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*27.106*/("""'></script>
        <script src="/signalj/jquery.signalR.js"></script>
        <script type="text/javascript" charset="utf-8" src="/signalj/hubs.js"></script>
        <script type="text/javascript" charset="utf-8" src=""""),_display_(/*30.62*/routes/*30.68*/.Assets.at("javascripts/chat.js")),format.raw/*30.101*/(""""></script>
        <!--div class="container">
            <footer class="footer">
                <div class="container"-->
                    """),_display_(/*34.22*/content),format.raw/*34.29*/("""
                    """),format.raw/*35.21*/("""<!--p class="text-muted">SignalJ Chat Demo</p-->
                <!--/div>
            </footer>
        </div-->
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
                  SOURCE: /home/leandro/workspace_java/signalj-chat-java/app/views/main.scala.html
                  HASH: dd5c1d5748aeeae344ea153274f3fa4a7fc97ae3
                  MATRIX: 720->1|823->16|850->17|1208->349|1222->355|1272->385|1340->426|1355->432|1439->494|1522->550|1537->556|1592->590|1680->651|1695->657|1746->687|2548->1462|2563->1468|2639->1522|2886->1742|2901->1748|2956->1781|3129->1927|3157->1934|3206->1955
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|55->27|55->27|55->27|58->30|58->30|58->30|62->34|62->34|63->35
                  -- GENERATED --
              */
          