package api

import play.api.libs.json._
import model.ErrorResponse
import model.Request
import model.SuccessResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
trait API2142Api {
  /**
    * API#2142 Create Subscription For OECD Tax Pillar 2 Service
    *  Example: /pillar2/subscription &#x60;&#x60;&#x60; Change Log &#x60;&#x60;&#x60;    | Version | Date | Author | Description |   |---|-----|------|-----|   | 0.1.0  | 26-07-2023 | Audu Alfa  | Initial draft |   |---|-----|------|-----|   | 1.0.0  | 02-08-2023 | Audu Alfa  | Baselined Version |   | 1.1.0  | 05-08-2023 | Audu Alfa  | Updated the folliwing: |   |||| - parameters &gt; correlationId &gt; description |   |||| - Added &#39;GB&#39; to the countryCode enum list |   |||| - Updated request example to inlcude telephone numbers as strings |   | 1.2.0  | 05-08-2023 | Audu Alfa  | Updated the folliwing:|   |||| - Removed originator id from parameters section|   |||| - Removed 400 http response - &#39;invalid or missing regime&#39;|   |||| - Removed &#39;/&#39; at the end of url path resulting in &#39;/pillar2/subscription&#39; |    
    * @param environment Mandatory. The environment in use.
    * @param request Request body
    * @param correlationId Strongly recommended. A UUID format string for the transaction.
    */
  def createSubscriptionPillar2(environment: String, request: Request, correlationId: Option[String]): SuccessResponse
}
