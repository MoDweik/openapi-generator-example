package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for successResponse_success.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class SuccessResponseSuccess(
  processingDate: String,
  formBundleNumber: String,
  plrReference: String
)

object SuccessResponseSuccess {
  implicit lazy val successResponseSuccessJsonFormat: Format[SuccessResponseSuccess] = Json.format[SuccessResponseSuccess]
}

