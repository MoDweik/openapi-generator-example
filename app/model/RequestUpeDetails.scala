package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for request_upeDetails.
  * @param safeId Safe ID.
  * @param customerIdentification1 Customer Identification 1 - CRN.
  * @param customerIdentification2 Customer Identification 2 - CT UTR.
  * @param organisationName Registered name of the organisation.
  * @param domesticOnly Boolean to indicate the organisation is UK domestic only.
  * @param filingMember Boolean to indicate filing member.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class RequestUpeDetails(
  safeId: String,
  customerIdentification1: Option[String],
  customerIdentification2: Option[String],
  organisationName: String,
  registrationDate: LocalDate,
  domesticOnly: Boolean,
  filingMember: Boolean
)

object RequestUpeDetails {
  implicit lazy val requestUpeDetailsJsonFormat: Format[RequestUpeDetails] = Json.format[RequestUpeDetails]
}

