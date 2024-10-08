package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for contactDetailsType.
  * @param name Name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class ContactDetailsType(
  name: String,
  telephone: Option[String],
  emailAddress: String
)

object ContactDetailsType {
  implicit lazy val contactDetailsTypeJsonFormat: Format[ContactDetailsType] = Json.format[ContactDetailsType]
}

