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
import fi.otavanopisto.restfulptv.client.model.ServiceLocationChannel;
import fi.otavanopisto.restfulptv.client.model.Forbidden;
import fi.otavanopisto.restfulptv.client.model.InternalServerError;
import fi.otavanopisto.restfulptv.client.model.NotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-04T07:20:36.515+03:00")
public class ServiceLocationChannelsApi {

  private ApiClient client;
  private String baseUrl;

  public ServiceLocationChannelsApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * creates ServiceLocationChannel
   * creates ServiceLocationChannel
   * @param serviceId service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<ServiceLocationChannel> createServiceServiceLocationChannel(String serviceId, ServiceLocationChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/serviceLocationChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<ServiceLocationChannel> resultType = new ResultType<ServiceLocationChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * finds ServiceLocationChannel by serviceLocationChannelId
   * finds ServiceLocationChannels by serviceLocationChannelId
   * @param serviceId Service id (required)
   * @param serviceLocationChannelId serviceLocationChannel id (required)
   */
  public ApiResponse<ServiceLocationChannel> findServiceServiceLocationChannel(String serviceId, String serviceLocationChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "serviceLocationChannelId" + "\\}", String.valueOf(serviceLocationChannelId)), baseUrl);
      
    ResultType<ServiceLocationChannel> resultType = new ResultType<ServiceLocationChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists ServiceLocationChannels by serviceId
   * Lists ServiceLocationChannels by serviceId
   * @param serviceId Service id (required)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<ServiceLocationChannel>> listServiceServiceLocationChannels(String serviceId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/services/{serviceId}/serviceLocationChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<List<ServiceLocationChannel>> resultType = new ResultType<List<ServiceLocationChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates ServiceLocationChannel
   * Updates ServiceLocationChannel
   * @param serviceId service id (required)
   * @param serviceLocationChannelId serviceLocationChannel id (required)
   * @param body Payload (required)
   */
  public ApiResponse<ServiceLocationChannel> updateServiceLocationChannel(String serviceId, String serviceLocationChannelId, ServiceLocationChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "serviceLocationChannelId" + "\\}", String.valueOf(serviceLocationChannelId)), baseUrl);
      
    ResultType<ServiceLocationChannel> resultType = new ResultType<ServiceLocationChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  
}
