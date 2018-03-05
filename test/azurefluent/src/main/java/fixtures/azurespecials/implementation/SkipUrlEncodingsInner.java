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
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.azurespecials.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * SkipUrlEncodings.
 */
public final class SkipUrlEncodingsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private SkipUrlEncodingsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of SkipUrlEncodingsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SkipUrlEncodingsInner(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(SkipUrlEncodingsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for SkipUrlEncodings to be used
     * by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface SkipUrlEncodingsService {
        @GET("azurespecials/skipUrlEncoding/method/path/valid/{unencodedPathParam}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> getMethodPathValid(@PathParam(value = "unencodedPathParam", encoded = true) String unencodedPathParam, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azurespecials/skipUrlEncoding/path/path/valid/{unencodedPathParam}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> getPathPathValid(@PathParam(value = "unencodedPathParam", encoded = true) String unencodedPathParam, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azurespecials/skipUrlEncoding/swagger/path/valid/{unencodedPathParam}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> getSwaggerPathValid(@PathParam(value = "unencodedPathParam", encoded = true) String unencodedPathParam, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azurespecials/skipUrlEncoding/method/query/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> getMethodQueryValid(@QueryParam(value = "q1", encoded = true) String q1, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azurespecials/skipUrlEncoding/method/query/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> getMethodQueryNull(@QueryParam(value = "q1", encoded = true) String q1, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azurespecials/skipUrlEncoding/path/query/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> getPathQueryValid(@QueryParam(value = "q1", encoded = true) String q1, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azurespecials/skipUrlEncoding/swagger/query/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> getSwaggerQueryValid(@QueryParam(value = "q1", encoded = true) String q1, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getMethodPathValid(@NonNull String unencodedPathParam) {
        getMethodPathValidAsync(unencodedPathParam).blockingAwait();
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getMethodPathValidAsync(@NonNull String unencodedPathParam, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodPathValidAsync(unencodedPathParam), serviceCallback);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> getMethodPathValidWithRestResponseAsync(@NonNull String unencodedPathParam) {
        if (unencodedPathParam == null) {
            throw new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.");
        }
        return service.getMethodPathValid(unencodedPathParam, this.client.acceptLanguage());
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getMethodPathValidAsync(@NonNull String unencodedPathParam) {
        return getMethodPathValidWithRestResponseAsync(unencodedPathParam)
            .toCompletable();
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getPathPathValid(@NonNull String unencodedPathParam) {
        getPathPathValidAsync(unencodedPathParam).blockingAwait();
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getPathPathValidAsync(@NonNull String unencodedPathParam, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getPathPathValidAsync(unencodedPathParam), serviceCallback);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> getPathPathValidWithRestResponseAsync(@NonNull String unencodedPathParam) {
        if (unencodedPathParam == null) {
            throw new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.");
        }
        return service.getPathPathValid(unencodedPathParam, this.client.acceptLanguage());
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getPathPathValidAsync(@NonNull String unencodedPathParam) {
        return getPathPathValidWithRestResponseAsync(unencodedPathParam)
            .toCompletable();
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getSwaggerPathValid() {
        getSwaggerPathValidAsync().blockingAwait();
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getSwaggerPathValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getSwaggerPathValidAsync(), serviceCallback);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> getSwaggerPathValidWithRestResponseAsync() {
        final String unencodedPathParam = "path1/path2/path3";
        return service.getSwaggerPathValid(unencodedPathParam, this.client.acceptLanguage());
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getSwaggerPathValidAsync() {
        return getSwaggerPathValidWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getMethodQueryValid(@NonNull String q1) {
        getMethodQueryValidAsync(q1).blockingAwait();
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getMethodQueryValidAsync(@NonNull String q1, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodQueryValidAsync(q1), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> getMethodQueryValidWithRestResponseAsync(@NonNull String q1) {
        if (q1 == null) {
            throw new IllegalArgumentException("Parameter q1 is required and cannot be null.");
        }
        return service.getMethodQueryValid(q1, this.client.acceptLanguage());
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getMethodQueryValidAsync(@NonNull String q1) {
        return getMethodQueryValidWithRestResponseAsync(q1)
            .toCompletable();
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getMethodQueryNull() {
        getMethodQueryNullAsync().blockingAwait();
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getMethodQueryNullAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodQueryNullAsync(), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> getMethodQueryNullWithRestResponseAsync() {
        final String q1 = null;
        return service.getMethodQueryNull(q1, this.client.acceptLanguage());
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getMethodQueryNullAsync() {
        return getMethodQueryNullWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getMethodQueryNull(String q1) {
        getMethodQueryNullAsync(q1).blockingAwait();
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getMethodQueryNullAsync(String q1, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodQueryNullAsync(q1), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> getMethodQueryNullWithRestResponseAsync(String q1) {
        return service.getMethodQueryNull(q1, this.client.acceptLanguage());
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getMethodQueryNullAsync(String q1) {
        return getMethodQueryNullWithRestResponseAsync(q1)
            .toCompletable();
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getPathQueryValid(@NonNull String q1) {
        getPathQueryValidAsync(q1).blockingAwait();
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getPathQueryValidAsync(@NonNull String q1, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getPathQueryValidAsync(q1), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> getPathQueryValidWithRestResponseAsync(@NonNull String q1) {
        if (q1 == null) {
            throw new IllegalArgumentException("Parameter q1 is required and cannot be null.");
        }
        return service.getPathQueryValid(q1, this.client.acceptLanguage());
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getPathQueryValidAsync(@NonNull String q1) {
        return getPathQueryValidWithRestResponseAsync(q1)
            .toCompletable();
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getSwaggerQueryValid() {
        getSwaggerQueryValidAsync().blockingAwait();
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getSwaggerQueryValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getSwaggerQueryValidAsync(), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> getSwaggerQueryValidWithRestResponseAsync() {
        final String q1 = "value1&q2=value2&q3=value3";
        return service.getSwaggerQueryValid(q1, this.client.acceptLanguage());
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getSwaggerQueryValidAsync() {
        return getSwaggerQueryValidWithRestResponseAsync()
            .toCompletable();
    }
}
