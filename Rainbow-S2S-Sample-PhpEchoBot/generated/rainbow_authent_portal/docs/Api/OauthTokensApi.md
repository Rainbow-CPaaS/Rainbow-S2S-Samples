# Ale\Rainbow\S2S\Client\AuthPortal\OauthTokensApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOAuthToken**](OauthTokensApi.md#deleteOAuthToken) | **DELETE** /api/rainbow/authentication/v1.0/oauth/tokens/{tokenId} | Delete an OAuth token
[**getOAuthToken**](OauthTokensApi.md#getOAuthToken) | **GET** /api/rainbow/authentication/v1.0/oauth/tokens | Get all OAuth token
[**getOAuthTokenById**](OauthTokensApi.md#getOAuthTokenById) | **GET** /api/rainbow/authentication/v1.0/oauth/tokens/{tokenId} | Get an OAuth token



## deleteOAuthToken

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\DeleteOAuthTokenSuccess deleteOAuthToken($token_id, $accept)

Delete an OAuth token

This API allows users to revoke OAuth token they have previously granted for applications. <br/> <br/> Once an OAuth token is revoked, the application for which this token has been issued will no longer be able to use Rainbow APIs in the name of the user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\OauthTokensApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_id = 'token_id_example'; // string | OAuth token unique identifier (like 5c6c32532204570d233816d2)
$accept = 'accept_example'; // string | application/json

try {
    $result = $apiInstance->deleteOAuthToken($token_id, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OauthTokensApi->deleteOAuthToken: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | **string**| OAuth token unique identifier (like 5c6c32532204570d233816d2) |
 **accept** | **string**| application/json |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\DeleteOAuthTokenSuccess**](../Model/DeleteOAuthTokenSuccess.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getOAuthToken

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetOAuthTokenSuccess getOAuthToken($accept, $format, $limit, $offset, $sort_field, $sort_order)

Get all OAuth token

This API allows users to list all OAuth tokens they have generated. <br/> <br/> An OAuth token is generated when an application logs a user using OAuth 2.0 protocol. An OAuth token gives the possibility for the application to use Rainbow APIs in the name of the user (delegation).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\OauthTokensApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$accept = 'accept_example'; // string | application/json
$format = 'small'; // string | Allows to retrieve more or less OAuth token details in response. <br/> - `small`: id, appId, appName, userId <br/> - `medium`: id, appId, appName, userId, scope, creationDate, accessTokenIssuedAt, refreshTokenExpiresAt <br/> - `full`: all OAuth token fields
$limit = 100.0; // float | Allow to specify the number of OAuth tokens to retrieve.
$offset = 3.4; // float | Allow to specify the position of first OAuth token to retrieve (first OAuth token if not specified). Warning: if offset > total, no results are returned.
$sort_field = 'appName'; // string | Sort OAuth tokens list based on the given field.
$sort_order = 1.0; // float | Specify order when sorting OAuth tokens list.

try {
    $result = $apiInstance->getOAuthToken($accept, $format, $limit, $offset, $sort_field, $sort_order);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OauthTokensApi->getOAuthToken: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| application/json |
 **format** | **string**| Allows to retrieve more or less OAuth token details in response. &lt;br/&gt; - &#x60;small&#x60;: id, appId, appName, userId &lt;br/&gt; - &#x60;medium&#x60;: id, appId, appName, userId, scope, creationDate, accessTokenIssuedAt, refreshTokenExpiresAt &lt;br/&gt; - &#x60;full&#x60;: all OAuth token fields | [optional] [default to &#39;small&#39;]
 **limit** | **float**| Allow to specify the number of OAuth tokens to retrieve. | [optional] [default to 100.0]
 **offset** | **float**| Allow to specify the position of first OAuth token to retrieve (first OAuth token if not specified). Warning: if offset &gt; total, no results are returned. | [optional]
 **sort_field** | **string**| Sort OAuth tokens list based on the given field. | [optional] [default to &#39;appName&#39;]
 **sort_order** | **float**| Specify order when sorting OAuth tokens list. | [optional] [default to 1.0]

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetOAuthTokenSuccess**](../Model/GetOAuthTokenSuccess.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getOAuthTokenById

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetOAuthTokenByIdSuccess getOAuthTokenById($token_id, $accept)

Get an OAuth token

This API allows users to get an OAuth token.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\OauthTokensApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_id = 'token_id_example'; // string | OAuth token unique identifier (like 5c6c32532204570d233816d2)
$accept = 'accept_example'; // string | application/json

try {
    $result = $apiInstance->getOAuthTokenById($token_id, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OauthTokensApi->getOAuthTokenById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | **string**| OAuth token unique identifier (like 5c6c32532204570d233816d2) |
 **accept** | **string**| application/json |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetOAuthTokenByIdSuccess**](../Model/GetOAuthTokenByIdSuccess.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

