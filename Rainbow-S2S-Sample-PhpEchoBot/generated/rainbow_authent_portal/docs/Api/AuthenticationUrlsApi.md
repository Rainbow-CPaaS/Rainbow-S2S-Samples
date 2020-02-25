# Ale\Rainbow\S2S\Client\AuthPortal\AuthenticationUrlsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoginUrl**](AuthenticationUrlsApi.md#getLoginUrl) | **GET** /api/rainbow/authentication/v1.0/urls | Get user authentication URLs



## getLoginUrl

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetLoginUrlSuccess getLoginUrl($uid)

Get user authentication URLs

This API allows Rainbow users to know that URL they can use to perform a login.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\AuthenticationUrlsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$uid = 'uid_example'; // string | Rainbow user unique identifier: typically his login email

try {
    $result = $apiInstance->getLoginUrl($uid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationUrlsApi->getLoginUrl: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **string**| Rainbow user unique identifier: typically his login email |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetLoginUrlSuccess**](../Model/GetLoginUrlSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

