/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.azurespecials.ErrorException;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdHeadResponse;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdParamGroupingResponse;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdResponse;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Headers.
 */
public final class HeadersInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private HeadersService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of HeadersInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HeadersInner(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(HeadersService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Headers to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface HeadersService {
        @POST("azurespecials/customNamedRequestId")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<HeaderCustomNamedRequestIdResponse> customNamedRequestId(@HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("accept-language") String acceptLanguage);

        @POST("azurespecials/customNamedRequestIdParamGrouping")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<HeaderCustomNamedRequestIdParamGroupingResponse> customNamedRequestIdParamGrouping(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("foo-client-request-id") String fooClientRequestId);

        @HEAD("azurespecials/customNamedRequestIdHead")
        @ExpectedResponses({200, 404})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<HeaderCustomNamedRequestIdHeadResponse> customNamedRequestIdHead(@HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void customNamedRequestId(@NonNull String fooClientRequestId) {
        customNamedRequestIdAsync(fooClientRequestId).blockingAwait();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> customNamedRequestIdAsync(@NonNull String fooClientRequestId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(customNamedRequestIdAsync(fooClientRequestId), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<HeaderCustomNamedRequestIdResponse> customNamedRequestIdWithRestResponseAsync(@NonNull String fooClientRequestId) {
        if (fooClientRequestId == null) {
            throw new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.");
        }
        return service.customNamedRequestId(fooClientRequestId, this.client.acceptLanguage());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable customNamedRequestIdAsync(@NonNull String fooClientRequestId) {
        return customNamedRequestIdWithRestResponseAsync(fooClientRequestId)
            .toCompletable();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void customNamedRequestIdParamGrouping(@NonNull HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        customNamedRequestIdParamGroupingAsync(headerCustomNamedRequestIdParamGroupingParameters).blockingAwait();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> customNamedRequestIdParamGroupingAsync(@NonNull HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(customNamedRequestIdParamGroupingAsync(headerCustomNamedRequestIdParamGroupingParameters), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<HeaderCustomNamedRequestIdParamGroupingResponse> customNamedRequestIdParamGroupingWithRestResponseAsync(@NonNull HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            throw new IllegalArgumentException("Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null.");
        }
        Validator.validate(headerCustomNamedRequestIdParamGroupingParameters);
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.fooClientRequestId();
        return service.customNamedRequestIdParamGrouping(this.client.acceptLanguage(), fooClientRequestId);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable customNamedRequestIdParamGroupingAsync(@NonNull HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        return customNamedRequestIdParamGroupingWithRestResponseAsync(headerCustomNamedRequestIdParamGroupingParameters)
            .toCompletable();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean customNamedRequestIdHead(@NonNull String fooClientRequestId) {
        return customNamedRequestIdHeadAsync(fooClientRequestId).blockingGet();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> customNamedRequestIdHeadAsync(@NonNull String fooClientRequestId, ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(customNamedRequestIdHeadAsync(fooClientRequestId), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<HeaderCustomNamedRequestIdHeadResponse> customNamedRequestIdHeadWithRestResponseAsync(@NonNull String fooClientRequestId) {
        if (fooClientRequestId == null) {
            throw new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.");
        }
        return service.customNamedRequestIdHead(fooClientRequestId, this.client.acceptLanguage());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> customNamedRequestIdHeadAsync(@NonNull String fooClientRequestId) {
        return customNamedRequestIdHeadWithRestResponseAsync(fooClientRequestId)
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
