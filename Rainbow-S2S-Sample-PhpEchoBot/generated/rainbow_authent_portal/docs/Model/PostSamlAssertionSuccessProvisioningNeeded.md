# # PostSamlAssertionSuccessProvisioningNeeded

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_type** | **string** | Only set if provisioningNeeded is set and the element of the array has providerType &#x60;JANUS&#x60;. Corresponds to the media type to use when provisioning the company account on WebRTC Conferencing component. | [optional] 
**pgi_enterprise_id** | **string** | Only set if provisioningNeeded is set and the element of the array has providerType &#x60;PGI&#x60;. Corresponds to an enterpriseId to use when provisioning the company account on PSTN Conferencing component. | [optional] 
**provider_type** | **string** | If provisioningNeeded is set, each element of the array must contain providerType. providerType defines the internal component on which the provisioning is needed when subscribing to this offer (provisioning is launched asynchronously when the subscription is created). | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


