# # GetBasicLoginSuccessProfiles

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignation_date** | **string** | Date when the subscription was attached to user profile | 
**business_model** | **string** | Indicates the business model associated to this offer (number of users, usage, ...) - &#x60;nb_users&#x60;: Licencing business model. Subscriptions having this business model are billed according to the number of users bought for it. - &#x60;usage&#x60;: Subscriptions having this business model are billed based on service consumption (whatever the number of users assigned to the subscription of this offer). - &#x60;flat_fee&#x60;: Subscriptions having this business model are billed based on a flat fee (same price each month for the company which subscribe to this offer). - &#x60;none&#x60;: no business model. Should be used for offers which are not sold (like Essential...). | [optional] [default to 'none']
**business_specific** | **string[]** | Indicates if the subscription is related to specific(s) business (for verticals like HDS) - &#x60;NONE&#x60;: This subscription is used if the company does not have a businessSpecific field. - &#x60;HDS&#x60;: This subscription is used if the company have a businessSpecific HDS (HealthCare). | [optional] 
**can_be_sold** | **bool** | Indicates if the offer is billed. &lt;br/&gt; Some offers will not be billed (Essential, Demo, ...). | 
**has_conference** | **bool** | Indicates if the profile contains conference services | [optional] 
**is_default** | **bool** | Indicates if this profile is linked to user&#39;s company&#39;s subscription to default offer (i.e. Essential) | 
**is_demo** | **bool** | Indicates if the profile is linked to a demo subscription | [optional] 
**is_exclusive** | **bool** | Indicates if the offer is exclusive for assignation to a user profile (if the user has already an exclusive offer assigned, it won&#39;t be possible to assign a second exclusive offer). | [optional] 
**is_prepaid** | **bool** | Indicates if the profile is linked to a prepaid subscription | [optional] 
**offer_id** | **string** | Id of the Rainbow offer to which company subscription is attached | 
**offer_name** | **string** | Name of the Rainbow offer to which company subscription is attached | 
**offer_technical_description** | **string** | Offer technical description. | [optional] 
**prepaid_duration** | **float** | Prepaid subscription duration (in month). &lt;br/&gt;Only set if &#x60;isPrepaid&#x60; is true. | [optional] 
**profile_id** | **string** | Id of the Rainbow profile to which company subscription is attached | 
**profile_name** | **string** | Name of the Rainbow profile to which company subscription is attached | 
**provisioning_needed** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetBasicLoginSuccessProvisioningNeeded[]**](GetBasicLoginSuccessProvisioningNeeded.md) | Array of Objects which indicates if account must be provisioned on other internal components when subscribing to this offer. | [optional] 
**status** | **string** | Status of the company subscription to which user profile is assigned &lt;br/&gt; &lt;br/&gt; Possible values: &lt;code&gt;active&lt;/code&gt;, &lt;code&gt;alerting&lt;/code&gt;, &lt;code&gt;hold&lt;/code&gt;, &lt;code&gt;terminated&lt;/code&gt; | 
**subscription_id** | **string** | Id of company subscription to which user profile is assigned (one of the subscriptions available to user&#39;s company) | 
**zuora_offer_id** | **string** | ID of the related offer in Zuora (if offer can be sold) | [optional] 
**zuora_product_rate_plan_charge_id** | **string** | ID of the ProductRatePlanChargeId used in Zuora (if offer can be sold) | [optional] 
**zuora_product_rate_plan_id** | **string** | ID of the ProductRatePlanId to used in Zuora (if offer can be sold) | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


