package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for request_upeCorrespAddressDetails.
  * @param addressLine1 Address Line 1
  * @param addressLine2 Address Line 2
  * @param addressLine3 Address Line 3
  * @param addressLine4 Address Line 4
  * @param postCode Postal code
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class RequestUpeCorrespAddressDetails(
  addressLine1: String,
  addressLine2: Option[String],
  addressLine3: Option[String],
  addressLine4: Option[String],
  postCode: Option[String],
  countryCode: CountryCodeType
)

object RequestUpeCorrespAddressDetails {
  implicit lazy val requestUpeCorrespAddressDetailsJsonFormat: Format[RequestUpeCorrespAddressDetails] = Json.format[RequestUpeCorrespAddressDetails]
}

