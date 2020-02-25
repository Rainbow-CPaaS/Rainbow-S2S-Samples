# # GetBasicLoginSuccess

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**object**](.md) |  | [optional] 
**phone_numbers** | [**object**](.md) |  | [optional] 
**country** | **string** | Phone number country (ISO 3166-1 alpha3 format) &lt;br/&gt;&#x60;country&#x60; field is automatically computed using the following algorithm when creating/updating a phoneNumber entry: - If &#x60;number&#x60; is provided and is in E164 format, &#x60;country&#x60; is computed from E164 number - Else if &#x60;country&#x60; field is provided in the phoneNumber entry, this one is used - Else user &#x60;country&#x60; field is used | 
**logged_in_application** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetBasicLoginSuccessLoggedInApplication**](GetBasicLoginSuccessLoggedInApplication.md) |  | 
**logged_in_user** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetBasicLoginSuccessLoggedInUser**](GetBasicLoginSuccessLoggedInUser.md) |  | 
**token** | **string** | JsonWebToken to use for all API requests | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


