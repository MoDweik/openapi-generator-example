package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class Request(
  upeDetails: RequestUpeDetails,
  accountingPeriod: RequestAccountingPeriod,
  upeCorrespAddressDetails: RequestUpeCorrespAddressDetails,
  primaryContactDetails: ContactDetailsType,
  secondaryContactDetails: Option[ContactDetailsType],
  filingMemberDetails: Option[RequestFilingMemberDetails]
)

object Request {
  implicit lazy val requestJsonFormat: Format[Request] = Json.format[Request]
}

