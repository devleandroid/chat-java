// @SOURCE:/home/leandro/workspace_java/signalj-chat-java/conf/routes
// @HASH:7532471b20ed539308a973df5396dfd5ed86dea3
// @DATE:Fri Nov 11 18:11:24 CST 2016


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)](("",signalJ.Routes)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
private[this] lazy val controllers_Application_message0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("message"))))
private[this] lazy val controllers_Application_message0_invoker = createInvoker(
controllers.Application.message(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "message", Nil,"GET", """ Home page
 GET         /                        controllers.Application.index()""", Routes.prefix + """message"""))
        

// @LINE:8
private[this] lazy val controllers_Application_index1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index1_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:11
private[this] lazy val controllers_Assets_at2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:12
private[this] lazy val controllers_WebJarAssets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_WebJarAssets_at3_invoker = createInvoker(
controllers.WebJarAssets.at(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
        

// @LINE:15
lazy val signalJ_Routes4 = Include(signalJ.Routes)
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """message""","""controllers.Application.message()"""),("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),signalJ.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_Application_message0_route(params) => {
   call { 
        controllers_Application_message0_invoker.call(controllers.Application.message())
   }
}
        

// @LINE:8
case controllers_Application_index1_route(params) => {
   call { 
        controllers_Application_index1_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:11
case controllers_Assets_at2_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:12
case controllers_WebJarAssets_at3_route(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at3_invoker.call(controllers.WebJarAssets.at(file))
   }
}
        

// @LINE:15
case signalJ_Routes4(handler) => handler
        
}

}
     