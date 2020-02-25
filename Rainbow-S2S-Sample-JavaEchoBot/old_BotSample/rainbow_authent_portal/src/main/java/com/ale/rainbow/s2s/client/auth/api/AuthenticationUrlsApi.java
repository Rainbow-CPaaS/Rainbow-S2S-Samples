/*
 * Rainbow authentication portal
 * # Rainbow authentication portal API guide  ## Preamble  [Download Postman collection][0]  ### Introduction  This guide describes list of API services that are provided by OT Rainbow authentication portal system. Services are used to manage OT Rainbow authentication.  ### Protocol  REST interface is used for sending/receiving OT rainbow API messages.   HTTP request GET is used. Standard HTTP responses are used to provide requested information or error status. There is no session notion in OT Rainbow system, so requests could be issued according stateless model, without transport conservation between them.   JSON is used as a main format for data encoding in message body part. Each request is started with the following pattern /{module}/{version}/ where {module} is a portal module name to address and {version} is a version of used API, par example, “v1.0”.  ### Security considerations  Each request should contain some credential information to authenticate itself. Standard HTTP authentication with basic/bearer modes is used. JSON Web Token mechanism is used to provide authentication information. JWT has a expire timeout that is controlled by OT Rainbow portal to prevent very long token usage. Also authentication with application token is used. The token must be provided in the request HTTP header, using a custom header: APIKey. At server side, token is verified, and if it doesn’t match, 403 Not Allowed response is sent. TLS is used as a transport protocol to support message exchanges between OT Rainbow portal and an application.    [0]: AuthenticationPortalServer_postman.json
 *
 * The version of the OpenAPI document: 1.104.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ale.rainbow.s2s.client.auth.api;

import com.ale.rainbow.s2s.client.auth.ApiCallback;
import com.ale.rainbow.s2s.client.auth.ApiClient;
import com.ale.rainbow.s2s.client.auth.ApiException;
import com.ale.rainbow.s2s.client.auth.ApiResponse;
import com.ale.rainbow.s2s.client.auth.Configuration;
import com.ale.rainbow.s2s.client.auth.Pair;
import com.ale.rainbow.s2s.client.auth.ProgressRequestBody;
import com.ale.rainbow.s2s.client.auth.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ale.rainbow.s2s.client.auth.models.GetLoginUrlSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationUrlsApi {
    private ApiClient localVarApiClient;

    public AuthenticationUrlsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationUrlsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getLoginUrl
     * @param uid Rainbow user unique identifier: typically his login email (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLoginUrlCall(String uid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rainbow/authentication/v1.0/urls";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (uid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("uid", uid));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLoginUrlValidateBeforeCall(String uid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new ApiException("Missing the required parameter 'uid' when calling getLoginUrl(Async)");
        }
        

        okhttp3.Call localVarCall = getLoginUrlCall(uid, _callback);
        return localVarCall;

    }

    /**
     * Get user authentication URLs
     * This API allows Rainbow users to know that URL they can use to perform a login.
     * @param uid Rainbow user unique identifier: typically his login email (required)
     * @return GetLoginUrlSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public GetLoginUrlSuccess getLoginUrl(String uid) throws ApiException {
        ApiResponse<GetLoginUrlSuccess> localVarResp = getLoginUrlWithHttpInfo(uid);
        return localVarResp.getData();
    }

    /**
     * Get user authentication URLs
     * This API allows Rainbow users to know that URL they can use to perform a login.
     * @param uid Rainbow user unique identifier: typically his login email (required)
     * @return ApiResponse&lt;GetLoginUrlSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetLoginUrlSuccess> getLoginUrlWithHttpInfo(String uid) throws ApiException {
        okhttp3.Call localVarCall = getLoginUrlValidateBeforeCall(uid, null);
        Type localVarReturnType = new TypeToken<GetLoginUrlSuccess>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get user authentication URLs (asynchronously)
     * This API allows Rainbow users to know that URL they can use to perform a login.
     * @param uid Rainbow user unique identifier: typically his login email (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLoginUrlAsync(String uid, final ApiCallback<GetLoginUrlSuccess> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLoginUrlValidateBeforeCall(uid, _callback);
        Type localVarReturnType = new TypeToken<GetLoginUrlSuccess>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}