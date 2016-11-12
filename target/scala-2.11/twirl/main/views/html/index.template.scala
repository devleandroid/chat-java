
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    """),format.raw/*2.5*/("""<div id="login" class="row">
        <div id="alert" class="alert alert-danger" role="alert">
            Campo nome* obrigatório !
        </div>
        <form class="form-signin" role="form">
            <h3 class="form-signin-heading">Preencha os campos abaixo e inicie o atendimento.</h3>
            <div class="row">
                <label for="inputUsername" class="sr-only">Nome</label>
                <span style="color:black;font-weight:bold">Nome*
                    <input type="text" id="inputUsername" class="form-control" placeholder="">
                </span>
                <label for="inputEmail" class="sr-only">Email</label>
                <span style="color:black;font-weight:bold">Email
                    <input type="email" id="inputEmail" class="form-control" placeholder="">
                </span>
                <label for="inputCGU" class="sr-only">CGU</label>
                <span style="color:black;font-weight:bold">CGU
                    <input type="text" id="inputCGU" class="form-control" placeholder="">
                </span>
            </div>
            <div class="row">
            <!--span style="color:black;font-weight:bold"-->
                        <h4>Assunto:</h4>
                        <select id="roomselect" class="form-control">
                            <option value="">Selecione a Opção</option>
                            <option value="Matrícula/Rematricula">Matrícula/Rematricula</option>
                            <option value="Vestibular">Vestibular</option>
                            <option value="Financeiro">Financeiro</option>
                            <option value="Outros">Outros</option>
                        </select>
                    <!--/span-->
                    <!-- or create a new one: -->
                    <div class="form-group">
                        <!-- label class="sr-only" for="roomname">Room name</label -->
                        <!-- input type="text" class="form-control" id="roomname" placeholder="Room name" -->
                    </div>
                    <!-- button id="create" class="btn btn-default">Create</button -->
                    <span style="color:black;font-weight:bold">
                        <button id="loginSubmit" class="btn btn-md btn-default">Iniciar Atendimento OnLine</button>
                        <h4>(*) Campo obrigatório.</h4>
                    </span><!--img src="" alt=""--> 
            </div>
        </form> <!-- p>Please note: This is not a real login screen, any username and password will be accepted.</p-->
            <div id="chat">
            <div class="row">
                <form class="form-inline" role="form">
                    
                </form>
            </div>
                <div class="row">
                    <div id="main" class="col-md-8">
                        <div id="messages">
                        </div>
                        <!-- input id="talk" type="text" class="form-control" -->
                    </div>
                    <div id="membersbar" class="col-md-4">
                        <ul id="obrigatorio">
                            
                        </ul>
                    </div>
                </div>
        </div>  <!--a href"http://www.ulbra.br/"/>Ulbra</a -->
    </div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 17:46:11 CST 2016
                  SOURCE: /home/leandro/workspace_java/signalj-chat-java/app/views/index.scala.html
                  HASH: 72e54ffc6dbf495146ec46cdc4f60054576b6762
                  MATRIX: 798->1|809->5|847->7|878->12
                  LINES: 29->1|29->1|29->1|30->2
                  -- GENERATED --
              */
          