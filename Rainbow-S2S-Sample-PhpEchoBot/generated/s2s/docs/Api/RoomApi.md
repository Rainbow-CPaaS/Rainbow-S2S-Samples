# Ale\Rainbow\S2S\Client\S2S\RoomApi

All URIs are relative to *http://openrainbow.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**roomJoin**](RoomApi.md#roomJoin) | **POST** /api/rainbow/ucs/v1.0/connections/{cnxId}/rooms/{roomId}/join | Join a room



## roomJoin

> \Ale\Rainbow\S2S\Client\S2S\Model\RoomStatus roomJoin($cnx_id, $room_id)

Join a room

Join a room

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\RoomApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$room_id = 'room_id_example'; // string | Room id

try {
    $result = $apiInstance->roomJoin($cnx_id, $room_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoomApi->roomJoin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **room_id** | **string**| Room id |

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\RoomStatus**](../Model/RoomStatus.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

