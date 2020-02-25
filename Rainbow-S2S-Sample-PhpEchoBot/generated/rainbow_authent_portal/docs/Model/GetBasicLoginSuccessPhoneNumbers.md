# # GetBasicLoginSuccessPhoneNumbers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_type** | **string** | Phone number device type, one of &lt;code&gt;landline&lt;/code&gt;, &lt;code&gt;mobile&lt;/code&gt;, &lt;code&gt;fax&lt;/code&gt;, &lt;code&gt;other&lt;/code&gt;. | 
**internal_number** | **string** | &lt;b&gt;[Only for phone numbers linked to a system (pbx)]&lt;/b&gt; &lt;br/&gt; If phone is linked to a system (pbx), internal phone number. &lt;br/&gt; Usable within a PBX group. &lt;br/&gt; Admins and users can modify this internalNumber field. | [optional] 
**is_from_system** | **bool** | Boolean indicating if phone is linked to a system (pbx). | 
**number** | **string** | User phone number (as entered by user) | [optional] 
**number_e164** | **string** | User E.164 phone number, computed by server from &#x60;number&#x60; and &#x60;country&#x60; fields | [optional] 
**pbx_id** | **string** | &lt;b&gt;[Only for phone numbers linked to a system (pbx)]&lt;/b&gt; &lt;br/&gt; If phone is linked to a system (pbx), unique identifier of that pbx. | [optional] 
**phone_number_id** | **string** | Phone number unique id in phone-numbers directory collection. | 
**short_number** | **string** | &lt;b&gt;[Only for phone numbers linked to a system (pbx)]&lt;/b&gt; &lt;br/&gt; If phone is linked to a system (pbx), short phone number (corresponds to the number monitored by PCG). &lt;br/&gt; Only usable within the same PBX. &lt;br/&gt; Only PCG can set this field. | [optional] 
**system_id** | **string** | &lt;b&gt;[Only for phone numbers linked to a system (pbx)]&lt;/b&gt; &lt;br/&gt; If phone is linked to a system (pbx), unique identifier of that system in Rainbow database. | [optional] 
**type** | **string** | Phone number type, one of &lt;code&gt;home&lt;/code&gt;, &lt;code&gt;work&lt;/code&gt;, &lt;code&gt;other&lt;/code&gt;. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


