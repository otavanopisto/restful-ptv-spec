/**
 * RESTful PTV
 * Restful way to use Palvelutietovaranto.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.otavanopisto.restfulptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.otavanopisto.restfulptv.client.model.LanguageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * ServiceHour
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-03T15:31:17.318+03:00")
public class ServiceHour   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("opens")
  private String opens = null;

  @JsonProperty("closes")
  private String closes = null;

  @JsonProperty("days")
  private List<Integer> days = new ArrayList<Integer>();

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("additionalInformation")
  private List<LanguageItem> additionalInformation = new ArrayList<LanguageItem>();

  public ServiceHour type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ServiceHour validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public ServiceHour validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Get validTo
   * @return validTo
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public ServiceHour opens(String opens) {
    this.opens = opens;
    return this;
  }

   /**
   * Get opens
   * @return opens
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOpens() {
    return opens;
  }

  public void setOpens(String opens) {
    this.opens = opens;
  }

  public ServiceHour closes(String closes) {
    this.closes = closes;
    return this;
  }

   /**
   * Get closes
   * @return closes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCloses() {
    return closes;
  }

  public void setCloses(String closes) {
    this.closes = closes;
  }

  public ServiceHour days(List<Integer> days) {
    this.days = days;
    return this;
  }

  public ServiceHour addDaysItem(Integer daysItem) {
    this.days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Integer> getDays() {
    return days;
  }

  public void setDays(List<Integer> days) {
    this.days = days;
  }

  public ServiceHour status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ServiceHour additionalInformation(List<LanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public ServiceHour addAdditionalInformationItem(LanguageItem additionalInformationItem) {
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<LanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceHour serviceHour = (ServiceHour) o;
    return Objects.equals(this.type, serviceHour.type) &&
        Objects.equals(this.validFrom, serviceHour.validFrom) &&
        Objects.equals(this.validTo, serviceHour.validTo) &&
        Objects.equals(this.opens, serviceHour.opens) &&
        Objects.equals(this.closes, serviceHour.closes) &&
        Objects.equals(this.days, serviceHour.days) &&
        Objects.equals(this.status, serviceHour.status) &&
        Objects.equals(this.additionalInformation, serviceHour.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, validFrom, validTo, opens, closes, days, status, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHour {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    closes: ").append(toIndentedString(closes)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
