package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for request_accountingPeriod.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
case class RequestAccountingPeriod(
  startDate: LocalDate,
  endDate: LocalDate
)

object RequestAccountingPeriod {
  implicit lazy val requestAccountingPeriodJsonFormat: Format[RequestAccountingPeriod] = Json.format[RequestAccountingPeriod]
}

