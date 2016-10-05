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

package fi.otavanopisto.restfulptv.client;

import fi.otavanopisto.restfulptv.client.model.*;

import fi.otavanopisto.restfulptv.client.model.BadRequest;
import fi.otavanopisto.restfulptv.client.model.Organization;
import fi.otavanopisto.restfulptv.client.model.Forbidden;
import fi.otavanopisto.restfulptv.client.model.InternalServerError;
import fi.otavanopisto.restfulptv.client.model.OrganizationService;
import fi.otavanopisto.restfulptv.client.model.NotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-05T10:47:52.746+03:00")
public class OrganizationsApi {

  private ApiClient client;
  private String baseUrl;

  public OrganizationsApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Create organization
   * Create organization
   * @param body Payload (required)
   */
  public ApiResponse<Organization> createOrganization(Organization body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/organizations", baseUrl);
      
    ResultType<Organization> resultType = new ResultType<Organization>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Create organization service
   * Create organization service
   * @param organizationId Organization id (required)
   * @param body Payload (required)
   */
  public ApiResponse<Organization> createOrganizationService(String organizationId, OrganizationService body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/organizations/{organizationId}/organizationServices"
      .replaceAll("\\{" + "organizationId" + "\\}", String.valueOf(organizationId)), baseUrl);
      
    ResultType<Organization> resultType = new ResultType<Organization>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Finds an organization
   * Finds an organization by id
   * @param organizationId Organization id (required)
   */
  public ApiResponse<Organization> findOrganization(String organizationId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/organizations/{organizationId}"
      .replaceAll("\\{" + "organizationId" + "\\}", String.valueOf(organizationId)), baseUrl);
      
    ResultType<Organization> resultType = new ResultType<Organization>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Finds a organization service by id
   * Find an organization service
   * @param organizationId Organization id (required)
   * @param organizationServiceId Organization service id (required)
   */
  public ApiResponse<OrganizationService> findOrganizationService(String organizationId, String organizationServiceId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/organizations/{organizationId}/organizationServices/{organizationServiceId}"
      .replaceAll("\\{" + "organizationId" + "\\}", String.valueOf(organizationId))
      .replaceAll("\\{" + "organizationServiceId" + "\\}", String.valueOf(organizationServiceId)), baseUrl);
      
    ResultType<OrganizationService> resultType = new ResultType<OrganizationService>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Organization organization service list
   * Lists organization&#39;s organization services
   * @param organizationId Organization id (required)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<OrganizationService>> listOrganizationOrganizationServices(String organizationId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/organizations/{organizationId}/organizationServices"
      .replaceAll("\\{" + "organizationId" + "\\}", String.valueOf(organizationId)), baseUrl);
      
    ResultType<List<OrganizationService>> resultType = new ResultType<List<OrganizationService>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * List organizations
   * List organizations
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<Organization>> listOrganizations(Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/organizations", baseUrl);
      
    ResultType<List<Organization>> resultType = new ResultType<List<Organization>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates an organization
   * Updates organization data
   * @param organizationId Organization id (required)
   * @param body Payload (required)
   */
  public ApiResponse<Organization> updateOrganization(String organizationId, Organization body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/organizations/{organizationId}"
      .replaceAll("\\{" + "organizationId" + "\\}", String.valueOf(organizationId)), baseUrl);
      
    ResultType<Organization> resultType = new ResultType<Organization>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates an organization service
   * Updates organization service
   * @param organizationId Organization id (required)
   * @param organizationServiceId Organization service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<OrganizationService> updateOrganizationService(String organizationId, String organizationServiceId, OrganizationService body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/organizations/{organizationId}/organizationServices/{organizationServiceId}"
      .replaceAll("\\{" + "organizationId" + "\\}", String.valueOf(organizationId))
      .replaceAll("\\{" + "organizationServiceId" + "\\}", String.valueOf(organizationServiceId)), baseUrl);
      
    ResultType<OrganizationService> resultType = new ResultType<OrganizationService>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  
}
