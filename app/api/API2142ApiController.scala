package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ErrorResponse
import model.Request
import model.SuccessResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
@Singleton
class API2142ApiController @Inject()(cc: ControllerComponents, api: API2142Api) extends AbstractController(cc) {
  /**
    * POST /pillar2/subscription
    */
  def createSubscriptionPillar2(): Action[AnyContent] = Action { request =>
    def executeApi(): SuccessResponse = {
      val request = request.body.asJson.map(_.as[Request]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "request")
      }
      val environment = request.headers.get("Environment")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("Environment", "header")
        }
        
      val correlationId = request.headers.get("CorrelationId")
        
      api.createSubscriptionPillar2(environment, request, correlationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
