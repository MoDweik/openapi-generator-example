package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for successResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class SuccessResponse(
  success: SuccessResponseSuccess
)

object SuccessResponse {
  implicit lazy val successResponseJsonFormat: Format[SuccessResponse] = Json.format[SuccessResponse]
}

