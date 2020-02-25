# Ale\Rainbow\S2S\Client\AuthPortal\SamlAuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSamlAssertion**](SamlAuthenticationApi.md#getSamlAssertion) | **GET** /api/rainbow/authentication/v1.0/saml/{companyId}/assert | IDP logout response
[**getSamlAssertionConfiguration**](SamlAuthenticationApi.md#getSamlAssertionConfiguration) | **GET** /api/rainbow/authentication/v1.0/saml/{companyId}/metadata.xml | Get assertion configuration for a company
[**getSamlLogin**](SamlAuthenticationApi.md#getSamlLogin) | **GET** /api/rainbow/authentication/v1.0/saml/login | Initiate an SAML authentication
[**getSamlLogout**](SamlAuthenticationApi.md#getSamlLogout) | **GET** /api/rainbow/authentication/v1.0/saml/logout | Close SAML session
[**postSamlAssertion**](SamlAuthenticationApi.md#postSamlAssertion) | **POST** /api/rainbow/authentication/v1.0/saml/{companyId}/assert | IDP authentication response



## getSamlAssertion

> getSamlAssertion($company_id, $accept)

IDP logout response

This API allows IDP server to respond to SAML logout request or ask for SAML logout.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\SamlAuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$company_id = 'company_id_example'; // string | Company unique identifier (like 569ce8c8f9336c471b98eda1)
$accept = 'accept_example'; // string | application/json

try {
    $apiInstance->getSamlAssertion($company_id, $accept);
} catch (Exception $e) {
    echo 'Exception when calling SamlAuthenticationApi->getSamlAssertion: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company unique identifier (like 569ce8c8f9336c471b98eda1) |
 **accept** | **string**| application/json |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/unknown

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getSamlAssertionConfiguration

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetSamlAssertionConfigurationSuccess getSamlAssertionConfiguration($company_id, $accept)

Get assertion configuration for a company

This API allows an IDP server to retrieve ASSERTION configuration to callback Rainbow SP after an SAML authentication request

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\SamlAuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$company_id = 'company_id_example'; // string | Company unique identifier (like 569ce8c8f9336c471b98eda1)
$accept = 'accept_example'; // string | application/json

try {
    $result = $apiInstance->getSamlAssertionConfiguration($company_id, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SamlAuthenticationApi->getSamlAssertionConfiguration: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company unique identifier (like 569ce8c8f9336c471b98eda1) |
 **accept** | **string**| application/json |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetSamlAssertionConfigurationSuccess**](../Model/GetSamlAssertionConfigurationSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/xml

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getSamlLogin

> getSamlLogin($company_id, $challenge)

Initiate an SAML authentication

This API allows Rainbow users to login using SAML authentication if this type of authentication is provided by their company.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\SamlAuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$company_id = 'company_id_example'; // string | User company identifier: this value can be retrieve using GET /api/rainbow/authentication/v1.0/urls?uid=user1@company.com
$challenge = 'challenge_example'; // string | challenge for application authentication: this value can be retrieve using GET /api/rainbow/authentication/v1.0/urls?uid=user1@company.com

try {
    $apiInstance->getSamlLogin($company_id, $challenge);
} catch (Exception $e) {
    echo 'Exception when calling SamlAuthenticationApi->getSamlLogin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| User company identifier: this value can be retrieve using GET /api/rainbow/authentication/v1.0/urls?uid&#x3D;user1@company.com |
 **challenge** | **string**| challenge for application authentication: this value can be retrieve using GET /api/rainbow/authentication/v1.0/urls?uid&#x3D;user1@company.com |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/unknown

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getSamlLogout

> getSamlLogout()

Close SAML session

This API allows Rainbow users to login using SAML authentication if this type of authentication is provided by their company.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\SamlAuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $apiInstance->getSamlLogout();
} catch (Exception $e) {
    echo 'Exception when calling SamlAuthenticationApi->getSamlLogout: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/unknown

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## postSamlAssertion

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\PostSamlAssertionSuccess postSamlAssertion($company_id, $body)

IDP authentication response

This API allows IDP server to provide the identity of a user which have performed an SAML authentication (If the user suceeded in the authentication process). This identity provided by the IDP will be used to retrieve the associated Rainbow user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\SamlAuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$company_id = 'company_id_example'; // string | Company unique identifier (like 569ce8c8f9336c471b98eda1)
$body = new \Ale\Rainbow\S2S\Client\AuthPortal\Model\PostSamlAssertion(); // \Ale\Rainbow\S2S\Client\AuthPortal\Model\PostSamlAssertion | 

try {
    $result = $apiInstance->postSamlAssertion($company_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SamlAuthenticationApi->postSamlAssertion: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Company unique identifier (like 569ce8c8f9336c471b98eda1) |
 **body** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\PostSamlAssertion**](../Model/PostSamlAssertion.md)|  |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\PostSamlAssertionSuccess**](../Model/PostSamlAssertionSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

