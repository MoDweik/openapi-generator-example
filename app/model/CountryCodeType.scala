package model

import play.api.libs.json._

/**
  * Country code iso 3166-1 alpha-2
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class CountryCodeType(
)

object CountryCodeType {
  implicit lazy val countryCodeTypeJsonFormat: Format[CountryCodeType] = Json.format[CountryCodeType]
}

