# Ale\Rainbow\S2S\Client\AuthPortal\OidcClientApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJwt**](OidcClientApi.md#getJwt) | **GET** /api/rainbow/authentication/v1.0/oidc-client/jwt | Get a JWT from an id_token
[**getOidcLogin**](OidcClientApi.md#getOidcLogin) | **GET** /api/rainbow/authentication/v1.0/oidc-client/login | Initiate an OIDC authentication



## getJwt

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetJwtSuccess getJwt($content_type, $x_rainbow_app_auth, $accept, $id_token, $challenge, $nonce)

Get a JWT from an id_token

This endpoints allows applications to get a Rainbow JWT from an OpenID Connect (OIDC) id_token.  This API has to be used when OIDC implicit flow is used (see details in OpenID Connect Core 1.0 specifications, [section 3.2](https://openid.net/specs/openid-connect-core-1_0.html#ImplicitFlowAuth)) or when the OIDC id_token is retrieved by other way than using [GET /api/rainbow/authentication/v1.0/oidc-client/login](#api-OIDC_Client-GetOidcLogin) API.  Authorization code grant is **recommended** as it is more secure than Implicit grant (it involves a clientSecret from Rainbow application). <br/> However, some applications may prefer to implement the OIDC flow directly in their application, or some OIDC providers may not support authorization code grant. <br/> This API is dedicated to such cases, where the OIDC flow is completely handled outside of Rainbow plateform and the obtained id_token is used to generate a Rainbow JWT in order to use the Rainbow APIs.  In order to use this API, the OIDC SingleSignOn settings of the company must contain:  - `clientId`: the client_id for the Rainbow application created on the company's OIDC provider,  - `issuer`: the company's OIDC provider issuer (should has been got from discoveryUrl if OIDC    settings has been configured with this parameter).  - `jwksUri`: the company's OIDC provider jwks_uri endpoint (should has been got from discoveryUrl if OIDC    settings has been configured with this parameter).  The id_token must be valid and contain an `email` field corresponding to the `loginEmail` of a Rainbow user.  The full OIDC flow using Implicit grant is detailed in the following sequence diagram. <br/> This GET /api/rainbow/authentication/v1.0/oidc-client/jwt endpoint addresses point 8 of this diagram (point 1 to 7 are addressed outside of Rainbow platform). ![Failed to load diagram :-(](img/oidc-client_implicit_grant_flow_sd.png \"OIDC client Implicit Flow grant sequence diagram\")  Details about the sequence diagram: - (1) User starts application - [optional] (2) Application requests Rainbow Authentication portal’s API [GET /api/rainbow/authentication/v1.0/urls?uid=user@company.com](#api-Authentication_Urls-GetLoginUrl)   to know what is the authentication type to use for this user. - (3) In the case the authentication type is OIDC for this user and company SSO setting `onlyUseImplicitFlow` is   set to true, or the developer wants to handle the OIDC flow directly in his application, the OIDC implicit flow is   handled outside of Rainbow platform.     - (3) The application redirects the browser / open a webview to the OIDC server’s authorize endpoint,     - (4) OIDC server display the login page,     - (5) The user enter his credentials in the OIDC server’s login page,     - (6) OIDC server redirects to client's redirect_uri (configured in OIDC server) with an id_token,     - (7) The application verifies the received id_token (see details in OpenID Connect Core 1.0 specifications, [section 3.1.3.7](https://openid.net/specs/openid-connect-core-1_0.html#IDTokenValidation)), - (8) The application calls API GET /api/rainbow/authentication/v1.0/oidc-client/jwt with the id_token to get   a Rainbow JWT. This API performs the following validations:     - verify the application using x-rainbow-app-auth header     - ensure id_token is well a JWT and decode it to extract the user email     - ensure a user exists in Rainbow with this email as loginEmail and ensure his company has SSO OIDC settings     - validate the signature, issuer and audience of the id_token using company SSO OIDC settings     - If the validation succeed, a Rainbow JWT is returned in response, with the loggedInUser and loggedInApplication       objects (same response than the one returned by [GET /api/rainbow/authentication/v1.0/login API](#api-Authentication-GetBasicLogin) - (9) Rainbow JWT can be use to call Rainbow APIs

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\OidcClientApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$content_type = 'content_type_example'; // string | application/x-www-form-urlencoded
$x_rainbow_app_auth = 'x_rainbow_app_auth_example'; // string | Basic <base64encode(appId:sha256(appSecretchallenge))> <br/> Concatenation of appSecret and provided challenge, hashed with sha256.
$accept = 'accept_example'; // string | application/json
$id_token = 'id_token_example'; // string | The id_token obtained from the OIDC provider
$challenge = 'challenge_example'; // string | challenge for application authentication. <br/> This value can be retrieve using GET /api/rainbow/authentication/v1.0/urls?uid=user1@company.com, or be randomly generated by the application.
$nonce = 'nonce_example'; // string | If provided, the nonce value (provided by application to OIDC provider when requesting the id_token using implicit flow) is validated to have the same value in the decoded id_token

try {
    $result = $apiInstance->getJwt($content_type, $x_rainbow_app_auth, $accept, $id_token, $challenge, $nonce);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OidcClientApi->getJwt: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **string**| application/x-www-form-urlencoded |
 **x_rainbow_app_auth** | **string**| Basic &lt;base64encode(appId:sha256(appSecretchallenge))&gt; &lt;br/&gt; Concatenation of appSecret and provided challenge, hashed with sha256. |
 **accept** | **string**| application/json |
 **id_token** | **string**| The id_token obtained from the OIDC provider |
 **challenge** | **string**| challenge for application authentication. &lt;br/&gt; This value can be retrieve using GET /api/rainbow/authentication/v1.0/urls?uid&#x3D;user1@company.com, or be randomly generated by the application. |
 **nonce** | **string**| If provided, the nonce value (provided by application to OIDC provider when requesting the id_token using implicit flow) is validated to have the same value in the decoded id_token | [optional]

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetJwtSuccess**](../Model/GetJwtSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getOidcLogin

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetOidcLoginSuccess getOidcLogin($company_id, $challenge, $x_rainbow_app_auth)

Initiate an OIDC authentication

This API allows Rainbow users to login using OpenID Connect (OIDC) authentication (using authorization code grant) if this type of authentication is provided by their company.  Authorization code grant is **recommended** as it is more secure than Implicit grant (it involves a clientSecret from Rainbow application). This API is dedicated to Authorization code grant, the OIDC flow being completely handled by Rainbow authentication server.  In order to use this API, the OIDC SingleSignOn settings of the company must contain:  - `clientId`: the client_id for the Rainbow application created on the company's OIDC provider,  - `clientSecret`: the client_secret for the Rainbow application created on the company's OIDC provider,  - `issuer`: the company's OIDC provider issuer (should has been got from discoveryUrl if OIDC    settings has been configured with this parameter).  - `authorizationEndpoint`: the company's OIDC provider authorization endpoint (should has been got from    discoveryUrl if OIDC settings has been configured with this parameter).  - `tokenEndpoint`: the company's OIDC provider token endpoint (should has been got from discoveryUrl if OIDC    settings has been configured with this parameter).  - `jwksUri`: the company's OIDC provider jwks_uri endpoint (should has been got from discoveryUrl if OIDC    settings has been configured with this parameter).  The full OIDC flow using Authorization Code grant is detailed in the following sequence diagram.  This GET /api/rainbow/authentication/v1.0/oidc-client/login endpoint addresses points 3 to 7 of this diagram (point 2 is addressed by GET /api/rainbow/authentication/v1.0/urls?uid=user@company.com endpoint, see related [documentation](#api-Authentication_Urls-GetLoginUrl)). ![Failed to load diagram :-(](img/oidc-client_authorization_code_flow_sd.png \"OIDC client Authorization Code grant sequence diagram\")  Details about the sequence diagram: - (1) User starts application - (2) Application requests Rainbow Authentication portal’s API [GET /api/rainbow/authentication/v1.0/urls?uid=user@company.com](#api-Authentication_Urls-GetLoginUrl)       to know what is the authentication type to use for this user. - (3) In the case the authentication type is OIDC for this user, the application has to redirect the browser / open a web view to this URL.     - `x-rainbow-app-auth` field has to be provided in query parameters to authenticate the application (sha256 hash is computed using the challenge) - Rainbow Authentication portal implements the OIDC authorization code grant flow:     - (4) Rainbow Authentication portal redirects the browser to the OIDC server’s authorize endpoint,     - (5) user enter his credentials in the OIDC server’s login page,     - (6) OIDC server send an authorization_code to a redirect_uri on Rainbow Authentication portal,     - (6) Rainbow Authentication portal calls OIDC server’s token endpoint to exchange this authorization_code against an id_token,     - (6) Rainbow Authentication portal decodes the id_token, looks for a Rainbow user with this email as loginEmail,           finds the OIDC SSO setting of his company and validates the id_token           (validation of id_token signature, id_token expiration, issuer and audience fields). - (7) Rainbow Authentication portal generates a Rainbow JWT and redirects the browser to the application’s       ssoAuthenticationRedirectUrl (default to Official Rainbow web client) with this jwt in query string (tkn query parameter). - (8) Rainbow JWT can be use to call Rainbow APIs  In the case errors occur during the OIDC client login flow, the browser is redirected to the application’s ssoAuthenticationRedirectUrl (default to Official Rainbow web client) with the following query parameters: - `errtype`: always set to OIDC for errors returned by this API, - `errcode`: an error detailed code associated to the error (ex: 401500) - `errmsg`: an error message code associated to the error (ex: Unknown application or wrong token for application id 204583b32039df11e9a07425538fb36c74)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\OidcClientApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$company_id = 'company_id_example'; // string | User company identifier <br/> This value is automatically set in the loginUrl which can be retrieved using [GET /api/rainbow/authentication/v1.0/urls?uid=user1@company.com](#api-Authentication_Urls-GetLoginUrl)
$challenge = 'challenge_example'; // string | Challenge for application authentication <br/> This value can be retrieved using [GET /api/rainbow/authentication/v1.0/urls?uid=user1@company.com](#api-Authentication_Urls-GetLoginUrl)
$x_rainbow_app_auth = 'x_rainbow_app_auth_example'; // string | Application authentication <br/> It has to be computed as follow: <base64encode(appId:sha256(appSecretchallenge))> (concatenation of appSecret and challenge, hashed with sha256). <br/> The challenge used to compute the `x-rainbow-app-auth` value must be the same than the one provided in query parameter `challenge`.

try {
    $result = $apiInstance->getOidcLogin($company_id, $challenge, $x_rainbow_app_auth);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OidcClientApi->getOidcLogin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| User company identifier &lt;br/&gt; This value is automatically set in the loginUrl which can be retrieved using [GET /api/rainbow/authentication/v1.0/urls?uid&#x3D;user1@company.com](#api-Authentication_Urls-GetLoginUrl) |
 **challenge** | **string**| Challenge for application authentication &lt;br/&gt; This value can be retrieved using [GET /api/rainbow/authentication/v1.0/urls?uid&#x3D;user1@company.com](#api-Authentication_Urls-GetLoginUrl) |
 **x_rainbow_app_auth** | **string**| Application authentication &lt;br/&gt; It has to be computed as follow: &lt;base64encode(appId:sha256(appSecretchallenge))&gt; (concatenation of appSecret and challenge, hashed with sha256). &lt;br/&gt; The challenge used to compute the &#x60;x-rainbow-app-auth&#x60; value must be the same than the one provided in query parameter &#x60;challenge&#x60;. |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetOidcLoginSuccess**](../Model/GetOidcLoginSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/unknown

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

