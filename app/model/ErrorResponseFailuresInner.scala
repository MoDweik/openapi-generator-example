package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for errorResponse_failures_inner.
  * @param code Keys for all the errors returned
  * @param reason A simple description for the failure
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class ErrorResponseFailuresInner(
  code: String,
  reason: String
)

object ErrorResponseFailuresInner {
  implicit lazy val errorResponseFailuresInnerJsonFormat: Format[ErrorResponseFailuresInner] = Json.format[ErrorResponseFailuresInner]
}

