package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for request_filingMemberDetails.
  * @param safeId Safe ID.
  * @param customerIdentification1 Customer Identification 1 - CRN.
  * @param customerIdentification2 Customer Identification 2 - CT UTR.
  * @param organisationName Registered name of the organisation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class RequestFilingMemberDetails(
  safeId: String,
  customerIdentification1: Option[String],
  customerIdentification2: Option[String],
  organisationName: String
)

object RequestFilingMemberDetails {
  implicit lazy val requestFilingMemberDetailsJsonFormat: Format[RequestFilingMemberDetails] = Json.format[RequestFilingMemberDetails]
}

