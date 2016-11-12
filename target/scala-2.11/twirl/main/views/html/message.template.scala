
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
object message extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/msg/*1.5*/ {_display_(Seq[Any](format.raw/*1.7*/("""
    """),format.raw/*2.5*/("""<img src="C:\Users\leandro.marques\Downloads\signalj-chat-java\signalj-chat-java\public\images\faq.jpg" alt="">
    <div id="login" class="row">
        <div id="alert" class="alert alert-danger" role="alert">
            Campo nome* obrigatório !
        </div>
        <form class="form-signin" role="form">
            <h3 class="form-signin-heading">Digite aqui seu texto.</h3>
            <div class="row">
                <label for="inputUsername" class="sr-only">Nome</label>
                <span style="color:black;font-weight:bold">Nome: 
                    <input type="text" id="inputUsername" class="form-control" placeholder="">
                </span>
                <label for="inputEmail" class="sr-only">Email</label>
                <span style="color:black;font-weight:bold">Email: *
                    <input type="email" id="inputEmail" class="form-control" placeholder="">
                </span>
                <label for="inputCGU" class="sr-only">Assunto</label>
                <span style="color:black;font-weight:bold">Assunto *
                </span>
                <textarea cols="33" rows="4" name="message"></textarea>
                <!--div id="chat"-->
                    <!--div class="row"-->
                        <form class="form-inline" role="form"><br></br>
                            <span style="color:black;font-weight:bold">
                                <button type="submit" name="submit" class="btn btn-default" value="Enviar Email">Enviar Email</button>
                                <button type="button" name="leave" class="btn btn-default" data-dismiss="modal" value="Fechar Janela">Fechar Janela</button>
                                <!-- input type="submit" name="submit" value="Enviar Email"/ -->
                                <!-- input type="button" name="leave" value="Fechar Janela" onclick="window.close();" -->
                            </span>
                            <img src="" alt=""> 
                        </form>
                    <!--/div-->
                <!--/div-->
            </div>
        </form> <!-- p>Please note: This is not a real login screen, any username and password will be accepted.</p-->
        <!--div class="row">
            <div id="main" class="col-md-8">
                <div id="messages"-->
                <!--/div--> <!-- input id="talk" type="text" class="form-control" -->
            <!--/div-->
            <!--div id="membersbar" class="col-md-4">
                <ul id="obrigatorio">
                </ul>
            </div-->
        <!--/div-->
        <!--a href"http://www.ulbra.br/"/>Ulbra</a -->
    </div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 19:25:07 CST 2016
                  SOURCE: /home/leandro/workspace_java/signalj-chat-java/app/views/message.scala.html
                  HASH: 298e487d008920cfbaf881b8258d093f07600f08
                  MATRIX: 800->1|810->4|848->6|879->11
                  LINES: 29->1|29->1|29->1|30->2
                  -- GENERATED --
              */
          