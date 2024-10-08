package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Represents the Swagger definition for errorResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class ErrorResponse(
  failures: Set[ErrorResponseFailuresInner]
)

object ErrorResponse {
  implicit lazy val errorResponseJsonFormat: Format[ErrorResponse] = Json.format[ErrorResponse]
}

