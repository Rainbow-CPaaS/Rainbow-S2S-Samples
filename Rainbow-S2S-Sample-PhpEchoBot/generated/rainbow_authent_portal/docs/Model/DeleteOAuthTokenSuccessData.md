# # DeleteOAuthTokenSuccessData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token_expires_at** | [**\DateTime**](\DateTime.md) | Date when the access token expires. | 
**access_token_issued_at** | [**\DateTime**](\DateTime.md) | Date of the last access token generation. Access token is requested by the application and has a short expiration time, therefore it can be considered as an indicator of the application activity for the user/application associated to this OAuth token. | 
**app_id** | **string** | Unique identifier of the Application for which the OAuth token has been generated. | 
**app_name** | **string** | Name of the Application for which the OAuth token has been generated. | 
**creation_date** | [**\DateTime**](\DateTime.md) | Date when the OAuth token has been created. &lt;br/&gt; Corresponds to the first time the user gave his consent so that the application can use Rainbow APIs in his name (delegation). | 
**id** | **string** | OAuth token unique identifier. | 
**refresh_token_expires_at** | [**\DateTime**](\DateTime.md) | Date when the refresh token expires. | 
**refresh_token_issued_at** | [**\DateTime**](\DateTime.md) | Date of the last refresh token generation. | 
**scope** | **string** | Scope granted to the application. | 
**user_id** | **string** | Unique identifier of the user for which the OAuth token has been generated. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


